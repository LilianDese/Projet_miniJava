parser grammar MiniCParser;
options { tokenVocab=MiniCLexer; }

@header {
package fr.n7.stl.minic.parser;
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
}

// Est il utile de construire un objet ? returns [Program unPrincipal]
programme : (declarations+=declaration)*
			TypeVide Principal ParentheseOuvrante ParentheseFermante main=bloc #declarationProgramme;

bloc returns [Block unBloc]: AccoladeOuvrante instructions += instruction* AccoladeFermante;

// Liste de declarations de paramètres séparées par une virgule, peut être vide.
parametres returns [List<ParameterDeclaration> lesParametres]:
    /* vide */ 
    | 
    type1=type ident1=identifiant (Virgule suiteType+=type suiteIdent+=identifiant)*
;

declaration returns [DeclarationInstruction uneDeclaration]:
	type identifiant Egal expression PointVirgule #declarationVariable
	| DefinitionConstante type identifiant Egal expression PointVirgule #declarationConstante
	| DefinitionType type identifiant PointVirgule #declarationType
    | type identifiant ParentheseOuvrante parametres ParentheseFermante bloc #declarationFonction
;

instruction returns [Instruction uneInstruction]: 
    (DefinitionConstante | /* vide */) type identifiant Egal expression PointVirgule #instructionDeclaration
    | affectable Egal valeur=expression PointVirgule #instructionAffectation
    | Afficher expression PointVirgule #instructionAffichage
    | Si ParentheseOuvrante expression ParentheseFermante alors=bloc (Sinon sinon=bloc)? #instructionSiSinon
    | TantQue ParentheseOuvrante expression ParentheseFermante corps=bloc #instructionTantQue
    | Retour expression PointVirgule #instructionReturn
;

atomique returns [AtomicType unTypeElementaire]:
    TypeEntier
    | TypeFlottant
    | TypeBooleen
    | TypeCaractere
    | TypeChaine
    | TypeVide
;

champ returns [FieldDeclaration unChamp]:
    type identifiant PointVirgule;

// Liste d'etiquettes séparées par une virgule, ne peut pas être vide
etiquettes returns [List<LabelDeclaration> lesEtiquettes]:
    premiere=Identificateur (Virgule suite+=Identificateur)*
;

type returns [Type unType]:
    atomique #typeAtomic
    | Identificateur #typeNamed
    | Inferieur gauche=type Virgule droite=type Superieur #typeCouple
    | Enregistrement Identificateur AccoladeOuvrante champs+=champ+ AccoladeFermante #typeRecord
    | Enumeration Identificateur AccoladeOuvrante etiquettes AccoladeFermante #typeEnum
;

affectable returns [AssignableExpression uneAffectable]:
    ident=Identificateur  #affectableIdentifiant
    | Asterisque expression #affectablePointer
    | affectable CrochetOuvrant expression CrochetFermant #affectableArray
    | ParentheseOuvrante (Identificateur | atomique) ParentheseFermante affectable #affectableConversion
    | affectable Point Identificateur #affectableField
;

// Liste d'expressions séparées par une virgule, ne peut pas être vide
expressions returns [List<AccessibleExpression> desExpressions]:
    premiere=expression (Virgule suite+=expression)*;

// Liste d'expressions séparées par une virgule, peut être vide
arguments returns [List<AccessibleExpression> desParametres]:
    /* Vide */ 
    | expressions 
;

// Les expressions vont du plus prioritaire (en haut) au moins prioritaire (en bas).
expression returns [AccessibleExpression uneExpression]:
    ParentheseOuvrante expression ParentheseFermante #expressionParenthese
    | expression Point Identificateur #expressionField
    | tableau=expression CrochetOuvrant indice=expression CrochetFermant #expressionArrayAcess
    | PointExclamation expr=expression #expressionNot
    | Premier expression #expressionFirst
    | Second expression #expressionSecond
    | Moins expression #expressionOpposite 
    | Nouveau type CrochetOuvrant expression CrochetFermant #expressionArrayAllocation
    | Nouveau type ParentheseOuvrante ParentheseFermante #expressionPointerAllocation
    | gauche=expression op=(Asterisque | Oblique | PourCent) droite=expression #expressionMultiplicative
    | gauche=expression op=(Plus | Moins) droite=expression #expressionAdditive
    | gauche=expression op=(Inferieur | InferieurEgal | Superieur | SuperieurEgal) droite=expression #expressionInequality
    | gauche=expression op=(DoubleEgal | ExclamationEgal) droite=expression #expressionEquality
    | gauche=expression DoubleEsperluette droite=expression #expressionAnd
    | gauche=expression DoubleBarre droite=expression #expressionOr
    | condition=expression PointInterrogation alors=expression DeuxPoint sinon=expression #expressionConditional
    | AccoladeOuvrante expressions AccoladeFermante #expressionSequence
    | Inferieur gauche=expression Virgule droite=expression Superieur #expressionCouple
    | Identificateur ParentheseOuvrante arguments ParentheseFermante #expressionFunctionCall
    | Asterisque expression #expressionPointerAccess
    | Esperluette affectable #expressionAddress
    | ParentheseOuvrante (Identificateur | atomique) ParentheseFermante expression #expressionConversion
    | Vrai #expressionTrue
    | Faux #expressionFalse
    | Entier #expressionInt
    | Flottant #expresionFloat
    | Caractere #expressionCharacter
    | Chaine #expressionString
    | Nul #expressionNull
    | Identificateur #expressionAccess
;

types returns [List<Type> desTypes] :
	/* vide */
	| lesTypes+=type (Virgule lesTypes+=type)*
; 

identifiant returns [fr.n7.stl.util.Pair<String, PartialType> unIdentifiant] :
    identifiant CrochetOuvrant CrochetFermant
    | identifiant ParentheseOuvrante types ParentheseFermante
    | Asterisque identifiant
    | ParentheseOuvrante identifiant ParentheseFermante
    | Identificateur
;