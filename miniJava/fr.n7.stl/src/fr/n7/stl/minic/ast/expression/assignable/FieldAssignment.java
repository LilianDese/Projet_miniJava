/**
 * 
 */
package fr.n7.stl.minic.ast.expression.assignable;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.AbstractField;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Abstract Syntax Tree node for an expression whose computation assigns a field in a record.
 * @author Marc Pantel
 *
 */
public class FieldAssignment extends AbstractField<AssignableExpression> implements AssignableExpression {

	/**
	 * Construction for the implementation of a record field assignment expression Abstract Syntax Tree node.
	 * @param _record Abstract Syntax Tree for the record part in a record field assignment expression.
	 * @param _name Name of the field in the record field assignment expression.
	 */
	public FieldAssignment(AssignableExpression _record, String _name) {
		super(_record, _name);
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.impl.FieldAccessImpl#getCode(fr.n7.stl.tam.ast.TAMFactory)
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
		// Get base address of the record
		_result.append(this.record.getAddressCode(_factory));
		
		// Find field offset
		fr.n7.stl.minic.ast.type.Type recordTypeRaw = this.record.getType();
		if (recordTypeRaw instanceof fr.n7.stl.minic.ast.type.NamedType) {
			recordTypeRaw = ((fr.n7.stl.minic.ast.type.NamedType) recordTypeRaw).getType();
		}
		fr.n7.stl.minic.ast.type.RecordType recordType = (fr.n7.stl.minic.ast.type.RecordType) recordTypeRaw;
		fr.n7.stl.minic.ast.type.declaration.FieldDeclaration f = recordType.get(this.name);
		int offset = f.getOffset();
		
		if (offset > 0) {
			_result.add(_factory.createLoadL(offset));
			_result.add(TAMFactory.createBinaryOperator(fr.n7.stl.minic.ast.expression.accessible.BinaryOperator.Add));
		}
		return _result;
	}
	
}
