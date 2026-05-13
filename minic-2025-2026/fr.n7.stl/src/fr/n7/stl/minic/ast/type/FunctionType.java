/**
 * 
 */
package fr.n7.stl.minic.ast.type;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import fr.n7.stl.minic.ast.SemanticsUndefinedException;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.HierarchicalScope;

/**
 * Implementation of the Abstract Syntax Tree node for a function type.
 * @author Marc Pantel
 *
 */
public class FunctionType implements Type {

	private Type result;
	private List<Type> parameters;

	public FunctionType(Type _result, Iterable<Type> _parameters) {
		this.result = _result;
		this.parameters = new LinkedList<Type>();
		for (Type _type : _parameters) {
			this.parameters.add(_type);
		}
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#equalsTo(fr.n7.stl.block.ast.Type)
	 */
	@Override
	public boolean equalsTo(Type _other) {
		if (_other instanceof FunctionType) {
			FunctionType other = (FunctionType) _other;
			if (this.parameters.size() != other.parameters.size()) return false;
			if (!this.result.equalsTo(other.result)) return false;
			for (int i = 0; i < this.parameters.size(); i++) {
            	if (!this.parameters.get(i).equalsTo(other.parameters.get(i))) return false;
        	}
			return true;
		}
		return false; 

	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#compatibleWith(fr.n7.stl.block.ast.Type)
	 */
	@Override
	public boolean compatibleWith(Type _other) {
		if (_other instanceof FunctionType) {
			FunctionType other = (FunctionType) _other;
			if (this.parameters.size() != other.parameters.size()) return false;
			if (!this.result.compatibleWith(other.result)) return false;
			for (int i = 0; i < this.parameters.size(); i++) {
            	if (!this.parameters.get(i).compatibleWith(other.parameters.get(i))) return false;
        	}
			return true;
		}
		return false; 
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#merge(fr.n7.stl.block.ast.Type)
	 */
	@Override
	public Type merge(Type _other) {
		if(this.compatibleWith(_other)){
			return _other;
		}
		else if (_other.compatibleWith(this)){
			return this;
		}
		else{
			return AtomicType.ErrorType;
		} 
		 
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#length(int)
	 */
	@Override
	public int length() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String _result = "(";
		Iterator<Type> _iter = this.parameters.iterator();
		if (_iter.hasNext()) {
			_result += _iter.next();
			while (_iter.hasNext()) {
				_result += " ," + _iter.next();
			}
		}
		return _result + ") -> " + this.result;
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.type.Type#resolve(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean ok = result.completeResolve(_scope);

		for(Type param : this.parameters){
			ok = ok && param.completeResolve(_scope);
		} 

		return ok;
	}

}
