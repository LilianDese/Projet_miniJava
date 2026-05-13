package fr.n7.stl.minic;

import fr.n7.stl.minic.parser.MiniCParserBaseListener;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import fr.n7.stl.minic.ast.Block;
import fr.n7.stl.minic.ast.Program;
import fr.n7.stl.minic.ast.expression.*;
import fr.n7.stl.minic.ast.expression.accessible.*;
import fr.n7.stl.minic.ast.expression.allocation.*;
import fr.n7.stl.minic.ast.expression.assignable.*;
import fr.n7.stl.minic.ast.expression.value.*;
import fr.n7.stl.minic.ast.instruction.*;
import fr.n7.stl.minic.ast.instruction.declaration.*;
import fr.n7.stl.minic.ast.scope.SymbolTable;
import fr.n7.stl.minic.ast.type.*;
import fr.n7.stl.minic.ast.type.declaration.*;
import fr.n7.stl.tam.ast.*;
import fr.n7.stl.tam.ast.impl.TAMFactoryImpl;
import fr.n7.stl.util.Pair;
import fr.n7.stl.minic.parser.MiniCParser;
import fr.n7.stl.minic.parser.MiniCParser.*;

public class ASTBuilder extends MiniCParserBaseListener {

    private String output_path;
    private Program main;

    public ASTBuilder(String _output) {
        this.output_path = _output;
    }

