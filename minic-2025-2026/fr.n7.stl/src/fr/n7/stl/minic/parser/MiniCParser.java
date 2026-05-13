// Generated from MiniCParser.g4 by ANTLR 4.13.1

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Egal=1, AccoladeOuvrante=2, AccoladeFermante=3, ParentheseOuvrante=4, 
		ParentheseFermante=5, CrochetOuvrant=6, CrochetFermant=7, Point=8, PointInterrogation=9, 
		DeuxPoint=10, Virgule=11, PointVirgule=12, Afficher=13, Si=14, Sinon=15, 
		TantQue=16, Retour=17, DefinitionConstante=18, DefinitionType=19, Enregistrement=20, 
		Enumeration=21, Nouveau=22, Principal=23, Asterisque=24, Oblique=25, PourCent=26, 
		Plus=27, Moins=28, DoubleBarre=29, DoubleEsperluette=30, PointExclamation=31, 
		Inferieur=32, Superieur=33, InferieurEgal=34, SuperieurEgal=35, DoubleEgal=36, 
		ExclamationEgal=37, Esperluette=38, TypeEntier=39, TypeFlottant=40, TypeBooleen=41, 
		TypeCaractere=42, TypeChaine=43, TypeVide=44, Vrai=45, Faux=46, Nul=47, 
		Premier=48, Second=49, Caractere=50, Chaine=51, Identificateur=52, Entier=53, 
		Flottant=54, CommentaireLigne=55, CommentaireBloc=56, WS=57;
	public static final int
		RULE_programme = 0, RULE_bloc = 1, RULE_parametres = 2, RULE_declaration = 3, 
		RULE_instruction = 4, RULE_atomique = 5, RULE_champ = 6, RULE_etiquettes = 7, 
		RULE_type = 8, RULE_affectable = 9, RULE_expressions = 10, RULE_arguments = 11, 
		RULE_expression = 12, RULE_types = 13, RULE_identifiant = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "bloc", "parametres", "declaration", "instruction", "atomique", 
			"champ", "etiquettes", "type", "affectable", "expressions", "arguments", 
			"expression", "types", "identifiant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", "'?'", 
			"':'", "','", "';'", "'print'", "'if'", "'else'", "'while'", "'return'", 
			"'const'", "'typedef'", "'struct'", "'enum'", "'new'", "'main'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'||'", "'&&'", "'!'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&'", "'int'", "'float'", "'boolean'", "'char'", 
			"'String'", "'void'", "'true'", "'false'", "'null'", "'fst'", "'snd'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Egal", "AccoladeOuvrante", "AccoladeFermante", "ParentheseOuvrante", 
			"ParentheseFermante", "CrochetOuvrant", "CrochetFermant", "Point", "PointInterrogation", 
			"DeuxPoint", "Virgule", "PointVirgule", "Afficher", "Si", "Sinon", "TantQue", 
			"Retour", "DefinitionConstante", "DefinitionType", "Enregistrement", 
			"Enumeration", "Nouveau", "Principal", "Asterisque", "Oblique", "PourCent", 
			"Plus", "Moins", "DoubleBarre", "DoubleEsperluette", "PointExclamation", 
			"Inferieur", "Superieur", "InferieurEgal", "SuperieurEgal", "DoubleEgal", 
			"ExclamationEgal", "Esperluette", "TypeEntier", "TypeFlottant", "TypeBooleen", 
			"TypeCaractere", "TypeChaine", "TypeVide", "Vrai", "Faux", "Nul", "Premier", 
			"Second", "Caractere", "Chaine", "Identificateur", "Entier", "Flottant", 
			"CommentaireLigne", "CommentaireBloc", "WS"
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
	public String getGrammarFileName() { return "MiniCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrammeContext extends ParserRuleContext {
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
	 
		public ProgrammeContext() { }
		public void copyFrom(ProgrammeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationProgrammeContext extends ProgrammeContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public BlocContext main;
		public TerminalNode TypeVide() { return getToken(MiniCParser.TypeVide, 0); }
		public TerminalNode Principal() { return getToken(MiniCParser.Principal, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationProgrammeContext(ProgrammeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterDeclarationProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitDeclarationProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			int _alt;
			_localctx = new DeclarationProgrammeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((DeclarationProgrammeContext)_localctx).declaration = declaration();
					((DeclarationProgrammeContext)_localctx).declarations.add(((DeclarationProgrammeContext)_localctx).declaration);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			match(TypeVide);
			setState(37);
			match(Principal);
			setState(38);
			match(ParentheseOuvrante);
			setState(39);
			match(ParentheseFermante);
			setState(40);
			((DeclarationProgrammeContext)_localctx).main = bloc();
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
		public List<InstructionContext> instructions = new ArrayList<InstructionContext>();
		public TerminalNode AccoladeOuvrante() { return getToken(MiniCParser.AccoladeOuvrante, 0); }
		public TerminalNode AccoladeFermante() { return getToken(MiniCParser.AccoladeFermante, 0); }
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
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(AccoladeOuvrante);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4538238559019024L) != 0)) {
				{
				{
				setState(43);
				((BlocContext)_localctx).instruction = instruction();
				((BlocContext)_localctx).instructions.add(((BlocContext)_localctx).instruction);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public List<ParameterDeclaration> lesParametres;
		public TypeContext type1;
		public IdentifiantContext ident1;
		public TypeContext type;
		public List<TypeContext> suiteType = new ArrayList<TypeContext>();
		public IdentifiantContext identifiant;
		public List<IdentifiantContext> suiteIdent = new ArrayList<IdentifiantContext>();
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifiantContext> identifiant() {
			return getRuleContexts(IdentifiantContext.class);
		}
		public IdentifiantContext identifiant(int i) {
			return getRuleContext(IdentifiantContext.class,i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniCParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniCParser.Virgule, i);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterParametres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitParametres(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametres);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentheseFermante:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Enregistrement:
			case Enumeration:
			case Inferieur:
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
			case Identificateur:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((ParametresContext)_localctx).type1 = type();
				setState(53);
				((ParametresContext)_localctx).ident1 = identifiant(0);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgule) {
					{
					{
					setState(54);
					match(Virgule);
					setState(55);
					((ParametresContext)_localctx).type = type();
					((ParametresContext)_localctx).suiteType.add(((ParametresContext)_localctx).type);
					setState(56);
					((ParametresContext)_localctx).identifiant = identifiant(0);
					((ParametresContext)_localctx).suiteIdent.add(((ParametresContext)_localctx).identifiant);
					}
					}
					setState(62);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationInstruction uneDeclaration;
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
	public static class DeclarationTypeContext extends DeclarationContext {
		public TerminalNode DefinitionType() { return getToken(MiniCParser.DefinitionType, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public DeclarationTypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitDeclarationType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationConstanteContext extends DeclarationContext {
		public TerminalNode DefinitionConstante() { return getToken(MiniCParser.DefinitionConstante, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode Egal() { return getToken(MiniCParser.Egal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public DeclarationConstanteContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterDeclarationConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitDeclarationConstante(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationVariableContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode Egal() { return getToken(MiniCParser.Egal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public DeclarationVariableContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterDeclarationVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitDeclarationVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationFonctionContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public DeclarationFonctionContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterDeclarationFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitDeclarationFonction(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclarationVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				type();
				setState(66);
				identifiant(0);
				setState(67);
				match(Egal);
				setState(68);
				expression(0);
				setState(69);
				match(PointVirgule);
				}
				break;
			case 2:
				_localctx = new DeclarationConstanteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(DefinitionConstante);
				setState(72);
				type();
				setState(73);
				identifiant(0);
				setState(74);
				match(Egal);
				setState(75);
				expression(0);
				setState(76);
				match(PointVirgule);
				}
				break;
			case 3:
				_localctx = new DeclarationTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(DefinitionType);
				setState(79);
				type();
				setState(80);
				identifiant(0);
				setState(81);
				match(PointVirgule);
				}
				break;
			case 4:
				_localctx = new DeclarationFonctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				type();
				setState(84);
				identifiant(0);
				setState(85);
				match(ParentheseOuvrante);
				setState(86);
				parametres();
				setState(87);
				match(ParentheseFermante);
				setState(88);
				bloc();
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
	public static class InstructionReturnContext extends InstructionContext {
		public TerminalNode Retour() { return getToken(MiniCParser.Retour, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public InstructionReturnContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionReturn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionTantQueContext extends InstructionContext {
		public BlocContext alors;
		public TerminalNode TantQue() { return getToken(MiniCParser.TantQue, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public InstructionTantQueContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionTantQue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionTantQue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionSiSinonContext extends InstructionContext {
		public BlocContext alors;
		public BlocContext sinon;
		public TerminalNode Si() { return getToken(MiniCParser.Si, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public TerminalNode Sinon() { return getToken(MiniCParser.Sinon, 0); }
		public InstructionSiSinonContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionSiSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionSiSinon(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAffichageContext extends InstructionContext {
		public TerminalNode Afficher() { return getToken(MiniCParser.Afficher, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public InstructionAffichageContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionAffichage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionAffichage(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionDeclarationContext extends InstructionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode Egal() { return getToken(MiniCParser.Egal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public TerminalNode DefinitionConstante() { return getToken(MiniCParser.DefinitionConstante, 0); }
		public InstructionDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionDeclaration(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAffectationContext extends InstructionContext {
		public ExpressionContext valeur;
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode Egal() { return getToken(MiniCParser.Egal, 0); }
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionAffectationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterInstructionAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitInstructionAffectation(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InstructionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DefinitionConstante:
					{
					setState(92);
					match(DefinitionConstante);
					}
					break;
				case Enregistrement:
				case Enumeration:
				case Inferieur:
				case TypeEntier:
				case TypeFlottant:
				case TypeBooleen:
				case TypeCaractere:
				case TypeChaine:
				case TypeVide:
				case Identificateur:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
				type();
				setState(97);
				identifiant(0);
				setState(98);
				match(Egal);
				setState(99);
				expression(0);
				setState(100);
				match(PointVirgule);
				}
				break;
			case 2:
				_localctx = new InstructionAffectationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				affectable(0);
				setState(103);
				match(Egal);
				setState(104);
				((InstructionAffectationContext)_localctx).valeur = expression(0);
				setState(105);
				match(PointVirgule);
				}
				break;
			case 3:
				_localctx = new InstructionAffichageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(Afficher);
				setState(108);
				expression(0);
				setState(109);
				match(PointVirgule);
				}
				break;
			case 4:
				_localctx = new InstructionTantQueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(TantQue);
				setState(112);
				match(ParentheseOuvrante);
				setState(113);
				expression(0);
				setState(114);
				match(ParentheseFermante);
				setState(115);
				((InstructionTantQueContext)_localctx).alors = bloc();
				}
				break;
			case 5:
				_localctx = new InstructionSiSinonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(Si);
				setState(118);
				match(ParentheseOuvrante);
				setState(119);
				expression(0);
				setState(120);
				match(ParentheseFermante);
				setState(121);
				((InstructionSiSinonContext)_localctx).alors = bloc();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Sinon) {
					{
					setState(122);
					match(Sinon);
					setState(123);
					((InstructionSiSinonContext)_localctx).sinon = bloc();
					}
				}

				}
				break;
			case 6:
				_localctx = new InstructionReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(Retour);
				setState(127);
				expression(0);
				setState(128);
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
		public AtomicType unTypeElementaire;
		public TerminalNode TypeEntier() { return getToken(MiniCParser.TypeEntier, 0); }
		public TerminalNode TypeFlottant() { return getToken(MiniCParser.TypeFlottant, 0); }
		public TerminalNode TypeBooleen() { return getToken(MiniCParser.TypeBooleen, 0); }
		public TerminalNode TypeCaractere() { return getToken(MiniCParser.TypeCaractere, 0); }
		public TerminalNode TypeChaine() { return getToken(MiniCParser.TypeChaine, 0); }
		public TerminalNode TypeVide() { return getToken(MiniCParser.TypeVide, 0); }
		public AtomiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAtomique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAtomique(this);
		}
	}

	public final AtomiqueContext atomique() throws RecognitionException {
		AtomiqueContext _localctx = new AtomiqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atomique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
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
	public static class ChampContext extends ParserRuleContext {
		public FieldDeclaration unChamp;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode PointVirgule() { return getToken(MiniCParser.PointVirgule, 0); }
		public ChampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_champ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterChamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitChamp(this);
		}
	}

	public final ChampContext champ() throws RecognitionException {
		ChampContext _localctx = new ChampContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_champ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			identifiant(0);
			setState(136);
			match(PointVirgule);
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
	public static class EtiquettesContext extends ParserRuleContext {
		public List<LabelDeclaration> lesEtiquettes;
		public Token premiere;
		public Token Identificateur;
		public List<Token> suite = new ArrayList<Token>();
		public List<TerminalNode> Identificateur() { return getTokens(MiniCParser.Identificateur); }
		public TerminalNode Identificateur(int i) {
			return getToken(MiniCParser.Identificateur, i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniCParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniCParser.Virgule, i);
		}
		public EtiquettesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquettes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterEtiquettes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitEtiquettes(this);
		}
	}

	public final EtiquettesContext etiquettes() throws RecognitionException {
		EtiquettesContext _localctx = new EtiquettesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_etiquettes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((EtiquettesContext)_localctx).premiere = match(Identificateur);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgule) {
				{
				{
				setState(139);
				match(Virgule);
				setState(140);
				((EtiquettesContext)_localctx).Identificateur = match(Identificateur);
				((EtiquettesContext)_localctx).suite.add(((EtiquettesContext)_localctx).Identificateur);
				}
				}
				setState(145);
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
	public static class TypeEnumContext extends TypeContext {
		public TerminalNode Enumeration() { return getToken(MiniCParser.Enumeration, 0); }
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public TerminalNode AccoladeOuvrante() { return getToken(MiniCParser.AccoladeOuvrante, 0); }
		public EtiquettesContext etiquettes() {
			return getRuleContext(EtiquettesContext.class,0);
		}
		public TerminalNode AccoladeFermante() { return getToken(MiniCParser.AccoladeFermante, 0); }
		public TypeEnumContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypeEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypeEnum(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNamedContext extends TypeContext {
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public TypeNamedContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypeNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypeNamed(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCoupleContext extends TypeContext {
		public TypeContext gauche;
		public TypeContext droite;
		public TerminalNode Inferieur() { return getToken(MiniCParser.Inferieur, 0); }
		public TerminalNode Virgule() { return getToken(MiniCParser.Virgule, 0); }
		public TerminalNode Superieur() { return getToken(MiniCParser.Superieur, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeCoupleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypeCouple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypeCouple(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomicContext extends TypeContext {
		public AtomiqueContext atomique() {
			return getRuleContext(AtomiqueContext.class,0);
		}
		public TypeAtomicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypeAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypeAtomic(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRecordContext extends TypeContext {
		public ChampContext champ;
		public List<ChampContext> champs = new ArrayList<ChampContext>();
		public TerminalNode Enregistrement() { return getToken(MiniCParser.Enregistrement, 0); }
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public TerminalNode AccoladeOuvrante() { return getToken(MiniCParser.AccoladeOuvrante, 0); }
		public TerminalNode AccoladeFermante() { return getToken(MiniCParser.AccoladeFermante, 0); }
		public List<ChampContext> champ() {
			return getRuleContexts(ChampContext.class);
		}
		public ChampContext champ(int i) {
			return getRuleContext(ChampContext.class,i);
		}
		public TypeRecordContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypeRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypeRecord(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
				_localctx = new TypeAtomicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				atomique();
				}
				break;
			case Identificateur:
				_localctx = new TypeNamedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(Identificateur);
				}
				break;
			case Inferieur:
				_localctx = new TypeCoupleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(Inferieur);
				setState(149);
				((TypeCoupleContext)_localctx).gauche = type();
				setState(150);
				match(Virgule);
				setState(151);
				((TypeCoupleContext)_localctx).droite = type();
				setState(152);
				match(Superieur);
				}
				break;
			case Enregistrement:
				_localctx = new TypeRecordContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(Enregistrement);
				setState(155);
				match(Identificateur);
				setState(156);
				match(AccoladeOuvrante);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					((TypeRecordContext)_localctx).champ = champ();
					((TypeRecordContext)_localctx).champs.add(((TypeRecordContext)_localctx).champ);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4538238541758464L) != 0) );
				setState(162);
				match(AccoladeFermante);
				}
				break;
			case Enumeration:
				_localctx = new TypeEnumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(Enumeration);
				setState(165);
				match(Identificateur);
				setState(166);
				match(AccoladeOuvrante);
				setState(167);
				etiquettes();
				setState(168);
				match(AccoladeFermante);
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
	public static class AffectableContext extends ParserRuleContext {
		public AssignableExpression uneAffectable;
		public AffectableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectable; }
	 
		public AffectableContext() { }
		public void copyFrom(AffectableContext ctx) {
			super.copyFrom(ctx);
			this.uneAffectable = ctx.uneAffectable;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectableArrayContext extends AffectableContext {
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode CrochetOuvrant() { return getToken(MiniCParser.CrochetOuvrant, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CrochetFermant() { return getToken(MiniCParser.CrochetFermant, 0); }
		public AffectableArrayContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAffectableArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAffectableArray(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectableIdentifiantContext extends AffectableContext {
		public Token ident;
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public AffectableIdentifiantContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAffectableIdentifiant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAffectableIdentifiant(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectableFieldContext extends AffectableContext {
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode Point() { return getToken(MiniCParser.Point, 0); }
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public AffectableFieldContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAffectableField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAffectableField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectablePointerContext extends AffectableContext {
		public TerminalNode Asterisque() { return getToken(MiniCParser.Asterisque, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AffectablePointerContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAffectablePointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAffectablePointer(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectableConversionContext extends AffectableContext {
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public AtomiqueContext atomique() {
			return getRuleContext(AtomiqueContext.class,0);
		}
		public AffectableConversionContext(AffectableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterAffectableConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitAffectableConversion(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_affectable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificateur:
				{
				_localctx = new AffectableIdentifiantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				((AffectableIdentifiantContext)_localctx).ident = match(Identificateur);
				}
				break;
			case Asterisque:
				{
				_localctx = new AffectablePointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(Asterisque);
				setState(175);
				expression(0);
				}
				break;
			case ParentheseOuvrante:
				{
				_localctx = new AffectableConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(ParentheseOuvrante);
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identificateur:
					{
					setState(177);
					match(Identificateur);
					}
					break;
				case TypeEntier:
				case TypeFlottant:
				case TypeBooleen:
				case TypeCaractere:
				case TypeChaine:
				case TypeVide:
					{
					setState(178);
					atomique();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181);
				match(ParentheseFermante);
				setState(182);
				affectable(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AffectableArrayContext(new AffectableContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_affectable);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						match(CrochetOuvrant);
						setState(187);
						expression(0);
						setState(188);
						match(CrochetFermant);
						}
						break;
					case 2:
						{
						_localctx = new AffectableFieldContext(new AffectableContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_affectable);
						setState(190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(191);
						match(Point);
						setState(192);
						match(Identificateur);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public ExpressionContext premiere;
		public ExpressionContext expression;
		public List<ExpressionContext> suite = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniCParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniCParser.Virgule, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((ExpressionsContext)_localctx).premiere = expression(0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Virgule) {
				{
				{
				setState(199);
				match(Virgule);
				setState(200);
				((ExpressionsContext)_localctx).expression = expression(0);
				((ExpressionsContext)_localctx).suite.add(((ExpressionsContext)_localctx).expression);
				}
				}
				setState(205);
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
		public List<AccessibleExpression> desParametres;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentheseFermante:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case AccoladeOuvrante:
			case ParentheseOuvrante:
			case Nouveau:
			case Asterisque:
			case Moins:
			case PointExclamation:
			case Inferieur:
			case Esperluette:
			case Vrai:
			case Faux:
			case Nul:
			case Premier:
			case Second:
			case Caractere:
			case Chaine:
			case Identificateur:
			case Entier:
			case Flottant:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expressions();
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
		public TerminalNode Caractere() { return getToken(MiniCParser.Caractere, 0); }
		public ExpressionCharacterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionCharacter(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddressContext extends ExpressionContext {
		public TerminalNode Esperluette() { return getToken(MiniCParser.Esperluette, 0); }
		public AffectableContext affectable() {
			return getRuleContext(AffectableContext.class,0);
		}
		public ExpressionAddressContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionAddress(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOppositeContext extends ExpressionContext {
		public TerminalNode Moins() { return getToken(MiniCParser.Moins, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOppositeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionOpposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionOpposite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParentheseContext extends ExpressionContext {
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public ExpressionParentheseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionParenthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionParenthese(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSequenceContext extends ExpressionContext {
		public TerminalNode AccoladeOuvrante() { return getToken(MiniCParser.AccoladeOuvrante, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode AccoladeFermante() { return getToken(MiniCParser.AccoladeFermante, 0); }
		public ExpressionSequenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionSequence(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode PointExclamation() { return getToken(MiniCParser.PointExclamation, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConditionalContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext alors;
		public ExpressionContext sinon;
		public TerminalNode PointInterrogation() { return getToken(MiniCParser.PointInterrogation, 0); }
		public TerminalNode DeuxPoint() { return getToken(MiniCParser.DeuxPoint, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionConditional(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndContext extends ExpressionContext {
		public ExpressionContext gauche;
		public ExpressionContext droite;
		public TerminalNode DoubleEsperluette() { return getToken(MiniCParser.DoubleEsperluette, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrayAcessContext extends ExpressionContext {
		public ExpressionContext tableau;
		public ExpressionContext indice;
		public TerminalNode CrochetOuvrant() { return getToken(MiniCParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniCParser.CrochetFermant, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionArrayAcessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionArrayAcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionArrayAcess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCoupleContext extends ExpressionContext {
		public ExpressionContext gauche;
		public ExpressionContext droite;
		public TerminalNode Inferieur() { return getToken(MiniCParser.Inferieur, 0); }
		public TerminalNode Virgule() { return getToken(MiniCParser.Virgule, 0); }
		public TerminalNode Superieur() { return getToken(MiniCParser.Superieur, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionCoupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionCouple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionCouple(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAccessContext extends ExpressionContext {
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public ExpressionAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFieldContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Point() { return getToken(MiniCParser.Point, 0); }
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public ExpressionFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNullContext extends ExpressionContext {
		public TerminalNode Nul() { return getToken(MiniCParser.Nul, 0); }
		public ExpressionNullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionNull(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPointerAccessContext extends ExpressionContext {
		public TerminalNode Asterisque() { return getToken(MiniCParser.Asterisque, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPointerAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionPointerAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionPointerAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionConversionContext extends ExpressionContext {
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public AtomiqueContext atomique() {
			return getRuleContext(AtomiqueContext.class,0);
		}
		public ExpressionConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionConversion(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqualityContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token op;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleEgal() { return getToken(MiniCParser.DoubleEgal, 0); }
		public TerminalNode ExclamationEgal() { return getToken(MiniCParser.ExclamationEgal, 0); }
		public ExpressionEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionEquality(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInequalityContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token op;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Inferieur() { return getToken(MiniCParser.Inferieur, 0); }
		public TerminalNode InferieurEgal() { return getToken(MiniCParser.InferieurEgal, 0); }
		public TerminalNode Superieur() { return getToken(MiniCParser.Superieur, 0); }
		public TerminalNode SuperieurEgal() { return getToken(MiniCParser.SuperieurEgal, 0); }
		public ExpressionInequalityContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionInequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionInequality(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFirstContext extends ExpressionContext {
		public TerminalNode Premier() { return getToken(MiniCParser.Premier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionFirstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionFirst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFunctionCallContext extends ExpressionContext {
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public ExpressionFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionFunctionCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAdditiveContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token op;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(MiniCParser.Plus, 0); }
		public TerminalNode Moins() { return getToken(MiniCParser.Moins, 0); }
		public ExpressionAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionAdditive(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionTrueContext extends ExpressionContext {
		public TerminalNode Vrai() { return getToken(MiniCParser.Vrai, 0); }
		public ExpressionTrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionTrue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultiplicativeContext extends ExpressionContext {
		public ExpressionContext gauche;
		public Token op;
		public ExpressionContext droite;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Asterisque() { return getToken(MiniCParser.Asterisque, 0); }
		public TerminalNode Oblique() { return getToken(MiniCParser.Oblique, 0); }
		public TerminalNode PourCent() { return getToken(MiniCParser.PourCent, 0); }
		public ExpressionMultiplicativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionMultiplicative(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFalseContext extends ExpressionContext {
		public TerminalNode Faux() { return getToken(MiniCParser.Faux, 0); }
		public ExpressionFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionFalse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionFloatContext extends ExpressionContext {
		public TerminalNode Flottant() { return getToken(MiniCParser.Flottant, 0); }
		public ExpresionFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpresionFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpresionFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSecondContext extends ExpressionContext {
		public TerminalNode Second() { return getToken(MiniCParser.Second, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSecondContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionSecond(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrayAllocationContext extends ExpressionContext {
		public TerminalNode Nouveau() { return getToken(MiniCParser.Nouveau, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CrochetOuvrant() { return getToken(MiniCParser.CrochetOuvrant, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CrochetFermant() { return getToken(MiniCParser.CrochetFermant, 0); }
		public ExpressionArrayAllocationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionArrayAllocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionArrayAllocation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringContext extends ExpressionContext {
		public TerminalNode Chaine() { return getToken(MiniCParser.Chaine, 0); }
		public ExpressionStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrContext extends ExpressionContext {
		public ExpressionContext gauche;
		public ExpressionContext droite;
		public TerminalNode DoubleBarre() { return getToken(MiniCParser.DoubleBarre, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPointerAllocationContext extends ExpressionContext {
		public TerminalNode Nouveau() { return getToken(MiniCParser.Nouveau, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public ExpressionPointerAllocationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionPointerAllocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionPointerAllocation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIntContext extends ExpressionContext {
		public TerminalNode Entier() { return getToken(MiniCParser.Entier, 0); }
		public ExpressionIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterExpressionInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitExpressionInt(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionParentheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211);
				match(ParentheseOuvrante);
				setState(212);
				expression(0);
				setState(213);
				match(ParentheseFermante);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(PointExclamation);
				setState(216);
				((ExpressionNotContext)_localctx).expr = expression(27);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(Premier);
				setState(218);
				expression(26);
				}
				break;
			case 4:
				{
				_localctx = new ExpressionSecondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(Second);
				setState(220);
				expression(25);
				}
				break;
			case 5:
				{
				_localctx = new ExpressionOppositeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(Moins);
				setState(222);
				expression(24);
				}
				break;
			case 6:
				{
				_localctx = new ExpressionArrayAllocationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(Nouveau);
				setState(224);
				type();
				setState(225);
				match(CrochetOuvrant);
				setState(226);
				expression(0);
				setState(227);
				match(CrochetFermant);
				}
				break;
			case 7:
				{
				_localctx = new ExpressionPointerAllocationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(Nouveau);
				setState(230);
				type();
				setState(231);
				match(ParentheseOuvrante);
				setState(232);
				match(ParentheseFermante);
				}
				break;
			case 8:
				{
				_localctx = new ExpressionSequenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(AccoladeOuvrante);
				setState(235);
				expressions();
				setState(236);
				match(AccoladeFermante);
				}
				break;
			case 9:
				{
				_localctx = new ExpressionCoupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(Inferieur);
				setState(239);
				((ExpressionCoupleContext)_localctx).gauche = expression(0);
				setState(240);
				match(Virgule);
				setState(241);
				((ExpressionCoupleContext)_localctx).droite = expression(0);
				setState(242);
				match(Superieur);
				}
				break;
			case 10:
				{
				_localctx = new ExpressionFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(Identificateur);
				setState(245);
				match(ParentheseOuvrante);
				setState(246);
				arguments();
				setState(247);
				match(ParentheseFermante);
				}
				break;
			case 11:
				{
				_localctx = new ExpressionPointerAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(Asterisque);
				setState(250);
				expression(11);
				}
				break;
			case 12:
				{
				_localctx = new ExpressionAddressContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(Esperluette);
				setState(252);
				affectable(0);
				}
				break;
			case 13:
				{
				_localctx = new ExpressionConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(ParentheseOuvrante);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identificateur:
					{
					setState(254);
					match(Identificateur);
					}
					break;
				case TypeEntier:
				case TypeFlottant:
				case TypeBooleen:
				case TypeCaractere:
				case TypeChaine:
				case TypeVide:
					{
					setState(255);
					atomique();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				match(ParentheseFermante);
				setState(259);
				expression(9);
				}
				break;
			case 14:
				{
				_localctx = new ExpressionTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(Vrai);
				}
				break;
			case 15:
				{
				_localctx = new ExpressionFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(Faux);
				}
				break;
			case 16:
				{
				_localctx = new ExpressionIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(Entier);
				}
				break;
			case 17:
				{
				_localctx = new ExpresionFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(Flottant);
				}
				break;
			case 18:
				{
				_localctx = new ExpressionCharacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(Caractere);
				}
				break;
			case 19:
				{
				_localctx = new ExpressionStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(Chaine);
				}
				break;
			case 20:
				{
				_localctx = new ExpressionNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(Nul);
				}
				break;
			case 21:
				{
				_localctx = new ExpressionAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(Identificateur);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultiplicativeContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionMultiplicativeContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(271);
						((ExpressionMultiplicativeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
							((ExpressionMultiplicativeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((ExpressionMultiplicativeContext)_localctx).droite = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAdditiveContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(274);
						((ExpressionAdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Moins) ) {
							((ExpressionAdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((ExpressionAdditiveContext)_localctx).droite = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionInequalityContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionInequalityContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(277);
						((ExpressionInequalityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
							((ExpressionInequalityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						((ExpressionInequalityContext)_localctx).droite = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionEqualityContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionEqualityContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(280);
						((ExpressionEqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DoubleEgal || _la==ExclamationEgal) ) {
							((ExpressionEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((ExpressionEqualityContext)_localctx).droite = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAndContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(283);
						match(DoubleEsperluette);
						setState(284);
						((ExpressionAndContext)_localctx).droite = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionOrContext)_localctx).gauche = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(286);
						match(DoubleBarre);
						setState(287);
						((ExpressionOrContext)_localctx).droite = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionConditionalContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(289);
						match(PointInterrogation);
						setState(290);
						((ExpressionConditionalContext)_localctx).alors = expression(0);
						setState(291);
						match(DeuxPoint);
						setState(292);
						((ExpressionConditionalContext)_localctx).sinon = expression(16);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionFieldContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(295);
						match(Point);
						setState(296);
						match(Identificateur);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionArrayAcessContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionArrayAcessContext)_localctx).tableau = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(298);
						match(CrochetOuvrant);
						setState(299);
						((ExpressionArrayAcessContext)_localctx).indice = expression(0);
						setState(300);
						match(CrochetFermant);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class TypesContext extends ParserRuleContext {
		public List<Type> desTypes;
		public TypeContext type;
		public List<TypeContext> lesTypes = new ArrayList<TypeContext>();
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Virgule() { return getTokens(MiniCParser.Virgule); }
		public TerminalNode Virgule(int i) {
			return getToken(MiniCParser.Virgule, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_types);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentheseFermante:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Enregistrement:
			case Enumeration:
			case Inferieur:
			case TypeEntier:
			case TypeFlottant:
			case TypeBooleen:
			case TypeCaractere:
			case TypeChaine:
			case TypeVide:
			case Identificateur:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((TypesContext)_localctx).type = type();
				((TypesContext)_localctx).lesTypes.add(((TypesContext)_localctx).type);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Virgule) {
					{
					{
					setState(309);
					match(Virgule);
					setState(310);
					((TypesContext)_localctx).type = type();
					((TypesContext)_localctx).lesTypes.add(((TypesContext)_localctx).type);
					}
					}
					setState(315);
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
	public static class IdentifiantContext extends ParserRuleContext {
		public fr.n7.stl.util.Pair<String, PartialType> unIdentifiant;
		public TerminalNode Asterisque() { return getToken(MiniCParser.Asterisque, 0); }
		public IdentifiantContext identifiant() {
			return getRuleContext(IdentifiantContext.class,0);
		}
		public TerminalNode ParentheseOuvrante() { return getToken(MiniCParser.ParentheseOuvrante, 0); }
		public TerminalNode ParentheseFermante() { return getToken(MiniCParser.ParentheseFermante, 0); }
		public TerminalNode Identificateur() { return getToken(MiniCParser.Identificateur, 0); }
		public TerminalNode CrochetOuvrant() { return getToken(MiniCParser.CrochetOuvrant, 0); }
		public TerminalNode CrochetFermant() { return getToken(MiniCParser.CrochetFermant, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public IdentifiantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).enterIdentifiant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCParserListener ) ((MiniCParserListener)listener).exitIdentifiant(this);
		}
	}

	public final IdentifiantContext identifiant() throws RecognitionException {
		return identifiant(0);
	}

	private IdentifiantContext identifiant(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifiantContext _localctx = new IdentifiantContext(_ctx, _parentState);
		IdentifiantContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_identifiant, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Asterisque:
				{
				setState(319);
				match(Asterisque);
				setState(320);
				identifiant(3);
				}
				break;
			case ParentheseOuvrante:
				{
				setState(321);
				match(ParentheseOuvrante);
				setState(322);
				identifiant(0);
				setState(323);
				match(ParentheseFermante);
				}
				break;
			case Identificateur:
				{
				setState(325);
				match(Identificateur);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new IdentifiantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifiant);
						setState(328);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(329);
						match(CrochetOuvrant);
						setState(330);
						match(CrochetFermant);
						}
						break;
					case 2:
						{
						_localctx = new IdentifiantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_identifiant);
						setState(331);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(332);
						match(ParentheseOuvrante);
						setState(333);
						types();
						setState(334);
						match(ParentheseFermante);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 9:
			return affectable_sempred((AffectableContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return identifiant_sempred((IdentifiantContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean affectable_sempred(AffectableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 29);
		case 10:
			return precpred(_ctx, 28);
		}
		return true;
	}
	private boolean identifiant_sempred(IdentifiantContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0156\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002\u0003\u0002@\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004_\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007"+
		"\f\u0007\u0091\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u009f\b\b\u000b"+
		"\b\f\b\u00a0\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ab\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b4\b\t\u0001\t\u0001\t\u0003\t\u00b8\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c2\b\t\n\t"+
		"\f\t\u00c5\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ca\b\n\n\n\f\n\u00cd"+
		"\t\n\u0001\u000b\u0001\u000b\u0003\u000b\u00d1\b\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0101\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u012f\b\f\n\f\f\f\u0132\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u0138\b\r\n\r\f\r\u013b\t\r\u0003\r\u013d\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0147\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0151"+
		"\b\u000e\n\u000e\f\u000e\u0154\t\u000e\u0001\u000e\u0000\u0003\u0012\u0018"+
		"\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0005\u0001\u0000\',\u0001\u0000\u0018\u001a"+
		"\u0001\u0000\u001b\u001c\u0001\u0000 #\u0001\u0000$%\u0185\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000"+
		"\u0000\u0006Z\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000"+
		"\n\u0084\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000\u0000\u000e"+
		"\u008a\u0001\u0000\u0000\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012"+
		"\u00b7\u0001\u0000\u0000\u0000\u0014\u00c6\u0001\u0000\u0000\u0000\u0016"+
		"\u00d0\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000\u0000\u0000\u001a"+
		"\u013c\u0001\u0000\u0000\u0000\u001c\u0146\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005,\u0000"+
		"\u0000%&\u0005\u0017\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\u0005"+
		"\u0000\u0000()\u0003\u0002\u0001\u0000)\u0001\u0001\u0000\u0000\u0000"+
		"*.\u0005\u0002\u0000\u0000+-\u0003\b\u0004\u0000,+\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\u0003"+
		"\u0000\u00002\u0003\u0001\u0000\u0000\u00003@\u0001\u0000\u0000\u0000"+
		"45\u0003\u0010\b\u00005<\u0003\u001c\u000e\u000067\u0005\u000b\u0000\u0000"+
		"78\u0003\u0010\b\u000089\u0003\u001c\u000e\u00009;\u0001\u0000\u0000\u0000"+
		":6\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?3\u0001\u0000\u0000\u0000?4\u0001\u0000\u0000\u0000@\u0005"+
		"\u0001\u0000\u0000\u0000AB\u0003\u0010\b\u0000BC\u0003\u001c\u000e\u0000"+
		"CD\u0005\u0001\u0000\u0000DE\u0003\u0018\f\u0000EF\u0005\f\u0000\u0000"+
		"F[\u0001\u0000\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0003\u0010\b\u0000"+
		"IJ\u0003\u001c\u000e\u0000JK\u0005\u0001\u0000\u0000KL\u0003\u0018\f\u0000"+
		"LM\u0005\f\u0000\u0000M[\u0001\u0000\u0000\u0000NO\u0005\u0013\u0000\u0000"+
		"OP\u0003\u0010\b\u0000PQ\u0003\u001c\u000e\u0000QR\u0005\f\u0000\u0000"+
		"R[\u0001\u0000\u0000\u0000ST\u0003\u0010\b\u0000TU\u0003\u001c\u000e\u0000"+
		"UV\u0005\u0004\u0000\u0000VW\u0003\u0004\u0002\u0000WX\u0005\u0005\u0000"+
		"\u0000XY\u0003\u0002\u0001\u0000Y[\u0001\u0000\u0000\u0000ZA\u0001\u0000"+
		"\u0000\u0000ZG\u0001\u0000\u0000\u0000ZN\u0001\u0000\u0000\u0000ZS\u0001"+
		"\u0000\u0000\u0000[\u0007\u0001\u0000\u0000\u0000\\_\u0005\u0012\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0003\u0010\b\u0000ab\u0003\u001c"+
		"\u000e\u0000bc\u0005\u0001\u0000\u0000cd\u0003\u0018\f\u0000de\u0005\f"+
		"\u0000\u0000e\u0083\u0001\u0000\u0000\u0000fg\u0003\u0012\t\u0000gh\u0005"+
		"\u0001\u0000\u0000hi\u0003\u0018\f\u0000ij\u0005\f\u0000\u0000j\u0083"+
		"\u0001\u0000\u0000\u0000kl\u0005\r\u0000\u0000lm\u0003\u0018\f\u0000m"+
		"n\u0005\f\u0000\u0000n\u0083\u0001\u0000\u0000\u0000op\u0005\u0010\u0000"+
		"\u0000pq\u0005\u0004\u0000\u0000qr\u0003\u0018\f\u0000rs\u0005\u0005\u0000"+
		"\u0000st\u0003\u0002\u0001\u0000t\u0083\u0001\u0000\u0000\u0000uv\u0005"+
		"\u000e\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0003\u0018\f\u0000xy\u0005"+
		"\u0005\u0000\u0000y|\u0003\u0002\u0001\u0000z{\u0005\u000f\u0000\u0000"+
		"{}\u0003\u0002\u0001\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0083\u0001\u0000\u0000\u0000~\u007f\u0005\u0011\u0000\u0000\u007f"+
		"\u0080\u0003\u0018\f\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082^\u0001\u0000\u0000\u0000\u0082f\u0001\u0000"+
		"\u0000\u0000\u0082k\u0001\u0000\u0000\u0000\u0082o\u0001\u0000\u0000\u0000"+
		"\u0082u\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\t"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u000b"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u0088\u0003"+
		"\u001c\u000e\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\r\u0001\u0000"+
		"\u0000\u0000\u008a\u008f\u00054\u0000\u0000\u008b\u008c\u0005\u000b\u0000"+
		"\u0000\u008c\u008e\u00054\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u00ab\u0003\n\u0005\u0000\u0093"+
		"\u00ab\u00054\u0000\u0000\u0094\u0095\u0005 \u0000\u0000\u0095\u0096\u0003"+
		"\u0010\b\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0098\u0003\u0010"+
		"\b\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u00ab\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b\u009c\u00054\u0000\u0000"+
		"\u009c\u009e\u0005\u0002\u0000\u0000\u009d\u009f\u0003\f\u0006\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5"+
		"\u00a6\u00054\u0000\u0000\u00a6\u00a7\u0005\u0002\u0000\u0000\u00a7\u00a8"+
		"\u0003\u000e\u0007\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u0092\u0001\u0000\u0000\u0000\u00aa\u0093"+
		"\u0001\u0000\u0000\u0000\u00aa\u0094\u0001\u0000\u0000\u0000\u00aa\u009a"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00ab\u0011"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\t\uffff\uffff\u0000\u00ad\u00b8"+
		"\u00054\u0000\u0000\u00ae\u00af\u0005\u0018\u0000\u0000\u00af\u00b8\u0003"+
		"\u0018\f\u0000\u00b0\u00b3\u0005\u0004\u0000\u0000\u00b1\u00b4\u00054"+
		"\u0000\u0000\u00b2\u00b4\u0003\n\u0005\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b8\u0003\u0012\t\u0002"+
		"\u00b7\u00ac\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b8\u00c3\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\n\u0003\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0018\f\u0000\u00bc\u00bd\u0005\u0007\u0000\u0000\u00bd\u00c2"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\n\u0001\u0000\u0000\u00bf\u00c0\u0005"+
		"\b\u0000\u0000\u00c0\u00c2\u00054\u0000\u0000\u00c1\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00cb\u0003\u0018\f\u0000\u00c7\u00c8\u0005\u000b\u0000"+
		"\u0000\u00c8\u00ca\u0003\u0018\f\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003\u0014\n\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0006\f\uffff\uffff\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4"+
		"\u00d5\u0003\u0018\f\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u010d"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u001f\u0000\u0000\u00d8\u010d"+
		"\u0003\u0018\f\u001b\u00d9\u00da\u00050\u0000\u0000\u00da\u010d\u0003"+
		"\u0018\f\u001a\u00db\u00dc\u00051\u0000\u0000\u00dc\u010d\u0003\u0018"+
		"\f\u0019\u00dd\u00de\u0005\u001c\u0000\u0000\u00de\u010d\u0003\u0018\f"+
		"\u0018\u00df\u00e0\u0005\u0016\u0000\u0000\u00e0\u00e1\u0003\u0010\b\u0000"+
		"\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e3\u0003\u0018\f\u0000\u00e3"+
		"\u00e4\u0005\u0007\u0000\u0000\u00e4\u010d\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u0016\u0000\u0000\u00e6\u00e7\u0003\u0010\b\u0000\u00e7\u00e8"+
		"\u0005\u0004\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9\u010d"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000\u00eb\u00ec"+
		"\u0003\u0014\n\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u010d\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0005 \u0000\u0000\u00ef\u00f0\u0003\u0018"+
		"\f\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1\u00f2\u0003\u0018\f"+
		"\u0000\u00f2\u00f3\u0005!\u0000\u0000\u00f3\u010d\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u00054\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000\u0000\u00f6"+
		"\u00f7\u0003\u0016\u000b\u0000\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8"+
		"\u010d\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa"+
		"\u010d\u0003\u0018\f\u000b\u00fb\u00fc\u0005&\u0000\u0000\u00fc\u010d"+
		"\u0003\u0012\t\u0000\u00fd\u0100\u0005\u0004\u0000\u0000\u00fe\u0101\u0005"+
		"4\u0000\u0000\u00ff\u0101\u0003\n\u0005\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005\u0005\u0000\u0000\u0103\u010d\u0003\u0018"+
		"\f\t\u0104\u010d\u0005-\u0000\u0000\u0105\u010d\u0005.\u0000\u0000\u0106"+
		"\u010d\u00055\u0000\u0000\u0107\u010d\u00056\u0000\u0000\u0108\u010d\u0005"+
		"2\u0000\u0000\u0109\u010d\u00053\u0000\u0000\u010a\u010d\u0005/\u0000"+
		"\u0000\u010b\u010d\u00054\u0000\u0000\u010c\u00d2\u0001\u0000\u0000\u0000"+
		"\u010c\u00d7\u0001\u0000\u0000\u0000\u010c\u00d9\u0001\u0000\u0000\u0000"+
		"\u010c\u00db\u0001\u0000\u0000\u0000\u010c\u00dd\u0001\u0000\u0000\u0000"+
		"\u010c\u00df\u0001\u0000\u0000\u0000\u010c\u00e5\u0001\u0000\u0000\u0000"+
		"\u010c\u00ea\u0001\u0000\u0000\u0000\u010c\u00ee\u0001\u0000\u0000\u0000"+
		"\u010c\u00f4\u0001\u0000\u0000\u0000\u010c\u00f9\u0001\u0000\u0000\u0000"+
		"\u010c\u00fb\u0001\u0000\u0000\u0000\u010c\u00fd\u0001\u0000\u0000\u0000"+
		"\u010c\u0104\u0001\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000\u0000"+
		"\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000"+
		"\u010c\u0108\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u0130\u0001\u0000\u0000\u0000\u010e\u010f\n\u0015\u0000\u0000\u010f"+
		"\u0110\u0007\u0001\u0000\u0000\u0110\u012f\u0003\u0018\f\u0016\u0111\u0112"+
		"\n\u0014\u0000\u0000\u0112\u0113\u0007\u0002\u0000\u0000\u0113\u012f\u0003"+
		"\u0018\f\u0015\u0114\u0115\n\u0013\u0000\u0000\u0115\u0116\u0007\u0003"+
		"\u0000\u0000\u0116\u012f\u0003\u0018\f\u0014\u0117\u0118\n\u0012\u0000"+
		"\u0000\u0118\u0119\u0007\u0004\u0000\u0000\u0119\u012f\u0003\u0018\f\u0013"+
		"\u011a\u011b\n\u0011\u0000\u0000\u011b\u011c\u0005\u001e\u0000\u0000\u011c"+
		"\u012f\u0003\u0018\f\u0012\u011d\u011e\n\u0010\u0000\u0000\u011e\u011f"+
		"\u0005\u001d\u0000\u0000\u011f\u012f\u0003\u0018\f\u0011\u0120\u0121\n"+
		"\u000f\u0000\u0000\u0121\u0122\u0005\t\u0000\u0000\u0122\u0123\u0003\u0018"+
		"\f\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0003\u0018\f\u0010"+
		"\u0125\u012f\u0001\u0000\u0000\u0000\u0126\u0127\n\u001d\u0000\u0000\u0127"+
		"\u0128\u0005\b\u0000\u0000\u0128\u012f\u00054\u0000\u0000\u0129\u012a"+
		"\n\u001c\u0000\u0000\u012a\u012b\u0005\u0006\u0000\u0000\u012b\u012c\u0003"+
		"\u0018\f\u0000\u012c\u012d\u0005\u0007\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u010e\u0001\u0000\u0000\u0000\u012e\u0111\u0001\u0000"+
		"\u0000\u0000\u012e\u0114\u0001\u0000\u0000\u0000\u012e\u0117\u0001\u0000"+
		"\u0000\u0000\u012e\u011a\u0001\u0000\u0000\u0000\u012e\u011d\u0001\u0000"+
		"\u0000\u0000\u012e\u0120\u0001\u0000\u0000\u0000\u012e\u0126\u0001\u0000"+
		"\u0000\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0019\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u013d\u0001\u0000\u0000\u0000\u0134\u0139\u0003\u0010"+
		"\b\u0000\u0135\u0136\u0005\u000b\u0000\u0000\u0136\u0138\u0003\u0010\b"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013c\u0133\u0001\u0000\u0000\u0000\u013c\u0134\u0001\u0000\u0000"+
		"\u0000\u013d\u001b\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u000e\uffff"+
		"\uffff\u0000\u013f\u0140\u0005\u0018\u0000\u0000\u0140\u0147\u0003\u001c"+
		"\u000e\u0003\u0141\u0142\u0005\u0004\u0000\u0000\u0142\u0143\u0003\u001c"+
		"\u000e\u0000\u0143\u0144\u0005\u0005\u0000\u0000\u0144\u0147\u0001\u0000"+
		"\u0000\u0000\u0145\u0147\u00054\u0000\u0000\u0146\u013e\u0001\u0000\u0000"+
		"\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0152\u0001\u0000\u0000\u0000\u0148\u0149\n\u0005\u0000\u0000"+
		"\u0149\u014a\u0005\u0006\u0000\u0000\u014a\u0151\u0005\u0007\u0000\u0000"+
		"\u014b\u014c\n\u0004\u0000\u0000\u014c\u014d\u0005\u0004\u0000\u0000\u014d"+
		"\u014e\u0003\u001a\r\u0000\u014e\u014f\u0005\u0005\u0000\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u0148\u0001\u0000\u0000\u0000\u0150\u014b"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u001d"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u001a!.<"+
		"?Z^|\u0082\u008f\u00a0\u00aa\u00b3\u00b7\u00c1\u00c3\u00cb\u00d0\u0100"+
		"\u010c\u012e\u0130\u0139\u013c\u0146\u0150\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}