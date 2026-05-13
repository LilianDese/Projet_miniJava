package fr.n7.stl.minijava.ast.type.declaration;

import java.util.Iterator;
import java.util.List;

import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.instruction.declaration.FunctionDeclaration;
import fr.n7.stl.minic.ast.instruction.declaration.ParameterDeclaration;
import fr.n7.stl.minic.ast.type.Type;

public class MethodDeclaration  extends ClassElement {
	
	protected boolean concrete;
	
	protected List<ParameterDeclaration> parameters;
	
	protected Block body;
	
	protected Type type;
	
	public MethodDeclaration(String _name, Type _type, List<ParameterDeclaration> _parameters, Block _body) {
		super( _name );
		this.parameters = _parameters;
		this.body = _body;
		this.concrete = (_body != null);
		this.type = _type;
	}
	
	public MethodDeclaration(String _name, Type _type, List<ParameterDeclaration> _parameters) {
		this( _name, _type, _parameters, null);
	}

	
	@Override
	public String toString() {
		String image = "";
		if (! this.concrete) {
			image += "abstract ";
		}
		image += this.accessRight + " " + this.type + " " + this.name + "( ";
		Iterator<ParameterDeclaration> iterator = this.parameters.iterator();
		if (iterator.hasNext()) {
			ParameterDeclaration parameter = iterator.next();
			image += parameter;
			while (iterator.hasNext()) {
				 parameter = iterator.next();
				 image += " ," + parameter;
			}
		}
		image += ")";
		if (this.concrete) {
			image += this.body; 
		} else {
			image += ";";
		}
		return image;
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
