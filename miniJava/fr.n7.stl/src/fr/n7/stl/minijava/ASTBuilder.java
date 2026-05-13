package fr.n7.stl.minijava;

import fr.n7.stl.minijava.parser.MiniJavaParser;
import fr.n7.stl.minijava.parser.MiniJavaParser.AccessRightContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.AffectableContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.AttributClasseContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.AttributContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.AttributMainContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.AttributObjetContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ClasseContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ClassesContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ConstructeurContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.DeclarationContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureAppelMethodeExpliciteContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureAppelMethodeImpliciteContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureAttributContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureConversionContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureIdentificateurContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureSuperContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureTableauContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.EcritureThisContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ElementContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ElementsContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ExpressionConditionelleContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ExpressionOpposeeContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionAppelConstructeurAlternatifContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionAppelConstructeurParentContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionAppelMethodeExpliciteContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionAppelMethodeImpliciteContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionIterationContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.InstructionSiContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.LectureAttributContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.LectureIdentificateurContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.LectureSuperContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.LectureTableauContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.LectureThisContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.MethodeAbstraiteContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.MethodeClasseContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.MethodeMainContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.MethodeObjetContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ParametreContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.PrincipaleContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.ProgrammeContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.SignatureContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.TypeAtomiqueContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.TypeContext;
import fr.n7.stl.minijava.parser.MiniJavaParser.TypeTableauContext;
import fr.n7.stl.minijava.parser.MiniJavaParserBaseListener;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.expression.*;
import fr.n7.stl.minic.ast.expression.accessible.*;
import fr.n7.stl.minic.ast.expression.allocation.*;
import fr.n7.stl.minic.ast.expression.assignable.*;
import fr.n7.stl.minic.ast.expression.value.*;
import fr.n7.stl.minic.ast.instruction.*;
import fr.n7.stl.minic.ast.instruction.declaration.*;
import fr.n7.stl.minic.ast.scope.Declaration;
import fr.n7.stl.minic.ast.scope.SymbolTable;
import fr.n7.stl.minic.ast.type.*;
import fr.n7.stl.minic.ast.type.declaration.*;
import fr.n7.stl.minijava.*;
import fr.n7.stl.minijava.ast.type.*;
import fr.n7.stl.minijava.ast.type.declaration.*;
import fr.n7.stl.minijava.expression.accessible.AttributeAccess;
import fr.n7.stl.minijava.expression.accessible.MethodCallAccess;
import fr.n7.stl.minijava.expression.accessible.SuperAccess;
import fr.n7.stl.minijava.expression.accessible.ThisAccess;
import fr.n7.stl.minijava.expression.allocation.ObjectAllocation;
import fr.n7.stl.minijava.expression.assignable.AttributeAssignment;
import fr.n7.stl.minijava.expression.assignable.MethodCallAssignment;
import fr.n7.stl.minijava.expression.assignable.SuperAssignment;
import fr.n7.stl.minijava.expression.assignable.ThisAssignment;
import fr.n7.stl.minijava.instruction.MethodCall;
import fr.n7.stl.minijava.instruction.SuperCall;
import fr.n7.stl.minijava.instruction.ThisCall;
import fr.n7.stl.tam.ast.*;
import fr.n7.stl.tam.ast.impl.TAMFactoryImpl;
import fr.n7.stl.util.Pair;

public class ASTBuilder extends MiniJavaParserBaseListener {

    private String output_path;
    private MainDeclaration main;
    private List<ClassDeclaration> classes;

    public ASTBuilder(String _output) {
        this.output_path = _output;
    }

