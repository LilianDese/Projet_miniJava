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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Egal=1, AccoladeOuvrante=2, AccoladeFermante=3, ParentheseOuvrante=4, 
		ParentheseFermante=5, CrochetOuvrant=6, CrochetFermant=7, Point=8, PointInterrogation=9, 
		DeuxPoint=10, Virgule=11, PointVirgule=12, Afficher=13, Si=14, Sinon=15, 
		Retour=16, TantQue=17, Nouveau=18, Classe=19, Herite=20, Public=21, Prive=22, 
		DeClasse=23, Definitif=24, Moi=25, Super=26, MethodePrincipale=27, Abstrait=28, 
		Protege=29, Asterisque=30, Oblique=31, PourCent=32, Plus=33, Moins=34, 
		DoubleBarre=35, DoubleEsperluette=36, PointExclamation=37, Inferieur=38, 
		Superieur=39, InferieurEgal=40, SuperieurEgal=41, DoubleEgal=42, ExclamationEgal=43, 
		Esperluette=44, TypeEntier=45, TypeFlottant=46, TypeBooleen=47, TypeCaractere=48, 
		TypeChaine=49, TypeVide=50, Vrai=51, Faux=52, Nul=53, Caractere=54, Chaine=55, 
		Underscore=56, Identificateur=57, Entier=58, Flottant=59, CommentaireLigne=60, 
		CommentaireBloc=61, WS=62;
	public static final int
		RULE_programme = 0, RULE_classes = 1, RULE_classe = 2, RULE_principale = 3, 
		RULE_declaration = 4, RULE_elements = 5, RULE_accessRight = 6, RULE_element = 7, 
		RULE_attribut = 8, RULE_methode = 9, RULE_signature = 10, RULE_constructeur = 11, 
		RULE_bloc = 12, RULE_parametres = 13, RULE_parametre = 14, RULE_instruction = 15, 
		RULE_atomique = 16, RULE_type = 17, RULE_affectable = 18, RULE_expressions = 19, 
		RULE_arguments = 20, RULE_expression = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "classes", "classe", "principale", "declaration", "elements", 
			"accessRight", "element", "attribut", "methode", "signature", "constructeur", 
			"bloc", "parametres", "parametre", "instruction", "atomique", "type", 
			"affectable", "expressions", "arguments", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", "'?'", 
			"':'", "','", "';'", "'print'", "'if'", "'else'", "'return'", "'while'", 
			"'new'", "'class'", "'extends'", "'public'", "'private'", "'static'", 
			"'final'", "'this'", "'super'", "'main'", "'abstract'", "'protected'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'||'", "'&&'", "'!'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&'", "'int'", "'float'", "'boolean'", 
			"'char'", "'String'", "'void'", "'true'", "'false'", "'null'", null, 
			null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Egal", "AccoladeOuvrante", "AccoladeFermante", "ParentheseOuvrante", 
			"ParentheseFermante", "CrochetOuvrant", "CrochetFermant", "Point", "PointInterrogation", 
			"DeuxPoint", "Virgule", "PointVirgule", "Afficher", "Si", "Sinon", "Retour", 
			"TantQue", "Nouveau", "Classe", "Herite", "Public", "Prive", "DeClasse", 
			"Definitif", "Moi", "Super", "MethodePrincipale", "Abstrait", "Protege", 
			"Asterisque", "Oblique", "PourCent", "Plus", "Moins", "DoubleBarre", 
			"DoubleEsperluette", "PointExclamation", "Inferieur", "Superieur", "InferieurEgal", 
			"SuperieurEgal", "DoubleEgal", "ExclamationEgal", "Esperluette", "TypeEntier", 
			"TypeFlottant", "TypeBooleen", "TypeCaractere", "TypeChaine", "TypeVide", 
			"Vrai", "Faux", "Nul", "Caractere", "Chaine", "Underscore", "Identificateur", 
			"Entier", "Flottant", "CommentaireLigne", "CommentaireBloc", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrammeContext extends ParserRuleContext {
		public ClassesContext lesClasses;
		public PrincipaleContext laPrincipale;
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public PrincipaleContext principale() {
			return getRuleContext(PrincipaleContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((ProgrammeContext)_localctx).lesClasses = classes();
			setState(45);
			((ProgrammeContext)_localctx).laPrincipale = principale();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassesContext extends ParserRuleContext {
		public List<ClassDeclaration> desClasses;
		public ClasseContext classe;
		public List<ClasseContext> lesClasses = new ArrayList<ClasseContext>();
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitClasses(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Classe || _la==Abstrait) {
				{
				{
				setState(47);
				((ClassesContext)_localctx).classe = classe();
				((ClassesContext)_localctx).lesClasses.add(((ClassesContext)_localctx).classe);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClasseContext extends ParserRuleContext {
		public ClassDeclaration uneClasse;
		public Token estAbstraite;
		public Token leNom;
		public Token heriteDe;
		public ElementsContext lesElements;
		public TerminalNode Classe() { return getToken(MiniJavaParser.Classe, 0); }
		public TerminalNode AccoladeOuvrante() { return getToken(MiniJavaParser.AccoladeOuvrante, 0); }
		public TerminalNode AccoladeFermante() { return getToken(MiniJavaParser.AccoladeFermante, 0); }
		public List<TerminalNode> Identificateur() { return getTokens(MiniJavaParser.Identificateur); }
		public TerminalNode Identificateur(int i) {
			return getToken(MiniJavaParser.Identificateur, i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode Herite() { return getToken(MiniJavaParser.Herite, 0); }
		public TerminalNode Abstrait() { return getToken(MiniJavaParser.Abstrait, 0); }
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitClasse(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstrait) {
				{
				setState(53);
				((ClasseContext)_localctx).estAbstraite = match(Abstrait);
				}
			}

			setState(56);
			match(Classe);
			setState(57);
			((ClasseContext)_localctx).leNom = match(Identificateur);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Herite) {
				{
				setState(58);
				match(Herite);
				setState(59);
				((ClasseContext)_localctx).heriteDe = match(Identificateur);
				}
			}

			setState(62);
			match(AccoladeOuvrante);
			setState(63);
			((ClasseContext)_localctx).lesElements = elements();
			setState(64);
			match(AccoladeFermante);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipaleContext extends ParserRuleContext {
		public MainDeclaration unPrincipal;
		public Token leNom;
		public DeclarationContext declaration;
		public List<DeclarationContext> lesDeclarations = new ArrayList<DeclarationContext>();
		public BlocContext leCorps;
		public List<TerminalNode> Public() { return getTokens(MiniJavaParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(MiniJavaParser.Public, i);
		}
		public TerminalNode Classe() { return getToken(MiniJavaParser.Classe, 0); }
		public TerminalNode AccoladeOuvrante() { return getToken(MiniJavaParser.AccoladeOuvrante, 0); }
		public TerminalNode DeClasse() { return getToken(MiniJavaParser.DeClasse, 0); }
		public TerminalNode TypeVide() { return getToken(MiniJavaParser.TypeVide, 0); }
		public TerminalNode MethodePrincipale() { return getToken(MiniJavaParser.MethodePrincipale, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode TypeChaine() { return getToken(MiniJavaParser.TypeChaine, 0); }
		public TerminalNode CrochetOuvrant() { return getToken(MiniJavaParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniJavaParser.CrochetFermant, 0); }
		public List<TerminalNode> Identificateur() { return getTokens(MiniJavaParser.Identificateur); }
		public TerminalNode Identificateur(int i) {
			return getToken(MiniJavaParser.Identificateur, i);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode AccoladeFermante() { return getToken(MiniJavaParser.AccoladeFermante, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public PrincipaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterPrincipale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitPrincipale(this);
		}
	}

	public final PrincipaleContext principale() throws RecognitionException {
		PrincipaleContext _localctx = new PrincipaleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_principale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Public);
			setState(67);
			match(Classe);
			setState(68);
			((PrincipaleContext)_localctx).leNom = match(Identificateur);
			setState(69);
			match(AccoladeOuvrante);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DeClasse) {
				{
				{
				setState(70);
				((PrincipaleContext)_localctx).declaration = declaration();
				((PrincipaleContext)_localctx).lesDeclarations.add(((PrincipaleContext)_localctx).declaration);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(Public);
			setState(77);
			match(DeClasse);
			setState(78);
			match(TypeVide);
			setState(79);
			match(MethodePrincipale);
			setState(80);
			match(ParentheseOuvrante);
			setState(81);
			match(TypeChaine);
			setState(82);
			match(CrochetOuvrant);
			setState(83);
			match(CrochetFermant);
			setState(84);
			match(Identificateur);
			setState(85);
			match(ParentheseFermante);
			setState(86);
			((PrincipaleContext)_localctx).leCorps = bloc();
			setState(87);
			match(AccoladeFermante);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration uneDeclaration;
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
			this.uneDeclaration = ctx.uneDeclaration;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodeMainContext extends DeclarationContext {
		public SignatureContext laSignature;
		public BlocContext leCorps;
		public TerminalNode DeClasse() { return getToken(MiniJavaParser.DeClasse, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public MethodeMainContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterMethodeMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitMethodeMain(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributMainContext extends DeclarationContext {
		public Token estDefinitif;
		public TypeContext leType;
		public Token leNom;
		public ExpressionContext laValeur;
		public TerminalNode DeClasse() { return getToken(MiniJavaParser.DeClasse, 0); }
		public TerminalNode Egal() { return getToken(MiniJavaParser.Egal, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Definitif() { return getToken(MiniJavaParser.Definitif, 0); }
		public AttributMainContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterAttributMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitAttributMain(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new MethodeMainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(DeClasse);
				setState(90);
				((MethodeMainContext)_localctx).laSignature = signature();
				setState(91);
				((MethodeMainContext)_localctx).leCorps = bloc();
				}
				break;
			case 2:
				_localctx = new AttributMainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(DeClasse);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Definitif) {
					{
					setState(94);
					((AttributMainContext)_localctx).estDefinitif = match(Definitif);
					}
				}

				setState(97);
				((AttributMainContext)_localctx).leType = type(0);
				setState(98);
				((AttributMainContext)_localctx).leNom = match(Identificateur);
				setState(99);
				match(Egal);
				setState(100);
				((AttributMainContext)_localctx).laValeur = expression(0);
				setState(101);
				match(PointVirgule);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<ClassElement> desElements;
		public ElementContext element;
		public List<ElementContext> lesElements = new ArrayList<ElementContext>();
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 543162368L) != 0)) {
				{
				{
				setState(105);
				((ElementsContext)_localctx).element = element();
				((ElementsContext)_localctx).lesElements.add(((ElementsContext)_localctx).element);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessRightContext extends ParserRuleContext {
		public AccessRight unDroit;
		public TerminalNode Public() { return getToken(MiniJavaParser.Public, 0); }
		public TerminalNode Protege() { return getToken(MiniJavaParser.Protege, 0); }
		public TerminalNode Prive() { return getToken(MiniJavaParser.Prive, 0); }
		public AccessRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterAccessRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitAccessRight(this);
		}
	}

	public final AccessRightContext accessRight() throws RecognitionException {
		AccessRightContext _localctx = new AccessRightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accessRight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 543162368L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ClassElement unElement;
		public AccessRightContext leDroit;
		public AccessRightContext accessRight() {
			return getRuleContext(AccessRightContext.class,0);
		}
		public AttributContext attribut() {
			return getRuleContext(AttributContext.class,0);
		}
		public MethodeContext methode() {
			return getRuleContext(MethodeContext.class,0);
		}
		public ConstructeurContext constructeur() {
			return getRuleContext(ConstructeurContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((ElementContext)_localctx).leDroit = accessRight();
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				attribut();
				}
				break;
			case 2:
				{
				setState(115);
				methode();
				}
				break;
			case 3:
				{
				setState(116);
				constructeur();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributContext extends ParserRuleContext {
		public AttributeDeclaration unAttribut;
		public AttributContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribut; }
	 
		public AttributContext() { }
		public void copyFrom(AttributContext ctx) {
			super.copyFrom(ctx);
			this.unAttribut = ctx.unAttribut;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributClasseContext extends AttributContext {
		public Token estDefinitif;
		public TypeContext leType;
		public Token leNom;
		public ExpressionContext laValeur;
		public TerminalNode DeClasse() { return getToken(MiniJavaParser.DeClasse, 0); }
		public TerminalNode Egal() { return getToken(MiniJavaParser.Egal, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Definitif() { return getToken(MiniJavaParser.Definitif, 0); }
		public AttributClasseContext(AttributContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterAttributClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitAttributClasse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributObjetContext extends AttributContext {
		public TypeContext leType;
		public Token leNom;
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public AttributObjetContext(AttributContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterAttributObjet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitAttributObjet(this);
		}
	}

	public final AttributContext attribut() throws RecognitionException {
		AttributContext _localctx = new AttributContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribut);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
			case Identificateur:
				_localctx = new AttributObjetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((AttributObjetContext)_localctx).leType = type(0);
				setState(120);
				((AttributObjetContext)_localctx).leNom = match(Identificateur);
				setState(121);
				match(PointVirgule);
				}
				break;
			case DeClasse:
				_localctx = new AttributClasseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(DeClasse);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Definitif) {
					{
					setState(124);
					((AttributClasseContext)_localctx).estDefinitif = match(Definitif);
					}
				}

				setState(127);
				((AttributClasseContext)_localctx).leType = type(0);
				setState(128);
				((AttributClasseContext)_localctx).leNom = match(Identificateur);
				setState(129);
				match(Egal);
				setState(130);
				((AttributClasseContext)_localctx).laValeur = expression(0);
				setState(131);
				match(PointVirgule);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodeContext extends ParserRuleContext {
		public MethodDeclaration uneMethode;
		public MethodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methode; }
	 
		public MethodeContext() { }
		public void copyFrom(MethodeContext ctx) {
			super.copyFrom(ctx);
			this.uneMethode = ctx.uneMethode;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodeClasseContext extends MethodeContext {
		public SignatureContext laSignature;
		public BlocContext leCorps;
		public TerminalNode DeClasse() { return getToken(MiniJavaParser.DeClasse, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode Definitif() { return getToken(MiniJavaParser.Definitif, 0); }
		public MethodeClasseContext(MethodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterMethodeClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitMethodeClasse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodeObjetContext extends MethodeContext {
		public Token estDefinitif;
		public SignatureContext laSignature;
		public BlocContext leCorps;
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode Definitif() { return getToken(MiniJavaParser.Definitif, 0); }
		public MethodeObjetContext(MethodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterMethodeObjet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitMethodeObjet(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodeAbstraiteContext extends MethodeContext {
		public SignatureContext laSignature;
		public TerminalNode Abstrait() { return getToken(MiniJavaParser.Abstrait, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public MethodeAbstraiteContext(MethodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterMethodeAbstraite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitMethodeAbstraite(this);
		}
	}

	public final MethodeContext methode() throws RecognitionException {
		MethodeContext _localctx = new MethodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methode);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Definitif:
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
			case Identificateur:
				_localctx = new MethodeObjetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Definitif) {
					{
					setState(135);
					((MethodeObjetContext)_localctx).estDefinitif = match(Definitif);
					}
				}

				setState(138);
				((MethodeObjetContext)_localctx).laSignature = signature();
				setState(139);
				((MethodeObjetContext)_localctx).leCorps = bloc();
				}
				break;
			case DeClasse:
				_localctx = new MethodeClasseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(DeClasse);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Definitif) {
					{
					setState(142);
					match(Definitif);
					}
				}

				setState(145);
				((MethodeClasseContext)_localctx).laSignature = signature();
				setState(146);
				((MethodeClasseContext)_localctx).leCorps = bloc();
				}
				break;
			case Abstrait:
				_localctx = new MethodeAbstraiteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(Abstrait);
				setState(149);
				((MethodeAbstraiteContext)_localctx).laSignature = signature();
				setState(150);
				match(PointVirgule);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignatureContext extends ParserRuleContext {
		public FunctionType uneSignature;
		public TypeContext leRetour;
		public Token leNom;
		public ParametresContext lesParametres;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((SignatureContext)_localctx).leRetour = type(0);
			setState(155);
			((SignatureContext)_localctx).leNom = match(Identificateur);
			setState(156);
			match(ParentheseOuvrante);
			setState(157);
			((SignatureContext)_localctx).lesParametres = parametres();
			setState(158);
			match(ParentheseFermante);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructeurContext extends ParserRuleContext {
		public ConstructorDeclaration unConstructeur;
		public Token leNom;
		public ParametresContext lesParametres;
		public BlocContext leCorps;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ConstructeurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructeur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterConstructeur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitConstructeur(this);
		}
	}

	public final ConstructeurContext constructeur() throws RecognitionException {
		ConstructeurContext _localctx = new ConstructeurContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructeur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((ConstructeurContext)_localctx).leNom = match(Identificateur);
			setState(161);
			match(ParentheseOuvrante);
			setState(162);
			((ConstructeurContext)_localctx).lesParametres = parametres();
			setState(163);
			match(ParentheseFermante);
			setState(164);
			((ConstructeurContext)_localctx).leCorps = bloc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocContext extends ParserRuleContext {
		public Block unBloc;
		public InstructionContext instruction;
		public List<InstructionContext> lesInstructions = new ArrayList<InstructionContext>();
		public TerminalNode AccoladeOuvrante() { return getToken(MiniJavaParser.AccoladeOuvrante, 0); }
		public TerminalNode AccoladeFermante() { return getToken(MiniJavaParser.AccoladeFermante, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(AccoladeOuvrante);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1080828880916799504L) != 0)) {
				{
				{
				setState(167);
				((BlocContext)_localctx).instruction = instruction();
				((BlocContext)_localctx).lesInstructions.add(((BlocContext)_localctx).instruction);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(AccoladeFermante);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametresContext extends ParserRuleContext {
		public List<ParameterDeclaration> desParametres;
		public ParametreContext parametre;
		public List<ParametreContext> lesParametres = new ArrayList<ParametreContext>();
		public List<ParametreContext> parametre() {
			return getRuleContexts(ParametreContext.class);
		}
		public ParametreContext parametre(int i) {
			return getRuleContext(ParametreContext.class,i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniJavaParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniJavaParser.Virgule, i);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterParametres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitParametres(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametres);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentheseFermante:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
			case Identificateur:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((ParametresContext)_localctx).parametre = parametre();
				((ParametresContext)_localctx).lesParametres.add(((ParametresContext)_localctx).parametre);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgule) {
					{
					{
					setState(177);
					match(Virgule);
					setState(178);
					((ParametresContext)_localctx).parametre = parametre();
					((ParametresContext)_localctx).lesParametres.add(((ParametresContext)_localctx).parametre);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametreContext extends ParserRuleContext {
		public ParameterDeclaration unParametre;
		public TypeContext leType;
		public Token leNom;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ParametreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterParametre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitParametre(this);
		}
	}

	public final ParametreContext parametre() throws RecognitionException {
		ParametreContext _localctx = new ParametreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((ParametreContext)_localctx).leType = type(0);
			setState(187);
			((ParametreContext)_localctx).leNom = match(Identificateur);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public Instruction uneInstruction;
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
			this.uneInstruction = ctx.uneInstruction;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAppelMethodeImpliciteContext extends InstructionContext {
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InstructionAppelMethodeImpliciteContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAppelMethodeImplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAppelMethodeImplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionReturnContext extends InstructionContext {
		public ExpressionContext laValeur;
		public TerminalNode Retour() { return getToken(MiniJavaParser.Retour, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionReturnContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionReturn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAppelConstructeurParentContext extends InstructionContext {
		public ArgumentsContext lesArguments;
		public TerminalNode Super() { return getToken(MiniJavaParser.Super, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InstructionAppelConstructeurParentContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAppelConstructeurParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAppelConstructeurParent(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionSiSinonContext extends InstructionContext {
		public ExpressionContext laCondition;
		public BlocContext leBlocAlors;
		public BlocContext leBlocSinon;
		public TerminalNode Si() { return getToken(MiniJavaParser.Si, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode Sinon() { return getToken(MiniJavaParser.Sinon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public InstructionSiSinonContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionSiSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionSiSinon(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionSiContext extends InstructionContext {
		public ExpressionContext laCondition;
		public BlocContext leBlocAlors;
		public TerminalNode Si() { return getToken(MiniJavaParser.Si, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public InstructionSiContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionSi(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAffichageContext extends InstructionContext {
		public ExpressionContext laValeur;
		public TerminalNode Afficher() { return getToken(MiniJavaParser.Afficher, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionAffichageContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAffichage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAffichage(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAppelMethodeExpliciteContext extends InstructionContext {
		public ExpressionContext lObjet;
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode Point() { return getToken(MiniJavaParser.Point, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InstructionAppelMethodeExpliciteContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAppelMethodeExplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAppelMethodeExplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAppelConstructeurAlternatifContext extends InstructionContext {
		public ArgumentsContext lesArguments;
		public TerminalNode Moi() { return getToken(MiniJavaParser.Moi, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InstructionAppelConstructeurAlternatifContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAppelConstructeurAlternatif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAppelConstructeurAlternatif(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionDeclarationContext extends InstructionContext {
		public TypeContext leType;
		public Token leNom;
		public ExpressionContext laValeur;
		public TerminalNode Egal() { return getToken(MiniJavaParser.Egal, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionDeclaration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionIterationContext extends InstructionContext {
		public ExpressionContext laCondition;
		public BlocContext leCorps;
		public TerminalNode TantQue() { return getToken(MiniJavaParser.TantQue, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public InstructionIterationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionIteration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAffectationContext extends InstructionContext {
		public AffectableContext leRecepteur;
		public ExpressionContext laValeur;
		public TerminalNode Egal() { return getToken(MiniJavaParser.Egal, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniJavaParser.PointVirgule, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionAffectationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterInstructionAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitInstructionAffectation(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new InstructionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((InstructionDeclarationContext)_localctx).leType = type(0);
				setState(190);
				((InstructionDeclarationContext)_localctx).leNom = match(Identificateur);
				setState(191);
				match(Egal);
				setState(192);
				((InstructionDeclarationContext)_localctx).laValeur = expression(0);
				setState(193);
				match(PointVirgule);
				}
				break;
			case 2:
				_localctx = new InstructionAffectationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((InstructionAffectationContext)_localctx).leRecepteur = affectable(0);
				setState(196);
				match(Egal);
				setState(197);
				((InstructionAffectationContext)_localctx).laValeur = expression(0);
				setState(198);
				match(PointVirgule);
				}
				break;
			case 3:
				_localctx = new InstructionAffichageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(Afficher);
				setState(201);
				((InstructionAffichageContext)_localctx).laValeur = expression(0);
				setState(202);
				match(PointVirgule);
				}
				break;
			case 4:
				_localctx = new InstructionSiSinonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(Si);
				setState(205);
				match(ParentheseOuvrante);
				setState(206);
				((InstructionSiSinonContext)_localctx).laCondition = expression(0);
				setState(207);
				match(ParentheseFermante);
				setState(208);
				((InstructionSiSinonContext)_localctx).leBlocAlors = bloc();
				setState(209);
				match(Sinon);
				setState(210);
				((InstructionSiSinonContext)_localctx).leBlocSinon = bloc();
				}
				break;
			case 5:
				_localctx = new InstructionSiContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(Si);
				setState(213);
				match(ParentheseOuvrante);
				setState(214);
				((InstructionSiContext)_localctx).laCondition = expression(0);
				setState(215);
				match(ParentheseFermante);
				setState(216);
				((InstructionSiContext)_localctx).leBlocAlors = bloc();
				}
				break;
			case 6:
				_localctx = new InstructionReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(Retour);
				setState(219);
				((InstructionReturnContext)_localctx).laValeur = expression(0);
				setState(220);
				match(PointVirgule);
				}
				break;
			case 7:
				_localctx = new InstructionIterationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				match(TantQue);
				setState(223);
				match(ParentheseOuvrante);
				setState(224);
				((InstructionIterationContext)_localctx).laCondition = expression(0);
				setState(225);
				match(ParentheseFermante);
				setState(226);
				((InstructionIterationContext)_localctx).leCorps = bloc();
				}
				break;
			case 8:
				_localctx = new InstructionAppelMethodeExpliciteContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				((InstructionAppelMethodeExpliciteContext)_localctx).lObjet = expression(0);
				setState(229);
				match(Point);
				setState(230);
				((InstructionAppelMethodeExpliciteContext)_localctx).leNom = match(Identificateur);
				setState(231);
				match(ParentheseOuvrante);
				setState(232);
				((InstructionAppelMethodeExpliciteContext)_localctx).lesArguments = arguments();
				setState(233);
				match(ParentheseFermante);
				setState(234);
				match(PointVirgule);
				}
				break;
			case 9:
				_localctx = new InstructionAppelMethodeImpliciteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				((InstructionAppelMethodeImpliciteContext)_localctx).leNom = match(Identificateur);
				setState(237);
				match(ParentheseOuvrante);
				setState(238);
				((InstructionAppelMethodeImpliciteContext)_localctx).lesArguments = arguments();
				setState(239);
				match(ParentheseFermante);
				setState(240);
				match(PointVirgule);
				}
				break;
			case 10:
				_localctx = new InstructionAppelConstructeurAlternatifContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				match(Moi);
				setState(243);
				match(ParentheseOuvrante);
				setState(244);
				((InstructionAppelConstructeurAlternatifContext)_localctx).lesArguments = arguments();
				setState(245);
				match(ParentheseFermante);
				setState(246);
				match(PointVirgule);
				}
				break;
			case 11:
				_localctx = new InstructionAppelConstructeurParentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				match(Super);
				setState(249);
				match(ParentheseOuvrante);
				setState(250);
				((InstructionAppelConstructeurParentContext)_localctx).lesArguments = arguments();
				setState(251);
				match(ParentheseFermante);
				setState(252);
				match(PointVirgule);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomiqueContext extends ParserRuleContext {
		public AtomicType unTypeAtomique;
		public TerminalNode TypeEntier() { return getToken(MiniJavaParser.TypeEntier, 0); }
		public TerminalNode TypeFlottant() { return getToken(MiniJavaParser.TypeFlottant, 0); }
		public TerminalNode TypeBooleen() { return getToken(MiniJavaParser.TypeBooleen, 0); }
		public TerminalNode TypeCaractere() { return getToken(MiniJavaParser.TypeCaractere, 0); }
		public TerminalNode TypeChaine() { return getToken(MiniJavaParser.TypeChaine, 0); }
		public TerminalNode TypeVide() { return getToken(MiniJavaParser.TypeVide, 0); }
		public AtomiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterAtomique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitAtomique(this);
		}
	}

	public final AtomiqueContext atomique() throws RecognitionException {
		AtomiqueContext _localctx = new AtomiqueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atomique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type unType;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.unType = ctx.unType;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomiqueContext extends TypeContext {
		public AtomiqueContext leTypeAtomique;
		public AtomiqueContext atomique() {
			return getRuleContext(AtomiqueContext.class,0);
		}
		public TypeAtomiqueContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterTypeAtomique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitTypeAtomique(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeClasseContext extends TypeContext {
		public Token leNom;
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public TypeClasseContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterTypeClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitTypeClasse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTableauContext extends TypeContext {
		public TypeContext leTypeValeur;
		public TerminalNode CrochetOuvrant() { return getToken(MiniJavaParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniJavaParser.CrochetFermant, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeTableauContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterTypeTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitTypeTableau(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
				{
				_localctx = new TypeAtomiqueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259);
				((TypeAtomiqueContext)_localctx).leTypeAtomique = atomique();
				}
				break;
			case Identificateur:
				{
				_localctx = new TypeClasseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				((TypeClasseContext)_localctx).leNom = match(Identificateur);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeTableauContext(new TypeContext(_parentctx, _parentState));
					((TypeTableauContext)_localctx).leTypeValeur = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(263);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(264);
					match(CrochetOuvrant);
					setState(265);
					match(CrochetFermant);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AffectableContext extends ParserRuleContext {
		public AssignableExpression uneExpressionAffectable;
		public AffectableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectable; }
	 
		public AffectableContext() { }
		public void copyFrom(AffectableContext ctx) {
			super.copyFrom(ctx);
			this.uneExpressionAffectable = ctx.uneExpressionAffectable;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureIdentificateurContext extends AffectableContext {
		public Token lIdentificateur;
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public EcritureIdentificateurContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureIdentificateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureIdentificateur(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureAppelMethodeExpliciteContext extends AffectableContext {
		public AffectableContext lObjet;
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode Point() { return getToken(MiniJavaParser.Point, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EcritureAppelMethodeExpliciteContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureAppelMethodeExplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureAppelMethodeExplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureThisContext extends AffectableContext {
		public Token leMoi;
		public TerminalNode Moi() { return getToken(MiniJavaParser.Moi, 0); }
		public EcritureThisContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureThis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureConversionContext extends AffectableContext {
		public TypeContext leType;
		public AffectableContext lAffectable;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public EcritureConversionContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureConversion(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureAppelMethodeImpliciteContext extends AffectableContext {
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EcritureAppelMethodeImpliciteContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureAppelMethodeImplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureAppelMethodeImplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureAttributContext extends AffectableContext {
		public AffectableContext lObjet;
		public Token leNom;
		public TerminalNode Point() { return getToken(MiniJavaParser.Point, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public EcritureAttributContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureAttribut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureAttribut(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureSuperContext extends AffectableContext {
		public Token leSuper;
		public TerminalNode Super() { return getToken(MiniJavaParser.Super, 0); }
		public EcritureSuperContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureSuper(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EcritureTableauContext extends AffectableContext {
		public AffectableContext leTableau;
		public ExpressionContext lIndice;
		public TerminalNode CrochetOuvrant() { return getToken(MiniJavaParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniJavaParser.CrochetFermant, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EcritureTableauContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterEcritureTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitEcritureTableau(this);
		}
	}

	public final AffectableContext affectable() throws RecognitionException {
		return affectable(0);
	}

	private AffectableContext affectable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AffectableContext _localctx = new AffectableContext(_ctx, _parentState);
		AffectableContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_affectable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new EcritureIdentificateurContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(272);
				((EcritureIdentificateurContext)_localctx).lIdentificateur = match(Identificateur);
				}
				break;
			case 2:
				{
				_localctx = new EcritureConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(ParentheseOuvrante);
				setState(274);
				((EcritureConversionContext)_localctx).leType = type(0);
				setState(275);
				match(ParentheseFermante);
				setState(276);
				((EcritureConversionContext)_localctx).lAffectable = affectable(6);
				}
				break;
			case 3:
				{
				_localctx = new EcritureAppelMethodeImpliciteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				((EcritureAppelMethodeImpliciteContext)_localctx).leNom = match(Identificateur);
				setState(279);
				match(ParentheseOuvrante);
				setState(280);
				((EcritureAppelMethodeImpliciteContext)_localctx).lesArguments = arguments();
				setState(281);
				match(ParentheseFermante);
				}
				break;
			case 4:
				{
				_localctx = new EcritureThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				((EcritureThisContext)_localctx).leMoi = match(Moi);
				}
				break;
			case 5:
				{
				_localctx = new EcritureSuperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				((EcritureSuperContext)_localctx).leSuper = match(Super);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new EcritureTableauContext(new AffectableContext(_parentctx, _parentState));
						((EcritureTableauContext)_localctx).leTableau = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_affectable);
						setState(287);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(288);
						match(CrochetOuvrant);
						setState(289);
						((EcritureTableauContext)_localctx).lIndice = expression(0);
						setState(290);
						match(CrochetFermant);
						}
						break;
					case 2:
						{
						_localctx = new EcritureAttributContext(new AffectableContext(_parentctx, _parentState));
						((EcritureAttributContext)_localctx).lObjet = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_affectable);
						setState(292);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(293);
						match(Point);
						setState(294);
						((EcritureAttributContext)_localctx).leNom = match(Identificateur);
						}
						break;
					case 3:
						{
						_localctx = new EcritureAppelMethodeExpliciteContext(new AffectableContext(_parentctx, _parentState));
						((EcritureAppelMethodeExpliciteContext)_localctx).lObjet = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_affectable);
						setState(295);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(296);
						match(Point);
						setState(297);
						((EcritureAppelMethodeExpliciteContext)_localctx).leNom = match(Identificateur);
						setState(298);
						match(ParentheseOuvrante);
						setState(299);
						((EcritureAppelMethodeExpliciteContext)_localctx).lesArguments = arguments();
						setState(300);
						match(ParentheseFermante);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<AccessibleExpression> desExpressions;
		public ExpressionContext expression;
		public List<ExpressionContext> lesExpressions = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniJavaParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniJavaParser.Virgule, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((ExpressionsContext)_localctx).expression = expression(0);
			((ExpressionsContext)_localctx).lesExpressions.add(((ExpressionsContext)_localctx).expression);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgule) {
				{
				{
				setState(308);
				match(Virgule);
				setState(309);
				((ExpressionsContext)_localctx).expression = expression(0);
				((ExpressionsContext)_localctx).lesExpressions.add(((ExpressionsContext)_localctx).expression);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<AccessibleExpression> desArguments;
		public ExpressionsContext lesExpressions;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arguments);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentheseFermante:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ParentheseOuvrante:
			case Nouveau:
			case Moi:
			case Super:
			case Moins:
			case PointExclamation:
			case Vrai:
			case Faux:
			case Nul:
			case Caractere:
			case Chaine:
			case Identificateur:
			case Entier:
			case Flottant:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				((ArgumentsContext)_localctx).lesExpressions = expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AccessibleExpression uneExpression;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.uneExpression = ctx.uneExpression;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCharacterContext extends ExpressionContext {
		public TerminalNode Caractere() { return getToken(MiniJavaParser.Caractere, 0); }
		public ExpressionCharacterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionCharacter(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOpposeeContext extends ExpressionContext {
		public ExpressionContext leParametre;
		public TerminalNode Moins() { return getToken(MiniJavaParser.Moins, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOpposeeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionOpposee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionOpposee(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreationObjetContext extends ExpressionContext {
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode Nouveau() { return getToken(MiniJavaParser.Nouveau, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CreationObjetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterCreationObjet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitCreationObjet(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConditionelleContext extends ExpressionContext {
		public ExpressionContext laCondition;
		public ExpressionContext lExpressionAlors;
		public ExpressionContext lExpressionSinon;
		public TerminalNode PointInterrogation() { return getToken(MiniJavaParser.PointInterrogation, 0); }
		public TerminalNode DeuxPoint() { return getToken(MiniJavaParser.DeuxPoint, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionConditionelleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionConditionelle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionConditionelle(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureTableauContext extends ExpressionContext {
		public ExpressionContext leTableau;
		public ExpressionContext lIndice;
		public TerminalNode CrochetOuvrant() { return getToken(MiniJavaParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniJavaParser.CrochetFermant, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LectureTableauContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureTableau(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureAppelMethodeImpliciteContext extends ExpressionContext {
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LectureAppelMethodeImpliciteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureAppelMethodeImplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureAppelMethodeImplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParentheseContext extends ExpressionContext {
		public ExpressionContext lExpression;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParentheseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionParenthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionParenthese(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureIdentificateurContext extends ExpressionContext {
		public Token leNom;
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public LectureIdentificateurContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureIdentificateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureIdentificateur(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureThisContext extends ExpressionContext {
		public TerminalNode Moi() { return getToken(MiniJavaParser.Moi, 0); }
		public LectureThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureThis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreationTableauContext extends ExpressionContext {
		public TypeContext leType;
		public ExpressionContext laTaille;
		public TerminalNode Nouveau() { return getToken(MiniJavaParser.Nouveau, 0); }
		public TerminalNode CrochetOuvrant() { return getToken(MiniJavaParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniJavaParser.CrochetFermant, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CreationTableauContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterCreationTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitCreationTableau(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureAttributContext extends ExpressionContext {
		public ExpressionContext lObjet;
		public Token leNom;
		public TerminalNode Point() { return getToken(MiniJavaParser.Point, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public LectureAttributContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureAttribut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureAttribut(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNullContext extends ExpressionContext {
		public TerminalNode Nul() { return getToken(MiniJavaParser.Nul, 0); }
		public ExpressionNullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionNull(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConversionContext extends ExpressionContext {
		public TypeContext leType;
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionConversion(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDisjonctionContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleBarre() { return getToken(MiniJavaParser.DoubleBarre, 0); }
		public ExpressionDisjonctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionDisjonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionDisjonction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConjonctionContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleEsperluette() { return getToken(MiniJavaParser.DoubleEsperluette, 0); }
		public ExpressionConjonctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionConjonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionConjonction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionComparaisonContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Inferieur() { return getToken(MiniJavaParser.Inferieur, 0); }
		public TerminalNode InferieurEgal() { return getToken(MiniJavaParser.InferieurEgal, 0); }
		public TerminalNode Superieur() { return getToken(MiniJavaParser.Superieur, 0); }
		public TerminalNode SuperieurEgal() { return getToken(MiniJavaParser.SuperieurEgal, 0); }
		public ExpressionComparaisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionComparaison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionComparaison(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAdditiveContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(MiniJavaParser.Plus, 0); }
		public TerminalNode Moins() { return getToken(MiniJavaParser.Moins, 0); }
		public ExpressionAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionAdditive(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionTrueContext extends ExpressionContext {
		public TerminalNode Vrai() { return getToken(MiniJavaParser.Vrai, 0); }
		public ExpressionTrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionTrue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNegationContext extends ExpressionContext {
		public ExpressionContext leParametre;
		public TerminalNode PointExclamation() { return getToken(MiniJavaParser.PointExclamation, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNegationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionNegation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultiplicativeContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Asterisque() { return getToken(MiniJavaParser.Asterisque, 0); }
		public TerminalNode Oblique() { return getToken(MiniJavaParser.Oblique, 0); }
		public TerminalNode PourCent() { return getToken(MiniJavaParser.PourCent, 0); }
		public ExpressionMultiplicativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionMultiplicative(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFalseContext extends ExpressionContext {
		public TerminalNode Faux() { return getToken(MiniJavaParser.Faux, 0); }
		public ExpressionFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionFalse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionFloatContext extends ExpressionContext {
		public TerminalNode Flottant() { return getToken(MiniJavaParser.Flottant, 0); }
		public ExpresionFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpresionFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpresionFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringContext extends ExpressionContext {
		public TerminalNode Chaine() { return getToken(MiniJavaParser.Chaine, 0); }
		public ExpressionStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureSuperContext extends ExpressionContext {
		public TerminalNode Super() { return getToken(MiniJavaParser.Super, 0); }
		public LectureSuperContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureSuper(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEgaliteContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token operateur;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleEgal() { return getToken(MiniJavaParser.DoubleEgal, 0); }
		public TerminalNode ExclamationEgal() { return getToken(MiniJavaParser.ExclamationEgal, 0); }
		public ExpressionEgaliteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionEgalite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionEgalite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LectureAppelMethodeExpliciteContext extends ExpressionContext {
		public ExpressionContext lobjet;
		public Token leNom;
		public ArgumentsContext lesArguments;
		public TerminalNode Point() { return getToken(MiniJavaParser.Point, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniJavaParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniJavaParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniJavaParser.Identificateur, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LectureAppelMethodeExpliciteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterLectureAppelMethodeExplicite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitLectureAppelMethodeExplicite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIntContext extends ExpressionContext {
		public TerminalNode Entier() { return getToken(MiniJavaParser.Entier, 0); }
		public ExpressionIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).enterExpressionInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaParserListener ) ((MiniJavaParserListener)listener).exitExpressionInt(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionParentheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(320);
				match(ParentheseOuvrante);
				setState(321);
				((ExpressionParentheseContext)_localctx).lExpression = expression(0);
				setState(322);
				match(ParentheseFermante);
				}
				break;
			case 2:
				{
				_localctx = new LectureAppelMethodeImpliciteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				((LectureAppelMethodeImpliciteContext)_localctx).leNom = match(Identificateur);
				setState(325);
				match(ParentheseOuvrante);
				setState(326);
				((LectureAppelMethodeImpliciteContext)_localctx).lesArguments = arguments();
				setState(327);
				match(ParentheseFermante);
				}
				break;
			case 3:
				{
				_localctx = new CreationTableauContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(Nouveau);
				setState(330);
				((CreationTableauContext)_localctx).leType = type(0);
				setState(331);
				match(CrochetOuvrant);
				setState(332);
				((CreationTableauContext)_localctx).laTaille = expression(0);
				setState(333);
				match(CrochetFermant);
				}
				break;
			case 4:
				{
				_localctx = new CreationObjetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(Nouveau);
				setState(336);
				((CreationObjetContext)_localctx).leNom = match(Identificateur);
				setState(337);
				match(ParentheseOuvrante);
				setState(338);
				((CreationObjetContext)_localctx).lesArguments = arguments();
				setState(339);
				match(ParentheseFermante);
				}
				break;
			case 5:
				{
				_localctx = new ExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(PointExclamation);
				setState(342);
				((ExpressionNegationContext)_localctx).leParametre = expression(20);
				}
				break;
			case 6:
				{
				_localctx = new ExpressionOpposeeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(Moins);
				setState(344);
				((ExpressionOpposeeContext)_localctx).leParametre = expression(19);
				}
				break;
			case 7:
				{
				_localctx = new ExpressionConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(ParentheseOuvrante);
				setState(346);
				((ExpressionConversionContext)_localctx).leType = type(0);
				setState(347);
				match(ParentheseFermante);
				setState(348);
				expression(11);
				}
				break;
			case 8:
				{
				_localctx = new ExpressionTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(Vrai);
				}
				break;
			case 9:
				{
				_localctx = new ExpressionFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(Faux);
				}
				break;
			case 10:
				{
				_localctx = new ExpressionIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				match(Entier);
				}
				break;
			case 11:
				{
				_localctx = new ExpresionFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				match(Flottant);
				}
				break;
			case 12:
				{
				_localctx = new ExpressionCharacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(Caractere);
				}
				break;
			case 13:
				{
				_localctx = new ExpressionStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(Chaine);
				}
				break;
			case 14:
				{
				_localctx = new ExpressionNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(Nul);
				}
				break;
			case 15:
				{
				_localctx = new LectureIdentificateurContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				((LectureIdentificateurContext)_localctx).leNom = match(Identificateur);
				}
				break;
			case 16:
				{
				_localctx = new LectureThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(Moi);
				}
				break;
			case 17:
				{
				_localctx = new LectureSuperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(Super);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(401);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultiplicativeContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionMultiplicativeContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(363);
						((ExpressionMultiplicativeContext)_localctx).operateur = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
							((ExpressionMultiplicativeContext)_localctx).operateur = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((ExpressionMultiplicativeContext)_localctx).droite = expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAdditiveContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(366);
						((ExpressionAdditiveContext)_localctx).operateur = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Moins) ) {
							((ExpressionAdditiveContext)_localctx).operateur = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(367);
						((ExpressionAdditiveContext)_localctx).droite = expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionComparaisonContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionComparaisonContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(369);
						((ExpressionComparaisonContext)_localctx).operateur = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
							((ExpressionComparaisonContext)_localctx).operateur = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(370);
						((ExpressionComparaisonContext)_localctx).droite = expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionEgaliteContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionEgaliteContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(372);
						((ExpressionEgaliteContext)_localctx).operateur = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DoubleEgal || _la==ExclamationEgal) ) {
							((ExpressionEgaliteContext)_localctx).operateur = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(373);
						((ExpressionEgaliteContext)_localctx).droite = expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionConjonctionContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionConjonctionContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(375);
						((ExpressionConjonctionContext)_localctx).operateur = match(DoubleEsperluette);
						setState(376);
						((ExpressionConjonctionContext)_localctx).droite = expression(15);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionDisjonctionContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionDisjonctionContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(378);
						((ExpressionDisjonctionContext)_localctx).operateur = match(DoubleBarre);
						setState(379);
						((ExpressionDisjonctionContext)_localctx).droite = expression(14);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionConditionelleContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionConditionelleContext)_localctx).laCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(381);
						match(PointInterrogation);
						setState(382);
						((ExpressionConditionelleContext)_localctx).lExpressionAlors = expression(0);
						setState(383);
						match(DeuxPoint);
						setState(384);
						((ExpressionConditionelleContext)_localctx).lExpressionSinon = expression(13);
						}
						break;
					case 8:
						{
						_localctx = new LectureAttributContext(new ExpressionContext(_parentctx, _parentState));
						((LectureAttributContext)_localctx).lObjet = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(387);
						match(Point);
						setState(388);
						((LectureAttributContext)_localctx).leNom = match(Identificateur);
						}
						break;
					case 9:
						{
						_localctx = new LectureAppelMethodeExpliciteContext(new ExpressionContext(_parentctx, _parentState));
						((LectureAppelMethodeExpliciteContext)_localctx).lobjet = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(390);
						match(Point);
						setState(391);
						((LectureAppelMethodeExpliciteContext)_localctx).leNom = match(Identificateur);
						setState(392);
						match(ParentheseOuvrante);
						setState(393);
						((LectureAppelMethodeExpliciteContext)_localctx).lesArguments = arguments();
						setState(394);
						match(ParentheseFermante);
						}
						break;
					case 10:
						{
						_localctx = new LectureTableauContext(new ExpressionContext(_parentctx, _parentState));
						((LectureTableauContext)_localctx).leTableau = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(397);
						match(CrochetOuvrant);
						setState(398);
						((LectureTableauContext)_localctx).lIndice = expression(0);
						setState(399);
						match(CrochetFermant);
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 18:
			return affectable_sempred((AffectableContext)_localctx, predIndex);
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean affectable_sempred(AffectableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 26);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0197\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00011\b\u0001"+
		"\n\u0001\f\u00014\t\u0001\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005"+
		"\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007v\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b~\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0086\b\b\u0001\t\u0003"+
		"\t\u0089\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0090\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0099"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0005\f\u00a9\b\f\n\f\f\f\u00ac\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00b4\b\r\n\r\f\r\u00b7\t\r\u0003\r\u00b9\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ff\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0106\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u010b\b\u0011\n\u0011\f\u0011\u010e\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u011e\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u012f\b\u0012\n\u0012\f\u0012\u0132\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0137\b\u0013\n\u0013\f\u0013"+
		"\u013a\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u013e\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0169"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0192\b\u0015\n"+
		"\u0015\f\u0015\u0195\t\u0015\u0001\u0015\u0000\u0003\"$*\u0016\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*\u0000\u0006\u0002\u0000\u0015\u0016\u001d\u001d\u0001\u0000-2"+
		"\u0001\u0000\u001e \u0001\u0000!\"\u0001\u0000&)\u0001\u0000*+\u01c1\u0000"+
		",\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00046\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000"+
		"\u0000\nl\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0098\u0001"+
		"\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000\u0000\u0016\u00a0\u0001"+
		"\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00b8\u0001"+
		"\u0000\u0000\u0000\u001c\u00ba\u0001\u0000\u0000\u0000\u001e\u00fe\u0001"+
		"\u0000\u0000\u0000 \u0100\u0001\u0000\u0000\u0000\"\u0105\u0001\u0000"+
		"\u0000\u0000$\u011d\u0001\u0000\u0000\u0000&\u0133\u0001\u0000\u0000\u0000"+
		"(\u013d\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000\u0000,-\u0003"+
		"\u0002\u0001\u0000-.\u0003\u0006\u0003\u0000.\u0001\u0001\u0000\u0000"+
		"\u0000/1\u0003\u0004\u0002\u00000/\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003"+
		"\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000057\u0005\u001c\u0000"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0005\u0013\u0000\u00009<\u00059\u0000\u0000:;\u0005\u0014"+
		"\u0000\u0000;=\u00059\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0003"+
		"\n\u0005\u0000@A\u0005\u0003\u0000\u0000A\u0005\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0015\u0000\u0000CD\u0005\u0013\u0000\u0000DE\u00059\u0000\u0000"+
		"EI\u0005\u0002\u0000\u0000FH\u0003\b\u0004\u0000GF\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0015"+
		"\u0000\u0000MN\u0005\u0017\u0000\u0000NO\u00052\u0000\u0000OP\u0005\u001b"+
		"\u0000\u0000PQ\u0005\u0004\u0000\u0000QR\u00051\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000ST\u0005\u0007\u0000\u0000TU\u00059\u0000\u0000UV\u0005\u0005"+
		"\u0000\u0000VW\u0003\u0018\f\u0000WX\u0005\u0003\u0000\u0000X\u0007\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0017\u0000\u0000Z[\u0003\u0014\n\u0000[\\"+
		"\u0003\u0018\f\u0000\\h\u0001\u0000\u0000\u0000]_\u0005\u0017\u0000\u0000"+
		"^`\u0005\u0018\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0003\"\u0011\u0000bc\u00059\u0000"+
		"\u0000cd\u0005\u0001\u0000\u0000de\u0003*\u0015\u0000ef\u0005\f\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000gY\u0001\u0000\u0000\u0000g]\u0001\u0000"+
		"\u0000\u0000h\t\u0001\u0000\u0000\u0000ik\u0003\u000e\u0007\u0000ji\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m\u000b\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0007\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qu\u0003"+
		"\f\u0006\u0000rv\u0003\u0010\b\u0000sv\u0003\u0012\t\u0000tv\u0003\u0016"+
		"\u000b\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0003\"\u0011\u0000"+
		"xy\u00059\u0000\u0000yz\u0005\f\u0000\u0000z\u0086\u0001\u0000\u0000\u0000"+
		"{}\u0005\u0017\u0000\u0000|~\u0005\u0018\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0003\"\u0011\u0000\u0080\u0081\u00059\u0000\u0000\u0081\u0082"+
		"\u0005\u0001\u0000\u0000\u0082\u0083\u0003*\u0015\u0000\u0083\u0084\u0005"+
		"\f\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085w\u0001\u0000"+
		"\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0005\u0018\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c\u0003\u0018\f\u0000"+
		"\u008c\u0099\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u0017\u0000\u0000"+
		"\u008e\u0090\u0005\u0018\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0003\u0014\n\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093"+
		"\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u001c\u0000\u0000\u0095"+
		"\u0096\u0003\u0014\n\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0088\u0001\u0000\u0000\u0000\u0098\u008d"+
		"\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0099\u0013"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0003\"\u0011\u0000\u009b\u009c\u0005"+
		"9\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0003\u001a"+
		"\r\u0000\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u0015\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u00059\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000"+
		"\u00a2\u00a3\u0003\u001a\r\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4"+
		"\u00a5\u0003\u0018\f\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00aa"+
		"\u0005\u0002\u0000\u0000\u00a7\u00a9\u0003\u001e\u000f\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0003\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003\u001c\u000e\u0000\u00b1\u00b2"+
		"\u0005\u000b\u0000\u0000\u00b2\u00b4\u0003\u001c\u000e\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00af"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000\u0000\u0000\u00b9\u001b"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0005"+
		"9\u0000\u0000\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\""+
		"\u0011\u0000\u00be\u00bf\u00059\u0000\u0000\u00bf\u00c0\u0005\u0001\u0000"+
		"\u0000\u00c0\u00c1\u0003*\u0015\u0000\u00c1\u00c2\u0005\f\u0000\u0000"+
		"\u00c2\u00ff\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4"+
		"\u00c5\u0005\u0001\u0000\u0000\u00c5\u00c6\u0003*\u0015\u0000\u00c6\u00c7"+
		"\u0005\f\u0000\u0000\u00c7\u00ff\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\r\u0000\u0000\u00c9\u00ca\u0003*\u0015\u0000\u00ca\u00cb\u0005\f\u0000"+
		"\u0000\u00cb\u00ff\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u000e\u0000"+
		"\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce\u00cf\u0003*\u0015\u0000"+
		"\u00cf\u00d0\u0005\u0005\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1"+
		"\u00d2\u0005\u000f\u0000\u0000\u00d2\u00d3\u0003\u0018\f\u0000\u00d3\u00ff"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0004\u0000\u0000\u00d6\u00d7\u0003*\u0015\u0000\u00d7\u00d8\u0005"+
		"\u0005\u0000\u0000\u00d8\u00d9\u0003\u0018\f\u0000\u00d9\u00ff\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u0010\u0000\u0000\u00db\u00dc\u0003*\u0015"+
		"\u0000\u00dc\u00dd\u0005\f\u0000\u0000\u00dd\u00ff\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00e0\u0005\u0004\u0000\u0000"+
		"\u00e0\u00e1\u0003*\u0015\u0000\u00e1\u00e2\u0005\u0005\u0000\u0000\u00e2"+
		"\u00e3\u0003\u0018\f\u0000\u00e3\u00ff\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0003*\u0015\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00e7\u0005"+
		"9\u0000\u0000\u00e7\u00e8\u0005\u0004\u0000\u0000\u00e8\u00e9\u0003(\u0014"+
		"\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea\u00eb\u0005\f\u0000\u0000"+
		"\u00eb\u00ff\u0001\u0000\u0000\u0000\u00ec\u00ed\u00059\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0003(\u0014\u0000\u00ef\u00f0"+
		"\u0005\u0005\u0000\u0000\u00f0\u00f1\u0005\f\u0000\u0000\u00f1\u00ff\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000\u00f3\u00f4\u0005"+
		"\u0004\u0000\u0000\u00f4\u00f5\u0003(\u0014\u0000\u00f5\u00f6\u0005\u0005"+
		"\u0000\u0000\u00f6\u00f7\u0005\f\u0000\u0000\u00f7\u00ff\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u001a\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000"+
		"\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc\u0005\u0005\u0000\u0000"+
		"\u00fc\u00fd\u0005\f\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe"+
		"\u00bd\u0001\u0000\u0000\u0000\u00fe\u00c3\u0001\u0000\u0000\u0000\u00fe"+
		"\u00c8\u0001\u0000\u0000\u0000\u00fe\u00cc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00d4\u0001\u0000\u0000\u0000\u00fe\u00da\u0001\u0000\u0000\u0000\u00fe"+
		"\u00de\u0001\u0000\u0000\u0000\u00fe\u00e4\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ec\u0001\u0000\u0000\u0000\u00fe\u00f2\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f8\u0001\u0000\u0000\u0000\u00ff\u001f\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0007\u0001\u0000\u0000\u0101!\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0006\u0011\uffff\uffff\u0000\u0103\u0106\u0003 \u0010\u0000\u0104\u0106"+
		"\u00059\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u010c\u0001\u0000\u0000\u0000\u0107\u0108\n\u0001"+
		"\u0000\u0000\u0108\u0109\u0005\u0006\u0000\u0000\u0109\u010b\u0005\u0007"+
		"\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d#\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0006\u0012\uffff\uffff\u0000\u0110\u011e\u00059\u0000"+
		"\u0000\u0111\u0112\u0005\u0004\u0000\u0000\u0112\u0113\u0003\"\u0011\u0000"+
		"\u0113\u0114\u0005\u0005\u0000\u0000\u0114\u0115\u0003$\u0012\u0006\u0115"+
		"\u011e\u0001\u0000\u0000\u0000\u0116\u0117\u00059\u0000\u0000\u0117\u0118"+
		"\u0005\u0004\u0000\u0000\u0118\u0119\u0003(\u0014\u0000\u0119\u011a\u0005"+
		"\u0005\u0000\u0000\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011e\u0005"+
		"\u0019\u0000\u0000\u011c\u011e\u0005\u001a\u0000\u0000\u011d\u010f\u0001"+
		"\u0000\u0000\u0000\u011d\u0111\u0001\u0000\u0000\u0000\u011d\u0116\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u0130\u0001\u0000\u0000\u0000\u011f\u0120\n\u0007"+
		"\u0000\u0000\u0120\u0121\u0005\u0006\u0000\u0000\u0121\u0122\u0003*\u0015"+
		"\u0000\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u012f\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\n\u0005\u0000\u0000\u0125\u0126\u0005\b\u0000\u0000"+
		"\u0126\u012f\u00059\u0000\u0000\u0127\u0128\n\u0004\u0000\u0000\u0128"+
		"\u0129\u0005\b\u0000\u0000\u0129\u012a\u00059\u0000\u0000\u012a\u012b"+
		"\u0005\u0004\u0000\u0000\u012b\u012c\u0003(\u0014\u0000\u012c\u012d\u0005"+
		"\u0005\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u011f\u0001"+
		"\u0000\u0000\u0000\u012e\u0124\u0001\u0000\u0000\u0000\u012e\u0127\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131%\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0138\u0003*\u0015"+
		"\u0000\u0134\u0135\u0005\u000b\u0000\u0000\u0135\u0137\u0003*\u0015\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\'\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013e\u0001\u0000\u0000\u0000\u013c\u013e\u0003&\u0013\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e)\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0006\u0015\uffff\uffff\u0000\u0140\u0141"+
		"\u0005\u0004\u0000\u0000\u0141\u0142\u0003*\u0015\u0000\u0142\u0143\u0005"+
		"\u0005\u0000\u0000\u0143\u0169\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"9\u0000\u0000\u0145\u0146\u0005\u0004\u0000\u0000\u0146\u0147\u0003(\u0014"+
		"\u0000\u0147\u0148\u0005\u0005\u0000\u0000\u0148\u0169\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005\u0012\u0000\u0000\u014a\u014b\u0003\"\u0011\u0000"+
		"\u014b\u014c\u0005\u0006\u0000\u0000\u014c\u014d\u0003*\u0015\u0000\u014d"+
		"\u014e\u0005\u0007\u0000\u0000\u014e\u0169\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u0012\u0000\u0000\u0150\u0151\u00059\u0000\u0000\u0151\u0152"+
		"\u0005\u0004\u0000\u0000\u0152\u0153\u0003(\u0014\u0000\u0153\u0154\u0005"+
		"\u0005\u0000\u0000\u0154\u0169\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"%\u0000\u0000\u0156\u0169\u0003*\u0015\u0014\u0157\u0158\u0005\"\u0000"+
		"\u0000\u0158\u0169\u0003*\u0015\u0013\u0159\u015a\u0005\u0004\u0000\u0000"+
		"\u015a\u015b\u0003\"\u0011\u0000\u015b\u015c\u0005\u0005\u0000\u0000\u015c"+
		"\u015d\u0003*\u0015\u000b\u015d\u0169\u0001\u0000\u0000\u0000\u015e\u0169"+
		"\u00053\u0000\u0000\u015f\u0169\u00054\u0000\u0000\u0160\u0169\u0005:"+
		"\u0000\u0000\u0161\u0169\u0005;\u0000\u0000\u0162\u0169\u00056\u0000\u0000"+
		"\u0163\u0169\u00057\u0000\u0000\u0164\u0169\u00055\u0000\u0000\u0165\u0169"+
		"\u00059\u0000\u0000\u0166\u0169\u0005\u0019\u0000\u0000\u0167\u0169\u0005"+
		"\u001a\u0000\u0000\u0168\u013f\u0001\u0000\u0000\u0000\u0168\u0144\u0001"+
		"\u0000\u0000\u0000\u0168\u0149\u0001\u0000\u0000\u0000\u0168\u014f\u0001"+
		"\u0000\u0000\u0000\u0168\u0155\u0001\u0000\u0000\u0000\u0168\u0157\u0001"+
		"\u0000\u0000\u0000\u0168\u0159\u0001\u0000\u0000\u0000\u0168\u015e\u0001"+
		"\u0000\u0000\u0000\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0160\u0001"+
		"\u0000\u0000\u0000\u0168\u0161\u0001\u0000\u0000\u0000\u0168\u0162\u0001"+
		"\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168\u0164\u0001"+
		"\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u0193\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\n\u0012\u0000\u0000\u016b\u016c\u0007\u0002"+
		"\u0000\u0000\u016c\u0192\u0003*\u0015\u0013\u016d\u016e\n\u0011\u0000"+
		"\u0000\u016e\u016f\u0007\u0003\u0000\u0000\u016f\u0192\u0003*\u0015\u0012"+
		"\u0170\u0171\n\u0010\u0000\u0000\u0171\u0172\u0007\u0004\u0000\u0000\u0172"+
		"\u0192\u0003*\u0015\u0011\u0173\u0174\n\u000f\u0000\u0000\u0174\u0175"+
		"\u0007\u0005\u0000\u0000\u0175\u0192\u0003*\u0015\u0010\u0176\u0177\n"+
		"\u000e\u0000\u0000\u0177\u0178\u0005$\u0000\u0000\u0178\u0192\u0003*\u0015"+
		"\u000f\u0179\u017a\n\r\u0000\u0000\u017a\u017b\u0005#\u0000\u0000\u017b"+
		"\u0192\u0003*\u0015\u000e\u017c\u017d\n\f\u0000\u0000\u017d\u017e\u0005"+
		"\t\u0000\u0000\u017e\u017f\u0003*\u0015\u0000\u017f\u0180\u0005\n\u0000"+
		"\u0000\u0180\u0181\u0003*\u0015\r\u0181\u0192\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\n\u001a\u0000\u0000\u0183\u0184\u0005\b\u0000\u0000\u0184"+
		"\u0192\u00059\u0000\u0000\u0185\u0186\n\u0019\u0000\u0000\u0186\u0187"+
		"\u0005\b\u0000\u0000\u0187\u0188\u00059\u0000\u0000\u0188\u0189\u0005"+
		"\u0004\u0000\u0000\u0189\u018a\u0003(\u0014\u0000\u018a\u018b\u0005\u0005"+
		"\u0000\u0000\u018b\u0192\u0001\u0000\u0000\u0000\u018c\u018d\n\u0017\u0000"+
		"\u0000\u018d\u018e\u0005\u0006\u0000\u0000\u018e\u018f\u0003*\u0015\u0000"+
		"\u018f\u0190\u0005\u0007\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u016a\u0001\u0000\u0000\u0000\u0191\u016d\u0001\u0000\u0000\u0000"+
		"\u0191\u0170\u0001\u0000\u0000\u0000\u0191\u0173\u0001\u0000\u0000\u0000"+
		"\u0191\u0176\u0001\u0000\u0000\u0000\u0191\u0179\u0001\u0000\u0000\u0000"+
		"\u0191\u017c\u0001\u0000\u0000\u0000\u0191\u0182\u0001\u0000\u0000\u0000"+
		"\u0191\u0185\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000"+
		"\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194+\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u001b26<I_glu}\u0085\u0088\u008f\u0098"+
		"\u00aa\u00b5\u00b8\u00fe\u0105\u010c\u011d\u012e\u0130\u0138\u013d\u0168"+
		"\u0191\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}