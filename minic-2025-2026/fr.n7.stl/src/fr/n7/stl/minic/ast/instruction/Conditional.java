/**
 * 
 */
package fr.n7.stl.minic.ast.instruction;

import java.util.Optional;

import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.Expression;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Implementation of the Abstract Syntax Tree node for a conditional instruction.
 * @author Marc Pantel
 *
 */
public class Conditional implements Instruction {

	protected Expression condition;
	protected Block thenBranch;
	protected Block elseBranch;

	public Conditional(Expression _condition, Block _then, Block _else) {
		this.condition = _condition;
		this.thenBranch = _then;
		this.elseBranch = _else;
	}

	public Conditional(Expression _condition, Block _then) {
		this.condition = _condition;
		this.thenBranch = _then;
		this.elseBranch = null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "if (" + this.condition + " )" + this.thenBranch + ((this.elseBranch != null)?(" else " + this.elseBranch):"");
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = this.condition.collectAndPartialResolve(_scope);
		ok &= this.thenBranch.collectAndPartialResolve(_scope);
		if (this.elseBranch != null) {
			ok &= this.elseBranch.collectAndPartialResolve(_scope);
		}
		return ok;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope, FunctionDeclaration _container) {
		boolean ok = this.condition.collectAndPartialResolve(_scope);
		ok &= this.thenBranch.collectAndPartialResolve(_scope, _container);
		if (this.elseBranch != null) {
			ok &= this.elseBranch.collectAndPartialResolve(_scope, _container);
		}
		return ok;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#resolve(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = this.condition.completeResolve(_scope);
		ok &= this.thenBranch.completeResolve(_scope);
		if (this.elseBranch != null) {
			ok &= this.elseBranch.completeResolve(_scope);
		}
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#checkType()
	 */
	@Override
	public boolean checkType() {
		boolean ok = true;
		if (!this.condition.getType().compatibleWith(fr.n7.stl.minic.ast.type.AtomicType.BooleanType)) {
			fr.n7.stl.util.Logger.error("Condition must be boolean.");
			ok = false;
		}
		ok &= this.thenBranch.checkType();
		if (this.elseBranch != null) {
			ok &= this.elseBranch.checkType();
		}
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#allocateMemory(fr.n7.stl.tam.ast.Register, int)
	 */
	@Override
	public int allocateMemory(Register _register, int _offset) {
		// Both branches start at the same offset; no memory allocated by this instruction itself
		this.thenBranch.allocateMemory(_register, _offset);
		if (this.elseBranch != null) {
			this.elseBranch.allocateMemory(_register, _offset);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		int labelNum = _factory.createLabelNumber();
		Fragment _result = this.condition.getCode(_factory);
		_result.addComment("if (...)");
		if (this.elseBranch != null) {
			// if-else: jump to else if condition is false (0)
			String elseLabel = "else_" + labelNum;
			String endLabel = "endif_" + labelNum;
			_result.add(_factory.createJumpIf(elseLabel, 0));
			_result.append(this.thenBranch.getCode(_factory));
			_result.add(_factory.createJump(endLabel));
			Fragment _else = this.elseBranch.getCode(_factory);
			_else.addPrefix(elseLabel);
			_result.append(_else);
			_result.addSuffix(endLabel);
		} else {
			// if only: jump to end if condition is false (0)
			String endLabel = "endif_" + labelNum;
			_result.add(_factory.createJumpIf(endLabel, 0));
			_result.append(this.thenBranch.getCode(_factory));
			_result.addSuffix(endLabel);
		}
		return _result;
	}

}
