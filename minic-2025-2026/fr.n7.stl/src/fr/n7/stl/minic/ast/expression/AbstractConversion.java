/**
 * 
 */
package fr.n7.stl.minic.ast.expression;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.expression.accessible.AccessibleExpression;
import fr.n7.stl.minic.ast.expression.assignable.AssignableExpression;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;
import fr.n7.stl.minic.ast.type.Type;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;

/**
 * Common elements between left (Assignable) and right (Expression) end sides of assignments. These elements
 * share attributes, toString and getType methods.
 * @author Marc Pantel
 *
 */
public abstract class AbstractConversion<TargetType> implements Expression {

	protected TargetType target;
	protected Type type;
	protected String name;

	public AbstractConversion(TargetType _target, String _type) {
		this.target = _target;
		this.name = _type;
		this.type = null;
	}
	
	public AbstractConversion(TargetType _target, Type _type) {
		this.target = _target;
		this.name = null;
		this.type = _type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if (this.type == null) {
			return "(" + this.name + ") " + this.target;
		} else {
			return "(" + this.type + ") " + this.target;
		}
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Expression#getType()
	 */
	@Override
	public Type getType() {
		return this.type;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.expression.Expression#collect(fr.n7.stl.block.ast.scope.HierarchicalScope)
	 */
	@Override
	public boolean collectAndPartialResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = true;
		if (this.target instanceof Expression) {
			ok &= ((Expression) this.target).collectAndPartialResolve(_scope);
		}
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.expression.Expression#resolve(fr.n7.stl.block.ast.scope.HierarchicalScope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = true;
		if (this.target instanceof Expression) {
			ok &= ((Expression) this.target).completeResolve(_scope);
		}
		if (this.type != null) {
			ok &= this.type.completeResolve(_scope);
		} else {
			if (_scope.knows(this.name)) {
				Declaration _declaration = _scope.get(this.name);
				if (_declaration instanceof fr.n7.stl.minic.ast.instruction.declaration.TypeDeclaration) {
					this.type = ((fr.n7.stl.minic.ast.instruction.declaration.TypeDeclaration) _declaration).getType();
				} else {
					fr.n7.stl.util.Logger.error("The declaration for " + this.name + " is of the wrong kind.");
					ok = false;
				}
			} else {
				fr.n7.stl.util.Logger.error("The identifier " + this.name + " has not been found.");
				ok = false;
			}
		}
		return ok;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Expression#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		if (this.target instanceof Expression) {
			return ((Expression) this.target).getCode(_factory);
		} else {
			return _factory.createFragment();
		}
	}

}
