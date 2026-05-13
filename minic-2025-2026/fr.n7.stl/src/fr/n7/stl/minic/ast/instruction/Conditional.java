/**
 * 
 */
package fr.n7.stl.minic.ast.instruction;

import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.Expression;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.type.AtomicType;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Implementation of the Abstract Syntax Tree node for a conditional
 * instruction.
 * 
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "if (" + this.condition + " )" + this.thenBranch
				+ ((this.elseBranch != null) ? (" else " + this.elseBranch) : "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope
	 * .Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		boolean _condition = this.condition.collectAndPartialResolve(_scope);
		boolean _then = this.thenBranch.collectAndPartialResolve(_scope);
		boolean _else = true;
		if (this.elseBranch != null) {
			_else = this.elseBranch.collectAndPartialResolve(_scope);
		}
		return _condition && _then && _else;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope
	 * .Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope, FunctionDeclaration _container) {
		boolean _condition = this.condition.collectAndPartialResolve(_scope);
		boolean _then = this.thenBranch.collectAndPartialResolve(_scope, _container);
		boolean _else = true;
		if (this.elseBranch != null) {
			_else = this.elseBranch.collectAndPartialResolve(_scope, _container);
		}
		return _condition && _then && _else;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.n7.stl.block.ast.instruction.Instruction#resolve(fr.n7.stl.block.ast.scope
	 * .Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean _condition = this.condition.completeResolve(_scope);
		boolean _then = this.thenBranch.completeResolve(_scope);
		boolean _else = true;
		if (this.elseBranch != null) {
			_else = this.elseBranch.completeResolve(_scope);
		}
		return _condition && _then && _else;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.n7.stl.block.ast.Instruction#checkType()
	 */
	@Override
	public boolean checkType() {
		boolean ConditionType = this.condition.getType().compatibleWith(AtomicType.BooleanType);
		boolean thenType = this.thenBranch.checkType();
		boolean elseType = true;

		if (this.elseBranch != null) {
			elseType = this.elseBranch.checkType();
		}

		return ConditionType && thenType && elseType;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.n7.stl.block.ast.Instruction#allocateMemory(fr.n7.stl.tam.ast.Register,
	 * int)
	 */
	@Override
	public int allocateMemory(Register _register, int _offset) {
		this.thenBranch.allocateMemory(_register, _offset);
		if (this.elseBranch != null) {
			this.elseBranch.allocateMemory(_register, _offset);
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.n7.stl.block.ast.Instruction#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		int id = _factory.createLabelNumber();
		String elseLabel = "else_" + id;
		String endLabel = "end_if_" + id;

		_result.append(this.condition.getCode(_factory));
		_result.add(_factory.createJumpIf(elseLabel, 0));
		_result.append(this.thenBranch.getCode(_factory));

		if (this.elseBranch != null) {
			_result.add(_factory.createJump(endLabel));
			_result.add(_factory.createPop(0, 0));
			_result.addPrefix(elseLabel);
			_result.append(this.elseBranch.getCode(_factory));
			_result.add(_factory.createPop(0, 0));
			_result.addSuffix(endLabel);
		} else {
			_result.add(_factory.createPop(0, 0));
			_result.addSuffix(elseLabel);
		}

		return _result;
	}

}
