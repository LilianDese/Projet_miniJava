/**
 * 
 */
package fr.n7.stl.minic.ast;

import java.util.List;

import fr.n7.stl.minic.ast.instruction.declaration.DeclarationInstruction;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.scope.SymbolTable;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.Register;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Represents a Main node in the Abstract Syntax Tree node for the miniC language.
 * Declares the various semantics attributes for the node.
 * 
 * A Main contains a name and a block.
 * 
 * @author Marc Pantel
 *
 */
public class Program {
	
	/**
	 * Sequence of declarations contained in a miniC program.
	 */
	protected List<DeclarationInstruction> declarations;

	/**
	 * Body of the main function for a miniC program.
	 */
	protected Block main;
	
	/**
	 * Scope for a miniC program.
	 */
	HierarchicalScope<Declaration> scope;

	/**
	 * Constructor for a block.
	 */
	public Program(List<DeclarationInstruction> _declarations, Block _main) {
		this.declarations = _declarations;
		this.main = _main;
		this.scope = new SymbolTable();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String declarations = "";
		for (Declaration declaration : this.declarations) {
			declarations += declaration + "\n";
		}
		return declarations + "void main() " + this.main;
	}
	
	/**
	 * Inherited Semantics attribute to collect all the identifiers declaration and check
	 * that the declaration are allowed.
	 * @param _scope Inherited Scope attribute that contains the identifiers defined previously
	 * in the context.
	 * @return Synthesized Semantics attribute that indicates if the identifier declaration are
	 * allowed.
	 */
	public boolean collectAndPartialResolve() {
            boolean ok = true;
    		for (DeclarationInstruction declaration : this.declarations) {
    			ok &= declaration.collectAndPartialResolve(this.scope);
    		}
            ok &= this.main.collectAndPartialResolve(this.scope);
            return ok;
	//	throw new SemanticsUndefinedException("Semantics collect is undefined in Program.");
	}
	
	/**
	 * Inherited Semantics attribute to check that all identifiers have been defined and
	 * associate all identifiers uses with their definitions.
	 * @param _scope Inherited Scope attribute that contains the defined identifiers.
	 * @return Synthesized Semantics attribute that indicates if the identifier used in the
	 * block have been previously defined.
	 */
	public boolean completeResolve() {
		boolean ok = true;
		for (DeclarationInstruction declaration : this.declarations) {
			ok &= declaration.completeResolve(this.scope);
		}
		ok &= this.main.completeResolve(this.scope);
		return ok;
		// throw new SemanticsUndefinedException("Semantics completeResolve is undefined in Program.");
	}

	/**
	 * Synthesized Semantics attribute to check that an instruction if well typed.
	 * @return Synthesized True if the instruction is well typed, False if not.
	 */	
	public boolean checkType() {
		boolean ok = true;
		for (DeclarationInstruction declaration : this.declarations) {
			ok &= declaration.checkType();
		}
		ok &= this.main.checkType();
		return ok;
		// throw new SemanticsUndefinedException("Semantics checkType is undefined in Program.");
	}

	/**
	 * Inherited Semantics attribute to allocate memory for the variables declared in the instruction.
	 * Synthesized Semantics attribute that compute the size of the allocated memory. 
	 * @param _register Inherited Register associated to the address of the variables.
	 * @param _offset Inherited Current offset for the address of the variables.
	 */	
	public void allocateMemory(Register _register, int _offset) {
		int currentOffset = _offset;
		for (DeclarationInstruction declaration : this.declarations) {
			currentOffset += declaration.allocateMemory(_register, currentOffset);
		}
		this.main.allocateMemory(_register, currentOffset);
	}

	/**
	 * Inherited Semantics attribute to build the nodes of the abstract syntax tree for the generated TAM code.
	 * Synthesized Semantics attribute that provide the generated TAM code.
	 * @param _factory Inherited Factory to build AST nodes for TAM code.
	 * @return Synthesized AST for the generated TAM code.
	 */
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		// Code for global declarations (constants, type declarations - no runtime code for those)
		for (DeclarationInstruction declaration : this.declarations) {
			_result.append(declaration.getCode(_factory));
		}
		// Code for the main block
		_result.append(this.main.getCode(_factory));
		return _result;
	}

}
