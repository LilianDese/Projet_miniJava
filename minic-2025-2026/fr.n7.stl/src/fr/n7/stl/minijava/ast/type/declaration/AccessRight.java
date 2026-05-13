package fr.n7.stl.minijava.ast.type.declaration;

public enum AccessRight {
	
	PUBLIC, PACKAGE, PROTECTED, PRIVATE;
	
	@Override
	public String toString() {
		switch (this) {
		case PUBLIC: return "public ";
		case PACKAGE: return "";
		case PROTECTED: return "protected ";
		case PRIVATE: return "private ";
		default: throw new IllegalArgumentException( "The default case should never be triggered.");		
		}
	}


}