    /**
     * Start the compile phase : collect, resolve, memory allocation and
     * code generation.
     */
    public void startCompilation() {
        System.out.println(this.main);
        if (this.main.collectAndPartialResolve()) {
            System.out.println("collect succeeded");
            if (this.main.completeResolve()) {
                System.out.println("Resolve succeeded.");
                if (this.main.checkType()) {
                    System.out.println("Type verification succeeded.");

                    System.out.println("Code generation ...");
                    this.main.allocateMemory(Register.SB, 0);
                    try {
                        PrintWriter writer = new PrintWriter(output_path);
                        TAMFactory factory = new TAMFactoryImpl();
                        Fragment f = this.main.getCode(factory);
                        f.add(factory.createHalt());
                        // f.append(this.mainBlock.getFunctions(factory));
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
                System.out.println("Resolve failed.");
            }
        } else {
            System.out.println("Collect failed : ");
        }
    }

    @Override
    public void exitDeclarationProgramme(DeclarationProgrammeContext ctx) {
    	List<DeclarationInstruction> lesDeclarations = new LinkedList<DeclarationInstruction>();
    	for (MiniCParser.DeclarationContext unContexte : ctx.declarations) {
    		lesDeclarations.add( unContexte.uneDeclaration);
    	}
    	this.main = new Program( lesDeclarations, ctx.main.unBloc);
    }

    @Override
    public void exitBloc(BlocContext ctx) {
        List<Instruction> instructionList = new LinkedList<>();
        for (MiniCParser.InstructionContext iCtx : ctx.instructions) {
            if (iCtx.uneInstruction != null) {
                instructionList.add(iCtx.uneInstruction);
            }
        }
        ctx.unBloc = new Block(instructionList);
    }

    @Override
    public void exitParametres(ParametresContext ctx) {
        List<ParameterDeclaration> listParameters = new LinkedList<>();
        if (ctx.ident1 != null && ctx.type1 != null) {
            String name1 = ctx.ident1.unIdentifiant.getLeft();
            Type type1 = completeType(ctx.ident1.unIdentifiant.getRight(), ctx.type1.unType);
            listParameters.add(new ParameterDeclaration(name1, type1));
            for (int i = 0; i < ctx.suiteIdent.size(); i++) {
                String name = ctx.suiteIdent.get(i).unIdentifiant.getLeft();
                Type type = completeType(ctx.suiteIdent.get(i).unIdentifiant.getRight(), ctx.suiteType.get(i).unType);
                listParameters.add(new ParameterDeclaration(name, type));
            }
        } 
        ctx.lesParametres = listParameters;
    }

    private Type completeType(PartialType pType, Type type)  {
        Type res;
        if (pType == null) {
            res = type;
        } else {
            res = pType.complete(type);
        }
        return res;
    }

    @Override
    public void exitInstructionDeclaration(InstructionDeclarationContext ctx) {
        String name = ctx.identifiant().unIdentifiant.getLeft();
        Type type = completeType(ctx.identifiant().unIdentifiant.getRight(), ctx.type().unType);
        if (ctx.DefinitionConstante() != null) {
            ctx.uneInstruction = new ConstantDeclaration(name, type, ctx.expression().uneExpression);
        } else {
            ctx.uneInstruction = new VariableDeclaration(name, type, ctx.expression().uneExpression);
        }
    }

    @Override
    public void exitDeclarationType(DeclarationTypeContext ctx) {
        String name = ctx.identifiant().unIdentifiant.getLeft();
        Type type = completeType(ctx.identifiant().unIdentifiant.getRight(), ctx.type().unType);
        ctx.uneDeclaration = new TypeDeclaration(name, type);
    }

    @Override
    public void exitDeclarationFonction(DeclarationFonctionContext ctx) {
        String name = ctx.identifiant().unIdentifiant.getLeft();
        Type returnType = completeType(ctx.identifiant().unIdentifiant.getRight(), ctx.type().unType);
        List<ParameterDeclaration> parameters = ctx.parametres().lesParametres;
        Block body = ctx.bloc().unBloc; 
        ctx.uneDeclaration = new FunctionDeclaration(name, returnType, parameters, body);
    }

    @Override
    public void exitInstructionAffectation(InstructionAffectationContext ctx) {
        ctx.uneInstruction = new Assignment(ctx.affectable().uneAffectable, ctx.valeur.uneExpression);
    }

    @Override
    public void exitInstructionAffichage(InstructionAffichageContext ctx) {
        ctx.uneInstruction = new Printer(ctx.expression().uneExpression);
    }

    @Override
    public void exitInstructionTantQue(InstructionTantQueContext ctx) {
        ctx.uneInstruction = new Iteration(ctx.expression().uneExpression, ctx.alors.unBloc);
    }

    @Override
    public void exitInstructionSiSinon(InstructionSiSinonContext ctx) {
        if (ctx.sinon == null) {
            ctx.uneInstruction = new Conditional(ctx.expression().uneExpression, ctx.alors.unBloc);
        }
        else {
            ctx.uneInstruction = new Conditional(ctx.expression().uneExpression, ctx.alors.unBloc, ctx.sinon.unBloc);
        }
    }

    @Override
    public void exitInstructionReturn(InstructionReturnContext ctx) {
        ctx.uneInstruction = new Return(ctx.expression().uneExpression);
    }

    @Override
    public void exitAtomique(AtomiqueContext ctx) {
        if (ctx.TypeEntier() != null) {
            ctx.unTypeElementaire = AtomicType.IntegerType;
        } else if (ctx.TypeFlottant() != null) {
            ctx.unTypeElementaire = AtomicType.FloatingType;
        } else if (ctx.TypeBooleen() != null) {
            ctx.unTypeElementaire = AtomicType.BooleanType;
        } else if (ctx.TypeCaractere() != null) {
            ctx.unTypeElementaire = AtomicType.CharacterType;
        } else if (ctx.TypeChaine() != null) {
            ctx.unTypeElementaire = AtomicType.StringType;
        } else if (ctx.TypeVide() != null) {
            ctx.unTypeElementaire = AtomicType.VoidType;
        }
    }

    @Override
    public void exitChamp(ChampContext ctx) {
        String name = ctx.identifiant().unIdentifiant.getLeft();
        Type type = completeType(ctx.identifiant().unIdentifiant.getRight(), ctx.type().unType);
        ctx.unChamp = new FieldDeclaration(name, type);
    }

    @Override
    public void exitEtiquettes(EtiquettesContext ctx) {
        List<LabelDeclaration> listLabels = new LinkedList<>();
        listLabels.add(new LabelDeclaration(ctx.premiere.getText()));
        for (Token lCtx : ctx.suite) {
            listLabels.add(new LabelDeclaration(lCtx.getText()));
        }
        ctx.lesEtiquettes = listLabels;
    }

    @Override
    public void exitTypeAtomic(TypeAtomicContext ctx) {
        ctx.unType = ctx.atomique().unTypeElementaire;
    }

    @Override
    public void exitTypeNamed(TypeNamedContext ctx) {
        ctx.unType = new NamedType(ctx.Identificateur().getText());
    }

    @Override
    public void exitTypeCouple(TypeCoupleContext ctx) {
        ctx.unType = new CoupleType(ctx.gauche.unType, ctx.droite.unType);
    }

    @Override
    public void exitTypeRecord(TypeRecordContext ctx) {
        List<FieldDeclaration> listDeclarations = new LinkedList<>();
        for (ChampContext cCtx : ctx.champs) {
            if (cCtx.unChamp != null) {
                listDeclarations.add(cCtx.unChamp);
            }
        }
        ctx.unType = new RecordType(ctx.Identificateur().getText(), listDeclarations);
    }

    @Override
    public void exitTypeEnum(TypeEnumContext ctx) {
        ctx.unType = new EnumerationType(ctx.Identificateur().getText(), ctx.etiquettes().lesEtiquettes);
    }

    @Override
    public void exitAffectableIdentifiant(AffectableIdentifiantContext ctx) {
        ctx.uneAffectable = new VariableAssignment(ctx.ident.getText());
    }

    @Override
    public void exitAffectableConversion(AffectableConversionContext ctx) {
        if (ctx.atomique() != null) {
            ctx.uneAffectable = new AssignableConversion(ctx.affectable().uneAffectable, ctx.atomique().unTypeElementaire);
        } else if (ctx.Identificateur() != null) {
            ctx.uneAffectable = new AssignableConversion(ctx.affectable().uneAffectable, ctx.Identificateur().getText());
        } else {
            throw new RuntimeException("Both atomic and Identificateur are null in rule affectableConversion");
        }
    }

    @Override
    public void exitAffectableField(AffectableFieldContext ctx) {
        ctx.uneAffectable = new FieldAssignment(ctx.affectable().uneAffectable, ctx.Identificateur().getText());
    }

    @Override
    public void exitAffectableArray(AffectableArrayContext ctx) {
        ctx.uneAffectable = new ArrayAssignment(ctx.affectable().uneAffectable, ctx.expression().uneExpression);
    }

    @Override
    public void exitAffectablePointer(AffectablePointerContext ctx) {
        ctx.uneAffectable = new PointerAssignment(ctx.expression().uneExpression);
    }

    @Override
    public void exitExpressions(ExpressionsContext ctx) {
        List<AccessibleExpression> listExpressions = new LinkedList<>();
        listExpressions.add(ctx.premiere.uneExpression);
        for (ExpressionContext eCtx : ctx.suite) {
            if (eCtx.uneExpression != null) {
                listExpressions.add(eCtx.uneExpression);
            }
        }
        ctx.desExpressions = listExpressions;
    }

    @Override
    public void exitArguments(ArgumentsContext ctx) {
        if (ctx.expressions() != null) {
            ctx.desParametres = ctx.expressions().desExpressions;
        } else {
            ctx.desParametres = new LinkedList<>();
        }
    }

    @Override
    public void exitExpressionAccess(ExpressionAccessContext ctx) {
        ctx.uneExpression = new IdentifierAccess(ctx.Identificateur().getText());
    }

    @Override
    public void exitExpressionAdditive(ExpressionAdditiveContext ctx) {
        BinaryOperator op;
        switch (ctx.op.getText()) {
            case "+":
                op = BinaryOperator.Add;
                break;
            case "-":
                op = BinaryOperator.Substract;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, op, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionMultiplicative(ExpressionMultiplicativeContext ctx) {
        BinaryOperator op;
        switch (ctx.op.getText()) {
            case "*":
                op = BinaryOperator.Multiply;
                break;
            case "/":
                op = BinaryOperator.Divide;
                break;
            case "%":
                op = BinaryOperator.Modulo;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, op, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionAnd(ExpressionAndContext ctx) {
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, BinaryOperator.And, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionOr(ExpressionOrContext ctx) {
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, BinaryOperator.Or, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionConditional(ExpressionConditionalContext ctx) {
        ctx.uneExpression = new AccessibleConditional(ctx.condition.uneExpression, ctx.alors.uneExpression, ctx.sinon.uneExpression);
    }

    @Override
    public void exitExpressionField(ExpressionFieldContext ctx) {
        ctx.uneExpression = new FieldAccess(ctx.expression().uneExpression, ctx.Identificateur().getText());
    }

    @Override
    public void exitExpressionFirst(ExpressionFirstContext ctx) {
        ctx.uneExpression = new First(ctx.expression().uneExpression);
    }

    @Override
    public void exitExpressionSecond(ExpressionSecondContext ctx) {
        ctx.uneExpression = new Second(ctx.expression().uneExpression);
    }

    @Override
    public void exitExpressionSequence(ExpressionSequenceContext ctx) {
        ctx.uneExpression = new Sequence(ctx.expressions().desExpressions);
    }

    @Override
    public void exitExpressionCouple(ExpressionCoupleContext ctx) {
        ctx.uneExpression = new Couple(ctx.gauche.uneExpression, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionNot(ExpressionNotContext ctx) {
        ctx.uneExpression = new UnaryExpression(UnaryOperator.Negate, ctx.expr.uneExpression);
    }

    @Override
    public void exitExpressionFalse(ExpressionFalseContext ctx) {
        ctx.uneExpression = BooleanValue.False;
    }

    @Override
    public void exitExpressionFunctionCall(ExpressionFunctionCallContext ctx) {
        ctx.uneExpression = new FunctionCall(ctx.Identificateur().getText(), ctx.arguments().desParametres);
    }

    @Override
    public void exitExpressionTrue(ExpressionTrueContext ctx) {
        ctx.uneExpression = BooleanValue.True;
    }

    @Override
    public void exitExpressionInt(ExpressionIntContext ctx) {
        ctx.uneExpression = new IntegerValue(ctx.Entier().getText());
    }

    @Override
    public void exitExpresionFloat(ExpresionFloatContext ctx) {
        ctx.uneExpression = new FloatingValue(ctx.Flottant().getText());
    }

    @Override
    public void exitExpressionCharacter(ExpressionCharacterContext ctx) {
        ctx.uneExpression = new CharacterValue(ctx.Caractere().getText());
    }

    @Override
    public void exitExpressionString(ExpressionStringContext ctx) {
        ctx.uneExpression = new StringValue(ctx.Chaine().getText());
    }

    @Override
    public void exitExpressionNull(ExpressionNullContext ctx) {
        ctx.uneExpression = NullValue.Null;
    }

    @Override
    public void exitExpressionEquality(ExpressionEqualityContext ctx) {
        BinaryOperator op;
        switch (ctx.op.getText()) {
            case "==":
                op = BinaryOperator.Equals;
                break;
            case "!=":
                op = BinaryOperator.Different;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, op, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionInequality(ExpressionInequalityContext ctx) {
        BinaryOperator op;
        switch (ctx.op.getText()) {
            case "<":
                op = BinaryOperator.Lesser;
                break;
            case "<=":
                op = BinaryOperator.LesserOrEqual;
                break;
            case ">":
                op = BinaryOperator.Greater;
                break;
            case ">=":
                op = BinaryOperator.GreaterOrEqual;
                break;
            default:
                throw new RuntimeException("Unkonwn operator");
        }
        ctx.uneExpression = new BinaryExpression(ctx.gauche.uneExpression, op, ctx.droite.uneExpression);
    }

    @Override
    public void exitExpressionParenthese(ExpressionParentheseContext ctx) {
        ctx.uneExpression = ctx.expression().uneExpression;
    }

    @Override
    public void exitExpressionOpposite(ExpressionOppositeContext ctx) {
        ctx.uneExpression = new UnaryExpression(UnaryOperator.Opposite, ctx.expression().uneExpression);
    }

    @Override
    public void exitExpressionAddress(ExpressionAddressContext ctx) {
        ctx.uneExpression = new AddressAccess(ctx.affectable().uneAffectable);
    }

    @Override
    public void exitExpressionConversion(ExpressionConversionContext ctx) {
        if (ctx.atomique() != null) {
            ctx.uneExpression = new AccessibleConversion(ctx.expression().uneExpression, ctx.atomique().unTypeElementaire);
        } else if (ctx.Identificateur() != null) {
            ctx.uneExpression = new AccessibleConversion(ctx.expression().uneExpression, ctx.Identificateur().getText());
        } else {
            throw new RuntimeException("Both atomic and Identificateur are null in rule ExpressionConversion");
        }
    }

    @Override
    public void exitExpressionPointerAccess(ExpressionPointerAccessContext ctx) {
        ctx.uneExpression = new PointerAccess(ctx.expression().uneExpression);
    }

    @Override
    public void exitExpressionArrayAcess(ExpressionArrayAcessContext ctx) {
        ctx.uneExpression = new ArrayAccess(ctx.tableau.uneExpression, ctx.indice.uneExpression);
    }

    @Override
    public void exitExpressionArrayAllocation(ExpressionArrayAllocationContext ctx) {
        ctx.uneExpression = new ArrayAllocation(ctx.type().unType, ctx.expression().uneExpression);     
    }

    @Override
    public void exitExpressionPointerAllocation(ExpressionPointerAllocationContext ctx) {
        ctx.uneExpression = new PointerAllocation(ctx.type().unType);
    }

    @Override
    public void exitIdentifiant(IdentifiantContext ctx) {
        if (ctx.Identificateur() != null) {
            ctx.unIdentifiant = new Pair<String, PartialType>(ctx.Identificateur().getText(), null);
        } else if (ctx.ParentheseOuvrante() != null) {
            ctx.unIdentifiant = ctx.identifiant().unIdentifiant;
        } else {
            Pair<String, PartialType> ident = ctx.identifiant().unIdentifiant;
            PartialType newPartialType = (ctx.Asterisque() != null) ? new PartialPointerType() : new PartialArrayType(); 
            if (ident.getRight() == null) {
                ident.setRight(newPartialType);
            } else {
                ident.getRight().enrich(newPartialType);
            }
            ctx.unIdentifiant = ident;
        }
    }
}
