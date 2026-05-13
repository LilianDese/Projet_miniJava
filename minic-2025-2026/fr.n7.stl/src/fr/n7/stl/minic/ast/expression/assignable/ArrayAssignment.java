/**
 * 
 */
package fr.n7.stl.minic.ast.expression.assignable;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.AbstractArray;
import fr.n7.stl.minic.ast.expression.Expression;
import fr.n7.stl.minic.ast.expression.accessible.AccessibleExpression;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Abstract Syntax Tree node for an expression whose computation assigns a cell in an array.
 * @author Marc Pantel
 */
public class ArrayAssignment extends AbstractArray<AssignableExpression> implements AssignableExpression {

	/**
	 * Construction for the implementation of an array element assignment expression Abstract Syntax Tree node.
	 * @param _array Abstract Syntax Tree for the array part in an array element assignment expression.
	 * @param _index Abstract Syntax Tree for the index part in an array element assignment expression.
	 */
	public ArrayAssignment(AssignableExpression _array, AccessibleExpression _index) {
		super(_array, _index);
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.impl.ArrayAccessImpl#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		_result.append(this.getAddressCode(_factory));
		_result.add(_factory.createStoreI(this.getType().length()));
		return _result;
	}

	@Override
	public Fragment getAddressCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		// Compute base address: array is a pointer
		_result.append(this.array.getAddressCode(_factory));
		_result.add(_factory.createLoadI(((fr.n7.stl.minic.ast.expression.Expression)this.array).getType().length()));
		
		// Compute index
		_result.append(this.index.getCode(_factory));
		// Multiply index by element size
		_result.add(_factory.createLoadL(this.getType().length()));
		_result.add(TAMFactory.createBinaryOperator(fr.n7.stl.minic.ast.expression.accessible.BinaryOperator.Multiply));
		// Add to base address
		_result.add(TAMFactory.createBinaryOperator(fr.n7.stl.minic.ast.expression.accessible.BinaryOperator.Add));
		return _result;
	}

	
}
