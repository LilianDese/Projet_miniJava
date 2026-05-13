/**
 * 
 */
package fr.n7.stl.minic.ast.instruction.declaration;

import java.util.Iterator;
import java.util.List;

import fr.n7.stl.util.Logger;
import fr.n7.stl.minic.ast.scope.SymbolTable;
import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.instruction.Instruction;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Abstract Syntax Tree node for a function declaration.
 * @author Marc Pantel
 */
public class FunctionDeclaration implements DeclarationInstruction {

	/**
	 * Name of the function
	 */
	protected String name;
	
	/**
	 * AST node for the returned type of the function
	 */
	protected Type type;
	
	/**
	 * List of AST nodes for the formal parameters of the function
	 */
	protected List<ParameterDeclaration> parameters;
	
	/**
	 * @return the parameters
	 */
	public List<ParameterDeclaration> getParameters() {
		return parameters;
	}

	/**
	 * AST node for the body of the function
	 */
	protected Block body;

	/**
	 * Builds an AST node for a function declaration
	 * @param _name : Name of the function
	 * @param _type : AST node for the returned type of the function
	 * @param _parameters : List of AST nodes for the formal parameters of the function
	 * @param _body : AST node for the body of the function
	 */
	public FunctionDeclaration(String _name, Type _type, List<ParameterDeclaration> _parameters, Block _body) {
		this.name = _name;
		this.type = _type;
		this.parameters = _parameters;
		this.body = _body;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String _result = this.type + " " + this.name + "( ";
		Iterator<ParameterDeclaration> _iter = this.parameters.iterator();
		if (_iter.hasNext()) {
			_result += _iter.next();
			while (_iter.hasNext()) {
				_result += " ," + _iter.next();
			}
		}
		return _result + " )" + this.body;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Declaration#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Declaration#getType()
	 */
	@Override
	public Type getType() {
		return this.type;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#collect(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		if (_scope.accepts(this)) {
			_scope.register(this);
			HierarchicalScope<Declaration> paramScope = new SymbolTable(_scope);
			boolean ok = true;
			for (ParameterDeclaration p : this.parameters) {
				if (paramScope.accepts(p)) {
					paramScope.register(p);
				} else {
					Logger.error("Parameter : " + p.getName() + " is already defined.");
					ok = false;
				}
			}
			ok &= this.body.collectAndPartialResolve(paramScope, this);
			return ok;
		} else {
			Logger.error("Function : " + this.name + " is already defined.");
			return false;
		}
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
		boolean ok = this.type.completeResolve(_scope);
		for (ParameterDeclaration p : this.parameters) {
			ok &= p.getType().completeResolve(_scope);
		}
		ok &= this.body.completeResolve(_scope);
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#checkType()
	 */
	@Override
	public boolean checkType() {
		return this.body.checkType();
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#allocateMemory(fr.n7.stl.tam.ast.Register, int)
	 */
	@Override
	public int allocateMemory(Register _register, int _offset) {
		// In TAM calling convention, parameters are at negative offsets relative to LB.
		// Compute total size of parameters first:
		int totalParamSize = 0;
		for (ParameterDeclaration p : this.parameters) {
			totalParamSize += p.getType().length();
		}
		// Assign each parameter its offset (negative, relative to LB):
		// params are pushed left-to-right, so first param is at LB - totalParamSize
		int paramOffset = -totalParamSize;
		for (ParameterDeclaration p : this.parameters) {
			p.setOffset(paramOffset);
			paramOffset += p.getType().length();
		}
		// Local variables in the body start at LB+3 (after the 3-word call frame)
		this.body.allocateMemory(Register.LB, 3);
		// Function declarations occupy no space in the caller's stack frame
		return 0;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.instruction.Instruction#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		// Jump over the function body (so execution doesn't fall into it)
		int labelNum = _factory.createLabelNumber();
		String endLabel = "end_func_" + this.name + "_" + labelNum;
		_result.add(_factory.createJump(endLabel));
		// Function body: use getCodeWithoutCleanup() because RETURN handles stack cleanup
		Fragment _body = this.body.getCodeWithoutCleanup(_factory);
		// Compute total size of parameters for RETURN instruction
		int totalParamSize = 0;
		for (ParameterDeclaration p : this.parameters) {
			totalParamSize += p.getType().length();
		}
		// Add RETURN: keep return value words, remove parameter words
		int returnSize = this.type.length();
		_body.add(_factory.createReturn(returnSize, totalParamSize));
		// Add the function label at the entry point of the body
		if (_body.isEmpty()) {
			// Empty body: add a HALT placeholder (shouldn't happen for valid code)
			_body.add(_factory.createHalt());
		}
		_body.addPrefix(this.name);
		_result.append(_body);
		// Suffix label: points to the instruction after the function body
		_result.addSuffix(endLabel);
		return _result;
	}

}
