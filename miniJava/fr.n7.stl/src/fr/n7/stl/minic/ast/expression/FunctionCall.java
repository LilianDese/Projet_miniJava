/**
 * 
 */
package fr.n7.stl.minic.ast.expression;

import java.util.Iterator;
import java.util.List;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.accessible.AccessibleExpression;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Abstract Syntax Tree node for a function call expression.
 * @author Marc Pantel
 *
 */
public class FunctionCall implements AccessibleExpression {

	/**
	 * Name of the called function.
	 * TODO : Should be an expression.
	 */
	protected String name;
	
	/**
	 * Declaration of the called function after name resolution.
	 * TODO : Should rely on the VariableUse class.
	 */
	protected FunctionDeclaration function;
	
	/**
	 * List of AST nodes that computes the values of the parameters for the function call.
	 */
	protected List<AccessibleExpression> arguments;
	
	/**
	 * @param _name : Name of the called function.
	 * @param _arguments : List of AST nodes that computes the values of the parameters for the function call.
	 */
	public FunctionCall(String _name, List<AccessibleExpression> _arguments) {
		this.name = _name;
		this.function = null;
		this.arguments = _arguments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String _result = ((this.function == null)?this.name:this.function) + "( ";
		Iterator<AccessibleExpression> _iter = this.arguments.iterator();
		if (_iter.hasNext()) {
			_result += _iter.next();
		}
		while (_iter.hasNext()) {
			_result += " ," + _iter.next();
		}
		return  _result + ")";
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.expression.Expression#collect(fr.n7.stl.block.ast.scope.HierarchicalScope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = true;
		for (AccessibleExpression argument : this.arguments) {
			ok &= argument.collectAndPartialResolve(_scope);
		}
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.expression.Expression#resolve(fr.n7.stl.block.ast.scope.HierarchicalScope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = true;
		if (_scope.knows(this.name)) {
			Declaration _declaration = _scope.get(this.name);
			if (_declaration instanceof FunctionDeclaration) {
				this.function = (FunctionDeclaration) _declaration;
			} else {
				fr.n7.stl.util.Logger.error("The declaration for " + this.name + " is of the wrong kind.");
				ok = false;
			}
		} else {
			fr.n7.stl.util.Logger.error("The identifier " + this.name + " has not been found.");
			ok = false;
		}
		for (AccessibleExpression argument : this.arguments) {
			ok &= argument.completeResolve(_scope);
		}
		return ok;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Expression#getType()
	 */
	@Override
	public Type getType() {
		if (this.function != null) {
			java.util.List<fr.n7.stl.minic.ast.instruction.declaration.ParameterDeclaration> params = this.function.getParameters();
			if (params.size() != this.arguments.size()) {
				fr.n7.stl.util.Logger.error("Wrong number of arguments for function " + this.name);
			} else {
				java.util.Iterator<fr.n7.stl.minic.ast.expression.accessible.AccessibleExpression> argIter = this.arguments.iterator();
				for (fr.n7.stl.minic.ast.instruction.declaration.ParameterDeclaration param : params) {
					Type argType = argIter.next().getType();
					if (!argType.compatibleWith(param.getType())) {
						fr.n7.stl.util.Logger.error("Argument type mismatch for function " + this.name);
					}
				}
			}
			return this.function.getType();
		} else {
			return fr.n7.stl.minic.ast.type.AtomicType.ErrorType;
		}
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Expression#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		// Push all arguments onto the stack
		for (AccessibleExpression argument : this.arguments) {
			_result.append(argument.getCode(_factory));
		}
		// Call the function using its label (LB as static link = current frame)
		fr.n7.stl.tam.ast.TAMInstruction callInstr =
				_factory.createCall(this.function.getName(), fr.n7.stl.tam.ast.Register.LB);
		callInstr.addComment("call " + this.function.getName());
		_result.add(callInstr);
		return _result;
	}

}
