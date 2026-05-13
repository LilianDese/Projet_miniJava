/**
 * 
 */
package fr.n7.stl.minic.ast.instruction;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.Expression;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.type.AtomicType;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Implementation of the Abstract Syntax Tree node for a printer instruction.
 * @author Marc Pantel
 *
 */
public class Printer implements Instruction {

	protected Expression parameter;

	public Printer(Expression _value) {
		this.parameter = _value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "print " + this.parameter + ";\n";
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		return this.parameter.collectAndPartialResolve(_scope);
	}
	
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope, FunctionDeclaration _container) {
		return this.collectAndPartialResolve(_scope);
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#resolve(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		return this.parameter.completeResolve(_scope);
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#checkType()
	 */
	@Override
	public boolean checkType() {
		Type paramType = this.parameter.getType();
		if (paramType == null || paramType.equalsTo(fr.n7.stl.minic.ast.type.AtomicType.ErrorType)) {
			fr.n7.stl.util.Logger.error("Printer parameter has undefined type.");
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#allocateMemory(fr.n7.stl.tam.ast.Register, int)
	 */
	@Override
	public int allocateMemory(Register _register, int _offset) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Instruction#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = this.parameter.getCode(_factory);
		_result.addComment("print " + this.parameter.toString());
		Type paramType = this.parameter.getType();
		if (paramType.equalsTo(AtomicType.IntegerType)) {
			_result.add(fr.n7.stl.tam.ast.Library.IOut);
		} else if (paramType.equalsTo(AtomicType.BooleanType)) {
			_result.add(fr.n7.stl.tam.ast.Library.BOut);
		} else if (paramType.equalsTo(AtomicType.CharacterType)) {
			_result.add(fr.n7.stl.tam.ast.Library.COut);
		} else if (paramType.equalsTo(AtomicType.StringType)) {
			_result.add(fr.n7.stl.tam.ast.Library.SOut);
		} else {
			// Default: try IOut for numeric types
			_result.add(fr.n7.stl.tam.ast.Library.IOut);
		}
		return _result;
	}

}
