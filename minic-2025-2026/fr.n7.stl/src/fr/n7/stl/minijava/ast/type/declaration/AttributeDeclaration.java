package fr.n7.stl.minijava.ast.type.declaration;

import fr.n7.stl.minic.ast.type.Type;

public class AttributeDeclaration extends ClassElement {
	
	protected Type type;

	public AttributeDeclaration( String _name, Type _type) {
		super(_name);
		this.type = _type;
	}

	@Override
	public Type getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return this.accessRight + " " + type + " " + this.name + ";\n"; 
	}
}