    /**
     * Start the compile phase : collect, resolve, memory allocation and
     * code generation.
     */
    public void startCompilation() {
    	for (ClassDeclaration c : this.classes) {
    		System.out.println(c);
    	}
        System.out.println(this.main);
        SymbolTable tds = new SymbolTable();
        boolean okCollectAndPartialResolve = true;
        for (ClassDeclaration c : this.classes) {
        	okCollectAndPartialResolve = okCollectAndPartialResolve && c.collectAndPartialResolve(tds);
        }
        okCollectAndPartialResolve = okCollectAndPartialResolve && this.main.collectAndPartialResolve(tds);
        if (okCollectAndPartialResolve) {
            System.out.println("collect succeeded");
            boolean okCompleteResolve = true;
            for (ClassDeclaration c : this.classes) {
            	okCompleteResolve = okCompleteResolve && c.completeResolve(tds);
            }
            okCompleteResolve = okCompleteResolve && this.main.completeResolve(tds);
            if (okCompleteResolve) {
                System.out.println("Resolve succeeded.");
                boolean okCheckType = true;
                for (ClassDeclaration c : this.classes) {
                	okCheckType = okCheckType && c.checkType();
                }
                okCheckType = okCheckType && this.main.checkType();
                
                if (okCheckType) {
                    System.out.println("Type verification succeeded.");

                    System.out.println("Code generation ...");
                    for (ClassDeclaration c : this.classes) {
                    	c.allocateMemory(Register.SB, 0);
                    }
                    this.main.allocateMemory(Register.SB, 0);
                    TAMFactory factory = new TAMFactoryImpl();
                    Fragment f = factory.createFragment();
                    for (ClassDeclaration c : this.classes) {
                    	f.append(c.getCode(factory));
                    }
                    f.append(this.main.getCode(factory));
                    f.add(factory.createHalt());
                    try {
                        PrintWriter writer = new PrintWriter(output_path);
                        writer.println(f);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Code generation finished");

                } else {
                    System.out.println("Type verification failed.");
                }
            } else {
                System.out.println("Resolve failed." + tds);
            }
        } else {
            System.out.println("Collect failed : " + tds);
        }
    }

    @Override
    public void exitProgramme(ProgrammeContext ctx) {
        this.main = ctx.laPrincipale.unPrincipal;
        this.classes = ctx.lesClasses.desClasses;
    }
    
    @Override
	public void exitClasses(ClassesContext ctx) {
        List<ClassDeclaration> lesClasses = new LinkedList<ClassDeclaration>();
        for (ClasseContext uneClasse : ctx.lesClasses) {
        	lesClasses.add(uneClasse.uneClasse);
        }
		ctx.desClasses = lesClasses;
		
	}

	@Override
	public void exitClasse(ClasseContext ctx) {
		boolean estConcrete = (ctx.estAbstraite == null);
		if (ctx.heriteDe != null) {
			ctx.uneClasse = new ClassDeclaration( estConcrete, ctx.leNom.getText(), ctx.heriteDe.getText(), ctx.lesElements.desElements);
		} else {
			ctx.uneClasse = new ClassDeclaration( estConcrete, ctx.leNom.getText(), ctx.lesElements.desElements);
		}
	}

	@Override
	public void exitPrincipale(PrincipaleContext ctx) {
        List<Declaration> lesDeclarations = new LinkedList<Declaration>();
        for (DeclarationContext uneDeclaration : ctx.lesDeclarations) {
        	lesDeclarations.add(uneDeclaration.uneDeclaration);
        }
		ctx.unPrincipal = new MainDeclaration( ctx.leNom.getText(), lesDeclarations, ctx.leCorps.unBloc);
	}

	@Override
	public void exitMethodeMain(MethodeMainContext ctx) {
		String leNom = ctx.laSignature.leNom.getText();
		Type leType = ctx.laSignature.leRetour.unType;
		List<ParameterDeclaration> lesParametres = ctx.laSignature.lesParametres.desParametres;
		Block leCorps = ctx.leCorps.unBloc;
		ctx.uneDeclaration = new FunctionDeclaration( leNom, leType, lesParametres, leCorps);
	}

	@Override
	public void exitAttributMain(AttributMainContext ctx) {
		String leNom = ctx.leNom.getText();
		Type leType = ctx.leType.unType;
		AccessibleExpression laValeur = ctx.laValeur.uneExpression;
		if (ctx.estDefinitif != null) {
			ctx.uneDeclaration = new ConstantDeclaration( leNom, leType, laValeur);
		} else {
			ctx.uneDeclaration = new VariableDeclaration( leNom, leType, laValeur);
		}
	}

	@Override
	public void exitSignature(SignatureContext ctx) {
		// TODO Auto-generated method stub
		super.exitSignature(ctx);
	}

	@Override
	public void exitElements(ElementsContext ctx) {
        List<ClassElement> lesElements = new LinkedList<ClassElement>();
        for (ElementContext unElement : ctx.lesElements) {
        	lesElements.add(unElement.unElement);
        }
		ctx.desElements = lesElements;
	}
	
	@Override
	public void exitElement(ElementContext ctx) {
		ClassElement unElement = null;
		if (ctx.attribut() != null) {
			unElement = ctx.attribut().unAttribut;
		} else {
			if (ctx.methode() != null) {
				unElement = ctx.methode().uneMethode;
			} else {
				if (ctx.constructeur() != null) {
					unElement = ctx.constructeur().unConstructeur;
				} else {
					throw new RuntimeException("Missing Element.");
				}
			}
		}
		unElement.setAccessRight(ctx.leDroit.unDroit);
		ctx.unElement = unElement;
	}

	@Override
	public void exitAccessRight(AccessRightContext ctx) {
		if (ctx.Public() != null) {
			ctx.unDroit = AccessRight.PUBLIC;
		} else {
			if (ctx.Protege() != null) {
				ctx.unDroit = AccessRight.PROTECTED;
			} else {
				if (ctx.Prive() != null) {
					ctx.unDroit = AccessRight.PRIVATE;
				} else {
					ctx.unDroit = AccessRight.PACKAGE;
				}
			}
		}
	}

	@Override
	public void exitAttributObjet(AttributObjetContext ctx) {
		ctx.unAttribut = new AttributeDeclaration( ctx.leNom.getText(), ctx.leType.unType);
	}

	@Override
	public void exitAttributClasse(AttributClasseContext ctx) {
		ctx.unAttribut = new AttributeDeclaration( ctx.leNom.getText(), ctx.leType.unType);
		ctx.unAttribut.setElementKind(ElementKind.CLASS);
	}

	@Override
	public void exitMethodeObjet(MethodeObjetContext ctx) {
		String leNom = ctx.laSignature.leNom.getText();
		Type leType = ctx.laSignature.leRetour.unType;
		List<ParameterDeclaration> lesParametres = ctx.laSignature.lesParametres.desParametres;
		Block leCorps = ctx.leCorps.unBloc;
		ctx.uneMethode = new MethodDeclaration( leNom, leType, lesParametres, leCorps);
	}

	@Override
	public void exitMethodeClasse(MethodeClasseContext ctx) {
		String leNom = ctx.laSignature.leNom.getText();
		Type leType = ctx.laSignature.leRetour.unType;
		List<ParameterDeclaration> lesParametres = ctx.laSignature.lesParametres.desParametres;
		Block leCorps = ctx.leCorps.unBloc;
		ctx.uneMethode = new MethodDeclaration( leNom, leType, lesParametres, leCorps);
		ctx.uneMethode.setElementKind(ElementKind.CLASS);
	}

	@Override
	public void exitMethodeAbstraite(MethodeAbstraiteContext ctx) {
		String leNom = ctx.laSignature.leNom.getText();
		Type leType = ctx.laSignature.leRetour.unType;
		List<ParameterDeclaration> lesParametres = ctx.laSignature.lesParametres.desParametres;
		ctx.uneMethode = new MethodDeclaration( leNom, leType, lesParametres);
	}

	@Override
	public void exitConstructeur(ConstructeurContext ctx) {
		ctx.unConstructeur = new ConstructorDeclaration( ctx.leNom.getText(), ctx.lesParametres.desParametres, ctx.leCorps.unBloc);
	}

	@Override
    public void exitBloc(MiniJavaParser.BlocContext ctx) {
        List<Instruction> instructionList = new LinkedList<Instruction>();
        for (MiniJavaParser.InstructionContext iCtx : ctx.lesInstructions) {
        	instructionList.add(iCtx.uneInstruction);
        }
        ctx.unBloc = new Block(instructionList);
    }

    @Override
    public void exitParametres(MiniJavaParser.ParametresContext ctx) {
        List<ParameterDeclaration> lesParametres = new LinkedList<ParameterDeclaration>();
        for (ParametreContext parametre : ctx.lesParametres) {
        	lesParametres.add(parametre.unParametre);
        }
        ctx.desParametres = lesParametres;
    }
    
	@Override
	public void exitParametre(ParametreContext ctx) {
		ctx.unParametre = new ParameterDeclaration( ctx.leNom.getText(), ctx.leType.unType);
	}

    @Override
    public void exitInstructionDeclaration(MiniJavaParser.InstructionDeclarationContext ctx) {
        String name = ctx.leNom.getText();
        Type type = ctx.leType.unType;
        AccessibleExpression valeur = ctx.laValeur.uneExpression;
        ctx.uneInstruction = new VariableDeclaration(name, type, valeur);
    }

    @Override
    public void exitInstructionAffectation(MiniJavaParser.InstructionAffectationContext ctx) {
        ctx.uneInstruction = new Assignment(ctx.leRecepteur.uneExpressionAffectable, ctx.laValeur.uneExpression);
    }

    @Override
    public void exitInstructionAffichage(MiniJavaParser.InstructionAffichageContext ctx) {
        ctx.uneInstruction = new Printer(ctx.laValeur.uneExpression);
    }
    
	@Override
	public void exitInstructionSi(InstructionSiContext ctx) {
		ctx.uneInstruction = new Conditional(ctx.laCondition.uneExpression, ctx.leBlocAlors.unBloc);
	}

    @Override
    public void exitInstructionSiSinon(MiniJavaParser.InstructionSiSinonContext ctx) {
        ctx.uneInstruction = new Conditional(ctx.laCondition.uneExpression, ctx.leBlocAlors.unBloc, ctx.leBlocSinon.unBloc);
    }
    
	@Override
	public void exitInstructionIteration(InstructionIterationContext ctx) {
		ctx.uneInstruction = new Iteration(ctx.laCondition.uneExpression, ctx.leCorps.unBloc);
	}


    @Override
    public void exitInstructionReturn(MiniJavaParser.InstructionReturnContext ctx) {
        ctx.uneInstruction = new Return(ctx.laValeur.uneExpression);
    }
    
    @Override
    public void exitInstructionAppelMethodeExplicite(InstructionAppelMethodeExpliciteContext ctx) {
        ctx.uneInstruction = new MethodCall(ctx.lObjet.uneExpression, ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }
    
    @Override
    public void exitInstructionAppelMethodeImplicite(InstructionAppelMethodeImpliciteContext ctx) {
        ctx.uneInstruction = new MethodCall(ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }
    
	@Override
	public void exitInstructionAppelConstructeurAlternatif(InstructionAppelConstructeurAlternatifContext ctx) {
		ctx.uneInstruction = new ThisCall( ctx.lesArguments.desArguments );
	}

	@Override
	public void exitInstructionAppelConstructeurParent(InstructionAppelConstructeurParentContext ctx) {
		ctx.uneInstruction = new SuperCall( ctx.lesArguments.desArguments );
	}

	@Override
	public void exitEcritureThis(EcritureThisContext ctx) {
		ctx.uneExpressionAffectable = new ThisAssignment();
	}

	@Override
	public void exitEcritureSuper(EcritureSuperContext ctx) {
		ctx.uneExpressionAffectable = new SuperAssignment();
	}

	@Override
	public void exitLectureThis(LectureThisContext ctx) {
		ctx.uneExpression = new ThisAccess();
	}

	@Override
	public void exitLectureSuper(LectureSuperContext ctx) {
		ctx.uneExpression = new SuperAccess();
	}

    @Override
    public void exitAtomique(MiniJavaParser.AtomiqueContext ctx) {
        if (ctx.TypeEntier() != null) {
            ctx.unTypeAtomique = AtomicType.IntegerType;
        } else if (ctx.TypeFlottant() != null) {
            ctx.unTypeAtomique = AtomicType.FloatingType;
        } else if (ctx.TypeBooleen() != null) {
            ctx.unTypeAtomique = AtomicType.BooleanType;
        } else if (ctx.TypeCaractere() != null) {
            ctx.unTypeAtomique = AtomicType.CharacterType;
        } else if (ctx.TypeChaine() != null) {
            ctx.unTypeAtomique = AtomicType.StringType;
        } else if (ctx.TypeVide() != null) {
            ctx.unTypeAtomique = AtomicType.VoidType;
        }
    }

    @Override
    public void exitTypeAtomique(MiniJavaParser.TypeAtomiqueContext ctx) {
        ctx.unType = ctx.atomique().unTypeAtomique;
    }
    
	@Override
	public void exitTypeTableau(TypeTableauContext ctx) {
		ctx.unType = new ArrayType(ctx.leTypeValeur.unType);
	}

    @Override
    public void exitTypeClasse(MiniJavaParser.TypeClasseContext ctx) {
        ctx.unType = new ClassType(ctx.leNom.getText());
    }

    @Override
    public void exitEcritureIdentificateur(EcritureIdentificateurContext ctx) {
        ctx.uneExpressionAffectable = new VariableAssignment(ctx.lIdentificateur.getText());
    }

    @Override
    public void exitEcritureConversion(EcritureConversionContext ctx) {
    	ctx.uneExpressionAffectable = new AssignableConversion(ctx.lAffectable.uneExpressionAffectable, ctx.leType.unType);
    }

    @Override
    public void exitEcritureAttribut(EcritureAttributContext ctx) {
        ctx.uneExpressionAffectable = new AttributeAssignment(ctx.lObjet.uneExpressionAffectable, ctx.leNom.getText());
    }

    @Override
    public void exitEcritureTableau(EcritureTableauContext ctx) {
        ctx.uneExpressionAffectable = new ArrayAssignment(ctx.leTableau.uneExpressionAffectable, ctx.lIndice.uneExpression);
    }
    
    @Override
    public void exitEcritureAppelMethodeExplicite(EcritureAppelMethodeExpliciteContext ctx) {
        ctx.uneExpressionAffectable = new MethodCallAssignment(ctx.lObjet.uneExpressionAffectable, ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }
    
    @Override
    public void exitEcritureAppelMethodeImplicite(EcritureAppelMethodeImpliciteContext ctx) {
        ctx.uneExpressionAffectable = new MethodCallAssignment(ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }

    @Override
    public void exitExpressions(MiniJavaParser.ExpressionsContext ctx) {
        List<AccessibleExpression> expressions = new LinkedList<AccessibleExpression>();
        for (MiniJavaParser.ExpressionContext expressionCtx : ctx.lesExpressions) {
            expressions.add(expressionCtx.uneExpression);
        }
        ctx.desExpressions = expressions;
    }

    @Override
    public void exitArguments(MiniJavaParser.ArgumentsContext ctx) {
        List<AccessibleExpression> expressions = new LinkedList<AccessibleExpression>();
        if (ctx.lesExpressions != null) {
        	for (MiniJavaParser.ExpressionContext expressionCtx : ctx.lesExpressions.lesExpressions) {
        		expressions.add(expressionCtx.uneExpression);
        	}
        }
        ctx.desArguments = expressions;
    }

    @Override
    public void exitLectureIdentificateur(LectureIdentificateurContext ctx) {
        ctx.uneExpression = new IdentifierAccess(ctx.leNom.getText());
    }

    @Override
    public void exitExpressionAdditive(MiniJavaParser.ExpressionAdditiveContext ctx) {
        BinaryOperator operateur;
        switch (ctx.operateur.getText()) {
            case "+":
                operateur = BinaryOperator.Add;
                break;
            case "-":
                operateur = BinaryOperator.Substract;
                break;
            default:
                throw new RuntimeException("Unknown operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, operateur, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionMultiplicative(MiniJavaParser.ExpressionMultiplicativeContext ctx) {
        BinaryOperator operateur;
        switch (ctx.operateur.getText()) {
            case "*":
                operateur = BinaryOperator.Multiply;
                break;
            case "/":
                operateur = BinaryOperator.Divide;
                break;
            case "%":
                operateur = BinaryOperator.Modulo;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, operateur, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionConjonction(MiniJavaParser.ExpressionConjonctionContext ctx) {
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, BinaryOperator.And, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionDisjonction(MiniJavaParser.ExpressionDisjonctionContext ctx) {
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, BinaryOperator.Or, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionConditionelle(ExpressionConditionelleContext ctx) {
        ctx.uneExpression = new AccessibleConditional(ctx.laCondition.uneExpression, ctx.lExpressionAlors.uneExpression, ctx.lExpressionSinon.uneExpression);
    }

    @Override
    public void exitExpressionNegation(MiniJavaParser.ExpressionNegationContext ctx) {
        ctx.uneExpression = new UnaryExpression(UnaryOperator.Negate, ctx.leParametre.uneExpression);
    }

    @Override
    public void exitExpressionFalse(MiniJavaParser.ExpressionFalseContext ctx) {
        ctx.uneExpression = BooleanValue.False;
    }

    @Override
    public void exitExpressionTrue(MiniJavaParser.ExpressionTrueContext ctx) {
        ctx.uneExpression = BooleanValue.True;
    }

    @Override
    public void exitExpressionInt(MiniJavaParser.ExpressionIntContext ctx) {
        ctx.uneExpression = new IntegerValue(ctx.Entier().getText());
    }

    @Override
    public void exitExpresionFloat(MiniJavaParser.ExpresionFloatContext ctx) {
        ctx.uneExpression = new FloatingValue(ctx.Flottant().getText());
    }

    @Override
    public void exitExpressionCharacter(MiniJavaParser.ExpressionCharacterContext ctx) {
        ctx.uneExpression = new CharacterValue(ctx.Caractere().getText());
    }

    @Override
    public void exitExpressionString(MiniJavaParser.ExpressionStringContext ctx) {
        ctx.uneExpression = new StringValue(ctx.Chaine().getText());
    }

    @Override
    public void exitExpressionNull(MiniJavaParser.ExpressionNullContext ctx) {
        ctx.uneExpression = NullValue.Null;
    }

    @Override
    public void exitExpressionEgalite(MiniJavaParser.ExpressionEgaliteContext ctx) {
        BinaryOperator operator;
        switch (ctx.operateur.getText()) {
            case "==":
                operator = BinaryOperator.Equals;
                break;
            case "!=":
                operator = BinaryOperator.Different;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, operator, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionComparaison(MiniJavaParser.ExpressionComparaisonContext ctx) {
        BinaryOperator operator;
        switch (ctx.operateur.getText()) {
            case "<":
                operator = BinaryOperator.Lesser;
                break;
            case "<=":
                operator = BinaryOperator.LesserOrEqual;
                break;
            case ">":
                operator = BinaryOperator.Greater;
                break;
            case ">=":
                operator = BinaryOperator.GreaterOrEqual;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, operator, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionParenthese(MiniJavaParser.ExpressionParentheseContext ctx) {
        ctx.uneExpression = ctx.expression().uneExpression;
    }

    @Override
    public void exitExpressionOpposee(ExpressionOpposeeContext ctx) {
        ctx.uneExpression = new UnaryExpression(UnaryOperator.Opposite, ctx.leParametre.uneExpression);
    }

    @Override
    public void exitExpressionConversion(MiniJavaParser.ExpressionConversionContext ctx) {
    	ctx.uneExpression = new AccessibleConversion(ctx.uneExpression, ctx.leType.unType );
    }

    @Override
    public void exitLectureTableau(LectureTableauContext ctx) {
        ctx.uneExpression = new ArrayAccess(ctx.leTableau.uneExpression, ctx.lIndice.uneExpression);
    }
    
    @Override
    public void exitLectureAttribut(LectureAttributContext ctx) {
        ctx.uneExpression = new AttributeAccess(ctx.lObjet.uneExpression, ctx.leNom.getText());
    }
    
    @Override
    public void exitLectureAppelMethodeExplicite(MiniJavaParser.LectureAppelMethodeExpliciteContext ctx) {
        ctx.uneExpression = new MethodCallAccess(ctx.lobjet.uneExpression, ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }
    
    @Override
    public void exitLectureAppelMethodeImplicite(MiniJavaParser.LectureAppelMethodeImpliciteContext ctx) {
        ctx.uneExpression = new MethodCallAccess(ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }

    @Override
    public void exitCreationTableau(MiniJavaParser.CreationTableauContext ctx) {
        ctx.uneExpression = new ArrayAllocation(ctx.leType.unType, ctx.laTaille.uneExpression);     
    }

    @Override
    public void exitCreationObjet(MiniJavaParser.CreationObjetContext ctx) {
        ctx.uneExpression = new ObjectAllocation(ctx.leNom.getText(), ctx.lesArguments.desArguments);
    }

}
