lexer grammar MiniJavaLexer;

@header {
package fr.n7.stl.minijava.parser;
}

Egal: '=';
AccoladeOuvrante: '{';
AccoladeFermante: '}';
ParentheseOuvrante: '(';
ParentheseFermante: ')';
CrochetOuvrant: '[';
CrochetFermant:']';
Point: '.';
PointInterrogation: '?';
DeuxPoint: ':';
Virgule: ',';
PointVirgule: ';';
Afficher: 'print';
Si: 'if';
Sinon: 'else';
Retour: 'return';
TantQue: 'while';
Nouveau: 'new';

// Ajout miniJava
Classe: 'class';
Herite: 'extends';
Public: 'public';
Prive: 'private';
DeClasse: 'static';
Definitif: 'final';
Moi: 'this';
Super: 'super';
// ClassePrincipale: 'Main';
MethodePrincipale: 'main';
Abstrait: 'abstract';
Protege: 'protected';
// Fin de l'ajout miniJava

// Operateurs
// Par défaut, les opérateurs sont associatifs à gauche
Asterisque: '*';
Oblique: '/';
PourCent: '%';
Plus: '+';
Moins: '-';
// Operateurs logiques
DoubleBarre: '||';
DoubleEsperluette: '&&';
PointExclamation: '!';
// Operateurs de comparaison
Inferieur: '<';
Superieur: '>';
InferieurEgal: '<=';
SuperieurEgal: '>=';
DoubleEgal: '==';
ExclamationEgal: '!=';
Esperluette: '&';
// Types
TypeEntier: 'int';
TypeFlottant: 'float';
TypeBooleen: 'boolean';
TypeCaractere: 'char';
TypeChaine: 'String';
TypeVide: 'void';

Vrai: 'true';
Faux: 'false';
Nul: 'null';

Caractere: '\'' . '\'';
Chaine: '"' .*? '"';

Underscore: '_';
Identificateur: ([a-zA-Z]|Underscore)([a-zA-Z_0-9]|Underscore)*;
Entier: '0' | ([1-9][0-9]*);
Flottant: Entier '.' Entier;

// Commentaires de ligne
CommentaireLigne: '//' ~[\r\n]* -> skip;

// Commentaires de bloc
CommentaireBloc: '/*' .*? '*/' -> skip;

// Blancs
WS: [ \t\r\n]+ -> skip;
