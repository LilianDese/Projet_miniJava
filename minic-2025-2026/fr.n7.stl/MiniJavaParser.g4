parser grammar MiniJavaParser;
options { tokenVocab=MiniJavaLexer; }

@header {
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
}

programme : lesClasses=classes laPrincipale=principale;

classes returns [List<ClassDeclaration> desClasses]:
    lesClasses+=classe*;

classe returns [ClassDeclaration uneClasse]:
    estAbstraite=Abstrait? Classe leNom=Identificateur (Herite heriteDe=Identificateur)? AccoladeOuvrante lesElements=elements AccoladeFermante;

principale returns [MainDeclaration unPrincipal]:
    Public Classe leNom=Identificateur AccoladeOuvrante
    	lesDeclarations+=declaration*
        Public DeClasse TypeVide MethodePrincipale ParentheseOuvrante TypeChaine CrochetOuvrant CrochetFermant Identificateur ParentheseFermante 
        leCorps=bloc
    AccoladeFermante;
    
declaration returns [Declaration uneDeclaration]:
	DeClasse laSignature=signature leCorps=bloc #methodeMain
	| DeClasse estDefinitif=Definitif? leType=type leNom=Identificateur Egal laValeur=expression PointVirgule #attributMain
;

elements returns [List<ClassElement> desElements]:
    lesElements+=element*;

accessRight returns [AccessRight unDroit]:
    Public | Protege | Prive;

element returns [ClassElement unElement]:
    leDroit=accessRight (attribut | methode | constructeur);

attribut returns [AttributeDeclaration unAttribut]:
      leType=type leNom=Identificateur PointVirgule #attributObjet
    | DeClasse estDefinitif=Definitif? leType=type leNom=Identificateur Egal laValeur=expression PointVirgule #attributClasse
;

methode returns [MethodDeclaration uneMethode]:
	estDefinitif=Definitif? laSignature=signature leCorps=bloc #methodeObjet
    | DeClasse Definitif? laSignature=signature leCorps=bloc #methodeClasse
    | Abstrait laSignature=signature PointVirgule #methodeAbstraite
;

signature returns [FunctionType uneSignature]:
    leRetour=type leNom=Identificateur ParentheseOuvrante lesParametres=parametres ParentheseFermante;

constructeur returns [ConstructorDeclaration unConstructeur]:
    leNom=Identificateur ParentheseOuvrante lesParametres=parametres ParentheseFermante leCorps=bloc;

bloc returns [Block unBloc]: 
	AccoladeOuvrante lesInstructions += instruction* AccoladeFermante;

// Liste de declarations de paramètres séparées par une virgule, peut être vide.
parametres returns [List<ParameterDeclaration> desParametres]:
    /* vide */ 
    | lesParametres+=parametre (Virgule lesParametres+=parametre)*
;

parametre returns [ParameterDeclaration unParametre]:
	leType=type leNom=Identificateur
;

instruction returns [Instruction uneInstruction]: 
    leType=type leNom=Identificateur Egal laValeur=expression PointVirgule #instructionDeclaration

    | leRecepteur=affectable Egal laValeur=expression PointVirgule #instructionAffectation
    
    | Afficher laValeur=expression PointVirgule #instructionAffichage
    | Si ParentheseOuvrante laCondition=expression ParentheseFermante leBlocAlors=bloc Sinon leBlocSinon=bloc #instructionSiSinon
    | Si ParentheseOuvrante laCondition=expression ParentheseFermante leBlocAlors=bloc #instructionSi
    | Retour laValeur=expression PointVirgule #instructionReturn
    | TantQue ParentheseOuvrante laCondition=expression ParentheseFermante leCorps=bloc #instructionIteration
    
    | lObjet=expression Point leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante PointVirgule #instructionAppelMethodeExplicite
    | leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante PointVirgule #instructionAppelMethodeImplicite
    | Moi ParentheseOuvrante lesArguments=arguments ParentheseFermante PointVirgule #instructionAppelConstructeurAlternatif
    | Super ParentheseOuvrante lesArguments=arguments ParentheseFermante PointVirgule #instructionAppelConstructeurParent
