/**
 * 
 */
package fr.n7.stl.minic.ast.expression.accessible;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.AbstractField;
import fr.n7.stl.minic.ast.expression.Expression;
import fr.n7.stl.minic.ast.type.NamedType;
import fr.n7.stl.minic.ast.type.RecordType;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Implementation of the Abstract Syntax Tree node for accessing a field in a
 * record.
 * 
 * @author Marc Pantel
 *
 */
public class FieldAccess extends AbstractField<AccessibleExpression> implements AccessibleExpression {

	/**
	 * Construction for the implementation of a record field access expression
	 * Abstract Syntax Tree node.
	 * 
	 * @param _record Abstract Syntax Tree for the record part in a record field
	 *                access expression.
	 * @param _name   Name of the field in the record field access expression.
	 */
	public FieldAccess(AccessibleExpression _record, String _name) {
		super(_record, _name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.n7.stl.block.ast.Expression#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment _result = _factory.createFragment();
		_result.append(this.record.getCode(_factory));

		int offsetFromBottom = 0;
		int offsetFromTop = 0;
		int targetSize = this.field.getType().length();
		boolean found = false;

		Type recordType = this.record.getType();
		if (recordType instanceof NamedType) {
			recordType = ((NamedType) recordType).getType();
		}
		RecordType rt;
		boolean isPointer = false;
		if (recordType instanceof RecordType) {
			rt = (RecordType) recordType;
		} else {
			rt = (RecordType) ((fr.n7.stl.minic.ast.type.PointerType) recordType).getPointedType();
			isPointer = true;
		}

		for (fr.n7.stl.minic.ast.type.declaration.FieldDeclaration f : rt.getFields()) {
			if (f.getName().equals(this.name)) {
				found = true;
			} else if (!found) {
				offsetFromBottom += f.getType().length();
			} else {
				offsetFromTop += f.getType().length();
			}
		}

		if (isPointer) {
			_result.add(_factory.createLoadL(offsetFromBottom));
			_result.add(fr.n7.stl.tam.ast.Library.IAdd);
			_result.add(_factory.createLoadI(targetSize));
		} else {
			_result.add(_factory.createPop(targetSize, offsetFromTop));
			_result.add(_factory.createPop(targetSize, offsetFromBottom));
		}

		return _result;
	}

}
