package fr.n7.stl.minijava.ast.type.declaration;

public enum ElementKind {
	
	OBJECT,
	CLASS;
	
	@Override
	public String toString() {
		switch (this) {
		case OBJECT : return "";
		case CLASS : return "static ";
		default: throw new IllegalArgumentException( "The default case should never be triggered.");
		}
	}

}
