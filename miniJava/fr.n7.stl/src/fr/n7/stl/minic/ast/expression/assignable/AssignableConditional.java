/**
 * 
 */
package fr.n7.stl.minic.ast.expression.assignable;

import fr.n7.stl.minic.ast.expression.AbstractConditional;
import fr.n7.stl.minic.ast.expression.Expression;

/**
 * @author marc
 *
 */
public class AssignableConditional extends AbstractConditional<AssignableExpression> implements AssignableExpression {

	public AssignableConditional(Expression _condition, AssignableExpression _then, AssignableExpression _else) {
		super(_condition, _then, _else);
	}

	@Override
	public fr.n7.stl.tam.ast.Fragment getAddressCode(fr.n7.stl.tam.ast.TAMFactory _factory) {
		fr.n7.stl.tam.ast.Fragment _result = _factory.createFragment();
		int labelNum = _factory.createLabelNumber();
		String elseLabel = "cond_else_" + labelNum;
		String endLabel = "cond_end_" + labelNum;
		
		_result.append(this.condition.getCode(_factory));
		_result.add(_factory.createJumpIf(elseLabel, 0));
		
		_result.append(this.thenExpression.getAddressCode(_factory));
		_result.add(_factory.createJump(endLabel));
		
		fr.n7.stl.tam.ast.Fragment _else = this.elseExpression.getAddressCode(_factory);
		_else.addPrefix(elseLabel);
		_result.append(_else);
		
		_result.addSuffix(endLabel);
		return _result;
	}

}
