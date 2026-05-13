// Generated from MiniJavaParser.g4 by ANTLR 4.13.1

package fr.n7.stl.minijava.parser;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.IOException;
import fr.n7.stl.minic.ast.*;
import fr.n7.stl.minic.ast.expression.*;
import fr.n7.stl.minic.ast.expression.accessible.*;
import fr.n7.stl.minic.ast.expression.allocation.*;
import fr.n7.stl.minic.ast.expression.assignable.*;
import fr.n7.stl.minic.ast.expression.value.*;
import fr.n7.stl.minic.ast.instruction.*;
import fr.n7.stl.minic.ast.instruction.declaration.*;
import fr.n7.stl.minic.ast.scope.*;
import fr.n7.stl.minic.ast.type.*;
import fr.n7.stl.minic.ast.type.declaration.*;
import fr.n7.stl.util.*;
import fr.n7.stl.tam.ast.*;
import fr.n7.stl.tam.ast.impl.*;
import fr.n7.stl.minijava.ast.type.declaration.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(MiniJavaParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(MiniJavaParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(MiniJavaParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(MiniJavaParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(MiniJavaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(MiniJavaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#principale}.
	 * @param ctx the parse tree
	 */
	void enterPrincipale(MiniJavaParser.PrincipaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#principale}.
	 * @param ctx the parse tree
	 */
	void exitPrincipale(MiniJavaParser.PrincipaleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodeMain}
	 * labeled alternative in {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodeMain(MiniJavaParser.MethodeMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodeMain}
	 * labeled alternative in {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodeMain(MiniJavaParser.MethodeMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributMain}
	 * labeled alternative in {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributMain(MiniJavaParser.AttributMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributMain}
	 * labeled alternative in {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributMain(MiniJavaParser.AttributMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(MiniJavaParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(MiniJavaParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#accessRight}.
	 * @param ctx the parse tree
	 */
	void enterAccessRight(MiniJavaParser.AccessRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#accessRight}.
	 * @param ctx the parse tree
	 */
	void exitAccessRight(MiniJavaParser.AccessRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributObjet}
	 * labeled alternative in {@link MiniJavaParser#attribut}.
	 * @param ctx the parse tree
	 */
	void enterAttributObjet(MiniJavaParser.AttributObjetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributObjet}
	 * labeled alternative in {@link MiniJavaParser#attribut}.
	 * @param ctx the parse tree
	 */
	void exitAttributObjet(MiniJavaParser.AttributObjetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributClasse}
	 * labeled alternative in {@link MiniJavaParser#attribut}.
	 * @param ctx the parse tree
	 */
	void enterAttributClasse(MiniJavaParser.AttributClasseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributClasse}
	 * labeled alternative in {@link MiniJavaParser#attribut}.
	 * @param ctx the parse tree
	 */
	void exitAttributClasse(MiniJavaParser.AttributClasseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodeObjet}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterMethodeObjet(MiniJavaParser.MethodeObjetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodeObjet}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitMethodeObjet(MiniJavaParser.MethodeObjetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodeClasse}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterMethodeClasse(MiniJavaParser.MethodeClasseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodeClasse}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitMethodeClasse(MiniJavaParser.MethodeClasseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodeAbstraite}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void enterMethodeAbstraite(MiniJavaParser.MethodeAbstraiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodeAbstraite}
	 * labeled alternative in {@link MiniJavaParser#methode}.
	 * @param ctx the parse tree
	 */
	void exitMethodeAbstraite(MiniJavaParser.MethodeAbstraiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(MiniJavaParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(MiniJavaParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#constructeur}.
	 * @param ctx the parse tree
	 */
	void enterConstructeur(MiniJavaParser.ConstructeurContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#constructeur}.
	 * @param ctx the parse tree
	 */
	void exitConstructeur(MiniJavaParser.ConstructeurContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(MiniJavaParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(MiniJavaParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parametres}.
	 * @param ctx the parse tree
	 */
	void enterParametres(MiniJavaParser.ParametresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parametres}.
	 * @param ctx the parse tree
	 */
	void exitParametres(MiniJavaParser.ParametresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parametre}.
	 * @param ctx the parse tree
	 */
	void enterParametre(MiniJavaParser.ParametreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parametre}.
	 * @param ctx the parse tree
	 */
	void exitParametre(MiniJavaParser.ParametreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionDeclaration}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionDeclaration(MiniJavaParser.InstructionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionDeclaration}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionDeclaration(MiniJavaParser.InstructionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAffectation}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAffectation(MiniJavaParser.InstructionAffectationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAffectation}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAffectation(MiniJavaParser.InstructionAffectationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAffichage}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAffichage(MiniJavaParser.InstructionAffichageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAffichage}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAffichage(MiniJavaParser.InstructionAffichageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionSiSinon}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionSiSinon(MiniJavaParser.InstructionSiSinonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionSiSinon}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionSiSinon(MiniJavaParser.InstructionSiSinonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionSi}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionSi(MiniJavaParser.InstructionSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionSi}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionSi(MiniJavaParser.InstructionSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionReturn}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionReturn(MiniJavaParser.InstructionReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionReturn}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionReturn(MiniJavaParser.InstructionReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionIteration}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionIteration(MiniJavaParser.InstructionIterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionIteration}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionIteration(MiniJavaParser.InstructionIterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAppelMethodeExplicite(MiniJavaParser.InstructionAppelMethodeExpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAppelMethodeExplicite(MiniJavaParser.InstructionAppelMethodeExpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAppelMethodeImplicite(MiniJavaParser.InstructionAppelMethodeImpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAppelMethodeImplicite(MiniJavaParser.InstructionAppelMethodeImpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAppelConstructeurAlternatif}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAppelConstructeurAlternatif(MiniJavaParser.InstructionAppelConstructeurAlternatifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAppelConstructeurAlternatif}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAppelConstructeurAlternatif(MiniJavaParser.InstructionAppelConstructeurAlternatifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instructionAppelConstructeurParent}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAppelConstructeurParent(MiniJavaParser.InstructionAppelConstructeurParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instructionAppelConstructeurParent}
	 * labeled alternative in {@link MiniJavaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAppelConstructeurParent(MiniJavaParser.InstructionAppelConstructeurParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#atomique}.
	 * @param ctx the parse tree
	 */
	void enterAtomique(MiniJavaParser.AtomiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#atomique}.
	 * @param ctx the parse tree
	 */
	void exitAtomique(MiniJavaParser.AtomiqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAtomique}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeAtomique(MiniJavaParser.TypeAtomiqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAtomique}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeAtomique(MiniJavaParser.TypeAtomiqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeClasse}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeClasse(MiniJavaParser.TypeClasseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeClasse}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeClasse(MiniJavaParser.TypeClasseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTableau}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeTableau(MiniJavaParser.TypeTableauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTableau}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeTableau(MiniJavaParser.TypeTableauContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureIdentificateur}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureIdentificateur(MiniJavaParser.EcritureIdentificateurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureIdentificateur}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureIdentificateur(MiniJavaParser.EcritureIdentificateurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureAppelMethodeExplicite(MiniJavaParser.EcritureAppelMethodeExpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureAppelMethodeExplicite(MiniJavaParser.EcritureAppelMethodeExpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureThis}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureThis(MiniJavaParser.EcritureThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureThis}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureThis(MiniJavaParser.EcritureThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureConversion}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureConversion(MiniJavaParser.EcritureConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureConversion}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureConversion(MiniJavaParser.EcritureConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureAppelMethodeImplicite(MiniJavaParser.EcritureAppelMethodeImpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureAppelMethodeImplicite(MiniJavaParser.EcritureAppelMethodeImpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureAttribut}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureAttribut(MiniJavaParser.EcritureAttributContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureAttribut}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureAttribut(MiniJavaParser.EcritureAttributContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureSuper}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureSuper(MiniJavaParser.EcritureSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureSuper}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureSuper(MiniJavaParser.EcritureSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ecritureTableau}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void enterEcritureTableau(MiniJavaParser.EcritureTableauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ecritureTableau}
	 * labeled alternative in {@link MiniJavaParser#affectable}.
	 * @param ctx the parse tree
	 */
	void exitEcritureTableau(MiniJavaParser.EcritureTableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(MiniJavaParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(MiniJavaParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MiniJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MiniJavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCharacter}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCharacter(MiniJavaParser.ExpressionCharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCharacter}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCharacter(MiniJavaParser.ExpressionCharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOpposee}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOpposee(MiniJavaParser.ExpressionOpposeeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOpposee}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOpposee(MiniJavaParser.ExpressionOpposeeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creationObjet}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCreationObjet(MiniJavaParser.CreationObjetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creationObjet}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCreationObjet(MiniJavaParser.CreationObjetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionConditionelle}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConditionelle(MiniJavaParser.ExpressionConditionelleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionConditionelle}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConditionelle(MiniJavaParser.ExpressionConditionelleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureTableau}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureTableau(MiniJavaParser.LectureTableauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureTableau}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureTableau(MiniJavaParser.LectureTableauContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureAppelMethodeImplicite(MiniJavaParser.LectureAppelMethodeImpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureAppelMethodeImplicite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureAppelMethodeImplicite(MiniJavaParser.LectureAppelMethodeImpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionParenthese}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParenthese(MiniJavaParser.ExpressionParentheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionParenthese}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParenthese(MiniJavaParser.ExpressionParentheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureIdentificateur}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureIdentificateur(MiniJavaParser.LectureIdentificateurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureIdentificateur}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureIdentificateur(MiniJavaParser.LectureIdentificateurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureThis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureThis(MiniJavaParser.LectureThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureThis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureThis(MiniJavaParser.LectureThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creationTableau}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCreationTableau(MiniJavaParser.CreationTableauContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creationTableau}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCreationTableau(MiniJavaParser.CreationTableauContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureAttribut}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureAttribut(MiniJavaParser.LectureAttributContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureAttribut}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureAttribut(MiniJavaParser.LectureAttributContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNull}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNull(MiniJavaParser.ExpressionNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNull}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNull(MiniJavaParser.ExpressionNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionConversion}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConversion(MiniJavaParser.ExpressionConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionConversion}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConversion(MiniJavaParser.ExpressionConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDisjonction}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDisjonction(MiniJavaParser.ExpressionDisjonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDisjonction}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDisjonction(MiniJavaParser.ExpressionDisjonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionConjonction}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConjonction(MiniJavaParser.ExpressionConjonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionConjonction}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConjonction(MiniJavaParser.ExpressionConjonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionComparaison}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionComparaison(MiniJavaParser.ExpressionComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionComparaison}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionComparaison(MiniJavaParser.ExpressionComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAdditive}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdditive(MiniJavaParser.ExpressionAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAdditive}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdditive(MiniJavaParser.ExpressionAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionTrue}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionTrue(MiniJavaParser.ExpressionTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionTrue}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionTrue(MiniJavaParser.ExpressionTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNegation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegation(MiniJavaParser.ExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNegation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegation(MiniJavaParser.ExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMultiplicative}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiplicative(MiniJavaParser.ExpressionMultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMultiplicative}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiplicative(MiniJavaParser.ExpressionMultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionFalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFalse(MiniJavaParser.ExpressionFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionFalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFalse(MiniJavaParser.ExpressionFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresionFloat}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpresionFloat(MiniJavaParser.ExpresionFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionFloat}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpresionFloat(MiniJavaParser.ExpresionFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionString}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionString(MiniJavaParser.ExpressionStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionString}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionString(MiniJavaParser.ExpressionStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureSuper}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureSuper(MiniJavaParser.LectureSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureSuper}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureSuper(MiniJavaParser.LectureSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionEgalite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEgalite(MiniJavaParser.ExpressionEgaliteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionEgalite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEgalite(MiniJavaParser.ExpressionEgaliteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lectureAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLectureAppelMethodeExplicite(MiniJavaParser.LectureAppelMethodeExpliciteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lectureAppelMethodeExplicite}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLectureAppelMethodeExplicite(MiniJavaParser.LectureAppelMethodeExpliciteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInt}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInt(MiniJavaParser.ExpressionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInt}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInt(MiniJavaParser.ExpressionIntContext ctx);
}