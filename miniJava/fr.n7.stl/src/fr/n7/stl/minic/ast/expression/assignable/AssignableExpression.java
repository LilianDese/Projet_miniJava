/**
 * 
 */
package fr.n7.stl.minic.ast.expression.assignable;

import fr.n7.stl.minic.ast.expression.Expression;

/**
 * Expression whose value can be modified : Arrays, Records, Pointers, Variable, ...
 * @author Marc Pantel
 *
 */
public interface AssignableExpression extends Expression {

	/**
	 * Build the TAM code that pushes the address of the assignable expression on the stack.
	 * @param _factory Factory to build AST nodes for TAM code.
	 * @return TAM code that pushes the address.
	 */
	public fr.n7.stl.tam.ast.Fragment getAddressCode(fr.n7.stl.tam.ast.TAMFactory _factory);

}
