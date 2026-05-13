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
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Implementation of the Abstract Syntax Tree node for a conditional instruction.
 * @author Marc Pantel
 *
 */
public class Iteration implements Instruction {

	protected Expression condition;
	protected Block body;

	public Iteration(Expression _condition, Block _body) {
		this.condition = _condition;
		this.body = _body;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "while (" + this.condition + " )" + this.body;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = this.condition.collectAndPartialResolve(_scope);
		ok &= this.body.collectAndPartialResolve(_scope);
		return ok;
	}
	
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope, FunctionDeclaration _container) {
		boolean ok = this.condition.collectAndPartialResolve(_scope);
		ok &= this.body.collectAndPartialResolve(_scope, _container);
		return ok;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#resolve(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = this.condition.completeResolve(_scope);
		ok &= this.body.completeResolve(_scope);
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#checkType()
	 */
	@Override
	public boolean checkType() {
		boolean ok = true;
		if (!this.condition.getType().compatibleWith(fr.n7.stl.minic.ast.type.AtomicType.BooleanType)) {
			fr.n7.stl.util.Logger.error("Iteration condition must be boolean.");
			ok = false;
		}
		ok &= this.body.checkType();
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#allocateMemory(fr.n7.stl.tam.ast.Register, int)
	 */
	@Override
	public int allocateMemory(Register _register, int _offset) {
		this.body.allocateMemory(_register, _offset);
		return 0;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		int labelNum = _factory.createLabelNumber();
		String startLabel = "while_" + labelNum;
		String endLabel = "endwhile_" + labelNum;
		Fragment _result = _factory.createFragment();
		// Evaluate condition with start label
		Fragment _cond = this.condition.getCode(_factory);
		_cond.addPrefix(startLabel);
		_cond.addComment("while (...)");
		_result.append(_cond);
		// Jump to end if condition is false (0)
		_result.add(_factory.createJumpIf(endLabel, 0));
		// Body
		_result.append(this.body.getCode(_factory));
		// Jump back to start
		_result.add(_factory.createJump(startLabel));
		// End label
		_result.addSuffix(endLabel);
		return _result;
	}

}
