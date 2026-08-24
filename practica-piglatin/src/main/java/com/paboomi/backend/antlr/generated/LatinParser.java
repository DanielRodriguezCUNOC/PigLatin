// Generated from LatinParser.g4 by ANTLR 4.13.2
package com.paboomi.backend.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LatinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, PLUS=3, MINUS=4, MULT=5, SPLIT=6, VARIABILES_INIT=7, 
		MUNERA_INIT=8, MAIOR_INIT=9, FINIS_EOF=10, IDENTIC=11, DIFF=12, MAJORTO=13, 
		MINORTO=14, MINOR=15, MAJOR=16, ASSIGN=17, AND=18, OR=19, NOT=20, ADD=21, 
		SUB=22, COLON=23, SEMICOLON=24, COMMA=25, DOT=26, LEFT_CLASP=27, RIGHT_CLASP=28, 
		LEFT_BRACE=29, RIGHT_BRACE=30, LEFT_PAREN=31, RIGHT_PAREN=32, ESTO=33, 
		NUMERUS=34, TEXTUM=35, DECIMALIS=36, BOOL=37, LITTERA=38, VERUM=39, FALSUS=40, 
		SERIES=41, STRUCTURA=42, FINIS=43, SI=44, ALITER=45, DUM=46, FACERE=47, 
		PER=48, PERGE=49, INTERRUMPE=50, ACTIO=51, VARIABILES=52, MUNERA=53, MAIOR=54, 
		RATIO=55, REDDERE=56, LEERE=57, IMPREMERE=58, ID=59, DECIMAL=60, INTEGER=61, 
		STRING=62, CHAR=63, WS=64;
	public static final int
		RULE_program = 0, RULE_globalDeclarations = 1, RULE_globalDeclaration = 2, 
		RULE_functionDefinitions = 3, RULE_mainInstructions = 4, RULE_instruction = 5, 
		RULE_declaration = 6, RULE_arrayDeclaration = 7, RULE_arrayValues = 8, 
		RULE_structDefinition = 9, RULE_structFieldDeclaration = 10, RULE_structLiteral = 11, 
		RULE_structFieldInitializer = 12, RULE_structFieldSeparator = 13, RULE_ifStatement = 14, 
		RULE_elseIfClause = 15, RULE_elseClause = 16, RULE_whileStatement = 17, 
		RULE_doWhileStatement = 18, RULE_forStatement = 19, RULE_jumpStatement = 20, 
		RULE_functionDefinition = 21, RULE_functionBody = 22, RULE_parameter = 23, 
		RULE_parameterList = 24, RULE_argumentList = 25, RULE_returnStatement = 26, 
		RULE_varSection = 27, RULE_forInit = 28, RULE_forCondition = 29, RULE_forUpdate = 30, 
		RULE_block = 31, RULE_arrayCreation = 32, RULE_arrayLiteral = 33, RULE_type = 34, 
		RULE_readStatement = 35, RULE_printStatement = 36, RULE_printItem = 37, 
		RULE_lvalue = 38, RULE_lvalueSufix = 39, RULE_assignment = 40, RULE_expression = 41, 
		RULE_booleanExpression = 42, RULE_booleanOrExpression = 43, RULE_booleanAndExpression = 44, 
		RULE_comparisonExpression = 45, RULE_comparisonOperand = 46, RULE_numericExpression = 47, 
		RULE_additiveExpression = 48, RULE_multiplicativeExpression = 49, RULE_unaryExpression = 50, 
		RULE_addSubExpression = 51, RULE_incrementDecrementLiteral = 52, RULE_multSplitExpression = 53, 
		RULE_plusMinusExpression = 54, RULE_stringExpression = 55, RULE_stringAdditiveExpression = 56, 
		RULE_stringAdditiveItem = 57, RULE_stringPrimary = 58, RULE_primaryNumeric = 59, 
		RULE_numericLiteral = 60, RULE_booleanLiteral = 61, RULE_relationalLiteral = 62, 
		RULE_atributeAccessExpresion = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalDeclarations", "globalDeclaration", "functionDefinitions", 
			"mainInstructions", "instruction", "declaration", "arrayDeclaration", 
			"arrayValues", "structDefinition", "structFieldDeclaration", "structLiteral", 
			"structFieldInitializer", "structFieldSeparator", "ifStatement", "elseIfClause", 
			"elseClause", "whileStatement", "doWhileStatement", "forStatement", "jumpStatement", 
			"functionDefinition", "functionBody", "parameter", "parameterList", "argumentList", 
			"returnStatement", "varSection", "forInit", "forCondition", "forUpdate", 
			"block", "arrayCreation", "arrayLiteral", "type", "readStatement", "printStatement", 
			"printItem", "lvalue", "lvalueSufix", "assignment", "expression", "booleanExpression", 
			"booleanOrExpression", "booleanAndExpression", "comparisonExpression", 
			"comparisonOperand", "numericExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "addSubExpression", "incrementDecrementLiteral", "multSplitExpression", 
			"plusMinusExpression", "stringExpression", "stringAdditiveExpression", 
			"stringAdditiveItem", "stringPrimary", "primaryNumeric", "numericLiteral", 
			"booleanLiteral", "relationalLiteral", "atributeAccessExpresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'VARIABILES>'", "'MUNERA>'", 
			"'MAIOR>'", "'FINIS'", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", 
			"'='", "'&&'", "'||'", "'non'", "'++'", "'--'", "':'", "';'", "','", 
			"'.'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'esto'", "'numerus'", 
			"'textum'", "'decimalis'", "'bool'", "'littera'", "'verum'", "'falsus'", 
			"'series'", "'structura'", "'finis'", "'si'", "'aliter'", "'dum'", "'facere'", 
			"'per'", "'perge'", "'interrumpe'", "'actio'", "'VARIABILES'", "'MUNERA'", 
			"'MAIOR'", "'ratio'", "'reddere'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "BLOCK_COMMENT", "PLUS", "MINUS", "MULT", "SPLIT", 
			"VARIABILES_INIT", "MUNERA_INIT", "MAIOR_INIT", "FINIS_EOF", "IDENTIC", 
			"DIFF", "MAJORTO", "MINORTO", "MINOR", "MAJOR", "ASSIGN", "AND", "OR", 
			"NOT", "ADD", "SUB", "COLON", "SEMICOLON", "COMMA", "DOT", "LEFT_CLASP", 
			"RIGHT_CLASP", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
			"ESTO", "NUMERUS", "TEXTUM", "DECIMALIS", "BOOL", "LITTERA", "VERUM", 
			"FALSUS", "SERIES", "STRUCTURA", "FINIS", "SI", "ALITER", "DUM", "FACERE", 
			"PER", "PERGE", "INTERRUMPE", "ACTIO", "VARIABILES", "MUNERA", "MAIOR", 
			"RATIO", "REDDERE", "LEERE", "IMPREMERE", "ID", "DECIMAL", "INTEGER", 
			"STRING", "CHAR", "WS"
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
	public String getGrammarFileName() { return "LatinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIOR_INIT() { return getToken(LatinParser.MAIOR_INIT, 0); }
		public MainInstructionsContext mainInstructions() {
			return getRuleContext(MainInstructionsContext.class,0);
		}
		public TerminalNode FINIS_EOF() { return getToken(LatinParser.FINIS_EOF, 0); }
		public TerminalNode EOF() { return getToken(LatinParser.EOF, 0); }
		public TerminalNode VARIABILES_INIT() { return getToken(LatinParser.VARIABILES_INIT, 0); }
		public GlobalDeclarationsContext globalDeclarations() {
			return getRuleContext(GlobalDeclarationsContext.class,0);
		}
		public TerminalNode MUNERA_INIT() { return getToken(LatinParser.MUNERA_INIT, 0); }
		public FunctionDefinitionsContext functionDefinitions() {
			return getRuleContext(FunctionDefinitionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES_INIT) {
				{
				setState(128);
				match(VARIABILES_INIT);
				setState(129);
				globalDeclarations();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA_INIT) {
				{
				setState(132);
				match(MUNERA_INIT);
				setState(133);
				functionDefinitions();
				}
			}

			setState(136);
			match(MAIOR_INIT);
			setState(137);
			mainInstructions();
			setState(138);
			match(FINIS_EOF);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(139);
				match(SEMICOLON);
				}
			}

			setState(142);
			match(EOF);
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
	public static class GlobalDeclarationsContext extends ParserRuleContext {
		public List<GlobalDeclarationContext> globalDeclaration() {
			return getRuleContexts(GlobalDeclarationContext.class);
		}
		public GlobalDeclarationContext globalDeclaration(int i) {
			return getRuleContext(GlobalDeclarationContext.class,i);
		}
		public GlobalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterGlobalDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitGlobalDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitGlobalDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclarationsContext globalDeclarations() throws RecognitionException {
		GlobalDeclarationsContext _localctx = new GlobalDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6605659701248L) != 0)) {
				{
				{
				setState(144);
				globalDeclaration();
				}
				}
				setState(149);
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
	public static class GlobalDeclarationContext extends ParserRuleContext {
		public GlobalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclaration; }
	 
		public GlobalDeclarationContext() { }
		public void copyFrom(GlobalDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclarationArrayDeclarationContext extends GlobalDeclarationContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public GlobalDeclarationArrayDeclarationContext(GlobalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterGlobalDeclarationArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitGlobalDeclarationArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitGlobalDeclarationArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclarationStructDefinitionContext extends GlobalDeclarationContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public GlobalDeclarationStructDefinitionContext(GlobalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterGlobalDeclarationStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitGlobalDeclarationStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitGlobalDeclarationStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclarationDeclarationContext extends GlobalDeclarationContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public GlobalDeclarationDeclarationContext(GlobalDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterGlobalDeclarationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitGlobalDeclarationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitGlobalDeclarationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclarationContext globalDeclaration() throws RecognitionException {
		GlobalDeclarationContext _localctx = new GlobalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalDeclaration);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				_localctx = new GlobalDeclarationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declaration();
				}
				break;
			case SERIES:
				_localctx = new GlobalDeclarationArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				arrayDeclaration();
				}
				break;
			case STRUCTURA:
				_localctx = new GlobalDeclarationStructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				structDefinition();
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
	public static class FunctionDefinitionsContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterFunctionDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitFunctionDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitFunctionDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionsContext functionDefinitions() throws RecognitionException {
		FunctionDefinitionsContext _localctx = new FunctionDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(155);
				functionDefinition();
				}
				}
				setState(160);
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
	public static class MainInstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public MainInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterMainInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitMainInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitMainInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainInstructionsContext mainInstructions() throws RecognitionException {
		MainInstructionsContext _localctx = new MainInstructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -213971574323150824L) != 0)) {
				{
				{
				setState(161);
				instruction();
				}
				}
				setState(166);
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
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionAssignmentContext extends InstructionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public InstructionAssignmentContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterInstructionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitInstructionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitInstructionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				assignment();
				}
				break;
			case 2:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				readStatement();
				}
				break;
			case 3:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				printStatement();
				}
				break;
			case 4:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				ifStatement();
				}
				break;
			case 5:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				whileStatement();
				}
				break;
			case 6:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				doWhileStatement();
				}
				break;
			case 7:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				forStatement();
				}
				break;
			case 8:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				jumpStatement();
				}
				break;
			case 9:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new InstructionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				expression();
				setState(177);
				match(SEMICOLON);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ESTO);
			setState(182);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(183);
				match(COLON);
				}
			}

			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(186);
				type();
				}
				break;
			}
			setState(189);
			expression();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(190);
				match(SEMICOLON);
				}
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(LatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode LEFT_CLASP() { return getToken(LatinParser.LEFT_CLASP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_CLASP() { return getToken(LatinParser.RIGHT_CLASP, 0); }
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(SERIES);
			setState(194);
			match(ID);
			setState(195);
			match(LEFT_CLASP);
			setState(196);
			expression();
			setState(197);
			match(RIGHT_CLASP);
			setState(198);
			match(COLON);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576462934146809856L) != 0)) {
				{
				setState(199);
				type();
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACE) {
				{
				setState(202);
				match(LEFT_BRACE);
				setState(203);
				arrayValues();
				setState(204);
				match(RIGHT_BRACE);
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(208);
				match(SEMICOLON);
				}
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
	public static class ArrayValuesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LatinParser.COMMA, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expression();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212);
				match(COMMA);
				setState(213);
				expression();
				}
				}
				setState(218);
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
	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode STRUCTURA() { return getToken(LatinParser.STRUCTURA, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public List<StructFieldDeclarationContext> structFieldDeclaration() {
			return getRuleContexts(StructFieldDeclarationContext.class);
		}
		public StructFieldDeclarationContext structFieldDeclaration(int i) {
			return getRuleContext(StructFieldDeclarationContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public List<StructFieldSeparatorContext> structFieldSeparator() {
			return getRuleContexts(StructFieldSeparatorContext.class);
		}
		public StructFieldSeparatorContext structFieldSeparator(int i) {
			return getRuleContext(StructFieldSeparatorContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(STRUCTURA);
			setState(220);
			match(ID);
			setState(221);
			match(LEFT_BRACE);
			setState(222);
			structFieldDeclaration();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON || _la==COMMA) {
				{
				{
				setState(223);
				structFieldSeparator();
				setState(224);
				structFieldDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(RIGHT_BRACE);
			setState(232);
			match(FINIS);
			setState(233);
			match(SEMICOLON);
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
	public static class StructFieldDeclarationContext extends ParserRuleContext {
		public StructFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldDeclaration; }
	 
		public StructFieldDeclarationContext() { }
		public void copyFrom(StructFieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldDeclarationVariablesContext extends StructFieldDeclarationContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructFieldDeclarationVariablesContext(StructFieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructFieldDeclarationVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructFieldDeclarationVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructFieldDeclarationVariables(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldDeclarationSeriesContext extends StructFieldDeclarationContext {
		public TerminalNode SERIES() { return getToken(LatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructFieldDeclarationSeriesContext(StructFieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructFieldDeclarationSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructFieldDeclarationSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructFieldDeclarationSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldDeclarationContext structFieldDeclaration() throws RecognitionException {
		StructFieldDeclarationContext _localctx = new StructFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structFieldDeclaration);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				_localctx = new StructFieldDeclarationVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(ESTO);
				setState(236);
				match(ID);
				setState(237);
				match(COLON);
				setState(238);
				type();
				}
				break;
			case SERIES:
				_localctx = new StructFieldDeclarationSeriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(SERIES);
				setState(240);
				match(ID);
				setState(241);
				match(COLON);
				setState(242);
				type();
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
	public static class StructLiteralContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public List<StructFieldInitializerContext> structFieldInitializer() {
			return getRuleContexts(StructFieldInitializerContext.class);
		}
		public StructFieldInitializerContext structFieldInitializer(int i) {
			return getRuleContext(StructFieldInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LatinParser.COMMA, i);
		}
		public StructLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralContext structLiteral() throws RecognitionException {
		StructLiteralContext _localctx = new StructLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(245);
				match(ID);
				}
			}

			setState(248);
			match(LEFT_BRACE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(249);
				structFieldInitializer();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					structFieldInitializer();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259);
			match(RIGHT_BRACE);
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
	public static class StructFieldInitializerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructFieldInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructFieldInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructFieldInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructFieldInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldInitializerContext structFieldInitializer() throws RecognitionException {
		StructFieldInitializerContext _localctx = new StructFieldInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_structFieldInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(COLON);
			setState(263);
			expression();
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
	public static class StructFieldSeparatorContext extends ParserRuleContext {
		public StructFieldSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldSeparator; }
	 
		public StructFieldSeparatorContext() { }
		public void copyFrom(StructFieldSeparatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldSeparatorSemicolonContext extends StructFieldSeparatorContext {
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public StructFieldSeparatorSemicolonContext(StructFieldSeparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructFieldSeparatorSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructFieldSeparatorSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructFieldSeparatorSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldSeparatorCommaContext extends StructFieldSeparatorContext {
		public TerminalNode COMMA() { return getToken(LatinParser.COMMA, 0); }
		public StructFieldSeparatorCommaContext(StructFieldSeparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStructFieldSeparatorComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStructFieldSeparatorComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStructFieldSeparatorComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldSeparatorContext structFieldSeparator() throws RecognitionException {
		StructFieldSeparatorContext _localctx = new StructFieldSeparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structFieldSeparator);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new StructFieldSeparatorCommaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(COMMA);
				}
				break;
			case SEMICOLON:
				_localctx = new StructFieldSeparatorSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(SEMICOLON);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(LatinParser.SI, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public List<ElseIfClauseContext> elseIfClause() {
			return getRuleContexts(ElseIfClauseContext.class);
		}
		public ElseIfClauseContext elseIfClause(int i) {
			return getRuleContext(ElseIfClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(SI);
			setState(270);
			match(LEFT_PAREN);
			setState(271);
			booleanExpression();
			setState(272);
			match(RIGHT_PAREN);
			setState(273);
			block();
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					elseIfClause();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(280);
				elseClause();
				}
			}

			setState(283);
			match(FINIS);
			setState(284);
			match(SEMICOLON);
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
	public static class ElseIfClauseContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(LatinParser.ALITER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitElseIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitElseIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfClauseContext elseIfClause() throws RecognitionException {
		ElseIfClauseContext _localctx = new ElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseIfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ALITER);
			setState(287);
			match(LEFT_PAREN);
			setState(288);
			booleanExpression();
			setState(289);
			match(RIGHT_PAREN);
			setState(290);
			block();
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
	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(LatinParser.ALITER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ALITER);
			setState(293);
			block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(LatinParser.DUM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(DUM);
			setState(296);
			match(LEFT_PAREN);
			setState(297);
			booleanExpression();
			setState(298);
			match(RIGHT_PAREN);
			setState(299);
			block();
			setState(300);
			match(FINIS);
			setState(301);
			match(SEMICOLON);
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode FACERE() { return getToken(LatinParser.FACERE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DUM() { return getToken(LatinParser.DUM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(FACERE);
			setState(304);
			block();
			setState(305);
			match(DUM);
			setState(306);
			match(LEFT_PAREN);
			setState(307);
			booleanExpression();
			setState(308);
			match(RIGHT_PAREN);
			setState(309);
			match(SEMICOLON);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStandardContext extends ForStatementContext {
		public TerminalNode PER() { return getToken(LatinParser.PER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LatinParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LatinParser.SEMICOLON, i);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStandardContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForStandard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForStandard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForStandard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForStandardContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(PER);
			setState(312);
			match(LEFT_PAREN);
			setState(313);
			forInit();
			setState(314);
			match(SEMICOLON);
			setState(315);
			forCondition();
			setState(316);
			match(SEMICOLON);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576458567768342504L) != 0)) {
				{
				setState(317);
				forUpdate();
				}
			}

			setState(320);
			match(RIGHT_PAREN);
			setState(321);
			block();
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
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContinueContext extends JumpStatementContext {
		public TerminalNode PERGE() { return getToken(LatinParser.PERGE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public JumpStatementContinueContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterJumpStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitJumpStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitJumpStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementReturnContext extends JumpStatementContext {
		public TerminalNode INTERRUMPE() { return getToken(LatinParser.INTERRUMPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public JumpStatementReturnContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterJumpStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitJumpStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitJumpStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jumpStatement);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				_localctx = new JumpStatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(PERGE);
				setState(324);
				match(SEMICOLON);
				}
				break;
			case INTERRUMPE:
				_localctx = new JumpStatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(INTERRUMPE);
				setState(326);
				match(SEMICOLON);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	 
		public FunctionDefinitionContext() { }
		public void copyFrom(FunctionDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionVoidContext extends FunctionDefinitionContext {
		public TerminalNode ACTIO() { return getToken(LatinParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionVoidContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterFunctionDefinitionVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitFunctionDefinitionVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitFunctionDefinitionVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionReturnContext extends FunctionDefinitionContext {
		public TerminalNode RATIO() { return getToken(LatinParser.RATIO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionReturnContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterFunctionDefinitionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitFunctionDefinitionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitFunctionDefinitionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDefinition);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				_localctx = new FunctionDefinitionVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(ACTIO);
				setState(330);
				match(ID);
				setState(331);
				match(LEFT_PAREN);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(332);
					parameterList();
					}
				}

				setState(335);
				match(RIGHT_PAREN);
				setState(336);
				functionBody();
				setState(337);
				match(FINIS);
				setState(338);
				match(SEMICOLON);
				}
				break;
			case RATIO:
				_localctx = new FunctionDefinitionReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(RATIO);
				setState(341);
				type();
				setState(342);
				match(ID);
				setState(343);
				match(LEFT_PAREN);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(344);
					parameterList();
					}
				}

				setState(347);
				match(RIGHT_PAREN);
				setState(348);
				functionBody();
				setState(349);
				match(FINIS);
				setState(350);
				match(SEMICOLON);
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public VarSectionContext varSection() {
			return getRuleContext(VarSectionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LEFT_BRACE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(355);
				varSection();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -213971574323150824L) != 0)) {
				{
				{
				setState(358);
				instruction();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(RIGHT_BRACE);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ESTO);
			setState(367);
			match(ID);
			setState(368);
			match(COLON);
			setState(369);
			type();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LatinParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			parameter();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				parameter();
				}
				}
				setState(378);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LatinParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			expression();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380);
				match(COMMA);
				setState(381);
				expression();
				}
				}
				setState(386);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode REDDERE() { return getToken(LatinParser.REDDERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(REDDERE);
			setState(388);
			expression();
			setState(389);
			match(SEMICOLON);
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
	public static class VarSectionContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(LatinParser.VARIABILES, 0); }
		public TerminalNode LEFT_CLASP() { return getToken(LatinParser.LEFT_CLASP, 0); }
		public TerminalNode RIGHT_CLASP() { return getToken(LatinParser.RIGHT_CLASP, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public VarSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterVarSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitVarSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitVarSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSectionContext varSection() throws RecognitionException {
		VarSectionContext _localctx = new VarSectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(VARIABILES);
			setState(392);
			match(LEFT_CLASP);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO) {
				{
				{
				setState(393);
				declaration();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(RIGHT_CLASP);
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
	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	 
		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitWithAssignContext extends ForInitContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LatinParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitWithAssignContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForInitWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForInitWithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForInitWithAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitWithIDContext extends ForInitContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public ForInitWithIDContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForInitWithID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForInitWithID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForInitWithID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitWithDeclarationContext extends ForInitContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LatinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForInitWithDeclarationContext(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForInitWithDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForInitWithDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForInitWithDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forInit);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ForInitWithDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(ESTO);
				setState(402);
				match(ID);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(403);
					match(COLON);
					}
				}

				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(406);
					type();
					}
					break;
				}
				setState(409);
				expression();
				}
				break;
			case 2:
				_localctx = new ForInitWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				lvalue();
				setState(411);
				match(ASSIGN);
				setState(412);
				expression();
				}
				break;
			case 3:
				_localctx = new ForInitWithIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(ID);
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
	public static class ForConditionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			booleanExpression();
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
	public static class ForUpdateContext extends ParserRuleContext {
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	 
		public ForUpdateContext() { }
		public void copyFrom(ForUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateExpressionContext extends ForUpdateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateExpressionContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForUpdateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForUpdateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForUpdateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateLvalueContext extends ForUpdateContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LatinParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateLvalueContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterForUpdateLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitForUpdateLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitForUpdateLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forUpdate);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new ForUpdateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				expression();
				}
				break;
			case 2:
				_localctx = new ForUpdateLvalueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				lvalue();
				setState(421);
				match(ASSIGN);
				setState(422);
				expression();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LEFT_BRACE);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -213971574323150824L) != 0)) {
				{
				{
				setState(427);
				instruction();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(RIGHT_BRACE);
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
	public static class ArrayCreationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_CLASP() { return getToken(LatinParser.LEFT_CLASP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_CLASP() { return getToken(LatinParser.RIGHT_CLASP, 0); }
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			type();
			setState(436);
			match(LEFT_CLASP);
			setState(437);
			expression();
			setState(438);
			match(RIGHT_CLASP);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(LatinParser.LEFT_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(LatinParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LatinParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(LEFT_BRACE);
			setState(441);
			expression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				expression();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(RIGHT_BRACE);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeVerumContext extends TypeContext {
		public TerminalNode VERUM() { return getToken(LatinParser.VERUM, 0); }
		public TypeVerumContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeVerum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeVerum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeVerum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIDContext extends TypeContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeIDContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNumerusContext extends TypeContext {
		public TerminalNode NUMERUS() { return getToken(LatinParser.NUMERUS, 0); }
		public TypeNumerusContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeNumerus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeNumerus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeNumerus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDecimalisContext extends TypeContext {
		public TerminalNode DECIMALIS() { return getToken(LatinParser.DECIMALIS, 0); }
		public TypeDecimalisContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeDecimalis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeDecimalis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeDecimalis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTextumContext extends TypeContext {
		public TerminalNode TEXTUM() { return getToken(LatinParser.TEXTUM, 0); }
		public TypeTextumContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeTextum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeTextum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeTextum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(LatinParser.BOOL, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeLitteraContext extends TypeContext {
		public TerminalNode LITTERA() { return getToken(LatinParser.LITTERA, 0); }
		public TypeLitteraContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeLittera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeLittera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeLittera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeFalsusContext extends TypeContext {
		public TerminalNode FALSUS() { return getToken(LatinParser.FALSUS, 0); }
		public TypeFalsusContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterTypeFalsus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitTypeFalsus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitTypeFalsus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
				_localctx = new TypeNumerusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(NUMERUS);
				}
				break;
			case TEXTUM:
				_localctx = new TypeTextumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(TEXTUM);
				}
				break;
			case DECIMALIS:
				_localctx = new TypeDecimalisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(DECIMALIS);
				}
				break;
			case LITTERA:
				_localctx = new TypeLitteraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(LITTERA);
				}
				break;
			case VERUM:
				_localctx = new TypeVerumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new TypeFalsusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				match(FALSUS);
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(457);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(458);
				match(ID);
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
	public static class ReadStatementContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LEERE() { return getToken(LatinParser.LEERE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			lvalue();
			setState(462);
			match(LEERE);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(463);
				match(SEMICOLON);
				}
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
	public static class PrintStatementContext extends ParserRuleContext {
		public List<TerminalNode> IMPREMERE() { return getTokens(LatinParser.IMPREMERE); }
		public TerminalNode IMPREMERE(int i) {
			return getToken(LatinParser.IMPREMERE, i);
		}
		public List<PrintItemContext> printItem() {
			return getRuleContexts(PrintItemContext.class);
		}
		public PrintItemContext printItem(int i) {
			return getRuleContext(PrintItemContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_printStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(IMPREMERE);
			setState(467);
			printItem();
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					match(IMPREMERE);
					setState(469);
					printItem();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(475);
				match(SEMICOLON);
				}
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
	public static class PrintItemContext extends ParserRuleContext {
		public PrintItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printItem; }
	 
		public PrintItemContext() { }
		public void copyFrom(PrintItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintItemExpressionContext extends PrintItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintItemExpressionContext(PrintItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrintItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrintItemExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrintItemExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintItemStringContext extends PrintItemContext {
		public TerminalNode STRING() { return getToken(LatinParser.STRING, 0); }
		public PrintItemStringContext(PrintItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrintItemString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrintItemString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrintItemString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintItemIDContext extends PrintItemContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public PrintItemIDContext(PrintItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrintItemID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrintItemID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrintItemID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintItemContext printItem() throws RecognitionException {
		PrintItemContext _localctx = new PrintItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_printItem);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new PrintItemStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new PrintItemIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PrintItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				expression();
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
	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public List<LvalueSufixContext> lvalueSufix() {
			return getRuleContexts(LvalueSufixContext.class);
		}
		public LvalueSufixContext lvalueSufix(int i) {
			return getRuleContext(LvalueSufixContext.class,i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ID);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==LEFT_CLASP) {
				{
				{
				setState(484);
				lvalueSufix();
				}
				}
				setState(489);
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
	public static class LvalueSufixContext extends ParserRuleContext {
		public LvalueSufixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalueSufix; }
	 
		public LvalueSufixContext() { }
		public void copyFrom(LvalueSufixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessContext extends LvalueSufixContext {
		public TerminalNode LEFT_CLASP() { return getToken(LatinParser.LEFT_CLASP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_CLASP() { return getToken(LatinParser.RIGHT_CLASP, 0); }
		public IndexAccessContext(LvalueSufixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends LvalueSufixContext {
		public TerminalNode DOT() { return getToken(LatinParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public FieldAccessContext(LvalueSufixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueSufixContext lvalueSufix() throws RecognitionException {
		LvalueSufixContext _localctx = new LvalueSufixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lvalueSufix);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new FieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(DOT);
				setState(491);
				match(ID);
				}
				break;
			case LEFT_CLASP:
				_localctx = new IndexAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(LEFT_CLASP);
				setState(493);
				expression();
				setState(494);
				match(RIGHT_CLASP);
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
	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LatinParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LatinParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			lvalue();
			setState(499);
			match(ASSIGN);
			setState(500);
			expression();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(501);
				match(SEMICOLON);
				}
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBooleanExpressionContext extends ExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringExpressionContext extends ExpressionContext {
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public ExpressionStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStructLiteralContext extends ExpressionContext {
		public StructLiteralContext structLiteral() {
			return getRuleContext(StructLiteralContext.class,0);
		}
		public ExpressionStructLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNumericExpressionContext extends ExpressionContext {
		public NumericExpressionContext numericExpression() {
			return getRuleContext(NumericExpressionContext.class,0);
		}
		public ExpressionNumericExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrayCreationContext extends ExpressionContext {
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public ExpressionArrayCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArrayLiteralContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExpressionArrayLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterExpressionArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitExpressionArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitExpressionArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ExpressionBooleanExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				booleanExpression();
				}
				break;
			case 2:
				_localctx = new ExpressionNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				numericExpression();
				}
				break;
			case 3:
				_localctx = new ExpressionStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				stringExpression();
				}
				break;
			case 4:
				_localctx = new ExpressionStructLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				structLiteral();
				}
				break;
			case 5:
				_localctx = new ExpressionArrayCreationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				arrayCreation();
				}
				break;
			case 6:
				_localctx = new ExpressionArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				arrayLiteral();
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
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanOrExpressionContext booleanOrExpression() {
			return getRuleContext(BooleanOrExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			booleanOrExpression();
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
	public static class BooleanOrExpressionContext extends ParserRuleContext {
		public List<BooleanAndExpressionContext> booleanAndExpression() {
			return getRuleContexts(BooleanAndExpressionContext.class);
		}
		public BooleanAndExpressionContext booleanAndExpression(int i) {
			return getRuleContext(BooleanAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(LatinParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LatinParser.OR, i);
		}
		public BooleanOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBooleanOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBooleanOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBooleanOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOrExpressionContext booleanOrExpression() throws RecognitionException {
		BooleanOrExpressionContext _localctx = new BooleanOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			booleanAndExpression();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(515);
				match(OR);
				setState(516);
				booleanAndExpression();
				}
				}
				setState(521);
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
	public static class BooleanAndExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LatinParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LatinParser.AND, i);
		}
		public BooleanAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBooleanAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBooleanAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBooleanAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAndExpressionContext booleanAndExpression() throws RecognitionException {
		BooleanAndExpressionContext _localctx = new BooleanAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_booleanAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			comparisonExpression();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(523);
				match(AND);
				setState(524);
				comparisonExpression();
				}
				}
				setState(529);
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
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionNotContext extends ComparisonExpressionContext {
		public TerminalNode NOT() { return getToken(LatinParser.NOT, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ComparisonExpressionNotContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterComparisonExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitComparisonExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitComparisonExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionComparisonOperandContext extends ComparisonExpressionContext {
		public List<ComparisonOperandContext> comparisonOperand() {
			return getRuleContexts(ComparisonOperandContext.class);
		}
		public ComparisonOperandContext comparisonOperand(int i) {
			return getRuleContext(ComparisonOperandContext.class,i);
		}
		public RelationalLiteralContext relationalLiteral() {
			return getRuleContext(RelationalLiteralContext.class,0);
		}
		public ComparisonExpressionComparisonOperandContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterComparisonExpressionComparisonOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitComparisonExpressionComparisonOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitComparisonExpressionComparisonOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionBooleanExpresionContext extends ComparisonExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public ComparisonExpressionBooleanExpresionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterComparisonExpressionBooleanExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitComparisonExpressionBooleanExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitComparisonExpressionBooleanExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_comparisonExpression);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(NOT);
				setState(531);
				comparisonExpression();
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionComparisonOperandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				comparisonOperand();
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) {
					{
					setState(533);
					relationalLiteral();
					setState(534);
					comparisonOperand();
					}
				}

				}
				break;
			case 3:
				_localctx = new ComparisonExpressionBooleanExpresionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(LEFT_PAREN);
				setState(539);
				booleanExpression();
				setState(540);
				match(RIGHT_PAREN);
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
	public static class ComparisonOperandContext extends ParserRuleContext {
		public NumericExpressionContext numericExpression() {
			return getRuleContext(NumericExpressionContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public ComparisonOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterComparisonOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitComparisonOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitComparisonOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperandContext comparisonOperand() throws RecognitionException {
		ComparisonOperandContext _localctx = new ComparisonOperandContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comparisonOperand);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				numericExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				booleanLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				stringExpression();
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
	public static class NumericExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numericExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			additiveExpression();
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<PlusMinusExpressionContext> plusMinusExpression() {
			return getRuleContexts(PlusMinusExpressionContext.class);
		}
		public PlusMinusExpressionContext plusMinusExpression(int i) {
			return getRuleContext(PlusMinusExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			multiplicativeExpression();
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					plusMinusExpression();
					setState(553);
					multiplicativeExpression();
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MultSplitExpressionContext> multSplitExpression() {
			return getRuleContexts(MultSplitExpressionContext.class);
		}
		public MultSplitExpressionContext multSplitExpression(int i) {
			return getRuleContext(MultSplitExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			unaryExpression();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==SPLIT) {
				{
				{
				setState(561);
				multSplitExpression();
				setState(562);
				unaryExpression();
				}
				}
				setState(568);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionNumericContext extends UnaryExpressionContext {
		public PrimaryNumericContext primaryNumeric() {
			return getRuleContext(PrimaryNumericContext.class,0);
		}
		public UnaryExpressionNumericContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterUnaryExpressionNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitUnaryExpressionNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitUnaryExpressionNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionAddSubContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public UnaryExpressionAddSubContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterUnaryExpressionAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitUnaryExpressionAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitUnaryExpressionAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unaryExpression);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ADD:
			case SUB:
				_localctx = new UnaryExpressionAddSubContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(569);
				addSubExpression();
				}
				setState(570);
				unaryExpression();
				}
				break;
			case LEFT_PAREN:
			case VERUM:
			case FALSUS:
			case ID:
			case DECIMAL:
			case INTEGER:
			case CHAR:
				_localctx = new UnaryExpressionNumericContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				primaryNumeric();
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
	public static class AddSubExpressionContext extends ParserRuleContext {
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
	 
		public AddSubExpressionContext() { }
		public void copyFrom(AddSubExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionSubContext extends AddSubExpressionContext {
		public TerminalNode SUB() { return getToken(LatinParser.SUB, 0); }
		public AddSubExpressionSubContext(AddSubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAddSubExpressionSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAddSubExpressionSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAddSubExpressionSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionAddContext extends AddSubExpressionContext {
		public TerminalNode ADD() { return getToken(LatinParser.ADD, 0); }
		public AddSubExpressionAddContext(AddSubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAddSubExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAddSubExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAddSubExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionPlusContext extends AddSubExpressionContext {
		public TerminalNode PLUS() { return getToken(LatinParser.PLUS, 0); }
		public AddSubExpressionPlusContext(AddSubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAddSubExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAddSubExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAddSubExpressionPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionMinusContext extends AddSubExpressionContext {
		public TerminalNode MINUS() { return getToken(LatinParser.MINUS, 0); }
		public AddSubExpressionMinusContext(AddSubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAddSubExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAddSubExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAddSubExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_addSubExpression);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AddSubExpressionPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new AddSubExpressionMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(MINUS);
				}
				break;
			case ADD:
				_localctx = new AddSubExpressionAddContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new AddSubExpressionSubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(SUB);
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
	public static class IncrementDecrementLiteralContext extends ParserRuleContext {
		public IncrementDecrementLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementDecrementLiteral; }
	 
		public IncrementDecrementLiteralContext() { }
		public void copyFrom(IncrementDecrementLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementDecrementLiteralAddContext extends IncrementDecrementLiteralContext {
		public TerminalNode ADD() { return getToken(LatinParser.ADD, 0); }
		public IncrementDecrementLiteralAddContext(IncrementDecrementLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterIncrementDecrementLiteralAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitIncrementDecrementLiteralAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitIncrementDecrementLiteralAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementDecrementLiteralSubContext extends IncrementDecrementLiteralContext {
		public TerminalNode SUB() { return getToken(LatinParser.SUB, 0); }
		public IncrementDecrementLiteralSubContext(IncrementDecrementLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterIncrementDecrementLiteralSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitIncrementDecrementLiteralSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitIncrementDecrementLiteralSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementDecrementLiteralContext incrementDecrementLiteral() throws RecognitionException {
		IncrementDecrementLiteralContext _localctx = new IncrementDecrementLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_incrementDecrementLiteral);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				_localctx = new IncrementDecrementLiteralAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new IncrementDecrementLiteralSubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(SUB);
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
	public static class MultSplitExpressionContext extends ParserRuleContext {
		public MultSplitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multSplitExpression; }
	 
		public MultSplitExpressionContext() { }
		public void copyFrom(MultSplitExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultSplitExpressionSplitContext extends MultSplitExpressionContext {
		public TerminalNode SPLIT() { return getToken(LatinParser.SPLIT, 0); }
		public MultSplitExpressionSplitContext(MultSplitExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterMultSplitExpressionSplit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitMultSplitExpressionSplit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitMultSplitExpressionSplit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultSplitExpressionMultContext extends MultSplitExpressionContext {
		public TerminalNode MULT() { return getToken(LatinParser.MULT, 0); }
		public MultSplitExpressionMultContext(MultSplitExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterMultSplitExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitMultSplitExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitMultSplitExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultSplitExpressionContext multSplitExpression() throws RecognitionException {
		MultSplitExpressionContext _localctx = new MultSplitExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_multSplitExpression);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultSplitExpressionMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(MULT);
				}
				break;
			case SPLIT:
				_localctx = new MultSplitExpressionSplitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(SPLIT);
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
	public static class PlusMinusExpressionContext extends ParserRuleContext {
		public PlusMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExpression; }
	 
		public PlusMinusExpressionContext() { }
		public void copyFrom(PlusMinusExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusExpressionMinusContext extends PlusMinusExpressionContext {
		public TerminalNode MINUS() { return getToken(LatinParser.MINUS, 0); }
		public PlusMinusExpressionMinusContext(PlusMinusExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPlusMinusExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPlusMinusExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPlusMinusExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusExpressionPlusContext extends PlusMinusExpressionContext {
		public TerminalNode PLUS() { return getToken(LatinParser.PLUS, 0); }
		public PlusMinusExpressionPlusContext(PlusMinusExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPlusMinusExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPlusMinusExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPlusMinusExpressionPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusExpressionContext plusMinusExpression() throws RecognitionException {
		PlusMinusExpressionContext _localctx = new PlusMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_plusMinusExpression);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusMinusExpressionPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new PlusMinusExpressionMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(MINUS);
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
	public static class StringExpressionContext extends ParserRuleContext {
		public StringAdditiveExpressionContext stringAdditiveExpression() {
			return getRuleContext(StringAdditiveExpressionContext.class,0);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			stringAdditiveExpression();
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
	public static class StringAdditiveExpressionContext extends ParserRuleContext {
		public StringPrimaryContext stringPrimary() {
			return getRuleContext(StringPrimaryContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(LatinParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LatinParser.PLUS, i);
		}
		public List<StringAdditiveItemContext> stringAdditiveItem() {
			return getRuleContexts(StringAdditiveItemContext.class);
		}
		public StringAdditiveItemContext stringAdditiveItem(int i) {
			return getRuleContext(StringAdditiveItemContext.class,i);
		}
		public StringAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAdditiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAdditiveExpressionContext stringAdditiveExpression() throws RecognitionException {
		StringAdditiveExpressionContext _localctx = new StringAdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_stringAdditiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			stringPrimary();
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					match(PLUS);
					setState(597);
					stringAdditiveItem();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
	public static class StringAdditiveItemContext extends ParserRuleContext {
		public StringAdditiveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAdditiveItem; }
	 
		public StringAdditiveItemContext() { }
		public void copyFrom(StringAdditiveItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAdditiveItemNumericExpressionContext extends StringAdditiveItemContext {
		public NumericExpressionContext numericExpression() {
			return getRuleContext(NumericExpressionContext.class,0);
		}
		public StringAdditiveItemNumericExpressionContext(StringAdditiveItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringAdditiveItemNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringAdditiveItemNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringAdditiveItemNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAdditiveItemStringPrimaryContext extends StringAdditiveItemContext {
		public StringPrimaryContext stringPrimary() {
			return getRuleContext(StringPrimaryContext.class,0);
		}
		public StringAdditiveItemStringPrimaryContext(StringAdditiveItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringAdditiveItemStringPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringAdditiveItemStringPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringAdditiveItemStringPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAdditiveItemContext stringAdditiveItem() throws RecognitionException {
		StringAdditiveItemContext _localctx = new StringAdditiveItemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_stringAdditiveItem);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new StringAdditiveItemStringPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				stringPrimary();
				}
				break;
			case 2:
				_localctx = new StringAdditiveItemNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				numericExpression();
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
	public static class StringPrimaryContext extends ParserRuleContext {
		public StringPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringPrimary; }
	 
		public StringPrimaryContext() { }
		public void copyFrom(StringPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryAtributeAccessExpressionContext extends StringPrimaryContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public List<AtributeAccessExpresionContext> atributeAccessExpresion() {
			return getRuleContexts(AtributeAccessExpresionContext.class);
		}
		public AtributeAccessExpresionContext atributeAccessExpresion(int i) {
			return getRuleContext(AtributeAccessExpresionContext.class,i);
		}
		public StringPrimaryAtributeAccessExpressionContext(StringPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringPrimaryAtributeAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringPrimaryAtributeAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringPrimaryAtributeAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryStringContext extends StringPrimaryContext {
		public TerminalNode STRING() { return getToken(LatinParser.STRING, 0); }
		public StringPrimaryStringContext(StringPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringPrimaryString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringPrimaryString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringPrimaryString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryCharContext extends StringPrimaryContext {
		public TerminalNode CHAR() { return getToken(LatinParser.CHAR, 0); }
		public StringPrimaryCharContext(StringPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterStringPrimaryChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitStringPrimaryChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitStringPrimaryChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringPrimaryContext stringPrimary() throws RecognitionException {
		StringPrimaryContext _localctx = new StringPrimaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_stringPrimary);
		try {
			int _alt;
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringPrimaryStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new StringPrimaryCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(CHAR);
				}
				break;
			case ID:
				_localctx = new StringPrimaryAtributeAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(ID);
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						atributeAccessExpresion();
						}
						} 
					}
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
	public static class PrimaryNumericContext extends ParserRuleContext {
		public PrimaryNumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNumeric; }
	 
		public PrimaryNumericContext() { }
		public void copyFrom(PrimaryNumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNumericAtributeAccessExpressionContext extends PrimaryNumericContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public List<AtributeAccessExpresionContext> atributeAccessExpresion() {
			return getRuleContexts(AtributeAccessExpresionContext.class);
		}
		public AtributeAccessExpresionContext atributeAccessExpresion(int i) {
			return getRuleContext(AtributeAccessExpresionContext.class,i);
		}
		public IncrementDecrementLiteralContext incrementDecrementLiteral() {
			return getRuleContext(IncrementDecrementLiteralContext.class,0);
		}
		public PrimaryNumericAtributeAccessExpressionContext(PrimaryNumericContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrimaryNumericAtributeAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrimaryNumericAtributeAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrimaryNumericAtributeAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNumericNumericExpressionContext extends PrimaryNumericContext {
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public NumericExpressionContext numericExpression() {
			return getRuleContext(NumericExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public PrimaryNumericNumericExpressionContext(PrimaryNumericContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrimaryNumericNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrimaryNumericNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrimaryNumericNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNumericNumericLiteralContext extends PrimaryNumericContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PrimaryNumericNumericLiteralContext(PrimaryNumericContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterPrimaryNumericNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitPrimaryNumericNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitPrimaryNumericNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNumericContext primaryNumeric() throws RecognitionException {
		PrimaryNumericContext _localctx = new PrimaryNumericContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryNumeric);
		try {
			int _alt;
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
			case FALSUS:
			case DECIMAL:
			case INTEGER:
			case CHAR:
				_localctx = new PrimaryNumericNumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				numericLiteral();
				}
				break;
			case ID:
				_localctx = new PrimaryNumericAtributeAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(ID);
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(620);
						atributeAccessExpresion();
						}
						} 
					}
					setState(625);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(626);
					incrementDecrementLiteral();
					}
					break;
				}
				}
				break;
			case LEFT_PAREN:
				_localctx = new PrimaryNumericNumericExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				match(LEFT_PAREN);
				setState(630);
				numericExpression();
				setState(631);
				match(RIGHT_PAREN);
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
	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	 
		public NumericLiteralContext() { }
		public void copyFrom(NumericLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralIntegerContext extends NumericLiteralContext {
		public TerminalNode INTEGER() { return getToken(LatinParser.INTEGER, 0); }
		public NumericLiteralIntegerContext(NumericLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterNumericLiteralInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitNumericLiteralInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitNumericLiteralInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralBooleanContext extends NumericLiteralContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public NumericLiteralBooleanContext(NumericLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterNumericLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitNumericLiteralBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitNumericLiteralBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralCharContext extends NumericLiteralContext {
		public TerminalNode CHAR() { return getToken(LatinParser.CHAR, 0); }
		public NumericLiteralCharContext(NumericLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterNumericLiteralChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitNumericLiteralChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitNumericLiteralChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralDecimalContext extends NumericLiteralContext {
		public TerminalNode DECIMAL() { return getToken(LatinParser.DECIMAL, 0); }
		public NumericLiteralDecimalContext(NumericLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterNumericLiteralDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitNumericLiteralDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitNumericLiteralDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_numericLiteral);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new NumericLiteralIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new NumericLiteralDecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(DECIMAL);
				}
				break;
			case CHAR:
				_localctx = new NumericLiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(CHAR);
				}
				break;
			case VERUM:
			case FALSUS:
				_localctx = new NumericLiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				booleanLiteral();
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
	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralFalsusContext extends BooleanLiteralContext {
		public TerminalNode FALSUS() { return getToken(LatinParser.FALSUS, 0); }
		public BooleanLiteralFalsusContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBooleanLiteralFalsus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBooleanLiteralFalsus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBooleanLiteralFalsus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralVerumContext extends BooleanLiteralContext {
		public TerminalNode VERUM() { return getToken(LatinParser.VERUM, 0); }
		public BooleanLiteralVerumContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterBooleanLiteralVerum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitBooleanLiteralVerum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitBooleanLiteralVerum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_booleanLiteral);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
				_localctx = new BooleanLiteralVerumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new BooleanLiteralFalsusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(FALSUS);
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
	public static class RelationalLiteralContext extends ParserRuleContext {
		public RelationalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalLiteral; }
	 
		public RelationalLiteralContext() { }
		public void copyFrom(RelationalLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralMajorToContext extends RelationalLiteralContext {
		public TerminalNode MAJORTO() { return getToken(LatinParser.MAJORTO, 0); }
		public RelationalLiteralMajorToContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralMajorTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralMajorTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralMajorTo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralMinorContext extends RelationalLiteralContext {
		public TerminalNode MINOR() { return getToken(LatinParser.MINOR, 0); }
		public RelationalLiteralMinorContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralMinor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralMinor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralMinor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralMinorToContext extends RelationalLiteralContext {
		public TerminalNode MINORTO() { return getToken(LatinParser.MINORTO, 0); }
		public RelationalLiteralMinorToContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralMinorTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralMinorTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralMinorTo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralIdenticContext extends RelationalLiteralContext {
		public TerminalNode IDENTIC() { return getToken(LatinParser.IDENTIC, 0); }
		public RelationalLiteralIdenticContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralIdentic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralIdentic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralIdentic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralMajorContext extends RelationalLiteralContext {
		public TerminalNode MAJOR() { return getToken(LatinParser.MAJOR, 0); }
		public RelationalLiteralMajorContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralMajor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralMajor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralMajor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalLiteralDiffContext extends RelationalLiteralContext {
		public TerminalNode DIFF() { return getToken(LatinParser.DIFF, 0); }
		public RelationalLiteralDiffContext(RelationalLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterRelationalLiteralDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitRelationalLiteralDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitRelationalLiteralDiff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalLiteralContext relationalLiteral() throws RecognitionException {
		RelationalLiteralContext _localctx = new RelationalLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationalLiteral);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIC:
				_localctx = new RelationalLiteralIdenticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(IDENTIC);
				}
				break;
			case DIFF:
				_localctx = new RelationalLiteralDiffContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(DIFF);
				}
				break;
			case MINOR:
				_localctx = new RelationalLiteralMinorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				match(MINOR);
				}
				break;
			case MAJOR:
				_localctx = new RelationalLiteralMajorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				match(MAJOR);
				}
				break;
			case MINORTO:
				_localctx = new RelationalLiteralMinorToContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				match(MINORTO);
				}
				break;
			case MAJORTO:
				_localctx = new RelationalLiteralMajorToContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				match(MAJORTO);
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
	public static class AtributeAccessExpresionContext extends ParserRuleContext {
		public AtributeAccessExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributeAccessExpresion; }
	 
		public AtributeAccessExpresionContext() { }
		public void copyFrom(AtributeAccessExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtributeAccessExpressionDitIDContext extends AtributeAccessExpresionContext {
		public TerminalNode DOT() { return getToken(LatinParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public AtributeAccessExpressionDitIDContext(AtributeAccessExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAtributeAccessExpressionDitID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAtributeAccessExpressionDitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAtributeAccessExpressionDitID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtributeAccessExpressionClaspExpressionContext extends AtributeAccessExpresionContext {
		public TerminalNode LEFT_CLASP() { return getToken(LatinParser.LEFT_CLASP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_CLASP() { return getToken(LatinParser.RIGHT_CLASP, 0); }
		public AtributeAccessExpressionClaspExpressionContext(AtributeAccessExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAtributeAccessExpressionClaspExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAtributeAccessExpressionClaspExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAtributeAccessExpressionClaspExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtributeAccessExpressionParenExpressionContext extends AtributeAccessExpresionContext {
		public TerminalNode LEFT_PAREN() { return getToken(LatinParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(LatinParser.RIGHT_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AtributeAccessExpressionParenExpressionContext(AtributeAccessExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).enterAtributeAccessExpressionParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinParserListener ) ((LatinParserListener)listener).exitAtributeAccessExpressionParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinParserVisitor ) return ((LatinParserVisitor<? extends T>)visitor).visitAtributeAccessExpressionParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributeAccessExpresionContext atributeAccessExpresion() throws RecognitionException {
		AtributeAccessExpresionContext _localctx = new AtributeAccessExpresionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_atributeAccessExpresion);
		int _la;
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new AtributeAccessExpressionDitIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(DOT);
				setState(654);
				match(ID);
				}
				break;
			case LEFT_CLASP:
				_localctx = new AtributeAccessExpressionClaspExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(LEFT_CLASP);
				setState(656);
				expression();
				setState(657);
				match(RIGHT_CLASP);
				}
				break;
			case LEFT_PAREN:
				_localctx = new AtributeAccessExpressionParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(LEFT_PAREN);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576458567768342504L) != 0)) {
					{
					setState(660);
					argumentList();
					}
				}

				setState(663);
				match(RIGHT_PAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001@\u029b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0083\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0087\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u008d"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0092\b\u0001"+
		"\n\u0001\f\u0001\u0095\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u009a\b\u0002\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003"+
		"\u00a0\t\u0003\u0001\u0004\u0005\u0004\u00a3\b\u0004\n\u0004\f\u0004\u00a6"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00b9\b\u0006\u0001\u0006\u0003\u0006\u00bc\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c9\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cf\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00d2\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00d7\b\b\n\b\f\b\u00da\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00e3\b\t\n\t\f\t\u00e6\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00f4\b\n\u0001\u000b\u0003\u000b\u00f7\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00fd\b\u000b\n\u000b"+
		"\f\u000b\u0100\t\u000b\u0003\u000b\u0102\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0114\b\u000e\n\u000e\f\u000e\u0117\t\u000e\u0001\u000e\u0003\u000e"+
		"\u011a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u013f\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0148\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014e\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015a\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0161\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0165\b\u0016\u0001\u0016\u0005\u0016"+
		"\u0168\b\u0016\n\u0016\f\u0016\u016b\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0177\b\u0018\n\u0018\f\u0018\u017a\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u017f\b\u0019\n\u0019"+
		"\f\u0019\u0182\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u018b\b\u001b\n\u001b"+
		"\f\u001b\u018e\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0195\b\u001c\u0001\u001c\u0003\u001c\u0198\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01a0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a9\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01ad\b\u001f\n\u001f\f\u001f\u01b0\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u01bd\b!\n!\f!\u01c0\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01cc\b\"\u0001"+
		"#\u0001#\u0001#\u0003#\u01d1\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u01d7"+
		"\b$\n$\f$\u01da\t$\u0001$\u0003$\u01dd\b$\u0001%\u0001%\u0001%\u0003%"+
		"\u01e2\b%\u0001&\u0001&\u0005&\u01e6\b&\n&\f&\u01e9\t&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01f1\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01f7\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u01ff\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u0206\b+\n+\f+\u0209"+
		"\t+\u0001,\u0001,\u0001,\u0005,\u020e\b,\n,\f,\u0211\t,\u0001-\u0001-"+
		"\u0001-\u0001-\u0001-\u0001-\u0003-\u0219\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u021f\b-\u0001.\u0001.\u0001.\u0003.\u0224\b.\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00050\u022c\b0\n0\f0\u022f\t0\u00011\u00011\u0001"+
		"1\u00011\u00051\u0235\b1\n1\f1\u0238\t1\u00012\u00012\u00012\u00012\u0003"+
		"2\u023e\b2\u00013\u00013\u00013\u00013\u00033\u0244\b3\u00014\u00014\u0003"+
		"4\u0248\b4\u00015\u00015\u00035\u024c\b5\u00016\u00016\u00036\u0250\b"+
		"6\u00017\u00017\u00018\u00018\u00018\u00058\u0257\b8\n8\f8\u025a\t8\u0001"+
		"9\u00019\u00039\u025e\b9\u0001:\u0001:\u0001:\u0001:\u0005:\u0264\b:\n"+
		":\f:\u0267\t:\u0003:\u0269\b:\u0001;\u0001;\u0001;\u0005;\u026e\b;\n;"+
		"\f;\u0271\t;\u0001;\u0003;\u0274\b;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u027a\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u0280\b<\u0001=\u0001=\u0003"+
		"=\u0284\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u028c\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0296\b?\u0001"+
		"?\u0003?\u0299\b?\u0001?\u0000\u0000@\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\u0000\u02c4\u0000\u0082\u0001\u0000"+
		"\u0000\u0000\u0002\u0093\u0001\u0000\u0000\u0000\u0004\u0099\u0001\u0000"+
		"\u0000\u0000\u0006\u009e\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000"+
		"\u0000\n\u00b3\u0001\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000\u0000"+
		"\u000e\u00c1\u0001\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000\u0000"+
		"\u0012\u00db\u0001\u0000\u0000\u0000\u0014\u00f3\u0001\u0000\u0000\u0000"+
		"\u0016\u00f6\u0001\u0000\u0000\u0000\u0018\u0105\u0001\u0000\u0000\u0000"+
		"\u001a\u010b\u0001\u0000\u0000\u0000\u001c\u010d\u0001\u0000\u0000\u0000"+
		"\u001e\u011e\u0001\u0000\u0000\u0000 \u0124\u0001\u0000\u0000\u0000\""+
		"\u0127\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000\u0000&\u0137\u0001"+
		"\u0000\u0000\u0000(\u0147\u0001\u0000\u0000\u0000*\u0160\u0001\u0000\u0000"+
		"\u0000,\u0162\u0001\u0000\u0000\u0000.\u016e\u0001\u0000\u0000\u00000"+
		"\u0173\u0001\u0000\u0000\u00002\u017b\u0001\u0000\u0000\u00004\u0183\u0001"+
		"\u0000\u0000\u00006\u0187\u0001\u0000\u0000\u00008\u019f\u0001\u0000\u0000"+
		"\u0000:\u01a1\u0001\u0000\u0000\u0000<\u01a8\u0001\u0000\u0000\u0000>"+
		"\u01aa\u0001\u0000\u0000\u0000@\u01b3\u0001\u0000\u0000\u0000B\u01b8\u0001"+
		"\u0000\u0000\u0000D\u01cb\u0001\u0000\u0000\u0000F\u01cd\u0001\u0000\u0000"+
		"\u0000H\u01d2\u0001\u0000\u0000\u0000J\u01e1\u0001\u0000\u0000\u0000L"+
		"\u01e3\u0001\u0000\u0000\u0000N\u01f0\u0001\u0000\u0000\u0000P\u01f2\u0001"+
		"\u0000\u0000\u0000R\u01fe\u0001\u0000\u0000\u0000T\u0200\u0001\u0000\u0000"+
		"\u0000V\u0202\u0001\u0000\u0000\u0000X\u020a\u0001\u0000\u0000\u0000Z"+
		"\u021e\u0001\u0000\u0000\u0000\\\u0223\u0001\u0000\u0000\u0000^\u0225"+
		"\u0001\u0000\u0000\u0000`\u0227\u0001\u0000\u0000\u0000b\u0230\u0001\u0000"+
		"\u0000\u0000d\u023d\u0001\u0000\u0000\u0000f\u0243\u0001\u0000\u0000\u0000"+
		"h\u0247\u0001\u0000\u0000\u0000j\u024b\u0001\u0000\u0000\u0000l\u024f"+
		"\u0001\u0000\u0000\u0000n\u0251\u0001\u0000\u0000\u0000p\u0253\u0001\u0000"+
		"\u0000\u0000r\u025d\u0001\u0000\u0000\u0000t\u0268\u0001\u0000\u0000\u0000"+
		"v\u0279\u0001\u0000\u0000\u0000x\u027f\u0001\u0000\u0000\u0000z\u0283"+
		"\u0001\u0000\u0000\u0000|\u028b\u0001\u0000\u0000\u0000~\u0298\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0083\u0003\u0002"+
		"\u0001\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0085\u0005\b\u0000"+
		"\u0000\u0085\u0087\u0003\u0006\u0003\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000"+
		"\u008a\u008c\u0005\n\u0000\u0000\u008b\u008d\u0005\u0018\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0000\u0000\u0001\u008f"+
		"\u0001\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u0004\u0002\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0003\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u009a\u0003\f\u0006\u0000\u0097\u009a\u0003\u000e\u0007\u0000\u0098\u009a"+
		"\u0003\u0012\t\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0005\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0003*\u0015\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0007\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\n\u0005"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00b4\u0003P(\u0000\u00a8\u00b4\u0003F#\u0000\u00a9\u00b4\u0003"+
		"H$\u0000\u00aa\u00b4\u0003\u001c\u000e\u0000\u00ab\u00b4\u0003\"\u0011"+
		"\u0000\u00ac\u00b4\u0003$\u0012\u0000\u00ad\u00b4\u0003&\u0013\u0000\u00ae"+
		"\u00b4\u0003(\u0014\u0000\u00af\u00b4\u00034\u001a\u0000\u00b0\u00b1\u0003"+
		"R)\u0000\u00b1\u00b2\u0005\u0018\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b3\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b3\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b4\u000b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005!\u0000\u0000"+
		"\u00b6\u00b8\u0005;\u0000\u0000\u00b7\u00b9\u0005\u0017\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003D\"\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003R)\u0000\u00be\u00c0\u0005\u0018"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\r\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005)\u0000"+
		"\u0000\u00c2\u00c3\u0005;\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000"+
		"\u00c4\u00c5\u0003R)\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u00c8"+
		"\u0005\u0017\u0000\u0000\u00c7\u00c9\u0003D\"\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u00cc\u0003"+
		"\u0010\b\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u0018"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3\u00d8\u0003R)\u0000"+
		"\u00d4\u00d5\u0005\u0019\u0000\u0000\u00d5\u00d7\u0003R)\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0011"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005*\u0000\u0000\u00dc\u00dd\u0005;\u0000\u0000\u00dd\u00de\u0005\u001d"+
		"\u0000\u0000\u00de\u00e4\u0003\u0014\n\u0000\u00df\u00e0\u0003\u001a\r"+
		"\u0000\u00e0\u00e1\u0003\u0014\n\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00df\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005\u001e\u0000\u0000\u00e8\u00e9\u0005+\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0018\u0000\u0000\u00ea\u0013\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005!\u0000\u0000\u00ec\u00ed\u0005;\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0017\u0000\u0000\u00ee\u00f4\u0003D\"\u0000\u00ef\u00f0\u0005)\u0000"+
		"\u0000\u00f0\u00f1\u0005;\u0000\u0000\u00f1\u00f2\u0005\u0017\u0000\u0000"+
		"\u00f2\u00f4\u0003D\"\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f4\u0015\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f7\u0005;\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0101"+
		"\u0005\u001d\u0000\u0000\u00f9\u00fe\u0003\u0018\f\u0000\u00fa\u00fb\u0005"+
		"\u0019\u0000\u0000\u00fb\u00fd\u0003\u0018\f\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0005\u001e\u0000\u0000\u0104\u0017\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005;\u0000\u0000\u0106\u0107\u0005\u0017\u0000"+
		"\u0000\u0107\u0108\u0003R)\u0000\u0108\u0019\u0001\u0000\u0000\u0000\u0109"+
		"\u010c\u0005\u0019\u0000\u0000\u010a\u010c\u0005\u0018\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u001b\u0001\u0000\u0000\u0000\u010d\u010e\u0005,\u0000\u0000\u010e\u010f"+
		"\u0005\u001f\u0000\u0000\u010f\u0110\u0003T*\u0000\u0110\u0111\u0005 "+
		"\u0000\u0000\u0111\u0115\u0003>\u001f\u0000\u0112\u0114\u0003\u001e\u000f"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u011a\u0003 \u0010\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005+\u0000\u0000\u011c\u011d\u0005\u0018\u0000\u0000\u011d"+
		"\u001d\u0001\u0000\u0000\u0000\u011e\u011f\u0005-\u0000\u0000\u011f\u0120"+
		"\u0005\u001f\u0000\u0000\u0120\u0121\u0003T*\u0000\u0121\u0122\u0005 "+
		"\u0000\u0000\u0122\u0123\u0003>\u001f\u0000\u0123\u001f\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005-\u0000\u0000\u0125\u0126\u0003>\u001f\u0000\u0126"+
		"!\u0001\u0000\u0000\u0000\u0127\u0128\u0005.\u0000\u0000\u0128\u0129\u0005"+
		"\u001f\u0000\u0000\u0129\u012a\u0003T*\u0000\u012a\u012b\u0005 \u0000"+
		"\u0000\u012b\u012c\u0003>\u001f\u0000\u012c\u012d\u0005+\u0000\u0000\u012d"+
		"\u012e\u0005\u0018\u0000\u0000\u012e#\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005/\u0000\u0000\u0130\u0131\u0003>\u001f\u0000\u0131\u0132\u0005."+
		"\u0000\u0000\u0132\u0133\u0005\u001f\u0000\u0000\u0133\u0134\u0003T*\u0000"+
		"\u0134\u0135\u0005 \u0000\u0000\u0135\u0136\u0005\u0018\u0000\u0000\u0136"+
		"%\u0001\u0000\u0000\u0000\u0137\u0138\u00050\u0000\u0000\u0138\u0139\u0005"+
		"\u001f\u0000\u0000\u0139\u013a\u00038\u001c\u0000\u013a\u013b\u0005\u0018"+
		"\u0000\u0000\u013b\u013c\u0003:\u001d\u0000\u013c\u013e\u0005\u0018\u0000"+
		"\u0000\u013d\u013f\u0003<\u001e\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005 \u0000\u0000\u0141\u0142\u0003>\u001f\u0000\u0142\'"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u00051\u0000\u0000\u0144\u0148\u0005"+
		"\u0018\u0000\u0000\u0145\u0146\u00052\u0000\u0000\u0146\u0148\u0005\u0018"+
		"\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148)\u0001\u0000\u0000\u0000\u0149\u014a\u00053\u0000\u0000"+
		"\u014a\u014b\u0005;\u0000\u0000\u014b\u014d\u0005\u001f\u0000\u0000\u014c"+
		"\u014e\u00030\u0018\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005 \u0000\u0000\u0150\u0151\u0003,\u0016\u0000\u0151\u0152\u0005+"+
		"\u0000\u0000\u0152\u0153\u0005\u0018\u0000\u0000\u0153\u0161\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u00057\u0000\u0000\u0155\u0156\u0003D\"\u0000"+
		"\u0156\u0157\u0005;\u0000\u0000\u0157\u0159\u0005\u001f\u0000\u0000\u0158"+
		"\u015a\u00030\u0018\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005 \u0000\u0000\u015c\u015d\u0003,\u0016\u0000\u015d\u015e\u0005+"+
		"\u0000\u0000\u015e\u015f\u0005\u0018\u0000\u0000\u015f\u0161\u0001\u0000"+
		"\u0000\u0000\u0160\u0149\u0001\u0000\u0000\u0000\u0160\u0154\u0001\u0000"+
		"\u0000\u0000\u0161+\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u001d\u0000"+
		"\u0000\u0163\u0165\u00036\u001b\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0169\u0001\u0000\u0000\u0000"+
		"\u0166\u0168\u0003\n\u0005\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u001e\u0000\u0000\u016d"+
		"-\u0001\u0000\u0000\u0000\u016e\u016f\u0005!\u0000\u0000\u016f\u0170\u0005"+
		";\u0000\u0000\u0170\u0171\u0005\u0017\u0000\u0000\u0171\u0172\u0003D\""+
		"\u0000\u0172/\u0001\u0000\u0000\u0000\u0173\u0178\u0003.\u0017\u0000\u0174"+
		"\u0175\u0005\u0019\u0000\u0000\u0175\u0177\u0003.\u0017\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u01791\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u0180\u0003"+
		"R)\u0000\u017c\u017d\u0005\u0019\u0000\u0000\u017d\u017f\u0003R)\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u01813\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u00058\u0000\u0000\u0184\u0185\u0003R)\u0000\u0185\u0186\u0005"+
		"\u0018\u0000\u0000\u01865\u0001\u0000\u0000\u0000\u0187\u0188\u00054\u0000"+
		"\u0000\u0188\u018c\u0005\u001b\u0000\u0000\u0189\u018b\u0003\f\u0006\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0005\u001c\u0000\u0000\u01907\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0005!\u0000\u0000\u0192\u0194\u0005;\u0000\u0000\u0193\u0195\u0005"+
		"\u0017\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0198\u0003"+
		"D\"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u01a0\u0003R)\u0000"+
		"\u019a\u019b\u0003L&\u0000\u019b\u019c\u0005\u0011\u0000\u0000\u019c\u019d"+
		"\u0003R)\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u01a0\u0005;"+
		"\u0000\u0000\u019f\u0191\u0001\u0000\u0000\u0000\u019f\u019a\u0001\u0000"+
		"\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a09\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0003T*\u0000\u01a2;\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a9\u0003R)\u0000\u01a4\u01a5\u0003L&\u0000\u01a5\u01a6\u0005\u0011"+
		"\u0000\u0000\u01a6\u01a7\u0003R)\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a9=\u0001\u0000\u0000\u0000\u01aa\u01ae\u0005\u001d\u0000\u0000\u01ab"+
		"\u01ad\u0003\n\u0005\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u001e\u0000\u0000\u01b2?\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0003D\"\u0000\u01b4\u01b5\u0005\u001b"+
		"\u0000\u0000\u01b5\u01b6\u0003R)\u0000\u01b6\u01b7\u0005\u001c\u0000\u0000"+
		"\u01b7A\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u001d\u0000\u0000\u01b9"+
		"\u01be\u0003R)\u0000\u01ba\u01bb\u0005\u0019\u0000\u0000\u01bb\u01bd\u0003"+
		"R)\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\u001e\u0000\u0000\u01c2C\u0001\u0000\u0000\u0000"+
		"\u01c3\u01cc\u0005\"\u0000\u0000\u01c4\u01cc\u0005#\u0000\u0000\u01c5"+
		"\u01cc\u0005$\u0000\u0000\u01c6\u01cc\u0005&\u0000\u0000\u01c7\u01cc\u0005"+
		"\'\u0000\u0000\u01c8\u01cc\u0005(\u0000\u0000\u01c9\u01cc\u0005%\u0000"+
		"\u0000\u01ca\u01cc\u0005;\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c4\u0001\u0000\u0000\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c6\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01ccE\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0003L&\u0000\u01ce\u01d0\u00059\u0000\u0000\u01cf\u01d1\u0005"+
		"\u0018\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d1G\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005:\u0000"+
		"\u0000\u01d3\u01d8\u0003J%\u0000\u01d4\u01d5\u0005:\u0000\u0000\u01d5"+
		"\u01d7\u0003J%\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\u0005\u0018\u0000\u0000\u01dc\u01db\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01ddI\u0001\u0000"+
		"\u0000\u0000\u01de\u01e2\u0005>\u0000\u0000\u01df\u01e2\u0005;\u0000\u0000"+
		"\u01e0\u01e2\u0003R)\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2K\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e7\u0005;\u0000\u0000\u01e4\u01e6\u0003N\'"+
		"\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e8M\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0005\u001a\u0000\u0000\u01eb\u01f1\u0005;\u0000\u0000\u01ec"+
		"\u01ed\u0005\u001b\u0000\u0000\u01ed\u01ee\u0003R)\u0000\u01ee\u01ef\u0005"+
		"\u001c\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001"+
		"\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f1O\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0003L&\u0000\u01f3\u01f4\u0005\u0011\u0000\u0000"+
		"\u01f4\u01f6\u0003R)\u0000\u01f5\u01f7\u0005\u0018\u0000\u0000\u01f6\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7Q\u0001"+
		"\u0000\u0000\u0000\u01f8\u01ff\u0003T*\u0000\u01f9\u01ff\u0003^/\u0000"+
		"\u01fa\u01ff\u0003n7\u0000\u01fb\u01ff\u0003\u0016\u000b\u0000\u01fc\u01ff"+
		"\u0003@ \u0000\u01fd\u01ff\u0003B!\u0000\u01fe\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fe\u01f9\u0001\u0000\u0000\u0000\u01fe\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ffS\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0003V+\u0000\u0201U\u0001\u0000\u0000\u0000\u0202\u0207"+
		"\u0003X,\u0000\u0203\u0204\u0005\u0013\u0000\u0000\u0204\u0206\u0003X"+
		",\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u0208W\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u020a\u020f\u0003Z-\u0000\u020b\u020c\u0005\u0012\u0000\u0000\u020c\u020e"+
		"\u0003Z-\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000"+
		"\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210Y\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0005\u0014\u0000\u0000\u0213\u021f\u0003Z-\u0000\u0214"+
		"\u0218\u0003\\.\u0000\u0215\u0216\u0003|>\u0000\u0216\u0217\u0003\\.\u0000"+
		"\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021f\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0005\u001f\u0000\u0000\u021b\u021c\u0003T*\u0000\u021c\u021d"+
		"\u0005 \u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u0212\u0001"+
		"\u0000\u0000\u0000\u021e\u0214\u0001\u0000\u0000\u0000\u021e\u021a\u0001"+
		"\u0000\u0000\u0000\u021f[\u0001\u0000\u0000\u0000\u0220\u0224\u0003^/"+
		"\u0000\u0221\u0224\u0003z=\u0000\u0222\u0224\u0003n7\u0000\u0223\u0220"+
		"\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222"+
		"\u0001\u0000\u0000\u0000\u0224]\u0001\u0000\u0000\u0000\u0225\u0226\u0003"+
		"`0\u0000\u0226_\u0001\u0000\u0000\u0000\u0227\u022d\u0003b1\u0000\u0228"+
		"\u0229\u0003l6\u0000\u0229\u022a\u0003b1\u0000\u022a\u022c\u0001\u0000"+
		"\u0000\u0000\u022b\u0228\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000"+
		"\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000"+
		"\u0000\u0000\u022ea\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000"+
		"\u0000\u0230\u0236\u0003d2\u0000\u0231\u0232\u0003j5\u0000\u0232\u0233"+
		"\u0003d2\u0000\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0231\u0001\u0000"+
		"\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237c\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023a\u0003f3\u0000\u023a"+
		"\u023b\u0003d2\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023e\u0003"+
		"v;\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000"+
		"\u0000\u023ee\u0001\u0000\u0000\u0000\u023f\u0244\u0005\u0003\u0000\u0000"+
		"\u0240\u0244\u0005\u0004\u0000\u0000\u0241\u0244\u0005\u0015\u0000\u0000"+
		"\u0242\u0244\u0005\u0016\u0000\u0000\u0243\u023f\u0001\u0000\u0000\u0000"+
		"\u0243\u0240\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0244g\u0001\u0000\u0000\u0000\u0245"+
		"\u0248\u0005\u0015\u0000\u0000\u0246\u0248\u0005\u0016\u0000\u0000\u0247"+
		"\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248"+
		"i\u0001\u0000\u0000\u0000\u0249\u024c\u0005\u0005\u0000\u0000\u024a\u024c"+
		"\u0005\u0006\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024a"+
		"\u0001\u0000\u0000\u0000\u024ck\u0001\u0000\u0000\u0000\u024d\u0250\u0005"+
		"\u0003\u0000\u0000\u024e\u0250\u0005\u0004\u0000\u0000\u024f\u024d\u0001"+
		"\u0000\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250m\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0003p8\u0000\u0252o\u0001\u0000\u0000\u0000"+
		"\u0253\u0258\u0003t:\u0000\u0254\u0255\u0005\u0003\u0000\u0000\u0255\u0257"+
		"\u0003r9\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259q\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000"+
		"\u0000\u025b\u025e\u0003t:\u0000\u025c\u025e\u0003^/\u0000\u025d\u025b"+
		"\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025es\u0001"+
		"\u0000\u0000\u0000\u025f\u0269\u0005>\u0000\u0000\u0260\u0269\u0005?\u0000"+
		"\u0000\u0261\u0265\u0005;\u0000\u0000\u0262\u0264\u0003~?\u0000\u0263"+
		"\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266"+
		"\u0269\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268"+
		"\u025f\u0001\u0000\u0000\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268"+
		"\u0261\u0001\u0000\u0000\u0000\u0269u\u0001\u0000\u0000\u0000\u026a\u027a"+
		"\u0003x<\u0000\u026b\u026f\u0005;\u0000\u0000\u026c\u026e\u0003~?\u0000"+
		"\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0272\u0274\u0003h4\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u027a\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005\u001f\u0000\u0000\u0276\u0277\u0003^/\u0000\u0277\u0278\u0005 "+
		"\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u026a\u0001\u0000"+
		"\u0000\u0000\u0279\u026b\u0001\u0000\u0000\u0000\u0279\u0275\u0001\u0000"+
		"\u0000\u0000\u027aw\u0001\u0000\u0000\u0000\u027b\u0280\u0005=\u0000\u0000"+
		"\u027c\u0280\u0005<\u0000\u0000\u027d\u0280\u0005?\u0000\u0000\u027e\u0280"+
		"\u0003z=\u0000\u027f\u027b\u0001\u0000\u0000\u0000\u027f\u027c\u0001\u0000"+
		"\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e\u0001\u0000"+
		"\u0000\u0000\u0280y\u0001\u0000\u0000\u0000\u0281\u0284\u0005\'\u0000"+
		"\u0000\u0282\u0284\u0005(\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000"+
		"\u0283\u0282\u0001\u0000\u0000\u0000\u0284{\u0001\u0000\u0000\u0000\u0285"+
		"\u028c\u0005\u000b\u0000\u0000\u0286\u028c\u0005\f\u0000\u0000\u0287\u028c"+
		"\u0005\u000f\u0000\u0000\u0288\u028c\u0005\u0010\u0000\u0000\u0289\u028c"+
		"\u0005\u000e\u0000\u0000\u028a\u028c\u0005\r\u0000\u0000\u028b\u0285\u0001"+
		"\u0000\u0000\u0000\u028b\u0286\u0001\u0000\u0000\u0000\u028b\u0287\u0001"+
		"\u0000\u0000\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028b\u0289\u0001"+
		"\u0000\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c}\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0005\u001a\u0000\u0000\u028e\u0299\u0005;\u0000"+
		"\u0000\u028f\u0290\u0005\u001b\u0000\u0000\u0290\u0291\u0003R)\u0000\u0291"+
		"\u0292\u0005\u001c\u0000\u0000\u0292\u0299\u0001\u0000\u0000\u0000\u0293"+
		"\u0295\u0005\u001f\u0000\u0000\u0294\u0296\u00032\u0019\u0000\u0295\u0294"+
		"\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297"+
		"\u0001\u0000\u0000\u0000\u0297\u0299\u0005 \u0000\u0000\u0298\u028d\u0001"+
		"\u0000\u0000\u0000\u0298\u028f\u0001\u0000\u0000\u0000\u0298\u0293\u0001"+
		"\u0000\u0000\u0000\u0299\u007f\u0001\u0000\u0000\u0000H\u0082\u0086\u008c"+
		"\u0093\u0099\u009e\u00a4\u00b3\u00b8\u00bb\u00bf\u00c8\u00ce\u00d1\u00d8"+
		"\u00e4\u00f3\u00f6\u00fe\u0101\u010b\u0115\u0119\u013e\u0147\u014d\u0159"+
		"\u0160\u0164\u0169\u0178\u0180\u018c\u0194\u0197\u019f\u01a8\u01ae\u01be"+
		"\u01cb\u01d0\u01d8\u01dc\u01e1\u01e7\u01f0\u01f6\u01fe\u0207\u020f\u0218"+
		"\u021e\u0223\u022d\u0236\u023d\u0243\u0247\u024b\u024f\u0258\u025d\u0265"+
		"\u0268\u026f\u0273\u0279\u027f\u0283\u028b\u0295\u0298";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}