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
import fr.n7.stl.minic.ast.scope.Scope;
import fr.n7.stl.minic.ast.type.declaration.FieldDeclaration;

/**
 * Implementation of the Abstract Syntax Tree node for a record type.
 * This one is a scope to allow an easy access to the fields.
 * @author Marc Pantel
 *
 */
public class RecordType implements Type, Declaration, Scope<FieldDeclaration> {

	private List<FieldDeclaration> fields;
	private String name;

	/**
	 * Constructor for a record type including fields.
	 * @param _name Name of the record type.
	 * @param _fields Sequence of fields to initialize the content of the record type.
	 */
	public RecordType(String _name, Iterable<FieldDeclaration> _fields) {
		this.name = _name;
		this.fields = new LinkedList<FieldDeclaration>();
		for (FieldDeclaration _field : _fields) {
			this.fields.add(_field);
		}
	}

	/**
	 * Constructor for an empty record type (i.e. without fields).
	 * @param _name Name of the record type.
	 */
	public RecordType(String _name) {
		this.name = _name;
		this.fields = new LinkedList<FieldDeclaration>();
	}

	/**
	 * Add a field to a record type.
	 * @param _field The added field.
	 */
	public void add(FieldDeclaration _field) {
		this.fields.add(_field);
	}

	/**
	 * Add a sequence of fields to a record type.
	 * @param _fields : Sequence of fields to be added.
	 */
	public void addAll(Iterable<FieldDeclaration> _fields) {
		for (FieldDeclaration _field : _fields) {
			this.fields.add(_field);
		}
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#equalsTo(fr.n7.stl.block.ast.Type)
	 */
	@Override
	public boolean equalsTo(Type _other) {
		if (_other instanceof RecordType) {
			RecordType other = (RecordType) _other;
			if (this.fields.size() != other.fields.size()) return false;
			Iterator<FieldDeclaration> it1 = this.fields.iterator();
			Iterator<FieldDeclaration> it2 = other.fields.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				FieldDeclaration f1 = it1.next();
				FieldDeclaration f2 = it2.next();
				if (!f1.getName().equals(f2.getName())) return false;
				if (!f1.getType().equalsTo(f2.getType())) return false;
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
		if (_other instanceof RecordType) {
			RecordType other = (RecordType) _other;
			if (this.fields.size() != other.fields.size()) return false;
			Iterator<FieldDeclaration> it1 = this.fields.iterator();
			Iterator<FieldDeclaration> it2 = other.fields.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				FieldDeclaration f1 = it1.next();
				FieldDeclaration f2 = it2.next();
				if (!f1.getName().equals(f2.getName())) return false;
				if (!f1.getType().compatibleWith(f2.getType())) return false;
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
		if (_other instanceof RecordType) {
			RecordType other = (RecordType) _other;
			if (this.fields.size() != other.fields.size()) return AtomicType.ErrorType;
			List<FieldDeclaration> mergedFields = new java.util.LinkedList<>();
			Iterator<FieldDeclaration> it1 = this.fields.iterator();
			Iterator<FieldDeclaration> it2 = other.fields.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				FieldDeclaration f1 = it1.next();
				FieldDeclaration f2 = it2.next();
				if (!f1.getName().equals(f2.getName())) return AtomicType.ErrorType;
				Type mergedType = f1.getType().merge(f2.getType());
				if (mergedType.equalsTo(AtomicType.ErrorType)) return AtomicType.ErrorType;
				mergedFields.add(new FieldDeclaration(f1.getName(), mergedType));
			}
			return new RecordType(this.name, mergedFields);
		}
		return AtomicType.ErrorType;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Scope#get(java.lang.String)
	 */
	@Override
	public FieldDeclaration get(String _name) {
		boolean _found = false;
		Iterator<FieldDeclaration> _iter = this.fields.iterator();
		FieldDeclaration _current = null;
		while (_iter.hasNext() && (! _found)) {
			_current = _iter.next();
			_found = _found || _current.getName().contentEquals(_name);
		}
		if (_found) {
			return _current;
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Scope#contains(java.lang.String)
	 */
	@Override
	public boolean contains(String _name) {
		boolean _result = false;
		Iterator<FieldDeclaration> _iter = this.fields.iterator();
		while (_iter.hasNext() && (! _result)) {
			_result = _result || _iter.next().getName().contentEquals(_name);
		}
		return _result;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Scope#accepts(fr.n7.stl.block.ast.Declaration)
	 */
	@Override
	public boolean accepts(FieldDeclaration _declaration) {
		return ! this.contains(_declaration.getName());
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Scope#register(fr.n7.stl.block.ast.Declaration)
	 */
	@Override
	public void register(FieldDeclaration _declaration) {
		if (this.accepts(_declaration)) {
			this.fields.add(_declaration);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Build a sequence type by erasing the names of the fields.
	 * @return Sequence type extracted from record fields.
	 */
	public SequenceType erase() {
		SequenceType _local = new SequenceType();
		for (FieldDeclaration _field : this.fields) {
			_local.add(_field.getType());
		}
		return _local;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.Type#length()
	 */
	@Override
	public int length() {
		int _length = 0;
		for (FieldDeclaration f : this.fields) {
			_length += f.getType().length();
		}
		return _length;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String _result = "struct " + this.name + " { ";
		Iterator<FieldDeclaration> _iter = this.fields.iterator();
		if (_iter.hasNext()) {
			_result += _iter.next();
			while (_iter.hasNext()) {
				_result += " " + _iter.next();
			}
		}
		return _result + "}";
	}
	
	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.type.Type#resolve(fr.n7.stl.block.ast.scope.Scope)
	 */
	@Override
	public boolean completeResolve(HierarchicalScope<Declaration> _scope) {
		boolean _result = true;
		int currentOffset = 0;
		for (FieldDeclaration f : this.fields) {
			_result = _result && f.getType().completeResolve(_scope);
			f.computerOffset(currentOffset);
			currentOffset += f.getType().length();
		}
		return _result;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.scope.Declaration#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.scope.Declaration#getType()
	 */
	@Override
	public Type getType() {
		return this;
	}
}
