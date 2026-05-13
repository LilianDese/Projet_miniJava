/**
 * 
 */
package fr.n7.stl.minic.ast.expression.assignable;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.AbstractField;
import fr.n7.stl.minic.ast.type.NamedType;
import fr.n7.stl.minic.ast.type.RecordType;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Abstract Syntax Tree node for an expression whose computation assigns a field
 * in a record.
 * 
 * @author Marc Pantel
 *
 */
public class FieldAssignment extends AbstractField<AssignableExpression> implements AssignableExpression {

	/**
	 * Construction for the implementation of a record field assignment expression
	 * Abstract Syntax Tree node.
	 * 
	 * @param _record Abstract Syntax Tree for the record part in a record field
	 *                assignment expression.
	 * @param _name   Name of the field in the record field assignment expression.
	 */
	public FieldAssignment(AssignableExpression _record, String _name) {
		super(_record, _name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.n7.stl.block.ast.impl.FieldAccessImpl#getCode(fr.n7.stl.tam.ast.
	 * TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		_result.append(this.record.getCode(_factory));

		Type recordType = this.record.getType();
		if (recordType instanceof NamedType) {
			recordType = ((NamedType) recordType).getType();
		}
		RecordType rt;
		if (recordType instanceof RecordType) {
			rt = (RecordType) recordType;
		} else {
			rt = (RecordType) ((fr.n7.stl.minic.ast.type.PointerType) recordType).getPointedType();
		}

		int offset = 0;
		for (fr.n7.stl.minic.ast.type.declaration.FieldDeclaration f : rt.getFields()) {
			if (f.getName().equals(this.name)) {
				break;
			}
			offset += f.getType().length();
		}

		if (offset > 0) {
			_result.add(_factory.createLoadL(offset));
			_result.add(fr.n7.stl.tam.ast.Library.IAdd);
		}

		return _result;
	}

}