;

atomique returns [AtomicType unTypeAtomique]:
    TypeEntier
    | TypeFlottant
    | TypeBooleen
    | TypeCaractere
    | TypeChaine
    | TypeVide
;

type returns [Type unType]:
    leTypeAtomique=atomique #typeAtomique
    | leNom=Identificateur #typeClasse
    | leTypeValeur=type CrochetOuvrant CrochetFermant #typeTableau
;

affectable returns [AssignableExpression uneExpressionAffectable]:
    lIdentificateur=Identificateur  #ecritureIdentificateur
    
    | leTableau=affectable CrochetOuvrant lIndice=expression CrochetFermant #ecritureTableau
    
    | ParentheseOuvrante leType=type ParentheseFermante lAffectable=affectable #ecritureConversion
    
    | lObjet=affectable Point leNom=Identificateur #ecritureAttribut
    
    | lObjet=affectable Point leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante #ecritureAppelMethodeExplicite
    
    | leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante #ecritureAppelMethodeImplicite
    
    | leMoi=Moi #ecritureThis
    
    | leSuper=Super #ecritureSuper

;

// Liste d'expressions séparées par une virgule, ne peut pas être vide
expressions returns [List<AccessibleExpression> desExpressions]:
    lesExpressions+=expression (Virgule lesExpressions+=expression)*;

// Liste d'expressions séparées par une virgule, peut être vide
arguments returns [List<AccessibleExpression> desArguments]:
    /* Vide */ 
    | lesExpressions=expressions 
;

// Les expressions vont du plus prioritaire (en haut) au moins prioritaire (en bas).
expression returns [AccessibleExpression uneExpression]:
    ParentheseOuvrante lExpression=expression ParentheseFermante #expressionParenthese
    
    | lObjet=expression Point leNom=Identificateur #lectureAttribut
    
    | lobjet=expression Point leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante #lectureAppelMethodeExplicite
    
    | leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante #lectureAppelMethodeImplicite
    
    | leTableau=expression CrochetOuvrant lIndice=expression CrochetFermant #lectureTableau
    
    | Nouveau leType=type CrochetOuvrant laTaille=expression CrochetFermant #creationTableau
    | Nouveau leNom=Identificateur ParentheseOuvrante lesArguments=arguments ParentheseFermante #creationObjet
    
    | PointExclamation leParametre=expression #expressionNegation
    | Moins leParametre=expression #expressionOpposee
    
    | gauche=expression operateur=(Asterisque | Oblique | PourCent) droite=expression #expressionMultiplicative
    | gauche=expression operateur=(Plus | Moins) droite=expression #expressionAdditive
    | gauche=expression operateur=(Inferieur | InferieurEgal | Superieur | SuperieurEgal) droite=expression #expressionComparaison
    | gauche=expression operateur=(DoubleEgal | ExclamationEgal) droite=expression #expressionEgalite
    | gauche=expression operateur=DoubleEsperluette droite=expression #expressionConjonction
    | gauche=expression operateur=DoubleBarre droite=expression #expressionDisjonction
    | laCondition=expression PointInterrogation lExpressionAlors=expression DeuxPoint lExpressionSinon=expression #expressionConditionelle

    | ParentheseOuvrante leType=type ParentheseFermante expression #expressionConversion
    
    | Vrai #expressionTrue
    | Faux #expressionFalse
    | Entier #expressionInt
    | Flottant #expresionFloat
    | Caractere #expressionCharacter
    | Chaine #expressionString
    | Nul #expressionNull
    | leNom=Identificateur #lectureIdentificateur
    
    | Moi #lectureThis
    | Super #lectureSuper

;

