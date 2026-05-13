package fr.n7.stl.minic;

import fr.n7.stl.tam.ast.*;
import fr.n7.stl.tam.ast.impl.*;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TAMFactory factory = new TAMFactoryImpl();
		Fragment fCondition = factory.createFragment();
		Fragment fAlors = factory.createFragment();
		Fragment fSinon = factory.createFragment();
		Fragment fConditionnelle = factory.createFragment();
		String sinon = "Sinon";
		String finsi = "FinSi";
		fCondition.add(factory.createLoad(Register.SB, 1, 0));
		fCondition.add(factory.createLoadL(0));
		fCondition.add(Library.IEq);
		fConditionnelle.append(fCondition);
		fConditionnelle.add(factory.createJumpIf(sinon, 0));
		fAlors.add(factory.createLoad(Register.SB, 1, 1));
		fAlors.add(factory.createLoadL(2));
		fAlors.add(Library.IAdd);
		fAlors.add(factory.createStore( Register.SB, 1, 1));
		fAlors.add(factory.createJump(finsi));
		fAlors.addSuffix(sinon);
		fConditionnelle.append(fAlors);
		fSinon.add(factory.createLoad(Register.SB, 1, 1));
		fSinon.add(factory.createLoadL(2));
		fSinon.add(Library.IAdd);
		fSinon.add(factory.createStore( Register.SB, 1, 1));
		fSinon.addSuffix(finsi);
		fConditionnelle.append(fSinon);
		System.out.println(fConditionnelle);
		
	}

}
