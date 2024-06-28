// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Scala3ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, Id=1, BooleanLiteral=2, 
		CharacterLiteral=3, SymbolLiteral=4, IntegerLiteral=5, StringLiteral=6, 
		FloatingPointLiteral=7, Varid=8, BoundVarid=9, Paren=10, Delim=11, Semi=12, 
		NL=13, NEWLINE=14, WS=15, COMMENT=16, LINE_COMMENT=17, InterpolatedStringLiteral=79, 
		ID=80, INDENT=81, OUTDENT=82, COLON=83, QUOTEID=84, LambdaStart=85, SPLICEID=86, 
		VARID=87;
	public static final int
		RULE_simpleLiteral = 0, RULE_literal = 1, RULE_qualId = 2, RULE_ids = 3, 
		RULE_simpleRef = 4, RULE_classQualifier = 5, RULE_type = 6, RULE_funType = 7, 
		RULE_funTypeArgs = 8, RULE_funParamClause = 9, RULE_typedFunParam = 10, 
		RULE_matchType = 11, RULE_infixType = 12, RULE_refinedType = 13, RULE_annotType = 14, 
		RULE_simpleType = 15, RULE_simpleType1 = 16, RULE_singleton = 17, RULE_funArgType = 18, 
		RULE_funArgTypes = 19, RULE_paramType = 20, RULE_paramValueType = 21, 
		RULE_typeArgs = 22, RULE_refinement_ = 23, RULE_refinement = 24, RULE_typeBounds = 25, 
		RULE_typeParamBounds = 26, RULE_types = 27, RULE_expr = 28, RULE_blockResult = 29, 
		RULE_funParams = 30, RULE_expr1 = 31, RULE_ascription = 32, RULE_catches = 33, 
		RULE_postfixExpr = 34, RULE_infixExpr = 35, RULE_matchClause = 36, RULE_prefixExpr = 37, 
		RULE_prefixOperator = 38, RULE_simpleExpr = 39, RULE_colonArgument = 40, 
		RULE_lambdaStart = 41, RULE_quoted = 42, RULE_exprSplice = 43, RULE_typeSplice = 44, 
		RULE_exprsInParens = 45, RULE_exprInParens = 46, RULE_parArgumentExprs = 47, 
		RULE_argumentExprs = 48, RULE_blockExpr_ = 49, RULE_blockExpr = 50, RULE_block = 51, 
		RULE_blockStat = 52, RULE_typeBlock = 53, RULE_typeBlockStat = 54, RULE_forExpr = 55, 
		RULE_enumerators0 = 56, RULE_enumerators = 57, RULE_enumerator = 58, RULE_generator = 59, 
		RULE_guard = 60, RULE_caseClauses = 61, RULE_caseClause = 62, RULE_exprCaseClause = 63, 
		RULE_typeCaseClauses = 64, RULE_typeCaseClause = 65, RULE_pattern = 66, 
		RULE_pattern1 = 67, RULE_pattern2 = 68, RULE_infixPattern = 69, RULE_simplePattern = 70, 
		RULE_simplePattern1 = 71, RULE_patVar = 72, RULE_patterns = 73, RULE_argumentPatterns = 74, 
		RULE_clsTypeParamClause = 75, RULE_clsTypeParam = 76, RULE_typTypeParamClause = 77, 
		RULE_typTypeParam = 78, RULE_hkTypeParamClause = 79, RULE_hkTypeParam = 80, 
		RULE_clsParamClauses = 81, RULE_clsParamClause = 82, RULE_clsParams = 83, 
		RULE_clsParam = 84, RULE_defParamClauses = 85, RULE_defParamClause = 86, 
		RULE_typelessClauses = 87, RULE_typelessClause = 88, RULE_defTypeParamClause = 89, 
		RULE_defTypeParam = 90, RULE_defTermParamClause = 91, RULE_usingParamClause = 92, 
		RULE_defImplicitClause = 93, RULE_defTermParams = 94, RULE_defTermParam = 95, 
		RULE_param = 96, RULE_bindings = 97, RULE_binding = 98, RULE_modifier = 99, 
		RULE_localModifier = 100, RULE_accessModifier = 101, RULE_accessQualifier = 102, 
		RULE_annotation = 103, RULE_import_ = 104, RULE_export = 105, RULE_importExpr = 106, 
		RULE_importSpec = 107, RULE_namedSelector = 108, RULE_wildCardSelector = 109, 
		RULE_importSelectors = 110, RULE_endMarker = 111, RULE_endMarkerTag = 112, 
		RULE_refineDcl = 113, RULE_valDcl = 114, RULE_defDcl = 115, RULE_def = 116, 
		RULE_patDef = 117, RULE_defDef = 118, RULE_defSig = 119, RULE_typeDef = 120, 
		RULE_tmplDef = 121, RULE_classDef = 122, RULE_classConstr = 123, RULE_constrMods = 124, 
		RULE_objectDef = 125, RULE_enumDef = 126, RULE_givenDef = 127, RULE_givenSig = 128, 
		RULE_structuralInstance = 129, RULE_extension = 130, RULE_extMethods_ = 131, 
		RULE_extMethods = 132, RULE_extMethod = 133, RULE_template = 134, RULE_inheritClauses = 135, 
		RULE_constrApps = 136, RULE_constrApp = 137, RULE_constrExpr_ = 138, RULE_constrExpr = 139, 
		RULE_selfInvocation = 140, RULE_templateBody_ = 141, RULE_withTemplateBody = 142, 
		RULE_templateBody = 143, RULE_templateStat = 144, RULE_selfType = 145, 
		RULE_enumBody_ = 146, RULE_enumBody = 147, RULE_enumStat = 148, RULE_enumCase = 149, 
		RULE_topStats = 150, RULE_topStat = 151, RULE_packaging = 152, RULE_packageObject = 153, 
		RULE_compilationUnit = 154;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLiteral", "literal", "qualId", "ids", "simpleRef", "classQualifier", 
			"type", "funType", "funTypeArgs", "funParamClause", "typedFunParam", 
			"matchType", "infixType", "refinedType", "annotType", "simpleType", "simpleType1", 
			"singleton", "funArgType", "funArgTypes", "paramType", "paramValueType", 
			"typeArgs", "refinement_", "refinement", "typeBounds", "typeParamBounds", 
			"types", "expr", "blockResult", "funParams", "expr1", "ascription", "catches", 
			"postfixExpr", "infixExpr", "matchClause", "prefixExpr", "prefixOperator", 
			"simpleExpr", "colonArgument", "lambdaStart", "quoted", "exprSplice", 
			"typeSplice", "exprsInParens", "exprInParens", "parArgumentExprs", "argumentExprs", 
			"blockExpr_", "blockExpr", "block", "blockStat", "typeBlock", "typeBlockStat", 
			"forExpr", "enumerators0", "enumerators", "enumerator", "generator", 
			"guard", "caseClauses", "caseClause", "exprCaseClause", "typeCaseClauses", 
			"typeCaseClause", "pattern", "pattern1", "pattern2", "infixPattern", 
			"simplePattern", "simplePattern1", "patVar", "patterns", "argumentPatterns", 
			"clsTypeParamClause", "clsTypeParam", "typTypeParamClause", "typTypeParam", 
			"hkTypeParamClause", "hkTypeParam", "clsParamClauses", "clsParamClause", 
			"clsParams", "clsParam", "defParamClauses", "defParamClause", "typelessClauses", 
			"typelessClause", "defTypeParamClause", "defTypeParam", "defTermParamClause", 
			"usingParamClause", "defImplicitClause", "defTermParams", "defTermParam", 
			"param", "bindings", "binding", "modifier", "localModifier", "accessModifier", 
			"accessQualifier", "annotation", "import_", "export", "importExpr", "importSpec", 
			"namedSelector", "wildCardSelector", "importSelectors", "endMarker", 
			"endMarkerTag", "refineDcl", "valDcl", "defDcl", "def", "patDef", "defDef", 
			"defSig", "typeDef", "tmplDef", "classDef", "classConstr", "constrMods", 
			"objectDef", "enumDef", "givenDef", "givenSig", "structuralInstance", 
			"extension", "extMethods_", "extMethods", "extMethod", "template", "inheritClauses", 
			"constrApps", "constrApp", "constrExpr_", "constrExpr", "selfInvocation", 
			"templateBody_", "withTemplateBody", "templateBody", "templateStat", 
			"selfType", "enumBody_", "enumBody", "enumStat", "enumCase", "topStats", 
			"topStat", "packaging", "packageObject", "compilationUnit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'null'", "'.'", "','", "'this'", "'super'", "'['", "']'", 
			"'=>>'", "'=>'", "'?=>'", "'('", "')'", "':'", "'match'", "'{'", "'}'", 
			"'?'", "'type'", "'#'", "'*'", "'>:'", "'<:'", "'_'", "'inline'", "'if'", 
			"'else'", "'then'", "'while'", "'do'", "'try'", "'finally'", "'throw'", 
			"'return'", "'='", "'catch'", "'+'", "'~'", "'!'", "'new'", "'with'", 
			"'''", "'$'", "'using'", "'for'", "'yield'", "'case'", "'<-'", "'|'", 
			"'@'", "'given'", "'implicit'", "'val'", "'var'", "'override'", "'opaque'", 
			"'abstract'", "'final'", "'sealed'", "'open'", "'lazy'", "'transparent'", 
			"'infix'", "'private'", "'protected'", "'import'", "'export'", "'as'", 
			"'end'", "'extension'", "'def'", "'class'", "'trait'", "'object'", "'enum'", 
			"'extends'", "'derives'", "'package'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "InterpolatedStringLiteral", 
			"ID", "INDENT", "OUTDENT", "COLON", "QUOTEID", "LambdaStart", "SPLICEID", 
			"VARID"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Scala3ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Scala3ParserParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Scala3ParserParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Scala3ParserParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Scala3ParserParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Scala3ParserParser.StringLiteral, 0); }
		public SimpleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimpleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimpleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimpleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLiteralContext simpleLiteral() throws RecognitionException {
		SimpleLiteralContext _localctx = new SimpleLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLiteral);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(310);
					match(T__0);
					}
				}

				setState(313);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(314);
					match(T__0);
					}
				}

				setState(317);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(T__5);
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
	public static class LiteralContext extends ParserRuleContext {
		public SimpleLiteralContext simpleLiteral() {
			return getRuleContext(SimpleLiteralContext.class,0);
		}
		public TerminalNode InterpolatedStringLiteral() { return getToken(Scala3ParserParser.InterpolatedStringLiteral, 0); }
		public TerminalNode SymbolLiteral() { return getToken(Scala3ParserParser.SymbolLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				simpleLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(InterpolatedStringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(T__1);
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
	public static class QualIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public QualIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterQualId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitQualId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitQualId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualIdContext qualId() throws RecognitionException {
		QualIdContext _localctx = new QualIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ID);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					match(T__2);
					setState(331);
					match(ID);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(338);
				match(T__3);
				setState(339);
				match(ID);
				}
				}
				setState(344);
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
	public static class SimpleRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public ClassQualifierContext classQualifier() {
			return getRuleContext(ClassQualifierContext.class,0);
		}
		public SimpleRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimpleRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimpleRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimpleRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleRefContext simpleRef() throws RecognitionException {
		SimpleRefContext _localctx = new SimpleRefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleRef);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(346);
					match(ID);
					setState(347);
					match(T__2);
					}
				}

				setState(350);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(351);
					match(ID);
					setState(352);
					match(T__2);
					}
				}

				setState(355);
				match(T__5);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(356);
					classQualifier();
					}
				}

				setState(359);
				match(T__2);
				setState(360);
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
	public static class ClassQualifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public ClassQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClassQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClassQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClassQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassQualifierContext classQualifier() throws RecognitionException {
		ClassQualifierContext _localctx = new ClassQualifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__6);
			setState(364);
			match(ID);
			setState(365);
			match(T__7);
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
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunParamClauseContext funParamClause() {
			return getRuleContext(FunParamClauseContext.class,0);
		}
		public MatchTypeContext matchType() {
			return getRuleContext(MatchTypeContext.class,0);
		}
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				funType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				hkTypeParamClause();
				setState(369);
				match(T__8);
				setState(370);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				funParamClause();
				setState(373);
				match(T__8);
				setState(374);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				matchType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				infixType();
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
	public static class FunTypeContext extends ParserRuleContext {
		public FunTypeArgsContext funTypeArgs() {
			return getRuleContext(FunTypeArgsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public FunTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeContext funType() throws RecognitionException {
		FunTypeContext _localctx = new FunTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funType);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				funTypeArgs();
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				hkTypeParamClause();
				setState(385);
				match(T__9);
				setState(386);
				type();
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
	public static class FunTypeArgsContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public FunArgTypesContext funArgTypes() {
			return getRuleContext(FunArgTypesContext.class,0);
		}
		public FunParamClauseContext funParamClause() {
			return getRuleContext(FunParamClauseContext.class,0);
		}
		public FunTypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTypeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunTypeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunTypeArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunTypeArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeArgsContext funTypeArgs() throws RecognitionException {
		FunTypeArgsContext _localctx = new FunTypeArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funTypeArgs);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(T__11);
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(392);
					funArgTypes();
					}
					break;
				}
				setState(395);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				funParamClause();
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
	public static class FunParamClauseContext extends ParserRuleContext {
		public List<TypedFunParamContext> typedFunParam() {
			return getRuleContexts(TypedFunParamContext.class);
		}
		public TypedFunParamContext typedFunParam(int i) {
			return getRuleContext(TypedFunParamContext.class,i);
		}
		public FunParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunParamClauseContext funParamClause() throws RecognitionException {
		FunParamClauseContext _localctx = new FunParamClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__11);
			setState(400);
			typedFunParam();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(401);
				match(T__3);
				setState(402);
				typedFunParam();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(T__12);
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
	public static class TypedFunParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedFunParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedFunParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypedFunParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypedFunParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypedFunParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedFunParamContext typedFunParam() throws RecognitionException {
		TypedFunParamContext _localctx = new TypedFunParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typedFunParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			setState(411);
			match(T__13);
			setState(412);
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
	public static class MatchTypeContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public TypeCaseClausesContext typeCaseClauses() {
			return getRuleContext(TypeCaseClausesContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public MatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterMatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitMatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitMatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchTypeContext matchType() throws RecognitionException {
		MatchTypeContext _localctx = new MatchTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			infixType();
			setState(415);
			match(T__14);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(416);
				match(T__15);
				setState(417);
				typeCaseClauses();
				setState(418);
				match(T__16);
				}
				break;
			case INDENT:
				{
				setState(420);
				match(INDENT);
				setState(421);
				typeCaseClauses();
				setState(422);
				match(OUTDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class InfixTypeContext extends ParserRuleContext {
		public List<RefinedTypeContext> refinedType() {
			return getRuleContexts(RefinedTypeContext.class);
		}
		public RefinedTypeContext refinedType(int i) {
			return getRuleContext(RefinedTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public InfixTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterInfixType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitInfixType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitInfixType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixTypeContext infixType() throws RecognitionException {
		InfixTypeContext _localctx = new InfixTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_infixType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			refinedType();
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					match(ID);
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(428);
						match(T__12);
						}
						break;
					}
					setState(431);
					refinedType();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class RefinedTypeContext extends ParserRuleContext {
		public AnnotTypeContext annotType() {
			return getRuleContext(AnnotTypeContext.class,0);
		}
		public List<RefinementContext> refinement() {
			return getRuleContexts(RefinementContext.class);
		}
		public RefinementContext refinement(int i) {
			return getRuleContext(RefinementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public RefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterRefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitRefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitRefinedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinedTypeContext refinedType() throws RecognitionException {
		RefinedTypeContext _localctx = new RefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_refinedType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			annotType();
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(438);
						match(T__12);
						}
						break;
					}
					setState(441);
					refinement();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class AnnotTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterAnnotType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitAnnotType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitAnnotType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotTypeContext annotType() throws RecognitionException {
		AnnotTypeContext _localctx = new AnnotTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			simpleType();
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					annotation();
					}
					} 
				}
				setState(453);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleLiteralContext simpleLiteral() {
			return getRuleContext(SimpleLiteralContext.class,0);
		}
		public TypeBoundsContext typeBounds() {
			return getRuleContext(TypeBoundsContext.class,0);
		}
		public SimpleType1Context simpleType1() {
			return getRuleContext(SimpleType1Context.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleType);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				simpleLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(T__17);
				setState(456);
				typeBounds();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				simpleType1(0);
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
	public static class SimpleType1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public SingletonContext singleton() {
			return getRuleContext(SingletonContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public TypeSpliceContext typeSplice() {
			return getRuleContext(TypeSpliceContext.class,0);
		}
		public SimpleType1Context simpleType1() {
			return getRuleContext(SimpleType1Context.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public SimpleType1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimpleType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimpleType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimpleType1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleType1Context simpleType1() throws RecognitionException {
		return simpleType1(0);
	}

	private SimpleType1Context simpleType1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleType1Context _localctx = new SimpleType1Context(_ctx, _parentState);
		SimpleType1Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_simpleType1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(461);
				match(ID);
				}
				break;
			case 2:
				{
				setState(462);
				singleton(0);
				setState(463);
				match(T__2);
				setState(464);
				match(ID);
				}
				break;
			case 3:
				{
				setState(466);
				singleton(0);
				setState(467);
				match(T__2);
				setState(468);
				match(T__18);
				}
				break;
			case 4:
				{
				setState(470);
				match(T__11);
				setState(471);
				types();
				setState(472);
				match(T__12);
				}
				break;
			case 5:
				{
				setState(474);
				refinement();
				}
				break;
			case 6:
				{
				setState(475);
				typeSplice();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleType1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType1);
						setState(478);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(479);
						typeArgs();
						}
						break;
					case 2:
						{
						_localctx = new SimpleType1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType1);
						setState(480);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(481);
						match(T__19);
						setState(482);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class SingletonContext extends ParserRuleContext {
		public SimpleRefContext simpleRef() {
			return getRuleContext(SimpleRefContext.class,0);
		}
		public SimpleLiteralContext simpleLiteral() {
			return getRuleContext(SimpleLiteralContext.class,0);
		}
		public SingletonContext singleton() {
			return getRuleContext(SingletonContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public SingletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSingleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSingleton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSingleton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingletonContext singleton() throws RecognitionException {
		return singleton(0);
	}

	private SingletonContext singleton(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingletonContext _localctx = new SingletonContext(_ctx, _parentState);
		SingletonContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_singleton, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(489);
				simpleRef();
				}
				break;
			case 2:
				{
				setState(490);
				simpleLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SingletonContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_singleton);
					setState(493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(494);
					match(T__2);
					setState(495);
					match(ID);
					}
					} 
				}
				setState(500);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunArgTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funArgType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunArgType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunArgTypeContext funArgType() throws RecognitionException {
		FunArgTypeContext _localctx = new FunArgTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funArgType);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__12:
			case T__15:
			case T__17:
			case T__42:
			case ID:
			case COLON:
			case SPLICEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(T__9);
				setState(503);
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
	public static class FunArgTypesContext extends ParserRuleContext {
		public List<FunArgTypeContext> funArgType() {
			return getRuleContexts(FunArgTypeContext.class);
		}
		public FunArgTypeContext funArgType(int i) {
			return getRuleContext(FunArgTypeContext.class,i);
		}
		public FunArgTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funArgTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunArgTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunArgTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunArgTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunArgTypesContext funArgTypes() throws RecognitionException {
		FunArgTypesContext _localctx = new FunArgTypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funArgTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			funArgType();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(507);
				match(T__3);
				setState(508);
				funArgType();
				}
				}
				setState(513);
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
	public static class ParamTypeContext extends ParserRuleContext {
		public ParamValueTypeContext paramValueType() {
			return getRuleContext(ParamValueTypeContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paramType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(514);
				match(T__9);
				}
			}

			setState(517);
			paramValueType();
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
	public static class ParamValueTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterParamValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitParamValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitParamValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamValueTypeContext paramValueType() throws RecognitionException {
		ParamValueTypeContext _localctx = new ParamValueTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramValueType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			type();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(520);
				match(T__20);
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
	public static class TypeArgsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgsContext typeArgs() throws RecognitionException {
		TypeArgsContext _localctx = new TypeArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__6);
			setState(524);
			types();
			setState(525);
			match(T__7);
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
	public static class Refinement_Context extends ParserRuleContext {
		public List<RefineDclContext> refineDcl() {
			return getRuleContexts(RefineDclContext.class);
		}
		public RefineDclContext refineDcl(int i) {
			return getRuleContext(RefineDclContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public Refinement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterRefinement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitRefinement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitRefinement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Refinement_Context refinement_() throws RecognitionException {
		Refinement_Context _localctx = new Refinement_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_refinement_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 4503616807239681L) != 0) {
				{
				setState(527);
				refineDcl();
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(530);
				match(T__11);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 4503616807239681L) != 0) {
					{
					setState(531);
					refineDcl();
					}
				}

				}
				}
				setState(538);
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
	public static class RefinementContext extends ParserRuleContext {
		public Refinement_Context refinement_() {
			return getRuleContext(Refinement_Context.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public TerminalNode COLON() { return getToken(Scala3ParserParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitRefinement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_refinement);
		int _la;
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(539);
					match(T__12);
					}
				}

				setState(542);
				match(T__15);
				setState(543);
				refinement_();
				setState(544);
				match(T__16);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(COLON);
				setState(547);
				match(INDENT);
				setState(548);
				refinement_();
				setState(549);
				match(OUTDENT);
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
	public static class TypeBoundsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundsContext typeBounds() throws RecognitionException {
		TypeBoundsContext _localctx = new TypeBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(553);
				match(T__21);
				setState(554);
				type();
				}
			}

			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(557);
				match(T__22);
				setState(558);
				type();
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
	public static class TypeParamBoundsContext extends ParserRuleContext {
		public TypeBoundsContext typeBounds() {
			return getRuleContext(TypeBoundsContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeParamBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeParamBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeParamBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeParamBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundsContext typeParamBounds() throws RecognitionException {
		TypeParamBoundsContext _localctx = new TypeParamBoundsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeParamBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			typeBounds();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(562);
				match(T__13);
				setState(563);
				type();
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
	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			type();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(570);
				match(T__3);
				setState(571);
				type();
				}
				}
				setState(576);
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
	public static class ExprContext extends ParserRuleContext {
		public FunParamsContext funParams() {
			return getRuleContext(FunParamsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				funParams();
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				hkTypeParamClause();
				setState(582);
				match(T__9);
				setState(583);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				expr1();
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
	public static class BlockResultContext extends ParserRuleContext {
		public FunParamsContext funParams() {
			return getRuleContext(FunParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public BlockResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBlockResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBlockResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBlockResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockResultContext blockResult() throws RecognitionException {
		BlockResultContext _localctx = new BlockResultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockResult);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				funParams();
				setState(589);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(590);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				hkTypeParamClause();
				setState(593);
				match(T__9);
				setState(594);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				expr1();
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
	public static class FunParamsContext extends ParserRuleContext {
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public FunParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterFunParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitFunParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitFunParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunParamsContext funParams() throws RecognitionException {
		FunParamsContext _localctx = new FunParamsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funParams);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				bindings();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(ID);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(T__23);
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
	public static class Expr1Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public TerminalNode Semi() { return getToken(Scala3ParserParser.Semi, 0); }
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public AscriptionContext ascription() {
			return getRuleContext(AscriptionContext.class,0);
		}
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public MatchClauseContext matchClause() {
			return getRuleContext(MatchClauseContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr1);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(604);
					match(T__24);
					}
				}

				setState(607);
				match(T__25);
				setState(608);
				match(T__11);
				setState(609);
				expr();
				setState(610);
				match(T__12);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(611);
					match(T__12);
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				expr();
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11) {
						{
						setState(618);
						match(T__11);
						}
					}

					setState(621);
					match(T__26);
					setState(622);
					expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(625);
					match(T__24);
					}
				}

				setState(628);
				match(T__25);
				setState(629);
				expr();
				setState(630);
				match(T__27);
				setState(631);
				expr();
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11) {
						{
						setState(632);
						match(T__11);
						}
					}

					setState(635);
					match(T__26);
					setState(636);
					expr();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(T__28);
				setState(640);
				match(T__11);
				setState(641);
				expr();
				setState(642);
				match(T__12);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(643);
					match(T__12);
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				match(T__28);
				setState(652);
				expr();
				setState(653);
				match(T__29);
				setState(654);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				match(T__30);
				setState(657);
				expr();
				setState(658);
				catches();
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(659);
					match(T__31);
					setState(660);
					expr();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(663);
				match(T__30);
				setState(664);
				expr();
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(665);
					match(T__31);
					setState(666);
					expr();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(669);
				match(T__32);
				setState(670);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				match(T__33);
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(672);
					expr();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(675);
				forExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(676);
					simpleExpr(0);
					setState(677);
					match(T__2);
					}
					break;
				}
				setState(681);
				match(ID);
				setState(682);
				match(T__34);
				setState(683);
				expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(684);
				prefixOperator();
				setState(685);
				simpleExpr(0);
				setState(686);
				match(T__34);
				setState(687);
				expr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(689);
				simpleExpr(0);
				setState(690);
				argumentExprs();
				setState(691);
				match(T__34);
				setState(692);
				expr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(694);
				postfixExpr();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(695);
					ascription();
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(698);
				match(T__24);
				setState(699);
				infixExpr(0);
				setState(700);
				matchClause();
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
	public static class AscriptionContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterAscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitAscription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitAscription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscriptionContext ascription() throws RecognitionException {
		AscriptionContext _localctx = new AscriptionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ascription);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(T__13);
				setState(705);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(T__13);
				setState(707);
				annotation();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(708);
					annotation();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class CatchesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCaseClauseContext exprCaseClause() {
			return getRuleContext(ExprCaseClauseContext.class,0);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_catches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T__35);
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__15:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__30:
			case T__32:
			case T__33:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__41:
			case T__42:
			case T__44:
			case InterpolatedStringLiteral:
			case ID:
			case INDENT:
			case QUOTEID:
			case SPLICEID:
				{
				setState(717);
				expr();
				}
				break;
			case T__46:
				{
				setState(718);
				exprCaseClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PostfixExprContext extends ParserRuleContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			infixExpr(0);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(722);
				match(ID);
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
	public static class InfixExprContext extends ParserRuleContext {
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public ColonArgumentContext colonArgument() {
			return getRuleContext(ColonArgumentContext.class,0);
		}
		public MatchClauseContext matchClause() {
			return getRuleContext(MatchClauseContext.class,0);
		}
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		return infixExpr(0);
	}

	private InfixExprContext infixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprContext _localctx = new InfixExprContext(_ctx, _parentState);
		InfixExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_infixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(726);
			prefixExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(739);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(728);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(729);
						match(ID);
						setState(731);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(730);
							match(T__12);
							}
						}

						setState(733);
						infixExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(734);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(735);
						match(ID);
						setState(736);
						colonArgument();
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(737);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(738);
						matchClause();
						}
						break;
					}
					} 
				}
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
	public static class MatchClauseContext extends ParserRuleContext {
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public MatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterMatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitMatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitMatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchClauseContext matchClause() throws RecognitionException {
		MatchClauseContext _localctx = new MatchClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_matchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(T__14);
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(745);
				match(T__15);
				setState(746);
				caseClauses();
				setState(747);
				match(T__16);
				}
				break;
			case INDENT:
				{
				setState(749);
				match(INDENT);
				setState(750);
				caseClauses();
				setState(751);
				match(OUTDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PrefixExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_prefixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(755);
				prefixOperator();
				}
				break;
			}
			setState(758);
			simpleExpr(0);
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
	public static class PrefixOperatorContext extends ParserRuleContext {
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPrefixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674306L) != 0) ) {
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
	public static class SimpleExprContext extends ParserRuleContext {
		public SimpleRefContext simpleRef() {
			return getRuleContext(SimpleRefContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ExprSpliceContext exprSplice() {
			return getRuleContext(ExprSpliceContext.class,0);
		}
		public QuotedContext quoted() {
			return getRuleContext(QuotedContext.class,0);
		}
		public TerminalNode QUOTEID() { return getToken(Scala3ParserParser.QUOTEID, 0); }
		public List<ConstrAppContext> constrApp() {
			return getRuleContexts(ConstrAppContext.class);
		}
		public ConstrAppContext constrApp(int i) {
			return getRuleContext(ConstrAppContext.class,i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ExprsInParensContext exprsInParens() {
			return getRuleContext(ExprsInParensContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public MatchClauseContext matchClause() {
			return getRuleContext(MatchClauseContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public ColonArgumentContext colonArgument() {
			return getRuleContext(ColonArgumentContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(763);
				simpleRef();
				}
				break;
			case 2:
				{
				setState(764);
				literal();
				}
				break;
			case 3:
				{
				setState(765);
				match(T__23);
				}
				break;
			case 4:
				{
				setState(766);
				blockExpr();
				}
				break;
			case 5:
				{
				setState(767);
				exprSplice();
				}
				break;
			case 6:
				{
				setState(768);
				quoted();
				}
				break;
			case 7:
				{
				setState(769);
				match(QUOTEID);
				}
				break;
			case 8:
				{
				setState(770);
				match(T__39);
				setState(771);
				constrApp();
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(772);
						match(T__40);
						setState(773);
						constrApp();
						}
						} 
					}
					setState(778);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(779);
					templateBody();
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(782);
				match(T__39);
				setState(783);
				templateBody();
				}
				break;
			case 10:
				{
				setState(784);
				match(T__11);
				setState(785);
				exprsInParens();
				setState(786);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(790);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(791);
						match(T__2);
						setState(792);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(793);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(794);
						match(T__2);
						setState(795);
						matchClause();
						}
						break;
					case 3:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(796);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(797);
						typeArgs();
						}
						break;
					case 4:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(798);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(799);
						argumentExprs();
						}
						break;
					case 5:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(800);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(801);
						colonArgument();
						}
						break;
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
	public static class ColonArgumentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Scala3ParserParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LambdaStart() { return getToken(Scala3ParserParser.LambdaStart, 0); }
		public ColonArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterColonArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitColonArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitColonArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonArgumentContext colonArgument() throws RecognitionException {
		ColonArgumentContext _localctx = new ColonArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_colonArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(COLON);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LambdaStart) {
				{
				setState(808);
				match(LambdaStart);
				}
			}

			setState(811);
			match(INDENT);
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(812);
				caseClauses();
				}
				break;
			case 2:
				{
				setState(813);
				block();
				}
				break;
			}
			setState(816);
			match(OUTDENT);
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
	public static class LambdaStartContext extends ParserRuleContext {
		public FunParamsContext funParams() {
			return getRuleContext(FunParamsContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public LambdaStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterLambdaStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitLambdaStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitLambdaStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaStartContext lambdaStart() throws RecognitionException {
		LambdaStartContext _localctx = new LambdaStartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lambdaStart);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__23:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				funParams();
				setState(819);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				hkTypeParamClause();
				setState(822);
				match(T__9);
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
	public static class QuotedContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeBlockContext typeBlock() {
			return getRuleContext(TypeBlockContext.class,0);
		}
		public QuotedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterQuoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitQuoted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitQuoted(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedContext quoted() throws RecognitionException {
		QuotedContext _localctx = new QuotedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_quoted);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(T__41);
				setState(827);
				match(T__15);
				setState(828);
				block();
				setState(829);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(T__41);
				setState(832);
				match(T__6);
				setState(833);
				typeBlock();
				setState(834);
				match(T__7);
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
	public static class ExprSpliceContext extends ParserRuleContext {
		public TerminalNode SPLICEID() { return getToken(Scala3ParserParser.SPLICEID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprSpliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSplice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExprSplice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExprSplice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExprSplice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSpliceContext exprSplice() throws RecognitionException {
		ExprSpliceContext _localctx = new ExprSpliceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exprSplice);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(SPLICEID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(T__42);
				setState(840);
				match(T__15);
				setState(841);
				block();
				setState(842);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(T__42);
				setState(845);
				match(T__15);
				setState(846);
				pattern();
				setState(847);
				match(T__16);
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
	public static class TypeSpliceContext extends ParserRuleContext {
		public TerminalNode SPLICEID() { return getToken(Scala3ParserParser.SPLICEID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeSpliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSplice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeSplice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeSplice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeSplice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpliceContext typeSplice() throws RecognitionException {
		TypeSpliceContext _localctx = new TypeSpliceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeSplice);
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(SPLICEID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(T__42);
				setState(853);
				match(T__15);
				setState(854);
				block();
				setState(855);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				match(T__42);
				setState(858);
				match(T__15);
				setState(859);
				pattern();
				setState(860);
				match(T__16);
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
	public static class ExprsInParensContext extends ParserRuleContext {
		public List<ExprInParensContext> exprInParens() {
			return getRuleContexts(ExprInParensContext.class);
		}
		public ExprInParensContext exprInParens(int i) {
			return getRuleContext(ExprInParensContext.class,i);
		}
		public ExprsInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExprsInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExprsInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExprsInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsInParensContext exprsInParens() throws RecognitionException {
		ExprsInParensContext _localctx = new ExprsInParensContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exprsInParens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			exprInParens();
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(865);
					match(T__3);
					setState(866);
					exprInParens();
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
	public static class ExprInParensContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExprInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExprInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExprInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprInParensContext exprInParens() throws RecognitionException {
		ExprInParensContext _localctx = new ExprInParensContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exprInParens);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				postfixExpr();
				setState(873);
				match(T__13);
				setState(874);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				expr();
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
	public static class ParArgumentExprsContext extends ParserRuleContext {
		public ExprsInParensContext exprsInParens() {
			return getRuleContext(ExprsInParensContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ParArgumentExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parArgumentExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterParArgumentExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitParArgumentExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitParArgumentExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParArgumentExprsContext parArgumentExprs() throws RecognitionException {
		ParArgumentExprsContext _localctx = new ParArgumentExprsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parArgumentExprs);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				match(T__11);
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 50468667592958L) != 0 || (((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 167L) != 0) {
					{
					setState(880);
					exprsInParens();
					}
				}

				setState(883);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(T__11);
				setState(885);
				match(T__43);
				setState(886);
				exprsInParens();
				setState(887);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(T__11);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(890);
					exprsInParens();
					setState(891);
					match(T__3);
					}
					break;
				}
				setState(895);
				postfixExpr();
				setState(896);
				match(T__20);
				setState(897);
				match(T__12);
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
	public static class ArgumentExprsContext extends ParserRuleContext {
		public ParArgumentExprsContext parArgumentExprs() {
			return getRuleContext(ParArgumentExprsContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ArgumentExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterArgumentExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitArgumentExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitArgumentExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExprsContext argumentExprs() throws RecognitionException {
		ArgumentExprsContext _localctx = new ArgumentExprsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentExprs);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				parArgumentExprs();
				}
				break;
			case T__15:
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				blockExpr();
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
	public static class BlockExpr_Context extends ParserRuleContext {
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBlockExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBlockExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBlockExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpr_Context blockExpr_() throws RecognitionException {
		BlockExpr_Context _localctx = new BlockExpr_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_blockExpr_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(905);
				caseClauses();
				}
				break;
			case 2:
				{
				setState(906);
				block();
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
	public static class BlockExprContext extends ParserRuleContext {
		public BlockExpr_Context blockExpr_() {
			return getRuleContext(BlockExpr_Context.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_blockExpr);
		try {
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(T__15);
				setState(910);
				blockExpr_();
				setState(911);
				match(T__16);
				}
				break;
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(INDENT);
				setState(914);
				blockExpr_();
				setState(915);
				match(OUTDENT);
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
	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public BlockResultContext blockResult() {
			return getRuleContext(BlockResultContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(919);
					blockStat();
					setState(920);
					match(T__11);
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 50468667592958L) != 0 || (((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 167L) != 0) {
				{
				setState(927);
				blockResult();
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
	public static class BlockStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LocalModifierContext localModifier() {
			return getRuleContext(LocalModifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EndMarkerContext endMarker() {
			return getRuleContext(EndMarkerContext.class,0);
		}
		public BlockStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatContext blockStat() throws RecognitionException {
		BlockStatContext _localctx = new BlockStatContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blockStat);
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(931);
					annotation();
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(932);
						match(T__12);
						}
						}
						setState(937);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -139611588414930944L) != 0) {
					{
					setState(943);
					localModifier();
					}
				}

				setState(946);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				extension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				expr1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(949);
				endMarker();
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
	public static class TypeBlockContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TypeBlockStatContext> typeBlockStat() {
			return getRuleContexts(TypeBlockStatContext.class);
		}
		public TypeBlockStatContext typeBlockStat(int i) {
			return getRuleContext(TypeBlockStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public TypeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBlockContext typeBlock() throws RecognitionException {
		TypeBlockContext _localctx = new TypeBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(952);
				typeBlockStat();
				setState(953);
				match(T__11);
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
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
	public static class TypeBlockStatContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public TypeBlockStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBlockStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBlockStatContext typeBlockStat() throws RecognitionException {
		TypeBlockStatContext _localctx = new TypeBlockStatContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeBlockStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(T__18);
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(963);
				match(T__12);
				}
				}
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(969);
			typeDef();
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
	public static class ForExprContext extends ParserRuleContext {
		public Enumerators0Context enumerators0() {
			return getRuleContext(Enumerators0Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitForExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forExpr);
		int _la;
		try {
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(T__44);
				setState(972);
				match(T__11);
				setState(973);
				enumerators0();
				setState(974);
				match(T__12);
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(975);
					match(T__12);
					}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__45) {
					{
					setState(981);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__45) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(984);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(T__44);
				setState(987);
				match(T__15);
				setState(988);
				enumerators0();
				setState(989);
				match(T__16);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(990);
					match(T__12);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__45) {
					{
					setState(996);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__45) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(999);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(T__44);
				setState(1002);
				enumerators0();
				setState(1003);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__45) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1004);
				expr();
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
	public static class Enumerators0Context extends ParserRuleContext {
		public EnumeratorsContext enumerators() {
			return getRuleContext(EnumeratorsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public TerminalNode Semi() { return getToken(Scala3ParserParser.Semi, 0); }
		public Enumerators0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerators0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumerators0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumerators0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumerators0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumerators0Context enumerators0() throws RecognitionException {
		Enumerators0Context _localctx = new Enumerators0Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_enumerators0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1008);
				match(T__12);
				}
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1014);
			enumerators();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1015);
				match(T__11);
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
	public static class EnumeratorsContext extends ParserRuleContext {
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public EnumeratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumerators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumerators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumerators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorsContext enumerators() throws RecognitionException {
		EnumeratorsContext _localctx = new EnumeratorsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_enumerators);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			generator();
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1022);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
						{
						setState(1019);
						match(T__11);
						setState(1020);
						enumerator();
						}
						break;
					case T__25:
						{
						setState(1021);
						guard();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
	public static class EnumeratorContext extends ParserRuleContext {
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public Pattern1Context pattern1() {
			return getRuleContext(Pattern1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_enumerator);
		try {
			int _alt;
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				generator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				guard();
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1029);
						guard();
						}
						} 
					}
					setState(1034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				pattern1();
				setState(1036);
				match(T__34);
				setState(1037);
				expr();
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
	public static class GeneratorContext extends ParserRuleContext {
		public Pattern1Context pattern1() {
			return getRuleContext(Pattern1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(1041);
				match(T__46);
				}
			}

			setState(1044);
			pattern1();
			setState(1045);
			match(T__47);
			setState(1046);
			expr();
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
	public static class GuardContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(T__25);
			setState(1049);
			postfixExpr();
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
	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			caseClause();
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(1052);
				caseClause();
				}
				}
				setState(1057);
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
	public static class CaseClauseContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T__46);
			setState(1059);
			pattern();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1060);
				guard();
				}
			}

			setState(1063);
			match(T__9);
			setState(1064);
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
	public static class ExprCaseClauseContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExprCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExprCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(T__46);
			setState(1067);
			pattern();
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1068);
				guard();
				}
			}

			setState(1071);
			match(T__9);
			setState(1072);
			expr();
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
	public static class TypeCaseClausesContext extends ParserRuleContext {
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeCaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseClausesContext typeCaseClauses() throws RecognitionException {
		TypeCaseClausesContext _localctx = new TypeCaseClausesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeCaseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			typeCaseClause();
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(1075);
				typeCaseClause();
				}
				}
				setState(1080);
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
	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(Scala3ParserParser.Semi, 0); }
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(T__46);
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__12:
			case T__15:
			case T__17:
			case T__42:
			case ID:
			case COLON:
			case SPLICEID:
				{
				setState(1082);
				infixType();
				}
				break;
			case T__23:
				{
				setState(1083);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1086);
			match(T__9);
			setState(1087);
			type();
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1088);
				match(T__11);
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
	public static class PatternContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			pattern1();
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(1092);
				match(T__48);
				setState(1093);
				pattern1();
				}
				}
				setState(1098);
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
	public static class Pattern1Context extends ParserRuleContext {
		public PatVarContext patVar() {
			return getRuleContext(PatVarContext.class,0);
		}
		public RefinedTypeContext refinedType() {
			return getRuleContext(RefinedTypeContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(Scala3ParserParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Scala3ParserParser.FloatingPointLiteral, 0); }
		public Pattern2Context pattern2() {
			return getRuleContext(Pattern2Context.class,0);
		}
		public Pattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPattern1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPattern1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern1Context pattern1() throws RecognitionException {
		Pattern1Context _localctx = new Pattern1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_pattern1);
		int _la;
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				patVar();
				setState(1100);
				match(T__13);
				setState(1101);
				refinedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1103);
					match(T__0);
					}
				}

				setState(1106);
				match(T__4);
				setState(1107);
				match(T__13);
				setState(1108);
				refinedType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1109);
					match(T__0);
					}
				}

				setState(1112);
				match(T__6);
				setState(1113);
				match(T__13);
				setState(1114);
				refinedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1115);
				pattern2();
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
	public static class Pattern2Context extends ParserRuleContext {
		public InfixPatternContext infixPattern() {
			return getRuleContext(InfixPatternContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public Pattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPattern2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPattern2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern2Context pattern2() throws RecognitionException {
		Pattern2Context _localctx = new Pattern2Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_pattern2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1118);
				match(ID);
				setState(1119);
				match(T__49);
				}
				break;
			}
			setState(1122);
			infixPattern();
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
	public static class InfixPatternContext extends ParserRuleContext {
		public List<SimplePatternContext> simplePattern() {
			return getRuleContexts(SimplePatternContext.class);
		}
		public SimplePatternContext simplePattern(int i) {
			return getRuleContext(SimplePatternContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public InfixPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterInfixPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitInfixPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitInfixPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixPatternContext infixPattern() throws RecognitionException {
		InfixPatternContext _localctx = new InfixPatternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_infixPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			simplePattern();
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(1125);
				match(ID);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1126);
					match(T__12);
					}
				}

				setState(1129);
				simplePattern();
				}
				}
				setState(1134);
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
	public static class SimplePatternContext extends ParserRuleContext {
		public PatVarContext patVar() {
			return getRuleContext(PatVarContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public QuotedContext quoted() {
			return getRuleContext(QuotedContext.class,0);
		}
		public SimplePattern1Context simplePattern1() {
			return getRuleContext(SimplePattern1Context.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public ArgumentPatternsContext argumentPatterns() {
			return getRuleContext(ArgumentPatternsContext.class,0);
		}
		public RefinedTypeContext refinedType() {
			return getRuleContext(RefinedTypeContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimplePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simplePattern);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				patVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137);
				match(T__11);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2256197876977918L) != 0 || (((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 259L) != 0) {
					{
					setState(1138);
					patterns();
					}
				}

				setState(1141);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1142);
				quoted();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1143);
				simplePattern1(0);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(1144);
					typeArgs();
					}
				}

				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(1147);
					argumentPatterns();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1150);
				match(T__50);
				setState(1151);
				refinedType();
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
	public static class SimplePattern1Context extends ParserRuleContext {
		public SimpleRefContext simpleRef() {
			return getRuleContext(SimpleRefContext.class,0);
		}
		public SimplePattern1Context simplePattern1() {
			return getRuleContext(SimplePattern1Context.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public SimplePattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSimplePattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSimplePattern1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSimplePattern1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePattern1Context simplePattern1() throws RecognitionException {
		return simplePattern1(0);
	}

	private SimplePattern1Context simplePattern1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimplePattern1Context _localctx = new SimplePattern1Context(_ctx, _parentState);
		SimplePattern1Context _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_simplePattern1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1155);
			simpleRef();
			}
			_ctx.stop = _input.LT(-1);
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimplePattern1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simplePattern1);
					setState(1157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1158);
					match(T__2);
					setState(1159);
					match(ID);
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
	public static class PatVarContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(Scala3ParserParser.VARID, 0); }
		public PatVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPatVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPatVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPatVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatVarContext patVar() throws RecognitionException {
		PatVarContext _localctx = new PatVarContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_patVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==VARID) ) {
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
	public static class PatternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			pattern();
			setState(1172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1168);
					match(T__3);
					setState(1169);
					pattern();
					}
					} 
				}
				setState(1174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
	public static class ArgumentPatternsContext extends ParserRuleContext {
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public PatVarContext patVar() {
			return getRuleContext(PatVarContext.class,0);
		}
		public ArgumentPatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentPatterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterArgumentPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitArgumentPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitArgumentPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentPatternsContext argumentPatterns() throws RecognitionException {
		ArgumentPatternsContext _localctx = new ArgumentPatternsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_argumentPatterns);
		int _la;
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(T__11);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2256197876977918L) != 0 || (((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 259L) != 0) {
					{
					setState(1176);
					patterns();
					}
				}

				setState(1179);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				match(T__11);
				setState(1184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1181);
					patterns();
					setState(1182);
					match(T__3);
					}
					break;
				}
				setState(1186);
				patVar();
				setState(1187);
				match(T__20);
				setState(1188);
				match(T__12);
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
	public static class ClsTypeParamClauseContext extends ParserRuleContext {
		public List<ClsTypeParamContext> clsTypeParam() {
			return getRuleContexts(ClsTypeParamContext.class);
		}
		public ClsTypeParamContext clsTypeParam(int i) {
			return getRuleContext(ClsTypeParamContext.class,i);
		}
		public ClsTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsTypeParamClauseContext clsTypeParamClause() throws RecognitionException {
		ClsTypeParamClauseContext _localctx = new ClsTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_clsTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(T__6);
			setState(1193);
			clsTypeParam();
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1194);
				match(T__3);
				setState(1195);
				clsTypeParam();
				}
				}
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1201);
			match(T__7);
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
	public static class ClsTypeParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public ClsTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsTypeParamContext clsTypeParam() throws RecognitionException {
		ClsTypeParamContext _localctx = new ClsTypeParamContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_clsTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1203);
				annotation();
				}
				}
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__36) {
				{
				setState(1209);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1212);
			match(ID);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1213);
				hkTypeParamClause();
				}
			}

			setState(1216);
			typeParamBounds();
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
	public static class TypTypeParamClauseContext extends ParserRuleContext {
		public List<TypTypeParamContext> typTypeParam() {
			return getRuleContexts(TypTypeParamContext.class);
		}
		public TypTypeParamContext typTypeParam(int i) {
			return getRuleContext(TypTypeParamContext.class,i);
		}
		public TypTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypTypeParamClauseContext typTypeParamClause() throws RecognitionException {
		TypTypeParamClauseContext _localctx = new TypTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_typTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(T__6);
			setState(1219);
			typTypeParam();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1220);
				match(T__3);
				setState(1221);
				typTypeParam();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1227);
			match(T__7);
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
	public static class TypTypeParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeBoundsContext typeBounds() {
			return getRuleContext(TypeBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public TypTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypTypeParamContext typTypeParam() throws RecognitionException {
		TypTypeParamContext _localctx = new TypTypeParamContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1229);
				annotation();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1235);
			match(ID);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1236);
				hkTypeParamClause();
				}
			}

			setState(1239);
			typeBounds();
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
	public static class HkTypeParamClauseContext extends ParserRuleContext {
		public List<HkTypeParamContext> hkTypeParam() {
			return getRuleContexts(HkTypeParamContext.class);
		}
		public HkTypeParamContext hkTypeParam(int i) {
			return getRuleContext(HkTypeParamContext.class,i);
		}
		public HkTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hkTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterHkTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitHkTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitHkTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HkTypeParamClauseContext hkTypeParamClause() throws RecognitionException {
		HkTypeParamClauseContext _localctx = new HkTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_hkTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(T__6);
			setState(1242);
			hkTypeParam();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1243);
				match(T__3);
				setState(1244);
				hkTypeParam();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1250);
			match(T__7);
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
	public static class HkTypeParamContext extends ParserRuleContext {
		public TypeBoundsContext typeBounds() {
			return getRuleContext(TypeBoundsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public HkTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hkTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterHkTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitHkTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitHkTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HkTypeParamContext hkTypeParam() throws RecognitionException {
		HkTypeParamContext _localctx = new HkTypeParamContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_hkTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1252);
				annotation();
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__36) {
				{
				setState(1258);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1261);
				match(ID);
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(1262);
					hkTypeParamClause();
					}
				}

				}
				break;
			case T__23:
				{
				setState(1265);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1268);
			typeBounds();
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
	public static class ClsParamClausesContext extends ParserRuleContext {
		public List<ClsParamClauseContext> clsParamClause() {
			return getRuleContexts(ClsParamClauseContext.class);
		}
		public ClsParamClauseContext clsParamClause(int i) {
			return getRuleContext(ClsParamClauseContext.class,i);
		}
		public ClsParamsContext clsParams() {
			return getRuleContext(ClsParamsContext.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public ClsParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsParamClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsParamClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsParamClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsParamClausesContext clsParamClauses() throws RecognitionException {
		ClsParamClausesContext _localctx = new ClsParamClausesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_clsParamClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1270);
					clsParamClause();
					}
					} 
				}
				setState(1275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1276);
					match(T__12);
					}
				}

				setState(1279);
				match(T__11);
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1280);
					match(T__51);
					}
					break;
				}
				setState(1283);
				clsParams();
				setState(1284);
				match(T__12);
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
	public static class ClsParamClauseContext extends ParserRuleContext {
		public ClsParamsContext clsParams() {
			return getRuleContext(ClsParamsContext.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public FunArgTypesContext funArgTypes() {
			return getRuleContext(FunArgTypesContext.class,0);
		}
		public ClsParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsParamClauseContext clsParamClause() throws RecognitionException {
		ClsParamClauseContext _localctx = new ClsParamClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_clsParamClause);
		int _la;
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1288);
					match(T__12);
					}
				}

				setState(1291);
				match(T__11);
				setState(1292);
				clsParams();
				setState(1293);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1295);
					match(T__12);
					}
				}

				setState(1298);
				match(T__11);
				setState(1299);
				match(T__43);
				setState(1302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1300);
					clsParams();
					}
					break;
				case 2:
					{
					setState(1301);
					funArgTypes();
					}
					break;
				}
				setState(1304);
				match(T__12);
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
	public static class ClsParamsContext extends ParserRuleContext {
		public List<ClsParamContext> clsParam() {
			return getRuleContexts(ClsParamContext.class);
		}
		public ClsParamContext clsParam(int i) {
			return getRuleContext(ClsParamContext.class,i);
		}
		public ClsParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsParamsContext clsParams() throws RecognitionException {
		ClsParamsContext _localctx = new ClsParamsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_clsParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			clsParam();
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1309);
				match(T__3);
				setState(1310);
				clsParam();
				}
				}
				setState(1315);
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
	public static class ClsParamContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClsParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClsParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClsParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClsParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsParamContext clsParam() throws RecognitionException {
		ClsParamContext _localctx = new ClsParamContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_clsParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1316);
				annotation();
				}
				}
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198889037825L) != 0) {
				{
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198083731457L) != 0) {
					{
					{
					setState(1322);
					modifier();
					}
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1328);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1331);
			param();
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
	public static class DefParamClausesContext extends ParserRuleContext {
		public List<DefParamClauseContext> defParamClause() {
			return getRuleContexts(DefParamClauseContext.class);
		}
		public DefParamClauseContext defParamClause(int i) {
			return getRuleContext(DefParamClauseContext.class,i);
		}
		public DefParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParamClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefParamClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefParamClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefParamClausesContext defParamClauses() throws RecognitionException {
		DefParamClausesContext _localctx = new DefParamClausesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_defParamClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			defParamClause();
			setState(1337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1334);
					defParamClause();
					}
					} 
				}
				setState(1339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
	public static class DefParamClauseContext extends ParserRuleContext {
		public DefTypeParamClauseContext defTypeParamClause() {
			return getRuleContext(DefTypeParamClauseContext.class,0);
		}
		public DefTermParamClauseContext defTermParamClause() {
			return getRuleContext(DefTermParamClauseContext.class,0);
		}
		public UsingParamClauseContext usingParamClause() {
			return getRuleContext(UsingParamClauseContext.class,0);
		}
		public DefParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefParamClauseContext defParamClause() throws RecognitionException {
		DefParamClauseContext _localctx = new DefParamClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_defParamClause);
		try {
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				defTypeParamClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				defTermParamClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
				usingParamClause();
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
	public static class TypelessClausesContext extends ParserRuleContext {
		public List<TypelessClauseContext> typelessClause() {
			return getRuleContexts(TypelessClauseContext.class);
		}
		public TypelessClauseContext typelessClause(int i) {
			return getRuleContext(TypelessClauseContext.class,i);
		}
		public TypelessClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelessClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypelessClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypelessClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypelessClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypelessClausesContext typelessClauses() throws RecognitionException {
		TypelessClausesContext _localctx = new TypelessClausesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typelessClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			typelessClause();
			setState(1349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1346);
					typelessClause();
					}
					} 
				}
				setState(1351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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
	public static class TypelessClauseContext extends ParserRuleContext {
		public DefTermParamClauseContext defTermParamClause() {
			return getRuleContext(DefTermParamClauseContext.class,0);
		}
		public UsingParamClauseContext usingParamClause() {
			return getRuleContext(UsingParamClauseContext.class,0);
		}
		public TypelessClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelessClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypelessClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypelessClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypelessClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypelessClauseContext typelessClause() throws RecognitionException {
		TypelessClauseContext _localctx = new TypelessClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typelessClause);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				defTermParamClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				usingParamClause();
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
	public static class DefTypeParamClauseContext extends ParserRuleContext {
		public List<DefTypeParamContext> defTypeParam() {
			return getRuleContexts(DefTypeParamContext.class);
		}
		public DefTypeParamContext defTypeParam(int i) {
			return getRuleContext(DefTypeParamContext.class,i);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public DefTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefTypeParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefTypeParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTypeParamClauseContext defTypeParamClause() throws RecognitionException {
		DefTypeParamClauseContext _localctx = new DefTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_defTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1356);
				match(T__12);
				}
			}

			setState(1359);
			match(T__6);
			setState(1360);
			defTypeParam();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1361);
				match(T__3);
				setState(1362);
				defTypeParam();
				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1368);
			match(T__7);
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
	public static class DefTypeParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public DefTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTypeParamContext defTypeParam() throws RecognitionException {
		DefTypeParamContext _localctx = new DefTypeParamContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_defTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1370);
				annotation();
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1376);
			match(ID);
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1377);
				hkTypeParamClause();
				}
			}

			setState(1380);
			typeParamBounds();
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
	public static class DefTermParamClauseContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public DefTermParamsContext defTermParams() {
			return getRuleContext(DefTermParamsContext.class,0);
		}
		public DefTermParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTermParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefTermParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefTermParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefTermParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTermParamClauseContext defTermParamClause() throws RecognitionException {
		DefTermParamClauseContext _localctx = new DefTermParamClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_defTermParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1382);
				match(T__12);
				}
			}

			setState(1385);
			match(T__11);
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 36028797052518401L) != 0) {
				{
				setState(1386);
				defTermParams();
				}
			}

			setState(1389);
			match(T__12);
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
	public static class UsingParamClauseContext extends ParserRuleContext {
		public DefTermParamsContext defTermParams() {
			return getRuleContext(DefTermParamsContext.class,0);
		}
		public FunArgTypesContext funArgTypes() {
			return getRuleContext(FunArgTypesContext.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public UsingParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterUsingParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitUsingParamClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitUsingParamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingParamClauseContext usingParamClause() throws RecognitionException {
		UsingParamClauseContext _localctx = new UsingParamClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_usingParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1391);
				match(T__12);
				}
			}

			setState(1394);
			match(T__11);
			setState(1395);
			match(T__43);
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1396);
				defTermParams();
				}
				break;
			case 2:
				{
				setState(1397);
				funArgTypes();
				}
				break;
			}
			setState(1400);
			match(T__12);
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
	public static class DefImplicitClauseContext extends ParserRuleContext {
		public DefTermParamsContext defTermParams() {
			return getRuleContext(DefTermParamsContext.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public DefImplicitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defImplicitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefImplicitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefImplicitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefImplicitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefImplicitClauseContext defImplicitClause() throws RecognitionException {
		DefImplicitClauseContext _localctx = new DefImplicitClauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_defImplicitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1402);
				match(T__12);
				}
			}

			setState(1405);
			match(T__11);
			setState(1406);
			match(T__51);
			setState(1407);
			defTermParams();
			setState(1408);
			match(T__12);
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
	public static class DefTermParamsContext extends ParserRuleContext {
		public List<DefTermParamContext> defTermParam() {
			return getRuleContexts(DefTermParamContext.class);
		}
		public DefTermParamContext defTermParam(int i) {
			return getRuleContext(DefTermParamContext.class,i);
		}
		public DefTermParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTermParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefTermParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefTermParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefTermParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTermParamsContext defTermParams() throws RecognitionException {
		DefTermParamsContext _localctx = new DefTermParamsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_defTermParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			defTermParam();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1411);
				match(T__3);
				setState(1412);
				defTermParam();
				}
				}
				setState(1417);
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
	public static class DefTermParamContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DefTermParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTermParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefTermParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefTermParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefTermParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefTermParamContext defTermParam() throws RecognitionException {
		DefTermParamContext _localctx = new DefTermParamContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_defTermParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(1418);
				annotation();
				}
				}
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(1424);
				match(T__24);
				}
			}

			setState(1427);
			param();
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(ID);
			setState(1430);
			match(T__13);
			setState(1431);
			paramType();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(1432);
				match(T__34);
				setState(1433);
				expr();
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
	public static class BindingsContext extends ParserRuleContext {
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(T__11);
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==ID) {
				{
				setState(1437);
				binding();
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1438);
					match(T__3);
					setState(1439);
					binding();
					}
					}
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1447);
			match(T__12);
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
	public static class BindingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1450);
				match(T__13);
				setState(1451);
				type();
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
	public static class ModifierContext extends ParserRuleContext {
		public LocalModifierContext localModifier() {
			return getRuleContext(LocalModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_modifier);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__51:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				localModifier();
				}
				break;
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				accessModifier();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 3);
				{
				setState(1456);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 4);
				{
				setState(1457);
				match(T__55);
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
	public static class LocalModifierContext extends ParserRuleContext {
		public LocalModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterLocalModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitLocalModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitLocalModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalModifierContext localModifier() throws RecognitionException {
		LocalModifierContext _localctx = new LocalModifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_localModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -139611588414930944L) != 0) ) {
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
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessQualifierContext accessQualifier() {
			return getRuleContext(AccessQualifierContext.class,0);
		}
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_la = _input.LA(1);
			if ( !(_la==T__63 || _la==T__64) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1463);
				accessQualifier();
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
	public static class AccessQualifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public AccessQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterAccessQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitAccessQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitAccessQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessQualifierContext accessQualifier() throws RecognitionException {
		AccessQualifierContext _localctx = new AccessQualifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_accessQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(T__6);
			setState(1467);
			match(ID);
			setState(1468);
			match(T__7);
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
	public static class AnnotationContext extends ParserRuleContext {
		public SimpleType1Context simpleType1() {
			return getRuleContext(SimpleType1Context.class,0);
		}
		public List<ParArgumentExprsContext> parArgumentExprs() {
			return getRuleContexts(ParArgumentExprsContext.class);
		}
		public ParArgumentExprsContext parArgumentExprs(int i) {
			return getRuleContext(ParArgumentExprsContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_annotation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(T__49);
			setState(1471);
			simpleType1(0);
			setState(1475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1472);
					parArgumentExprs();
					}
					} 
				}
				setState(1477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
	public static class Import_Context extends ParserRuleContext {
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(T__65);
			setState(1479);
			importExpr();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1480);
				match(T__3);
				setState(1481);
				importExpr();
				}
				}
				setState(1486);
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
	public static class ExportContext extends ParserRuleContext {
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(T__66);
			setState(1488);
			importExpr();
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1489);
				match(T__3);
				setState(1490);
				importExpr();
				}
				}
				setState(1495);
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
	public static class ImportExprContext extends ParserRuleContext {
		public SimpleRefContext simpleRef() {
			return getRuleContext(SimpleRefContext.class,0);
		}
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterImportExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitImportExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitImportExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_importExpr);
		try {
			int _alt;
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				simpleRef();
				setState(1501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1497);
						match(T__2);
						setState(1498);
						match(ID);
						}
						} 
					}
					setState(1503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1504);
				match(T__2);
				setState(1505);
				importSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				simpleRef();
				setState(1508);
				match(T__67);
				setState(1509);
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
	public static class ImportSpecContext extends ParserRuleContext {
		public NamedSelectorContext namedSelector() {
			return getRuleContext(NamedSelectorContext.class,0);
		}
		public WildCardSelectorContext wildCardSelector() {
			return getRuleContext(WildCardSelectorContext.class,0);
		}
		public ImportSelectorsContext importSelectors() {
			return getRuleContext(ImportSelectorsContext.class,0);
		}
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_importSpec);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				namedSelector();
				}
				break;
			case T__20:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				wildCardSelector();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				match(T__15);
				setState(1516);
				importSelectors();
				setState(1517);
				match(T__16);
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
	public static class NamedSelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Scala3ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Scala3ParserParser.ID, i);
		}
		public NamedSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterNamedSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitNamedSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitNamedSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedSelectorContext namedSelector() throws RecognitionException {
		NamedSelectorContext _localctx = new NamedSelectorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_namedSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(ID);
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__67) {
				{
				setState(1522);
				match(T__67);
				setState(1523);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class WildCardSelectorContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public WildCardSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildCardSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterWildCardSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitWildCardSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitWildCardSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildCardSelectorContext wildCardSelector() throws RecognitionException {
		WildCardSelectorContext _localctx = new WildCardSelectorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_wildCardSelector);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				match(T__20);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				match(T__50);
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1528);
					infixType();
					}
					break;
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
	public static class ImportSelectorsContext extends ParserRuleContext {
		public NamedSelectorContext namedSelector() {
			return getRuleContext(NamedSelectorContext.class,0);
		}
		public ImportSelectorsContext importSelectors() {
			return getRuleContext(ImportSelectorsContext.class,0);
		}
		public List<WildCardSelectorContext> wildCardSelector() {
			return getRuleContexts(WildCardSelectorContext.class);
		}
		public WildCardSelectorContext wildCardSelector(int i) {
			return getRuleContext(WildCardSelectorContext.class,i);
		}
		public ImportSelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterImportSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitImportSelectors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitImportSelectors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSelectorsContext importSelectors() throws RecognitionException {
		ImportSelectorsContext _localctx = new ImportSelectorsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_importSelectors);
		int _la;
		try {
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				namedSelector();
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1534);
					match(T__3);
					setState(1535);
					importSelectors();
					}
				}

				}
				break;
			case T__20:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				wildCardSelector();
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1539);
					match(T__3);
					setState(1540);
					wildCardSelector();
					}
					}
					setState(1545);
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
	public static class EndMarkerContext extends ParserRuleContext {
		public EndMarkerTagContext endMarkerTag() {
			return getRuleContext(EndMarkerTagContext.class,0);
		}
		public EndMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEndMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEndMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEndMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndMarkerContext endMarker() throws RecognitionException {
		EndMarkerContext _localctx = new EndMarkerContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_endMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(T__68);
			setState(1549);
			endMarkerTag();
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
	public static class EndMarkerTagContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public EndMarkerTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endMarkerTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEndMarkerTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEndMarkerTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEndMarkerTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndMarkerTagContext endMarkerTag() throws RecognitionException {
		EndMarkerTagContext _localctx = new EndMarkerTagContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_endMarkerTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 11295285703639072L) != 0 || _la==T__69 || _la==ID) ) {
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
	public static class RefineDclContext extends ParserRuleContext {
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public DefDclContext defDcl() {
			return getRuleContext(DefDclContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public RefineDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refineDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterRefineDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitRefineDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitRefineDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefineDclContext refineDcl() throws RecognitionException {
		RefineDclContext _localctx = new RefineDclContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_refineDcl);
		int _la;
		try {
			setState(1565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				match(T__52);
				setState(1554);
				valDcl();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 2);
				{
				setState(1555);
				match(T__70);
				setState(1556);
				defDcl();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557);
				match(T__18);
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(1558);
					match(T__12);
					}
					}
					setState(1563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1564);
				typeDef();
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
	public static class ValDclContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterValDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitValDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitValDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValDclContext valDcl() throws RecognitionException {
		ValDclContext _localctx = new ValDclContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_valDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			ids();
			setState(1568);
			match(T__13);
			setState(1569);
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
	public static class DefDclContext extends ParserRuleContext {
		public DefSigContext defSig() {
			return getRuleContext(DefSigContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefDclContext defDcl() throws RecognitionException {
		DefDclContext _localctx = new DefDclContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			defSig();
			setState(1572);
			match(T__13);
			setState(1573);
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
	public static class DefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public DefDefContext defDef() {
			return getRuleContext(DefDefContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_def);
		int _la;
		try {
			setState(1590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				match(T__52);
				setState(1576);
				patDef();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				match(T__53);
				setState(1578);
				patDef();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 3);
				{
				setState(1579);
				match(T__70);
				setState(1580);
				defDef();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
				match(T__18);
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(1582);
					match(T__12);
					}
					}
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1588);
				typeDef();
				}
				break;
			case T__46:
			case T__50:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 5);
				{
				setState(1589);
				tmplDef();
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
	public static class PatDefContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Pattern2Context pattern2() {
			return getRuleContext(Pattern2Context.class,0);
		}
		public PatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPatDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPatDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatDefContext patDef() throws RecognitionException {
		PatDefContext _localctx = new PatDefContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_patDef);
		int _la;
		try {
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				ids();
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1593);
					match(T__13);
					setState(1594);
					type();
					}
				}

				setState(1597);
				match(T__34);
				setState(1598);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				pattern2();
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1601);
					match(T__13);
					setState(1602);
					type();
					}
				}

				setState(1605);
				match(T__34);
				setState(1606);
				expr();
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
	public static class DefDefContext extends ParserRuleContext {
		public DefSigContext defSig() {
			return getRuleContext(DefSigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypelessClausesContext typelessClauses() {
			return getRuleContext(TypelessClausesContext.class,0);
		}
		public ConstrExprContext constrExpr() {
			return getRuleContext(ConstrExprContext.class,0);
		}
		public DefImplicitClauseContext defImplicitClause() {
			return getRuleContext(DefImplicitClauseContext.class,0);
		}
		public DefDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefDefContext defDef() throws RecognitionException {
		DefDefContext _localctx = new DefDefContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_defDef);
		int _la;
		try {
			setState(1626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				defSig();
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1611);
					match(T__13);
					setState(1612);
					type();
					}
				}

				setState(1615);
				match(T__34);
				setState(1616);
				expr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(T__4);
				setState(1619);
				typelessClauses();
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(1620);
					defImplicitClause();
					}
				}

				setState(1623);
				match(T__34);
				setState(1624);
				constrExpr();
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
	public static class DefSigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public DefParamClausesContext defParamClauses() {
			return getRuleContext(DefParamClausesContext.class,0);
		}
		public DefImplicitClauseContext defImplicitClause() {
			return getRuleContext(DefImplicitClauseContext.class,0);
		}
		public DefSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterDefSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitDefSig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitDefSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefSigContext defSig() throws RecognitionException {
		DefSigContext _localctx = new DefSigContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_defSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(ID);
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1629);
				defParamClauses();
				}
				break;
			}
			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(1632);
				defImplicitClause();
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
	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TypeBoundsContext typeBounds() {
			return getRuleContext(TypeBoundsContext.class,0);
		}
		public HkTypeParamClauseContext hkTypeParamClause() {
			return getRuleContext(HkTypeParamClauseContext.class,0);
		}
		public List<FunParamClauseContext> funParamClause() {
			return getRuleContexts(FunParamClauseContext.class);
		}
		public FunParamClauseContext funParamClause(int i) {
			return getRuleContext(FunParamClauseContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_typeDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(ID);
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1636);
				hkTypeParamClause();
				}
			}

			setState(1642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1639);
					funParamClause();
					}
					} 
				}
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			setState(1645);
			typeBounds();
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(1646);
				match(T__34);
				setState(1647);
				type();
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
	public static class TmplDefContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public GivenDefContext givenDef() {
			return getRuleContext(GivenDefContext.class,0);
		}
		public TmplDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTmplDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTmplDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTmplDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplDefContext tmplDef() throws RecognitionException {
		TmplDefContext _localctx = new TmplDefContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_tmplDef);
		int _la;
		try {
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__46:
				case T__71:
					{
					setState(1651);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__46) {
						{
						setState(1650);
						match(T__46);
						}
					}

					setState(1653);
					match(T__71);
					}
					break;
				case T__72:
					{
					setState(1654);
					match(T__72);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1657);
				classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(1658);
					match(T__46);
					}
				}

				setState(1661);
				match(T__73);
				setState(1662);
				objectDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1663);
				match(T__74);
				setState(1664);
				enumDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1665);
				match(T__50);
				setState(1666);
				givenDef();
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
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public ClassConstrContext classConstr() {
			return getRuleContext(ClassConstrContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(ID);
			setState(1670);
			classConstr();
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1671);
				template();
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
	public static class ClassConstrContext extends ParserRuleContext {
		public ClsParamClausesContext clsParamClauses() {
			return getRuleContext(ClsParamClausesContext.class,0);
		}
		public ClsTypeParamClauseContext clsTypeParamClause() {
			return getRuleContext(ClsTypeParamClauseContext.class,0);
		}
		public ConstrModsContext constrMods() {
			return getRuleContext(ConstrModsContext.class,0);
		}
		public ClassConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterClassConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitClassConstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitClassConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstrContext classConstr() throws RecognitionException {
		ClassConstrContext _localctx = new ClassConstrContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_classConstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1674);
				clsTypeParamClause();
				}
				break;
			}
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1677);
				constrMods();
				}
				break;
			}
			setState(1680);
			clsParamClauses();
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
	public static class ConstrModsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ConstrModsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrMods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterConstrMods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitConstrMods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitConstrMods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrModsContext constrMods() throws RecognitionException {
		ConstrModsContext _localctx = new ConstrModsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_constrMods);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1682);
					annotation();
					}
					} 
				}
				setState(1687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1688);
				accessModifier();
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
	public static class ObjectDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ObjectDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterObjectDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitObjectDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitObjectDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDefContext objectDef() throws RecognitionException {
		ObjectDefContext _localctx = new ObjectDefContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_objectDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(ID);
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1692);
				template();
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
	public static class EnumDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public ClassConstrContext classConstr() {
			return getRuleContext(ClassConstrContext.class,0);
		}
		public InheritClausesContext inheritClauses() {
			return getRuleContext(InheritClausesContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_enumDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(ID);
			setState(1696);
			classConstr();
			setState(1697);
			inheritClauses();
			setState(1698);
			enumBody();
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
	public static class GivenDefContext extends ParserRuleContext {
		public AnnotTypeContext annotType() {
			return getRuleContext(AnnotTypeContext.class,0);
		}
		public StructuralInstanceContext structuralInstance() {
			return getRuleContext(StructuralInstanceContext.class,0);
		}
		public GivenSigContext givenSig() {
			return getRuleContext(GivenSigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GivenDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterGivenDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitGivenDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitGivenDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenDefContext givenDef() throws RecognitionException {
		GivenDefContext _localctx = new GivenDefContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_givenDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1700);
				givenSig();
				}
				break;
			}
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1703);
				annotType();
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(1704);
					match(T__34);
					setState(1705);
					expr();
					}
				}

				}
				break;
			case 2:
				{
				setState(1708);
				structuralInstance();
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
	public static class GivenSigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public DefTypeParamClauseContext defTypeParamClause() {
			return getRuleContext(DefTypeParamClauseContext.class,0);
		}
		public List<UsingParamClauseContext> usingParamClause() {
			return getRuleContexts(UsingParamClauseContext.class);
		}
		public UsingParamClauseContext usingParamClause(int i) {
			return getRuleContext(UsingParamClauseContext.class,i);
		}
		public GivenSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterGivenSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitGivenSig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitGivenSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenSigContext givenSig() throws RecognitionException {
		GivenSigContext _localctx = new GivenSigContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_givenSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1711);
				match(ID);
				}
			}

			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1714);
				defTypeParamClause();
				}
				break;
			}
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(1717);
				usingParamClause();
				}
				}
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1723);
			match(T__13);
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
	public static class StructuralInstanceContext extends ParserRuleContext {
		public List<ConstrAppContext> constrApp() {
			return getRuleContexts(ConstrAppContext.class);
		}
		public ConstrAppContext constrApp(int i) {
			return getRuleContext(ConstrAppContext.class,i);
		}
		public WithTemplateBodyContext withTemplateBody() {
			return getRuleContext(WithTemplateBodyContext.class,0);
		}
		public StructuralInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterStructuralInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitStructuralInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitStructuralInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralInstanceContext structuralInstance() throws RecognitionException {
		StructuralInstanceContext _localctx = new StructuralInstanceContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_structuralInstance);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			constrApp();
			setState(1730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1726);
					match(T__40);
					setState(1727);
					constrApp();
					}
					} 
				}
				setState(1732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(1733);
				match(T__40);
				setState(1734);
				withTemplateBody();
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
	public static class ExtensionContext extends ParserRuleContext {
		public DefTermParamContext defTermParam() {
			return getRuleContext(DefTermParamContext.class,0);
		}
		public ExtMethods_Context extMethods_() {
			return getRuleContext(ExtMethods_Context.class,0);
		}
		public DefTypeParamClauseContext defTypeParamClause() {
			return getRuleContext(DefTypeParamClauseContext.class,0);
		}
		public List<UsingParamClauseContext> usingParamClause() {
			return getRuleContexts(UsingParamClauseContext.class);
		}
		public UsingParamClauseContext usingParamClause(int i) {
			return getRuleContext(UsingParamClauseContext.class,i);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_extension);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(T__69);
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1738);
				defTypeParamClause();
				}
				break;
			}
			setState(1744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1741);
					usingParamClause();
					}
					} 
				}
				setState(1746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			setState(1747);
			match(T__11);
			setState(1748);
			defTermParam();
			setState(1749);
			match(T__12);
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(1750);
				usingParamClause();
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1756);
			extMethods_();
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
	public static class ExtMethods_Context extends ParserRuleContext {
		public List<ExtMethodContext> extMethod() {
			return getRuleContexts(ExtMethodContext.class);
		}
		public ExtMethodContext extMethod(int i) {
			return getRuleContext(ExtMethodContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public ExtMethods_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extMethods_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExtMethods_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExtMethods_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExtMethods_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtMethods_Context extMethods_() throws RecognitionException {
		ExtMethods_Context _localctx = new ExtMethods_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_extMethods_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			extMethod();
			setState(1763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1759);
					match(T__11);
					setState(1760);
					extMethod();
					}
					} 
				}
				setState(1765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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
	public static class ExtMethodsContext extends ParserRuleContext {
		public ExtMethodContext extMethod() {
			return getRuleContext(ExtMethodContext.class,0);
		}
		public ExtMethods_Context extMethods_() {
			return getRuleContext(ExtMethods_Context.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public ExtMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExtMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExtMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExtMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtMethodsContext extMethods() throws RecognitionException {
		ExtMethodsContext _localctx = new ExtMethodsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_extMethods);
		int _la;
		try {
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__49:
			case T__51:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__66:
			case T__70:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				extMethod();
				}
				break;
			case T__12:
			case T__15:
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1767);
					match(T__12);
					}
				}

				setState(1778);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(1770);
					match(T__15);
					setState(1771);
					extMethods_();
					setState(1772);
					match(T__16);
					}
					break;
				case INDENT:
					{
					setState(1774);
					match(INDENT);
					setState(1775);
					extMethods_();
					setState(1776);
					match(OUTDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class ExtMethodContext extends ParserRuleContext {
		public DefDefContext defDef() {
			return getRuleContext(DefDefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ExtMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterExtMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitExtMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitExtMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtMethodContext extMethod() throws RecognitionException {
		ExtMethodContext _localctx = new ExtMethodContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_extMethod);
		int _la;
		try {
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__49:
			case T__51:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__70:
				enterOuterAlt(_localctx, 1);
				{
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(1782);
					annotation();
					setState(1784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(1783);
						match(T__12);
						}
					}

					}
					}
					setState(1790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198083731457L) != 0) {
					{
					{
					setState(1791);
					modifier();
					}
					}
					setState(1796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1797);
				match(T__70);
				setState(1798);
				defDef();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				export();
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
	public static class TemplateContext extends ParserRuleContext {
		public InheritClausesContext inheritClauses() {
			return getRuleContext(InheritClausesContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			inheritClauses();
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__15 || _la==COLON) {
				{
				setState(1803);
				templateBody();
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
	public static class InheritClausesContext extends ParserRuleContext {
		public ConstrAppsContext constrApps() {
			return getRuleContext(ConstrAppsContext.class,0);
		}
		public List<QualIdContext> qualId() {
			return getRuleContexts(QualIdContext.class);
		}
		public QualIdContext qualId(int i) {
			return getRuleContext(QualIdContext.class,i);
		}
		public InheritClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterInheritClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitInheritClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitInheritClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritClausesContext inheritClauses() throws RecognitionException {
		InheritClausesContext _localctx = new InheritClausesContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_inheritClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(1806);
				match(T__75);
				setState(1807);
				constrApps();
				}
			}

			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(1810);
				match(T__76);
				setState(1811);
				qualId();
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1812);
						match(T__3);
						setState(1813);
						qualId();
						}
						} 
					}
					setState(1818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				}
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
	public static class ConstrAppsContext extends ParserRuleContext {
		public List<ConstrAppContext> constrApp() {
			return getRuleContexts(ConstrAppContext.class);
		}
		public ConstrAppContext constrApp(int i) {
			return getRuleContext(ConstrAppContext.class,i);
		}
		public ConstrAppsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrApps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterConstrApps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitConstrApps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitConstrApps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrAppsContext constrApps() throws RecognitionException {
		ConstrAppsContext _localctx = new ConstrAppsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_constrApps);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			constrApp();
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1822);
						match(T__3);
						setState(1823);
						constrApp();
						}
						} 
					}
					setState(1828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(1829);
					match(T__40);
					setState(1830);
					constrApp();
					}
					}
					setState(1835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ConstrAppContext extends ParserRuleContext {
		public SimpleType1Context simpleType1() {
			return getRuleContext(SimpleType1Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ParArgumentExprsContext> parArgumentExprs() {
			return getRuleContexts(ParArgumentExprsContext.class);
		}
		public ParArgumentExprsContext parArgumentExprs(int i) {
			return getRuleContext(ParArgumentExprsContext.class,i);
		}
		public ConstrAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterConstrApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitConstrApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitConstrApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrAppContext constrApp() throws RecognitionException {
		ConstrAppContext _localctx = new ConstrAppContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_constrApp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			simpleType1(0);
			setState(1842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1839);
					annotation();
					}
					} 
				}
				setState(1844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1845);
					parArgumentExprs();
					}
					} 
				}
				setState(1850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
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
	public static class ConstrExpr_Context extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public ConstrExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterConstrExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitConstrExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitConstrExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrExpr_Context constrExpr_() throws RecognitionException {
		ConstrExpr_Context _localctx = new ConstrExpr_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_constrExpr_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			selfInvocation();
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1852);
				match(T__11);
				setState(1853);
				blockStat();
				}
				}
				setState(1858);
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
	public static class ConstrExprContext extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public ConstrExpr_Context constrExpr_() {
			return getRuleContext(ConstrExpr_Context.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public ConstrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterConstrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitConstrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitConstrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrExprContext constrExpr() throws RecognitionException {
		ConstrExprContext _localctx = new ConstrExprContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_constrExpr);
		try {
			setState(1870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				selfInvocation();
				}
				break;
			case T__15:
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(1860);
					match(T__15);
					setState(1861);
					constrExpr_();
					setState(1862);
					match(T__16);
					}
					break;
				case INDENT:
					{
					setState(1864);
					match(INDENT);
					setState(1865);
					constrExpr_();
					setState(1866);
					match(OUTDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class SelfInvocationContext extends ParserRuleContext {
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public SelfInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSelfInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSelfInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSelfInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfInvocationContext selfInvocation() throws RecognitionException {
		SelfInvocationContext _localctx = new SelfInvocationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_selfInvocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			match(T__4);
			setState(1873);
			argumentExprs();
			setState(1877);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1874);
					argumentExprs();
					}
					} 
				}
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
	public static class TemplateBody_Context extends ParserRuleContext {
		public List<TemplateStatContext> templateStat() {
			return getRuleContexts(TemplateStatContext.class);
		}
		public TemplateStatContext templateStat(int i) {
			return getRuleContext(TemplateStatContext.class,i);
		}
		public TerminalNode Semi() { return getToken(Scala3ParserParser.Semi, 0); }
		public SelfTypeContext selfType() {
			return getRuleContext(SelfTypeContext.class,0);
		}
		public TemplateBody_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTemplateBody_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTemplateBody_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTemplateBody_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBody_Context templateBody_() throws RecognitionException {
		TemplateBody_Context _localctx = new TemplateBody_Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_templateBody_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1880);
				selfType();
				}
				break;
			}
			setState(1883);
			templateStat();
			{
			setState(1884);
			match(T__11);
			setState(1885);
			templateStat();
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
	public static class WithTemplateBodyContext extends ParserRuleContext {
		public TemplateBody_Context templateBody_() {
			return getRuleContext(TemplateBody_Context.class,0);
		}
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public WithTemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withTemplateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterWithTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitWithTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitWithTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithTemplateBodyContext withTemplateBody() throws RecognitionException {
		WithTemplateBodyContext _localctx = new WithTemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_withTemplateBody);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				match(T__15);
				setState(1888);
				templateBody_();
				setState(1889);
				match(T__16);
				}
				break;
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1891);
				match(INDENT);
				setState(1892);
				templateBody_();
				setState(1893);
				match(OUTDENT);
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
	public static class TemplateBodyContext extends ParserRuleContext {
		public TemplateBody_Context templateBody_() {
			return getRuleContext(TemplateBody_Context.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public TerminalNode COLON() { return getToken(Scala3ParserParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_templateBody);
		int _la;
		try {
			setState(1909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1897);
					match(T__12);
					}
				}

				setState(1900);
				match(T__15);
				setState(1901);
				templateBody_();
				setState(1902);
				match(T__16);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				match(COLON);
				setState(1905);
				match(INDENT);
				setState(1906);
				templateBody_();
				setState(1907);
				match(OUTDENT);
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
	public static class TemplateStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EndMarkerContext endMarker() {
			return getRuleContext(EndMarkerContext.class,0);
		}
		public TemplateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTemplateStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTemplateStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTemplateStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatContext templateStat() throws RecognitionException {
		TemplateStatContext _localctx = new TemplateStatContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_templateStat);
		int _la;
		try {
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				export();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(1913);
					annotation();
					setState(1915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(1914);
						match(T__12);
						}
					}

					}
					}
					setState(1921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198083731457L) != 0) {
					{
					{
					setState(1922);
					modifier();
					}
					}
					setState(1927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1928);
				def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				extension();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1930);
				expr1();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1931);
				endMarker();
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
	public static class SelfTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public SelfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterSelfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitSelfType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitSelfType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfTypeContext selfType() throws RecognitionException {
		SelfTypeContext _localctx = new SelfTypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_selfType);
		int _la;
		try {
			setState(1945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				match(ID);
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1935);
					match(T__13);
					setState(1936);
					infixType();
					}
				}

				setState(1939);
				match(T__9);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				match(T__4);
				setState(1941);
				match(T__13);
				setState(1942);
				infixType();
				setState(1943);
				match(T__9);
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
	public static class EnumBody_Context extends ParserRuleContext {
		public List<EnumStatContext> enumStat() {
			return getRuleContexts(EnumStatContext.class);
		}
		public EnumStatContext enumStat(int i) {
			return getRuleContext(EnumStatContext.class,i);
		}
		public SelfTypeContext selfType() {
			return getRuleContext(SelfTypeContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public EnumBody_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumBody_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumBody_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumBody_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBody_Context enumBody_() throws RecognitionException {
		EnumBody_Context _localctx = new EnumBody_Context(_ctx, getState());
		enterRule(_localctx, 292, RULE_enumBody_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1947);
				selfType();
				}
				break;
			}
			setState(1950);
			enumStat();
			setState(1955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1951);
					match(T__11);
					setState(1952);
					enumStat();
					}
					} 
				}
				setState(1957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBody_Context enumBody_() {
			return getRuleContext(EnumBody_Context.class,0);
		}
		public TerminalNode NL() { return getToken(Scala3ParserParser.NL, 0); }
		public TerminalNode COLON() { return getToken(Scala3ParserParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_enumBody);
		int _la;
		try {
			setState(1967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__11:
			case T__12:
			case T__15:
			case T__18:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__30:
			case T__32:
			case T__33:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__41:
			case T__42:
			case T__44:
			case T__46:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case InterpolatedStringLiteral:
			case ID:
			case INDENT:
			case QUOTEID:
			case SPLICEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1958);
					match(T__12);
					}
				}

				setState(1961);
				enumBody_();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				match(COLON);
				setState(1963);
				match(INDENT);
				setState(1964);
				enumBody_();
				setState(1965);
				match(OUTDENT);
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
	public static class EnumStatContext extends ParserRuleContext {
		public TemplateStatContext templateStat() {
			return getRuleContext(TemplateStatContext.class,0);
		}
		public EnumCaseContext enumCase() {
			return getRuleContext(EnumCaseContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public EnumStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumStatContext enumStat() throws RecognitionException {
		EnumStatContext _localctx = new EnumStatContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumStat);
		int _la;
		try {
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969);
				templateStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(1970);
					annotation();
					setState(1972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(1971);
						match(T__12);
						}
					}

					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198083731457L) != 0) {
					{
					{
					setState(1979);
					modifier();
					}
					}
					setState(1984);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1985);
				enumCase();
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
	public static class EnumCaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Scala3ParserParser.ID, 0); }
		public ClassConstrContext classConstr() {
			return getRuleContext(ClassConstrContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ConstrAppsContext constrApps() {
			return getRuleContext(ConstrAppsContext.class,0);
		}
		public EnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitEnumCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitEnumCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumCaseContext enumCase() throws RecognitionException {
		EnumCaseContext _localctx = new EnumCaseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(T__46);
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1989);
				match(ID);
				setState(1990);
				classConstr();
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(1991);
					match(T__75);
					setState(1992);
					constrApps();
					}
				}

				}
				break;
			case 2:
				{
				setState(1995);
				ids();
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
	public static class TopStatsContext extends ParserRuleContext {
		public List<TopStatContext> topStat() {
			return getRuleContexts(TopStatContext.class);
		}
		public TopStatContext topStat(int i) {
			return getRuleContext(TopStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public TopStatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTopStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTopStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTopStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatsContext topStats() throws RecognitionException {
		TopStatsContext _localctx = new TopStatsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_topStats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			topStat();
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1999);
				match(T__11);
				setState(2000);
				topStat();
				}
				}
				setState(2005);
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
	public static class TopStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public PackagingContext packaging() {
			return getRuleContext(PackagingContext.class,0);
		}
		public PackageObjectContext packageObject() {
			return getRuleContext(PackageObjectContext.class,0);
		}
		public EndMarkerContext endMarker() {
			return getRuleContext(EndMarkerContext.class,0);
		}
		public TopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterTopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitTopStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitTopStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatContext topStat() throws RecognitionException {
		TopStatContext _localctx = new TopStatContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_topStat);
		int _la;
		try {
			setState(2028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2006);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
				export();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(2008);
					annotation();
					setState(2010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(2009);
						match(T__12);
						}
					}

					}
					}
					setState(2016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2198083731457L) != 0) {
					{
					{
					setState(2017);
					modifier();
					}
					}
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2023);
				def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2024);
				extension();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2025);
				packaging();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2026);
				packageObject();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2027);
				endMarker();
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
	public static class PackagingContext extends ParserRuleContext {
		public QualIdContext qualId() {
			return getRuleContext(QualIdContext.class,0);
		}
		public TopStatsContext topStats() {
			return getRuleContext(TopStatsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Scala3ParserParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(Scala3ParserParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(Scala3ParserParser.OUTDENT, 0); }
		public List<TerminalNode> NL() { return getTokens(Scala3ParserParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Scala3ParserParser.NL, i);
		}
		public PackagingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packaging; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPackaging(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPackaging(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPackaging(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagingContext packaging() throws RecognitionException {
		PackagingContext _localctx = new PackagingContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_packaging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			match(T__77);
			setState(2031);
			qualId();
			setState(2033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2032);
				match(T__12);
				}
				break;
			}
			setState(2047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
				{
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(2035);
					match(T__12);
					}
				}

				setState(2038);
				match(T__15);
				setState(2039);
				topStats();
				setState(2040);
				match(T__16);
				}
				break;
			case COLON:
				{
				setState(2042);
				match(COLON);
				setState(2043);
				match(INDENT);
				setState(2044);
				topStats();
				setState(2045);
				match(OUTDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PackageObjectContext extends ParserRuleContext {
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public PackageObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterPackageObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitPackageObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitPackageObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageObjectContext packageObject() throws RecognitionException {
		PackageObjectContext _localctx = new PackageObjectContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_packageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(T__77);
			setState(2050);
			match(T__73);
			setState(2051);
			objectDef();
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
	public static class CompilationUnitContext extends ParserRuleContext {
		public TopStatsContext topStats() {
			return getRuleContext(TopStatsContext.class,0);
		}
		public List<QualIdContext> qualId() {
			return getRuleContexts(QualIdContext.class);
		}
		public QualIdContext qualId(int i) {
			return getRuleContext(QualIdContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(Scala3ParserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(Scala3ParserParser.Semi, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Scala3ParserListener ) ((Scala3ParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Scala3ParserVisitor ) return ((Scala3ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_compilationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2053);
					match(T__77);
					setState(2054);
					qualId();
					setState(2055);
					match(T__11);
					}
					} 
				}
				setState(2061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			setState(2062);
			topStats();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return simpleType1_sempred((SimpleType1Context)_localctx, predIndex);
		case 17:
			return singleton_sempred((SingletonContext)_localctx, predIndex);
		case 35:
			return infixExpr_sempred((InfixExprContext)_localctx, predIndex);
		case 39:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		case 71:
			return simplePattern1_sempred((SimplePattern1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleType1_sempred(SimpleType1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean singleton_sempred(SingletonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean infixExpr_sempred(InfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simplePattern1_sempred(SimplePattern1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001W\u0811\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080"+
		"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083"+
		"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086"+
		"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089"+
		"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c"+
		"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f"+
		"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092"+
		"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095"+
		"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098"+
		"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0001\u0000\u0003\u0000"+
		"\u0138\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u013c\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0142\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0148\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u014d\b\u0002\n\u0002\f\u0002"+
		"\u0150\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0155\b"+
		"\u0003\n\u0003\f\u0003\u0158\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u015d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0162\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0166\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u016a\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u017b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0185"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u018a\b\b\u0001\b\u0001\b\u0003"+
		"\b\u018e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0194\b\t\n\t\f\t"+
		"\u0197\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a9\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u01ae\b\f\u0001\f\u0005\f\u01b1\b\f\n\f\f\f\u01b4"+
		"\t\f\u0001\r\u0001\r\u0003\r\u01b8\b\r\u0001\r\u0005\r\u01bb\b\r\n\r\f"+
		"\r\u01be\t\r\u0001\u000e\u0001\u000e\u0005\u000e\u01c2\b\u000e\n\u000e"+
		"\f\u000e\u01c5\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u01cb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01dd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u01e4\b\u0010\n\u0010\f\u0010\u01e7\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01ec\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u01f1\b\u0011\n\u0011\f\u0011\u01f4\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01f9\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u01fe\b\u0013\n\u0013\f\u0013\u0201"+
		"\t\u0013\u0001\u0014\u0003\u0014\u0204\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u020a\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u0211\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0215\b\u0017\u0005\u0017\u0217\b\u0017\n\u0017"+
		"\f\u0017\u021a\t\u0017\u0001\u0018\u0003\u0018\u021d\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0228\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u022c\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0230\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0235\b\u001a\n"+
		"\u001a\f\u001a\u0238\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u023d\b\u001b\n\u001b\f\u001b\u0240\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u024b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0256\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u025b\b\u001e\u0001\u001f\u0003\u001f\u025e\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0265\b\u001f\n"+
		"\u001f\f\u001f\u0268\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u026c"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0270\b\u001f\u0001\u001f"+
		"\u0003\u001f\u0273\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u027a\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u027e\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0285\b\u001f\n\u001f\f\u001f\u0288\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0296"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u029c"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02a2"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02a8"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02b9\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02bf\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u02c6\b \n \f \u02c9\t \u0003 \u02cb"+
		"\b \u0001!\u0001!\u0001!\u0003!\u02d0\b!\u0001\"\u0001\"\u0003\"\u02d4"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02dc\b#\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u02e4\b#\n#\f#\u02e7\t#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02f2"+
		"\b$\u0001%\u0003%\u02f5\b%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u0307\b\'\n\'\f\'\u030a\t\'\u0001\'\u0003\'\u030d\b"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0315\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0323\b\'\n\'\f\'\u0326\t\'\u0001(\u0001(\u0003"+
		"(\u032a\b(\u0001(\u0001(\u0001(\u0003(\u032f\b(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0339\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0345\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0352\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u035f\b,\u0001-\u0001-\u0001-\u0005-\u0364\b-\n"+
		"-\f-\u0367\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u036e\b.\u0001"+
		"/\u0001/\u0003/\u0372\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u037e\b/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0384\b/\u00010\u00010\u00030\u0388\b0\u00011\u00011\u00031\u038c\b"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0396"+
		"\b2\u00013\u00013\u00013\u00053\u039b\b3\n3\f3\u039e\t3\u00013\u00033"+
		"\u03a1\b3\u00014\u00014\u00014\u00054\u03a6\b4\n4\f4\u03a9\t4\u00054\u03ab"+
		"\b4\n4\f4\u03ae\t4\u00014\u00034\u03b1\b4\u00014\u00014\u00014\u00014"+
		"\u00034\u03b7\b4\u00015\u00015\u00015\u00055\u03bc\b5\n5\f5\u03bf\t5\u0001"+
		"5\u00015\u00016\u00016\u00056\u03c5\b6\n6\f6\u03c8\t6\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00057\u03d1\b7\n7\f7\u03d4\t7\u00017\u0003"+
		"7\u03d7\b7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00057\u03e0"+
		"\b7\n7\f7\u03e3\t7\u00017\u00037\u03e6\b7\u00017\u00017\u00017\u00017"+
		"\u00017\u00017\u00017\u00037\u03ef\b7\u00018\u00058\u03f2\b8\n8\f8\u03f5"+
		"\t8\u00018\u00018\u00038\u03f9\b8\u00019\u00019\u00019\u00019\u00059\u03ff"+
		"\b9\n9\f9\u0402\t9\u0001:\u0001:\u0001:\u0005:\u0407\b:\n:\f:\u040a\t"+
		":\u0001:\u0001:\u0001:\u0001:\u0003:\u0410\b:\u0001;\u0003;\u0413\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0005=\u041e"+
		"\b=\n=\f=\u0421\t=\u0001>\u0001>\u0001>\u0003>\u0426\b>\u0001>\u0001>"+
		"\u0001>\u0001?\u0001?\u0001?\u0003?\u042e\b?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0005@\u0435\b@\n@\f@\u0438\t@\u0001A\u0001A\u0001A\u0003A\u043d"+
		"\bA\u0001A\u0001A\u0001A\u0003A\u0442\bA\u0001B\u0001B\u0001B\u0005B\u0447"+
		"\bB\nB\fB\u044a\tB\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0451\bC"+
		"\u0001C\u0001C\u0001C\u0001C\u0003C\u0457\bC\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u045d\bC\u0001D\u0001D\u0003D\u0461\bD\u0001D\u0001D\u0001E\u0001"+
		"E\u0001E\u0003E\u0468\bE\u0001E\u0005E\u046b\bE\nE\fE\u046e\tE\u0001F"+
		"\u0001F\u0001F\u0001F\u0003F\u0474\bF\u0001F\u0001F\u0001F\u0001F\u0003"+
		"F\u047a\bF\u0001F\u0003F\u047d\bF\u0001F\u0001F\u0003F\u0481\bF\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u0489\bG\nG\fG\u048c\tG\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0005I\u0493\bI\nI\fI\u0496\tI\u0001J\u0001"+
		"J\u0003J\u049a\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u04a1\bJ\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u04a7\bJ\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u04ad\bK\nK\fK\u04b0\tK\u0001K\u0001K\u0001L\u0005L\u04b5\bL\nL\fL\u04b8"+
		"\tL\u0001L\u0003L\u04bb\bL\u0001L\u0001L\u0003L\u04bf\bL\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0001M\u0005M\u04c7\bM\nM\fM\u04ca\tM\u0001M\u0001"+
		"M\u0001N\u0005N\u04cf\bN\nN\fN\u04d2\tN\u0001N\u0001N\u0003N\u04d6\bN"+
		"\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0005O\u04de\bO\nO\fO\u04e1"+
		"\tO\u0001O\u0001O\u0001P\u0005P\u04e6\bP\nP\fP\u04e9\tP\u0001P\u0003P"+
		"\u04ec\bP\u0001P\u0001P\u0003P\u04f0\bP\u0001P\u0003P\u04f3\bP\u0001P"+
		"\u0001P\u0001Q\u0005Q\u04f8\bQ\nQ\fQ\u04fb\tQ\u0001Q\u0003Q\u04fe\bQ\u0001"+
		"Q\u0001Q\u0003Q\u0502\bQ\u0001Q\u0001Q\u0001Q\u0003Q\u0507\bQ\u0001R\u0003"+
		"R\u050a\bR\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0511\bR\u0001R\u0001"+
		"R\u0001R\u0001R\u0003R\u0517\bR\u0001R\u0001R\u0003R\u051b\bR\u0001S\u0001"+
		"S\u0001S\u0005S\u0520\bS\nS\fS\u0523\tS\u0001T\u0005T\u0526\bT\nT\fT\u0529"+
		"\tT\u0001T\u0005T\u052c\bT\nT\fT\u052f\tT\u0001T\u0003T\u0532\bT\u0001"+
		"T\u0001T\u0001U\u0001U\u0005U\u0538\bU\nU\fU\u053b\tU\u0001V\u0001V\u0001"+
		"V\u0003V\u0540\bV\u0001W\u0001W\u0005W\u0544\bW\nW\fW\u0547\tW\u0001X"+
		"\u0001X\u0003X\u054b\bX\u0001Y\u0003Y\u054e\bY\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0005Y\u0554\bY\nY\fY\u0557\tY\u0001Y\u0001Y\u0001Z\u0005Z\u055c\bZ"+
		"\nZ\fZ\u055f\tZ\u0001Z\u0001Z\u0003Z\u0563\bZ\u0001Z\u0001Z\u0001[\u0003"+
		"[\u0568\b[\u0001[\u0001[\u0003[\u056c\b[\u0001[\u0001[\u0001\\\u0003\\"+
		"\u0571\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u0577\b\\\u0001\\\u0001"+
		"\\\u0001]\u0003]\u057c\b]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001^\u0001"+
		"^\u0001^\u0005^\u0586\b^\n^\f^\u0589\t^\u0001_\u0005_\u058c\b_\n_\f_\u058f"+
		"\t_\u0001_\u0003_\u0592\b_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0003`\u059b\b`\u0001a\u0001a\u0001a\u0001a\u0005a\u05a1\ba\na\fa\u05a4"+
		"\ta\u0003a\u05a6\ba\u0001a\u0001a\u0001b\u0001b\u0001b\u0003b\u05ad\b"+
		"b\u0001c\u0001c\u0001c\u0001c\u0003c\u05b3\bc\u0001d\u0001d\u0001e\u0001"+
		"e\u0003e\u05b9\be\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0005"+
		"g\u05c2\bg\ng\fg\u05c5\tg\u0001h\u0001h\u0001h\u0001h\u0005h\u05cb\bh"+
		"\nh\fh\u05ce\th\u0001i\u0001i\u0001i\u0001i\u0005i\u05d4\bi\ni\fi\u05d7"+
		"\ti\u0001j\u0001j\u0001j\u0005j\u05dc\bj\nj\fj\u05df\tj\u0001j\u0001j"+
		"\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u05e8\bj\u0001k\u0001k\u0001"+
		"k\u0001k\u0001k\u0001k\u0003k\u05f0\bk\u0001l\u0001l\u0001l\u0003l\u05f5"+
		"\bl\u0001m\u0001m\u0001m\u0003m\u05fa\bm\u0003m\u05fc\bm\u0001n\u0001"+
		"n\u0001n\u0003n\u0601\bn\u0001n\u0001n\u0001n\u0005n\u0606\bn\nn\fn\u0609"+
		"\tn\u0003n\u060b\bn\u0001o\u0001o\u0001o\u0001p\u0001p\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0005q\u0618\bq\nq\fq\u061b\tq\u0001q\u0003q\u061e"+
		"\bq\u0001r\u0001r\u0001r\u0001r\u0001s\u0001s\u0001s\u0001s\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0005t\u0630\bt\nt\ft\u0633"+
		"\tt\u0001t\u0001t\u0003t\u0637\bt\u0001u\u0001u\u0001u\u0003u\u063c\b"+
		"u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0003u\u0644\bu\u0001u\u0001"+
		"u\u0001u\u0003u\u0649\bu\u0001v\u0001v\u0001v\u0003v\u064e\bv\u0001v\u0001"+
		"v\u0001v\u0001v\u0001v\u0001v\u0003v\u0656\bv\u0001v\u0001v\u0001v\u0003"+
		"v\u065b\bv\u0001w\u0001w\u0003w\u065f\bw\u0001w\u0003w\u0662\bw\u0001"+
		"x\u0001x\u0003x\u0666\bx\u0001x\u0005x\u0669\bx\nx\fx\u066c\tx\u0001x"+
		"\u0001x\u0001x\u0003x\u0671\bx\u0001y\u0003y\u0674\by\u0001y\u0001y\u0003"+
		"y\u0678\by\u0001y\u0001y\u0003y\u067c\by\u0001y\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0003y\u0684\by\u0001z\u0001z\u0001z\u0003z\u0689\bz\u0001{\u0003"+
		"{\u068c\b{\u0001{\u0003{\u068f\b{\u0001{\u0001{\u0001|\u0005|\u0694\b"+
		"|\n|\f|\u0697\t|\u0001|\u0003|\u069a\b|\u0001}\u0001}\u0003}\u069e\b}"+
		"\u0001~\u0001~\u0001~\u0001~\u0001~\u0001\u007f\u0003\u007f\u06a6\b\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u06ab\b\u007f\u0001\u007f"+
		"\u0003\u007f\u06ae\b\u007f\u0001\u0080\u0003\u0080\u06b1\b\u0080\u0001"+
		"\u0080\u0003\u0080\u06b4\b\u0080\u0001\u0080\u0005\u0080\u06b7\b\u0080"+
		"\n\u0080\f\u0080\u06ba\t\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001"+
		"\u0081\u0001\u0081\u0005\u0081\u06c1\b\u0081\n\u0081\f\u0081\u06c4\t\u0081"+
		"\u0001\u0081\u0001\u0081\u0003\u0081\u06c8\b\u0081\u0001\u0082\u0001\u0082"+
		"\u0003\u0082\u06cc\b\u0082\u0001\u0082\u0005\u0082\u06cf\b\u0082\n\u0082"+
		"\f\u0082\u06d2\t\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0005\u0082\u06d8\b\u0082\n\u0082\f\u0082\u06db\t\u0082\u0001\u0082\u0001"+
		"\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0005\u0083\u06e2\b\u0083\n"+
		"\u0083\f\u0083\u06e5\t\u0083\u0001\u0084\u0001\u0084\u0003\u0084\u06e9"+
		"\b\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u06f3\b\u0084\u0003\u0084\u06f5"+
		"\b\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u06f9\b\u0085\u0005\u0085"+
		"\u06fb\b\u0085\n\u0085\f\u0085\u06fe\t\u0085\u0001\u0085\u0005\u0085\u0701"+
		"\b\u0085\n\u0085\f\u0085\u0704\t\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0003\u0085\u0709\b\u0085\u0001\u0086\u0001\u0086\u0003\u0086\u070d\b"+
		"\u0086\u0001\u0087\u0001\u0087\u0003\u0087\u0711\b\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u0717\b\u0087\n\u0087\f\u0087"+
		"\u071a\t\u0087\u0003\u0087\u071c\b\u0087\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0005\u0088\u0721\b\u0088\n\u0088\f\u0088\u0724\t\u0088\u0001\u0088"+
		"\u0001\u0088\u0005\u0088\u0728\b\u0088\n\u0088\f\u0088\u072b\t\u0088\u0003"+
		"\u0088\u072d\b\u0088\u0001\u0089\u0001\u0089\u0005\u0089\u0731\b\u0089"+
		"\n\u0089\f\u0089\u0734\t\u0089\u0001\u0089\u0005\u0089\u0737\b\u0089\n"+
		"\u0089\f\u0089\u073a\t\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0005"+
		"\u008a\u073f\b\u008a\n\u008a\f\u008a\u0742\t\u008a\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0003\u008b\u074d\b\u008b\u0003\u008b\u074f\b\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0005\u008c\u0754\b\u008c\n\u008c\f\u008c"+
		"\u0757\t\u008c\u0001\u008d\u0003\u008d\u075a\b\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0003\u008e\u0768"+
		"\b\u008e\u0001\u008f\u0003\u008f\u076b\b\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0003\u008f\u0776\b\u008f\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0090\u0003\u0090\u077c\b\u0090\u0005\u0090\u077e\b\u0090\n\u0090"+
		"\f\u0090\u0781\t\u0090\u0001\u0090\u0005\u0090\u0784\b\u0090\n\u0090\f"+
		"\u0090\u0787\t\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0003"+
		"\u0090\u078d\b\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u0792"+
		"\b\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001"+
		"\u0091\u0003\u0091\u079a\b\u0091\u0001\u0092\u0003\u0092\u079d\b\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0005\u0092\u07a2\b\u0092\n\u0092"+
		"\f\u0092\u07a5\t\u0092\u0001\u0093\u0003\u0093\u07a8\b\u0093\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093"+
		"\u07b0\b\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u07b5\b"+
		"\u0094\u0005\u0094\u07b7\b\u0094\n\u0094\f\u0094\u07ba\t\u0094\u0001\u0094"+
		"\u0005\u0094\u07bd\b\u0094\n\u0094\f\u0094\u07c0\t\u0094\u0001\u0094\u0003"+
		"\u0094\u07c3\b\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001"+
		"\u0095\u0003\u0095\u07ca\b\u0095\u0001\u0095\u0003\u0095\u07cd\b\u0095"+
		"\u0001\u0096\u0001\u0096\u0001\u0096\u0005\u0096\u07d2\b\u0096\n\u0096"+
		"\f\u0096\u07d5\t\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0003\u0097\u07db\b\u0097\u0005\u0097\u07dd\b\u0097\n\u0097\f\u0097\u07e0"+
		"\t\u0097\u0001\u0097\u0005\u0097\u07e3\b\u0097\n\u0097\f\u0097\u07e6\t"+
		"\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0003"+
		"\u0097\u07ed\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u07f2"+
		"\b\u0098\u0001\u0098\u0003\u0098\u07f5\b\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0003\u0098\u0800\b\u0098\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0005\u009a"+
		"\u080a\b\u009a\n\u009a\f\u009a\u080d\t\u009a\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0000\u0005 \"FN\u008e\u009b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0000\n\u0001\u0000\n\u000b\u0002\u0000\u0001\u0001%\'\u0002\u0000\u001e"+
		"\u001e..\u0002\u0000\u0018\u0018WW\u0002\u0000\u0001\u0001%%\u0001\u0000"+
		"56\u0002\u0000\u0018\u0018PP\u0003\u0000\u0019\u0019449?\u0001\u0000@"+
		"A\u000b\u0000\u0005\u0005\u000f\u000f\u001a\u001a\u001d\u001d\u001f\u001f"+
		"((--3355FFPP\u08cf\u0000\u0141\u0001\u0000\u0000\u0000\u0002\u0147\u0001"+
		"\u0000\u0000\u0000\u0004\u0149\u0001\u0000\u0000\u0000\u0006\u0151\u0001"+
		"\u0000\u0000\u0000\b\u0169\u0001\u0000\u0000\u0000\n\u016b\u0001\u0000"+
		"\u0000\u0000\f\u017a\u0001\u0000\u0000\u0000\u000e\u0184\u0001\u0000\u0000"+
		"\u0000\u0010\u018d\u0001\u0000\u0000\u0000\u0012\u018f\u0001\u0000\u0000"+
		"\u0000\u0014\u019a\u0001\u0000\u0000\u0000\u0016\u019e\u0001\u0000\u0000"+
		"\u0000\u0018\u01aa\u0001\u0000\u0000\u0000\u001a\u01b5\u0001\u0000\u0000"+
		"\u0000\u001c\u01bf\u0001\u0000\u0000\u0000\u001e\u01ca\u0001\u0000\u0000"+
		"\u0000 \u01dc\u0001\u0000\u0000\u0000\"\u01eb\u0001\u0000\u0000\u0000"+
		"$\u01f8\u0001\u0000\u0000\u0000&\u01fa\u0001\u0000\u0000\u0000(\u0203"+
		"\u0001\u0000\u0000\u0000*\u0207\u0001\u0000\u0000\u0000,\u020b\u0001\u0000"+
		"\u0000\u0000.\u0210\u0001\u0000\u0000\u00000\u0227\u0001\u0000\u0000\u0000"+
		"2\u022b\u0001\u0000\u0000\u00004\u0231\u0001\u0000\u0000\u00006\u0239"+
		"\u0001\u0000\u0000\u00008\u024a\u0001\u0000\u0000\u0000:\u0255\u0001\u0000"+
		"\u0000\u0000<\u025a\u0001\u0000\u0000\u0000>\u02be\u0001\u0000\u0000\u0000"+
		"@\u02ca\u0001\u0000\u0000\u0000B\u02cc\u0001\u0000\u0000\u0000D\u02d1"+
		"\u0001\u0000\u0000\u0000F\u02d5\u0001\u0000\u0000\u0000H\u02e8\u0001\u0000"+
		"\u0000\u0000J\u02f4\u0001\u0000\u0000\u0000L\u02f8\u0001\u0000\u0000\u0000"+
		"N\u0314\u0001\u0000\u0000\u0000P\u0327\u0001\u0000\u0000\u0000R\u0338"+
		"\u0001\u0000\u0000\u0000T\u0344\u0001\u0000\u0000\u0000V\u0351\u0001\u0000"+
		"\u0000\u0000X\u035e\u0001\u0000\u0000\u0000Z\u0360\u0001\u0000\u0000\u0000"+
		"\\\u036d\u0001\u0000\u0000\u0000^\u0383\u0001\u0000\u0000\u0000`\u0387"+
		"\u0001\u0000\u0000\u0000b\u038b\u0001\u0000\u0000\u0000d\u0395\u0001\u0000"+
		"\u0000\u0000f\u039c\u0001\u0000\u0000\u0000h\u03b6\u0001\u0000\u0000\u0000"+
		"j\u03bd\u0001\u0000\u0000\u0000l\u03c2\u0001\u0000\u0000\u0000n\u03ee"+
		"\u0001\u0000\u0000\u0000p\u03f3\u0001\u0000\u0000\u0000r\u03fa\u0001\u0000"+
		"\u0000\u0000t\u040f\u0001\u0000\u0000\u0000v\u0412\u0001\u0000\u0000\u0000"+
		"x\u0418\u0001\u0000\u0000\u0000z\u041b\u0001\u0000\u0000\u0000|\u0422"+
		"\u0001\u0000\u0000\u0000~\u042a\u0001\u0000\u0000\u0000\u0080\u0432\u0001"+
		"\u0000\u0000\u0000\u0082\u0439\u0001\u0000\u0000\u0000\u0084\u0443\u0001"+
		"\u0000\u0000\u0000\u0086\u045c\u0001\u0000\u0000\u0000\u0088\u0460\u0001"+
		"\u0000\u0000\u0000\u008a\u0464\u0001\u0000\u0000\u0000\u008c\u0480\u0001"+
		"\u0000\u0000\u0000\u008e\u0482\u0001\u0000\u0000\u0000\u0090\u048d\u0001"+
		"\u0000\u0000\u0000\u0092\u048f\u0001\u0000\u0000\u0000\u0094\u04a6\u0001"+
		"\u0000\u0000\u0000\u0096\u04a8\u0001\u0000\u0000\u0000\u0098\u04b6\u0001"+
		"\u0000\u0000\u0000\u009a\u04c2\u0001\u0000\u0000\u0000\u009c\u04d0\u0001"+
		"\u0000\u0000\u0000\u009e\u04d9\u0001\u0000\u0000\u0000\u00a0\u04e7\u0001"+
		"\u0000\u0000\u0000\u00a2\u04f9\u0001\u0000\u0000\u0000\u00a4\u051a\u0001"+
		"\u0000\u0000\u0000\u00a6\u051c\u0001\u0000\u0000\u0000\u00a8\u0527\u0001"+
		"\u0000\u0000\u0000\u00aa\u0535\u0001\u0000\u0000\u0000\u00ac\u053f\u0001"+
		"\u0000\u0000\u0000\u00ae\u0541\u0001\u0000\u0000\u0000\u00b0\u054a\u0001"+
		"\u0000\u0000\u0000\u00b2\u054d\u0001\u0000\u0000\u0000\u00b4\u055d\u0001"+
		"\u0000\u0000\u0000\u00b6\u0567\u0001\u0000\u0000\u0000\u00b8\u0570\u0001"+
		"\u0000\u0000\u0000\u00ba\u057b\u0001\u0000\u0000\u0000\u00bc\u0582\u0001"+
		"\u0000\u0000\u0000\u00be\u058d\u0001\u0000\u0000\u0000\u00c0\u0595\u0001"+
		"\u0000\u0000\u0000\u00c2\u059c\u0001\u0000\u0000\u0000\u00c4\u05a9\u0001"+
		"\u0000\u0000\u0000\u00c6\u05b2\u0001\u0000\u0000\u0000\u00c8\u05b4\u0001"+
		"\u0000\u0000\u0000\u00ca\u05b6\u0001\u0000\u0000\u0000\u00cc\u05ba\u0001"+
		"\u0000\u0000\u0000\u00ce\u05be\u0001\u0000\u0000\u0000\u00d0\u05c6\u0001"+
		"\u0000\u0000\u0000\u00d2\u05cf\u0001\u0000\u0000\u0000\u00d4\u05e7\u0001"+
		"\u0000\u0000\u0000\u00d6\u05ef\u0001\u0000\u0000\u0000\u00d8\u05f1\u0001"+
		"\u0000\u0000\u0000\u00da\u05fb\u0001\u0000\u0000\u0000\u00dc\u060a\u0001"+
		"\u0000\u0000\u0000\u00de\u060c\u0001\u0000\u0000\u0000\u00e0\u060f\u0001"+
		"\u0000\u0000\u0000\u00e2\u061d\u0001\u0000\u0000\u0000\u00e4\u061f\u0001"+
		"\u0000\u0000\u0000\u00e6\u0623\u0001\u0000\u0000\u0000\u00e8\u0636\u0001"+
		"\u0000\u0000\u0000\u00ea\u0648\u0001\u0000\u0000\u0000\u00ec\u065a\u0001"+
		"\u0000\u0000\u0000\u00ee\u065c\u0001\u0000\u0000\u0000\u00f0\u0663\u0001"+
		"\u0000\u0000\u0000\u00f2\u0683\u0001\u0000\u0000\u0000\u00f4\u0685\u0001"+
		"\u0000\u0000\u0000\u00f6\u068b\u0001\u0000\u0000\u0000\u00f8\u0695\u0001"+
		"\u0000\u0000\u0000\u00fa\u069b\u0001\u0000\u0000\u0000\u00fc\u069f\u0001"+
		"\u0000\u0000\u0000\u00fe\u06a5\u0001\u0000\u0000\u0000\u0100\u06b0\u0001"+
		"\u0000\u0000\u0000\u0102\u06bd\u0001\u0000\u0000\u0000\u0104\u06c9\u0001"+
		"\u0000\u0000\u0000\u0106\u06de\u0001\u0000\u0000\u0000\u0108\u06f4\u0001"+
		"\u0000\u0000\u0000\u010a\u0708\u0001\u0000\u0000\u0000\u010c\u070a\u0001"+
		"\u0000\u0000\u0000\u010e\u0710\u0001\u0000\u0000\u0000\u0110\u071d\u0001"+
		"\u0000\u0000\u0000\u0112\u072e\u0001\u0000\u0000\u0000\u0114\u073b\u0001"+
		"\u0000\u0000\u0000\u0116\u074e\u0001\u0000\u0000\u0000\u0118\u0750\u0001"+
		"\u0000\u0000\u0000\u011a\u0759\u0001\u0000\u0000\u0000\u011c\u0767\u0001"+
		"\u0000\u0000\u0000\u011e\u0775\u0001\u0000\u0000\u0000\u0120\u078c\u0001"+
		"\u0000\u0000\u0000\u0122\u0799\u0001\u0000\u0000\u0000\u0124\u079c\u0001"+
		"\u0000\u0000\u0000\u0126\u07af\u0001\u0000\u0000\u0000\u0128\u07c2\u0001"+
		"\u0000\u0000\u0000\u012a\u07c4\u0001\u0000\u0000\u0000\u012c\u07ce\u0001"+
		"\u0000\u0000\u0000\u012e\u07ec\u0001\u0000\u0000\u0000\u0130\u07ee\u0001"+
		"\u0000\u0000\u0000\u0132\u0801\u0001\u0000\u0000\u0000\u0134\u080b\u0001"+
		"\u0000\u0000\u0000\u0136\u0138\u0005\u0001\u0000\u0000\u0137\u0136\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u0142\u0005\u0005\u0000\u0000\u013a\u013c\u0005"+
		"\u0001\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0142\u0005"+
		"\u0007\u0000\u0000\u013e\u0142\u0005\u0002\u0000\u0000\u013f\u0142\u0005"+
		"\u0003\u0000\u0000\u0140\u0142\u0005\u0006\u0000\u0000\u0141\u0137\u0001"+
		"\u0000\u0000\u0000\u0141\u013b\u0001\u0000\u0000\u0000\u0141\u013e\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0001\u0001\u0000\u0000\u0000\u0143\u0148\u0003"+
		"\u0000\u0000\u0000\u0144\u0148\u0005O\u0000\u0000\u0145\u0148\u0005\u0004"+
		"\u0000\u0000\u0146\u0148\u0005\u0002\u0000\u0000\u0147\u0143\u0001\u0000"+
		"\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0003\u0001\u0000"+
		"\u0000\u0000\u0149\u014e\u0005P\u0000\u0000\u014a\u014b\u0005\u0003\u0000"+
		"\u0000\u014b\u014d\u0005P\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0005\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156\u0005P\u0000\u0000\u0152"+
		"\u0153\u0005\u0004\u0000\u0000\u0153\u0155\u0005P\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0007"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u016a"+
		"\u0005P\u0000\u0000\u015a\u015b\u0005P\u0000\u0000\u015b\u015d\u0005\u0003"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u016a\u0005\u0005"+
		"\u0000\u0000\u015f\u0160\u0005P\u0000\u0000\u0160\u0162\u0005\u0003\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0005\u0006\u0000"+
		"\u0000\u0164\u0166\u0003\n\u0005\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u016a\u0005P\u0000\u0000\u0169"+
		"\u0159\u0001\u0000\u0000\u0000\u0169\u015c\u0001\u0000\u0000\u0000\u0169"+
		"\u0161\u0001\u0000\u0000\u0000\u016a\t\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005\u0007\u0000\u0000\u016c\u016d\u0005P\u0000\u0000\u016d\u016e\u0005"+
		"\b\u0000\u0000\u016e\u000b\u0001\u0000\u0000\u0000\u016f\u017b\u0003\u000e"+
		"\u0007\u0000\u0170\u0171\u0003\u009eO\u0000\u0171\u0172\u0005\t\u0000"+
		"\u0000\u0172\u0173\u0003\f\u0006\u0000\u0173\u017b\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0003\u0012\t\u0000\u0175\u0176\u0005\t\u0000\u0000\u0176"+
		"\u0177\u0003\f\u0006\u0000\u0177\u017b\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0003\u0016\u000b\u0000\u0179\u017b\u0003\u0018\f\u0000\u017a\u016f\u0001"+
		"\u0000\u0000\u0000\u017a\u0170\u0001\u0000\u0000\u0000\u017a\u0174\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\r\u0001\u0000\u0000\u0000\u017c\u017d\u0003\u0010"+
		"\b\u0000\u017d\u017e\u0007\u0000\u0000\u0000\u017e\u017f\u0003\f\u0006"+
		"\u0000\u017f\u0185\u0001\u0000\u0000\u0000\u0180\u0181\u0003\u009eO\u0000"+
		"\u0181\u0182\u0005\n\u0000\u0000\u0182\u0183\u0003\f\u0006\u0000\u0183"+
		"\u0185\u0001\u0000\u0000\u0000\u0184\u017c\u0001\u0000\u0000\u0000\u0184"+
		"\u0180\u0001\u0000\u0000\u0000\u0185\u000f\u0001\u0000\u0000\u0000\u0186"+
		"\u018e\u0003\u0018\f\u0000\u0187\u0189\u0005\f\u0000\u0000\u0188\u018a"+
		"\u0003&\u0013\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018e\u0005"+
		"\r\u0000\u0000\u018c\u018e\u0003\u0012\t\u0000\u018d\u0186\u0001\u0000"+
		"\u0000\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u0011\u0001\u0000\u0000\u0000\u018f\u0190\u0005\f\u0000"+
		"\u0000\u0190\u0195\u0003\u0014\n\u0000\u0191\u0192\u0005\u0004\u0000\u0000"+
		"\u0192\u0194\u0003\u0014\n\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005\r\u0000\u0000\u0199\u0013"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0005P\u0000\u0000\u019b\u019c\u0005"+
		"\u000e\u0000\u0000\u019c\u019d\u0003\f\u0006\u0000\u019d\u0015\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0003\u0018\f\u0000\u019f\u01a8\u0005\u000f\u0000"+
		"\u0000\u01a0\u01a1\u0005\u0010\u0000\u0000\u01a1\u01a2\u0003\u0080@\u0000"+
		"\u01a2\u01a3\u0005\u0011\u0000\u0000\u01a3\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005Q\u0000\u0000\u01a5\u01a6\u0003\u0080@\u0000\u01a6\u01a7"+
		"\u0005R\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a9\u0017\u0001"+
		"\u0000\u0000\u0000\u01aa\u01b2\u0003\u001a\r\u0000\u01ab\u01ad\u0005P"+
		"\u0000\u0000\u01ac\u01ae\u0005\r\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0003\u001a\r\u0000\u01b0\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u0019\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01bc\u0003\u001c\u000e\u0000"+
		"\u01b6\u01b8\u0005\r\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bb\u00030\u0018\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01bb\u01be"+
		"\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u001b\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c3\u0003\u001e\u000f\u0000\u01c0\u01c2"+
		"\u0003\u00ceg\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u001d\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c6\u01cb\u0003\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0012\u0000\u0000\u01c8\u01cb\u00032\u0019\u0000\u01c9\u01cb\u0003 \u0010"+
		"\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u001f\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0006\u0010\uffff\uffff\u0000\u01cd\u01dd\u0005P\u0000"+
		"\u0000\u01ce\u01cf\u0003\"\u0011\u0000\u01cf\u01d0\u0005\u0003\u0000\u0000"+
		"\u01d0\u01d1\u0005P\u0000\u0000\u01d1\u01dd\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0003\"\u0011\u0000\u01d3\u01d4\u0005\u0003\u0000\u0000\u01d4\u01d5"+
		"\u0005\u0013\u0000\u0000\u01d5\u01dd\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0005\f\u0000\u0000\u01d7\u01d8\u00036\u001b\u0000\u01d8\u01d9\u0005"+
		"\r\u0000\u0000\u01d9\u01dd\u0001\u0000\u0000\u0000\u01da\u01dd\u00030"+
		"\u0018\u0000\u01db\u01dd\u0003X,\u0000\u01dc\u01cc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01ce\u0001\u0000\u0000\u0000\u01dc\u01d2\u0001\u0000\u0000\u0000"+
		"\u01dc\u01d6\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01e5\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\n\u0002\u0000\u0000\u01df\u01e4\u0003,\u0016\u0000\u01e0"+
		"\u01e1\n\u0001\u0000\u0000\u01e1\u01e2\u0005\u0014\u0000\u0000\u01e2\u01e4"+
		"\u0005P\u0000\u0000\u01e3\u01de\u0001\u0000\u0000\u0000\u01e3\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6!\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0006\u0011"+
		"\uffff\uffff\u0000\u01e9\u01ec\u0003\b\u0004\u0000\u01ea\u01ec\u0003\u0000"+
		"\u0000\u0000\u01eb\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01f2\u0001\u0000\u0000\u0000\u01ed\u01ee\n\u0001\u0000"+
		"\u0000\u01ee\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f1\u0005P\u0000\u0000"+
		"\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3#\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f9\u0003\f\u0006\u0000\u01f6\u01f7\u0005\n\u0000\u0000\u01f7\u01f9"+
		"\u0003\f\u0006\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f9%\u0001\u0000\u0000\u0000\u01fa\u01ff\u0003$\u0012"+
		"\u0000\u01fb\u01fc\u0005\u0004\u0000\u0000\u01fc\u01fe\u0003$\u0012\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\'\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u0005\n\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0003*\u0015\u0000\u0206)\u0001\u0000\u0000\u0000\u0207\u0209\u0003\f"+
		"\u0006\u0000\u0208\u020a\u0005\u0015\u0000\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a+\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0005\u0007\u0000\u0000\u020c\u020d\u00036\u001b\u0000"+
		"\u020d\u020e\u0005\b\u0000\u0000\u020e-\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0003\u00e2q\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0218\u0001\u0000\u0000\u0000\u0212\u0214"+
		"\u0005\f\u0000\u0000\u0213\u0215\u0003\u00e2q\u0000\u0214\u0213\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001"+
		"\u0000\u0000\u0000\u0216\u0212\u0001\u0000\u0000\u0000\u0217\u021a\u0001"+
		"\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219/\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021b\u021d\u0005\r\u0000\u0000\u021c\u021b\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0005\u0010\u0000\u0000\u021f\u0220\u0003.\u0017\u0000"+
		"\u0220\u0221\u0005\u0011\u0000\u0000\u0221\u0228\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0005S\u0000\u0000\u0223\u0224\u0005Q\u0000\u0000\u0224\u0225"+
		"\u0003.\u0017\u0000\u0225\u0226\u0005R\u0000\u0000\u0226\u0228\u0001\u0000"+
		"\u0000\u0000\u0227\u021c\u0001\u0000\u0000\u0000\u0227\u0222\u0001\u0000"+
		"\u0000\u0000\u02281\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0016\u0000"+
		"\u0000\u022a\u022c\u0003\f\u0006\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0005\u0017\u0000\u0000\u022e\u0230\u0003\f\u0006\u0000\u022f"+
		"\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230"+
		"3\u0001\u0000\u0000\u0000\u0231\u0236\u00032\u0019\u0000\u0232\u0233\u0005"+
		"\u000e\u0000\u0000\u0233\u0235\u0003\f\u0006\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u02375\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023e\u0003\f\u0006\u0000"+
		"\u023a\u023b\u0005\u0004\u0000\u0000\u023b\u023d\u0003\f\u0006\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e"+
		"\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f"+
		"7\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0003<\u001e\u0000\u0242\u0243\u0007\u0000\u0000\u0000\u0243\u0244\u0003"+
		"8\u001c\u0000\u0244\u024b\u0001\u0000\u0000\u0000\u0245\u0246\u0003\u009e"+
		"O\u0000\u0246\u0247\u0005\n\u0000\u0000\u0247\u0248\u00038\u001c\u0000"+
		"\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u024b\u0003>\u001f\u0000\u024a"+
		"\u0241\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000\u0000\u0000\u024a"+
		"\u0249\u0001\u0000\u0000\u0000\u024b9\u0001\u0000\u0000\u0000\u024c\u024d"+
		"\u0003<\u001e\u0000\u024d\u024e\u0007\u0000\u0000\u0000\u024e\u024f\u0003"+
		"f3\u0000\u024f\u0256\u0001\u0000\u0000\u0000\u0250\u0251\u0003\u009eO"+
		"\u0000\u0251\u0252\u0005\n\u0000\u0000\u0252\u0253\u0003f3\u0000\u0253"+
		"\u0256\u0001\u0000\u0000\u0000\u0254\u0256\u0003>\u001f\u0000\u0255\u024c"+
		"\u0001\u0000\u0000\u0000\u0255\u0250\u0001\u0000\u0000\u0000\u0255\u0254"+
		"\u0001\u0000\u0000\u0000\u0256;\u0001\u0000\u0000\u0000\u0257\u025b\u0003"+
		"\u00c2a\u0000\u0258\u025b\u0005P\u0000\u0000\u0259\u025b\u0005\u0018\u0000"+
		"\u0000\u025a\u0257\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000"+
		"\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025b=\u0001\u0000\u0000\u0000"+
		"\u025c\u025e\u0005\u0019\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0005\u001a\u0000\u0000\u0260\u0261\u0005\f\u0000\u0000\u0261"+
		"\u0262\u00038\u001c\u0000\u0262\u0266\u0005\r\u0000\u0000\u0263\u0265"+
		"\u0005\r\u0000\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0268\u0001"+
		"\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001"+
		"\u0000\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u026f\u00038\u001c\u0000\u026a\u026c\u0005\f"+
		"\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0005\u001b"+
		"\u0000\u0000\u026e\u0270\u00038\u001c\u0000\u026f\u026b\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u02bf\u0001\u0000\u0000"+
		"\u0000\u0271\u0273\u0005\u0019\u0000\u0000\u0272\u0271\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0005\u001a\u0000\u0000\u0275\u0276\u00038\u001c\u0000"+
		"\u0276\u0277\u0005\u001c\u0000\u0000\u0277\u027d\u00038\u001c\u0000\u0278"+
		"\u027a\u0005\f\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0005\u001b\u0000\u0000\u027c\u027e\u00038\u001c\u0000\u027d\u0279\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u02bf\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0005\u001d\u0000\u0000\u0280\u0281\u0005"+
		"\f\u0000\u0000\u0281\u0282\u00038\u001c\u0000\u0282\u0286\u0005\r\u0000"+
		"\u0000\u0283\u0285\u0005\r\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000"+
		"\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u00038\u001c\u0000\u028a"+
		"\u02bf\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u001d\u0000\u0000\u028c"+
		"\u028d\u00038\u001c\u0000\u028d\u028e\u0005\u001e\u0000\u0000\u028e\u028f"+
		"\u00038\u001c\u0000\u028f\u02bf\u0001\u0000\u0000\u0000\u0290\u0291\u0005"+
		"\u001f\u0000\u0000\u0291\u0292\u00038\u001c\u0000\u0292\u0295\u0003B!"+
		"\u0000\u0293\u0294\u0005 \u0000\u0000\u0294\u0296\u00038\u001c\u0000\u0295"+
		"\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296"+
		"\u02bf\u0001\u0000\u0000\u0000\u0297\u0298\u0005\u001f\u0000\u0000\u0298"+
		"\u029b\u00038\u001c\u0000\u0299\u029a\u0005 \u0000\u0000\u029a\u029c\u0003"+
		"8\u001c\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000"+
		"\u0000\u0000\u029c\u02bf\u0001\u0000\u0000\u0000\u029d\u029e\u0005!\u0000"+
		"\u0000\u029e\u02bf\u00038\u001c\u0000\u029f\u02a1\u0005\"\u0000\u0000"+
		"\u02a0\u02a2\u00038\u001c\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2\u02bf\u0001\u0000\u0000\u0000\u02a3"+
		"\u02bf\u0003n7\u0000\u02a4\u02a5\u0003N\'\u0000\u02a5\u02a6\u0005\u0003"+
		"\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0005P\u0000\u0000\u02aa\u02ab\u0005#\u0000\u0000"+
		"\u02ab\u02bf\u00038\u001c\u0000\u02ac\u02ad\u0003L&\u0000\u02ad\u02ae"+
		"\u0003N\'\u0000\u02ae\u02af\u0005#\u0000\u0000\u02af\u02b0\u00038\u001c"+
		"\u0000\u02b0\u02bf\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003N\'\u0000"+
		"\u02b2\u02b3\u0003`0\u0000\u02b3\u02b4\u0005#\u0000\u0000\u02b4\u02b5"+
		"\u00038\u001c\u0000\u02b5\u02bf\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003"+
		"D\"\u0000\u02b7\u02b9\u0003@ \u0000\u02b8\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bf\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0005\u0019\u0000\u0000\u02bb\u02bc\u0003F#\u0000\u02bc\u02bd"+
		"\u0003H$\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u025d\u0001\u0000"+
		"\u0000\u0000\u02be\u0272\u0001\u0000\u0000\u0000\u02be\u027f\u0001\u0000"+
		"\u0000\u0000\u02be\u028b\u0001\u0000\u0000\u0000\u02be\u0290\u0001\u0000"+
		"\u0000\u0000\u02be\u0297\u0001\u0000\u0000\u0000\u02be\u029d\u0001\u0000"+
		"\u0000\u0000\u02be\u029f\u0001\u0000\u0000\u0000\u02be\u02a3\u0001\u0000"+
		"\u0000\u0000\u02be\u02a7\u0001\u0000\u0000\u0000\u02be\u02ac\u0001\u0000"+
		"\u0000\u0000\u02be\u02b1\u0001\u0000\u0000\u0000\u02be\u02b6\u0001\u0000"+
		"\u0000\u0000\u02be\u02ba\u0001\u0000\u0000\u0000\u02bf?\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0005\u000e\u0000\u0000\u02c1\u02cb\u0003\u0018\f\u0000"+
		"\u02c2\u02c3\u0005\u000e\u0000\u0000\u02c3\u02c7\u0003\u00ceg\u0000\u02c4"+
		"\u02c6\u0003\u00ceg\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c9"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8"+
		"\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001\u0000\u0000\u0000\u02c9\u02c7"+
		"\u0001\u0000\u0000\u0000\u02ca\u02c0\u0001\u0000\u0000\u0000\u02ca\u02c2"+
		"\u0001\u0000\u0000\u0000\u02cbA\u0001\u0000\u0000\u0000\u02cc\u02cf\u0005"+
		"$\u0000\u0000\u02cd\u02d0\u00038\u001c\u0000\u02ce\u02d0\u0003~?\u0000"+
		"\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d0C\u0001\u0000\u0000\u0000\u02d1\u02d3\u0003F#\u0000\u02d2\u02d4"+
		"\u0005P\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d4E\u0001\u0000\u0000\u0000\u02d5\u02d6\u0006#\uffff"+
		"\uffff\u0000\u02d6\u02d7\u0003J%\u0000\u02d7\u02e5\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\n\u0003\u0000\u0000\u02d9\u02db\u0005P\u0000\u0000\u02da"+
		"\u02dc\u0005\r\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02e4"+
		"\u0003F#\u0004\u02de\u02df\n\u0002\u0000\u0000\u02df\u02e0\u0005P\u0000"+
		"\u0000\u02e0\u02e4\u0003P(\u0000\u02e1\u02e2\n\u0001\u0000\u0000\u02e2"+
		"\u02e4\u0003H$\u0000\u02e3\u02d8\u0001\u0000\u0000\u0000\u02e3\u02de\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e6G\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e8\u02f1\u0005\u000f\u0000\u0000\u02e9\u02ea\u0005\u0010"+
		"\u0000\u0000\u02ea\u02eb\u0003z=\u0000\u02eb\u02ec\u0005\u0011\u0000\u0000"+
		"\u02ec\u02f2\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005Q\u0000\u0000\u02ee"+
		"\u02ef\u0003z=\u0000\u02ef\u02f0\u0005R\u0000\u0000\u02f0\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f1\u02e9\u0001\u0000\u0000\u0000\u02f1\u02ed\u0001"+
		"\u0000\u0000\u0000\u02f2I\u0001\u0000\u0000\u0000\u02f3\u02f5\u0003L&"+
		"\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0003N\'\u0000"+
		"\u02f7K\u0001\u0000\u0000\u0000\u02f8\u02f9\u0007\u0001\u0000\u0000\u02f9"+
		"M\u0001\u0000\u0000\u0000\u02fa\u02fb\u0006\'\uffff\uffff\u0000\u02fb"+
		"\u0315\u0003\b\u0004\u0000\u02fc\u0315\u0003\u0002\u0001\u0000\u02fd\u0315"+
		"\u0005\u0018\u0000\u0000\u02fe\u0315\u0003d2\u0000\u02ff\u0315\u0003V"+
		"+\u0000\u0300\u0315\u0003T*\u0000\u0301\u0315\u0005T\u0000\u0000\u0302"+
		"\u0303\u0005(\u0000\u0000\u0303\u0308\u0003\u0112\u0089\u0000\u0304\u0305"+
		"\u0005)\u0000\u0000\u0305\u0307\u0003\u0112\u0089\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030c\u0001"+
		"\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030d\u0003"+
		"\u011e\u008f\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u0315\u0001\u0000\u0000\u0000\u030e\u030f\u0005"+
		"(\u0000\u0000\u030f\u0315\u0003\u011e\u008f\u0000\u0310\u0311\u0005\f"+
		"\u0000\u0000\u0311\u0312\u0003Z-\u0000\u0312\u0313\u0005\r\u0000\u0000"+
		"\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u02fa\u0001\u0000\u0000\u0000"+
		"\u0314\u02fc\u0001\u0000\u0000\u0000\u0314\u02fd\u0001\u0000\u0000\u0000"+
		"\u0314\u02fe\u0001\u0000\u0000\u0000\u0314\u02ff\u0001\u0000\u0000\u0000"+
		"\u0314\u0300\u0001\u0000\u0000\u0000\u0314\u0301\u0001\u0000\u0000\u0000"+
		"\u0314\u0302\u0001\u0000\u0000\u0000\u0314\u030e\u0001\u0000\u0000\u0000"+
		"\u0314\u0310\u0001\u0000\u0000\u0000\u0315\u0324\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\n\u0005\u0000\u0000\u0317\u0318\u0005\u0003\u0000\u0000\u0318"+
		"\u0323\u0005P\u0000\u0000\u0319\u031a\n\u0004\u0000\u0000\u031a\u031b"+
		"\u0005\u0003\u0000\u0000\u031b\u0323\u0003H$\u0000\u031c\u031d\n\u0003"+
		"\u0000\u0000\u031d\u0323\u0003,\u0016\u0000\u031e\u031f\n\u0002\u0000"+
		"\u0000\u031f\u0323\u0003`0\u0000\u0320\u0321\n\u0001\u0000\u0000\u0321"+
		"\u0323\u0003P(\u0000\u0322\u0316\u0001\u0000\u0000\u0000\u0322\u0319\u0001"+
		"\u0000\u0000\u0000\u0322\u031c\u0001\u0000\u0000\u0000\u0322\u031e\u0001"+
		"\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0326\u0001"+
		"\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001"+
		"\u0000\u0000\u0000\u0325O\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000"+
		"\u0000\u0000\u0327\u0329\u0005S\u0000\u0000\u0328\u032a\u0005U\u0000\u0000"+
		"\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032e\u0005Q\u0000\u0000\u032c"+
		"\u032f\u0003z=\u0000\u032d\u032f\u0003f3\u0000\u032e\u032c\u0001\u0000"+
		"\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u0005R\u0000\u0000\u0331Q\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0003<\u001e\u0000\u0333\u0334\u0007\u0000\u0000\u0000\u0334"+
		"\u0339\u0001\u0000\u0000\u0000\u0335\u0336\u0003\u009eO\u0000\u0336\u0337"+
		"\u0005\n\u0000\u0000\u0337\u0339\u0001\u0000\u0000\u0000\u0338\u0332\u0001"+
		"\u0000\u0000\u0000\u0338\u0335\u0001\u0000\u0000\u0000\u0339S\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0005*\u0000\u0000\u033b\u033c\u0005\u0010\u0000"+
		"\u0000\u033c\u033d\u0003f3\u0000\u033d\u033e\u0005\u0011\u0000\u0000\u033e"+
		"\u0345\u0001\u0000\u0000\u0000\u033f\u0340\u0005*\u0000\u0000\u0340\u0341"+
		"\u0005\u0007\u0000\u0000\u0341\u0342\u0003j5\u0000\u0342\u0343\u0005\b"+
		"\u0000\u0000\u0343\u0345\u0001\u0000\u0000\u0000\u0344\u033a\u0001\u0000"+
		"\u0000\u0000\u0344\u033f\u0001\u0000\u0000\u0000\u0345U\u0001\u0000\u0000"+
		"\u0000\u0346\u0352\u0005V\u0000\u0000\u0347\u0348\u0005+\u0000\u0000\u0348"+
		"\u0349\u0005\u0010\u0000\u0000\u0349\u034a\u0003f3\u0000\u034a\u034b\u0005"+
		"\u0011\u0000\u0000\u034b\u0352\u0001\u0000\u0000\u0000\u034c\u034d\u0005"+
		"+\u0000\u0000\u034d\u034e\u0005\u0010\u0000\u0000\u034e\u034f\u0003\u0084"+
		"B\u0000\u034f\u0350\u0005\u0011\u0000\u0000\u0350\u0352\u0001\u0000\u0000"+
		"\u0000\u0351\u0346\u0001\u0000\u0000\u0000\u0351\u0347\u0001\u0000\u0000"+
		"\u0000\u0351\u034c\u0001\u0000\u0000\u0000\u0352W\u0001\u0000\u0000\u0000"+
		"\u0353\u035f\u0005V\u0000\u0000\u0354\u0355\u0005+\u0000\u0000\u0355\u0356"+
		"\u0005\u0010\u0000\u0000\u0356\u0357\u0003f3\u0000\u0357\u0358\u0005\u0011"+
		"\u0000\u0000\u0358\u035f\u0001\u0000\u0000\u0000\u0359\u035a\u0005+\u0000"+
		"\u0000\u035a\u035b\u0005\u0010\u0000\u0000\u035b\u035c\u0003\u0084B\u0000"+
		"\u035c\u035d\u0005\u0011\u0000\u0000\u035d\u035f\u0001\u0000\u0000\u0000"+
		"\u035e\u0353\u0001\u0000\u0000\u0000\u035e\u0354\u0001\u0000\u0000\u0000"+
		"\u035e\u0359\u0001\u0000\u0000\u0000\u035fY\u0001\u0000\u0000\u0000\u0360"+
		"\u0365\u0003\\.\u0000\u0361\u0362\u0005\u0004\u0000\u0000\u0362\u0364"+
		"\u0003\\.\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0367\u0001"+
		"\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366[\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0003D\"\u0000\u0369\u036a\u0005\u000e\u0000"+
		"\u0000\u036a\u036b\u0003\f\u0006\u0000\u036b\u036e\u0001\u0000\u0000\u0000"+
		"\u036c\u036e\u00038\u001c\u0000\u036d\u0368\u0001\u0000\u0000\u0000\u036d"+
		"\u036c\u0001\u0000\u0000\u0000\u036e]\u0001\u0000\u0000\u0000\u036f\u0371"+
		"\u0005\f\u0000\u0000\u0370\u0372\u0003Z-\u0000\u0371\u0370\u0001\u0000"+
		"\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000"+
		"\u0000\u0000\u0373\u0384\u0005\r\u0000\u0000\u0374\u0375\u0005\f\u0000"+
		"\u0000\u0375\u0376\u0005,\u0000\u0000\u0376\u0377\u0003Z-\u0000\u0377"+
		"\u0378\u0005\r\u0000\u0000\u0378\u0384\u0001\u0000\u0000\u0000\u0379\u037d"+
		"\u0005\f\u0000\u0000\u037a\u037b\u0003Z-\u0000\u037b\u037c\u0005\u0004"+
		"\u0000\u0000\u037c\u037e\u0001\u0000\u0000\u0000\u037d\u037a\u0001\u0000"+
		"\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0003D\"\u0000\u0380\u0381\u0005\u0015\u0000"+
		"\u0000\u0381\u0382\u0005\r\u0000\u0000\u0382\u0384\u0001\u0000\u0000\u0000"+
		"\u0383\u036f\u0001\u0000\u0000\u0000\u0383\u0374\u0001\u0000\u0000\u0000"+
		"\u0383\u0379\u0001\u0000\u0000\u0000\u0384_\u0001\u0000\u0000\u0000\u0385"+
		"\u0388\u0003^/\u0000\u0386\u0388\u0003d2\u0000\u0387\u0385\u0001\u0000"+
		"\u0000\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0388a\u0001\u0000\u0000"+
		"\u0000\u0389\u038c\u0003z=\u0000\u038a\u038c\u0003f3\u0000\u038b\u0389"+
		"\u0001\u0000\u0000\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038cc\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0005\u0010\u0000\u0000\u038e\u038f\u0003"+
		"b1\u0000\u038f\u0390\u0005\u0011\u0000\u0000\u0390\u0396\u0001\u0000\u0000"+
		"\u0000\u0391\u0392\u0005Q\u0000\u0000\u0392\u0393\u0003b1\u0000\u0393"+
		"\u0394\u0005R\u0000\u0000\u0394\u0396\u0001\u0000\u0000\u0000\u0395\u038d"+
		"\u0001\u0000\u0000\u0000\u0395\u0391\u0001\u0000\u0000\u0000\u0396e\u0001"+
		"\u0000\u0000\u0000\u0397\u0398\u0003h4\u0000\u0398\u0399\u0005\f\u0000"+
		"\u0000\u0399\u039b\u0001\u0000\u0000\u0000\u039a\u0397\u0001\u0000\u0000"+
		"\u0000\u039b\u039e\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03a0\u0001\u0000\u0000"+
		"\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u03a1\u0003:\u001d\u0000"+
		"\u03a0\u039f\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a1g\u0001\u0000\u0000\u0000\u03a2\u03b7\u0003\u00d0h\u0000\u03a3\u03a7"+
		"\u0003\u00ceg\u0000\u03a4\u03a6\u0005\r\u0000\u0000\u03a5\u03a4\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001"+
		"\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03a3\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ae\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001"+
		"\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u03b0\u0001"+
		"\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03af\u03b1\u0003"+
		"\u00c8d\u0000\u03b0\u03af\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b7\u0003\u00e8"+
		"t\u0000\u03b3\u03b7\u0003\u0104\u0082\u0000\u03b4\u03b7\u0003>\u001f\u0000"+
		"\u03b5\u03b7\u0003\u00deo\u0000\u03b6\u03a2\u0001\u0000\u0000\u0000\u03b6"+
		"\u03ac\u0001\u0000\u0000\u0000\u03b6\u03b3\u0001\u0000\u0000\u0000\u03b6"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"i\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003l6\u0000\u03b9\u03ba\u0005"+
		"\f\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u03b8\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c0\u0001\u0000"+
		"\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c1\u0003\f\u0006"+
		"\u0000\u03c1k\u0001\u0000\u0000\u0000\u03c2\u03c6\u0005\u0013\u0000\u0000"+
		"\u03c3\u03c5\u0005\r\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c8\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c9\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c9\u03ca\u0003\u00f0x\u0000\u03cam\u0001"+
		"\u0000\u0000\u0000\u03cb\u03cc\u0005-\u0000\u0000\u03cc\u03cd\u0005\f"+
		"\u0000\u0000\u03cd\u03ce\u0003p8\u0000\u03ce\u03d2\u0005\r\u0000\u0000"+
		"\u03cf\u03d1\u0005\r\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d7\u0007\u0002\u0000\u0000\u03d6"+
		"\u03d5\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d8\u0001\u0000\u0000\u0000\u03d8\u03d9\u00038\u001c\u0000\u03d9\u03ef"+
		"\u0001\u0000\u0000\u0000\u03da\u03db\u0005-\u0000\u0000\u03db\u03dc\u0005"+
		"\u0010\u0000\u0000\u03dc\u03dd\u0003p8\u0000\u03dd\u03e1\u0005\u0011\u0000"+
		"\u0000\u03de\u03e0\u0005\r\u0000\u0000\u03df\u03de\u0001\u0000\u0000\u0000"+
		"\u03e0\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e4\u03e6\u0007\u0002\u0000\u0000"+
		"\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u00038\u001c\u0000\u03e8"+
		"\u03ef\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005-\u0000\u0000\u03ea\u03eb"+
		"\u0003p8\u0000\u03eb\u03ec\u0007\u0002\u0000\u0000\u03ec\u03ed\u00038"+
		"\u001c\u0000\u03ed\u03ef\u0001\u0000\u0000\u0000\u03ee\u03cb\u0001\u0000"+
		"\u0000\u0000\u03ee\u03da\u0001\u0000\u0000\u0000\u03ee\u03e9\u0001\u0000"+
		"\u0000\u0000\u03efo\u0001\u0000\u0000\u0000\u03f0\u03f2\u0005\r\u0000"+
		"\u0000\u03f1\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f8\u0003r9\u0000\u03f7\u03f9\u0005\f\u0000\u0000\u03f8"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9"+
		"q\u0001\u0000\u0000\u0000\u03fa\u0400\u0003v;\u0000\u03fb\u03fc\u0005"+
		"\f\u0000\u0000\u03fc\u03ff\u0003t:\u0000\u03fd\u03ff\u0003x<\u0000\u03fe"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff"+
		"\u0402\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400"+
		"\u0401\u0001\u0000\u0000\u0000\u0401s\u0001\u0000\u0000\u0000\u0402\u0400"+
		"\u0001\u0000\u0000\u0000\u0403\u0410\u0003v;\u0000\u0404\u0408\u0003x"+
		"<\u0000\u0405\u0407\u0003x<\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u040a\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u0410\u0001\u0000\u0000\u0000"+
		"\u040a\u0408\u0001\u0000\u0000\u0000\u040b\u040c\u0003\u0086C\u0000\u040c"+
		"\u040d\u0005#\u0000\u0000\u040d\u040e\u00038\u001c\u0000\u040e\u0410\u0001"+
		"\u0000\u0000\u0000\u040f\u0403\u0001\u0000\u0000\u0000\u040f\u0404\u0001"+
		"\u0000\u0000\u0000\u040f\u040b\u0001\u0000\u0000\u0000\u0410u\u0001\u0000"+
		"\u0000\u0000\u0411\u0413\u0005/\u0000\u0000\u0412\u0411\u0001\u0000\u0000"+
		"\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000"+
		"\u0000\u0414\u0415\u0003\u0086C\u0000\u0415\u0416\u00050\u0000\u0000\u0416"+
		"\u0417\u00038\u001c\u0000\u0417w\u0001\u0000\u0000\u0000\u0418\u0419\u0005"+
		"\u001a\u0000\u0000\u0419\u041a\u0003D\"\u0000\u041ay\u0001\u0000\u0000"+
		"\u0000\u041b\u041f\u0003|>\u0000\u041c\u041e\u0003|>\u0000\u041d\u041c"+
		"\u0001\u0000\u0000\u0000\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d"+
		"\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420{\u0001"+
		"\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0423\u0005"+
		"/\u0000\u0000\u0423\u0425\u0003\u0084B\u0000\u0424\u0426\u0003x<\u0000"+
		"\u0425\u0424\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000"+
		"\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428\u0005\n\u0000\u0000\u0428"+
		"\u0429\u0003f3\u0000\u0429}\u0001\u0000\u0000\u0000\u042a\u042b\u0005"+
		"/\u0000\u0000\u042b\u042d\u0003\u0084B\u0000\u042c\u042e\u0003x<\u0000"+
		"\u042d\u042c\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000"+
		"\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0430\u0005\n\u0000\u0000\u0430"+
		"\u0431\u00038\u001c\u0000\u0431\u007f\u0001\u0000\u0000\u0000\u0432\u0436"+
		"\u0003\u0082A\u0000\u0433\u0435\u0003\u0082A\u0000\u0434\u0433\u0001\u0000"+
		"\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000"+
		"\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0081\u0001\u0000"+
		"\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0439\u043c\u0005/\u0000"+
		"\u0000\u043a\u043d\u0003\u0018\f\u0000\u043b\u043d\u0005\u0018\u0000\u0000"+
		"\u043c\u043a\u0001\u0000\u0000\u0000\u043c\u043b\u0001\u0000\u0000\u0000"+
		"\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u043f\u0005\n\u0000\u0000\u043f"+
		"\u0441\u0003\f\u0006\u0000\u0440\u0442\u0005\f\u0000\u0000\u0441\u0440"+
		"\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0083"+
		"\u0001\u0000\u0000\u0000\u0443\u0448\u0003\u0086C\u0000\u0444\u0445\u0005"+
		"1\u0000\u0000\u0445\u0447\u0003\u0086C\u0000\u0446\u0444\u0001\u0000\u0000"+
		"\u0000\u0447\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000"+
		"\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u0085\u0001\u0000\u0000"+
		"\u0000\u044a\u0448\u0001\u0000\u0000\u0000\u044b\u044c\u0003\u0090H\u0000"+
		"\u044c\u044d\u0005\u000e\u0000\u0000\u044d\u044e\u0003\u001a\r\u0000\u044e"+
		"\u045d\u0001\u0000\u0000\u0000\u044f\u0451\u0005\u0001\u0000\u0000\u0450"+
		"\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0005\u0005\u0000\u0000\u0453"+
		"\u0454\u0005\u000e\u0000\u0000\u0454\u045d\u0003\u001a\r\u0000\u0455\u0457"+
		"\u0005\u0001\u0000\u0000\u0456\u0455\u0001\u0000\u0000\u0000\u0456\u0457"+
		"\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459"+
		"\u0005\u0007\u0000\u0000\u0459\u045a\u0005\u000e\u0000\u0000\u045a\u045d"+
		"\u0003\u001a\r\u0000\u045b\u045d\u0003\u0088D\u0000\u045c\u044b\u0001"+
		"\u0000\u0000\u0000\u045c\u0450\u0001\u0000\u0000\u0000\u045c\u0456\u0001"+
		"\u0000\u0000\u0000\u045c\u045b\u0001\u0000\u0000\u0000\u045d\u0087\u0001"+
		"\u0000\u0000\u0000\u045e\u045f\u0005P\u0000\u0000\u045f\u0461\u00052\u0000"+
		"\u0000\u0460\u045e\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000"+
		"\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0003\u008aE\u0000"+
		"\u0463\u0089\u0001\u0000\u0000\u0000\u0464\u046c\u0003\u008cF\u0000\u0465"+
		"\u0467\u0005P\u0000\u0000\u0466\u0468\u0005\r\u0000\u0000\u0467\u0466"+
		"\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0469"+
		"\u0001\u0000\u0000\u0000\u0469\u046b\u0003\u008cF\u0000\u046a\u0465\u0001"+
		"\u0000\u0000\u0000\u046b\u046e\u0001\u0000\u0000\u0000\u046c\u046a\u0001"+
		"\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u008b\u0001"+
		"\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046f\u0481\u0003"+
		"\u0090H\u0000\u0470\u0481\u0003\u0002\u0001\u0000\u0471\u0473\u0005\f"+
		"\u0000\u0000\u0472\u0474\u0003\u0092I\u0000\u0473\u0472\u0001\u0000\u0000"+
		"\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000"+
		"\u0000\u0475\u0481\u0005\r\u0000\u0000\u0476\u0481\u0003T*\u0000\u0477"+
		"\u0479\u0003\u008eG\u0000\u0478\u047a\u0003,\u0016\u0000\u0479\u0478\u0001"+
		"\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u047c\u0001"+
		"\u0000\u0000\u0000\u047b\u047d\u0003\u0094J\u0000\u047c\u047b\u0001\u0000"+
		"\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u0481\u0001\u0000"+
		"\u0000\u0000\u047e\u047f\u00053\u0000\u0000\u047f\u0481\u0003\u001a\r"+
		"\u0000\u0480\u046f\u0001\u0000\u0000\u0000\u0480\u0470\u0001\u0000\u0000"+
		"\u0000\u0480\u0471\u0001\u0000\u0000\u0000\u0480\u0476\u0001\u0000\u0000"+
		"\u0000\u0480\u0477\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000\u0000"+
		"\u0000\u0481\u008d\u0001\u0000\u0000\u0000\u0482\u0483\u0006G\uffff\uffff"+
		"\u0000\u0483\u0484\u0003\b\u0004\u0000\u0484\u048a\u0001\u0000\u0000\u0000"+
		"\u0485\u0486\n\u0001\u0000\u0000\u0486\u0487\u0005\u0003\u0000\u0000\u0487"+
		"\u0489\u0005P\u0000\u0000\u0488\u0485\u0001\u0000\u0000\u0000\u0489\u048c"+
		"\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u048b"+
		"\u0001\u0000\u0000\u0000\u048b\u008f\u0001\u0000\u0000\u0000\u048c\u048a"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0007\u0003\u0000\u0000\u048e\u0091"+
		"\u0001\u0000\u0000\u0000\u048f\u0494\u0003\u0084B\u0000\u0490\u0491\u0005"+
		"\u0004\u0000\u0000\u0491\u0493\u0003\u0084B\u0000\u0492\u0490\u0001\u0000"+
		"\u0000\u0000\u0493\u0496\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000"+
		"\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0093\u0001\u0000"+
		"\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0497\u0499\u0005\f\u0000"+
		"\u0000\u0498\u049a\u0003\u0092I\u0000\u0499\u0498\u0001\u0000\u0000\u0000"+
		"\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000"+
		"\u049b\u04a7\u0005\r\u0000\u0000\u049c\u04a0\u0005\f\u0000\u0000\u049d"+
		"\u049e\u0003\u0092I\u0000\u049e\u049f\u0005\u0004\u0000\u0000\u049f\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a0\u049d\u0001\u0000\u0000\u0000\u04a0\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a3"+
		"\u0003\u0090H\u0000\u04a3\u04a4\u0005\u0015\u0000\u0000\u04a4\u04a5\u0005"+
		"\r\u0000\u0000\u04a5\u04a7\u0001\u0000\u0000\u0000\u04a6\u0497\u0001\u0000"+
		"\u0000\u0000\u04a6\u049c\u0001\u0000\u0000\u0000\u04a7\u0095\u0001\u0000"+
		"\u0000\u0000\u04a8\u04a9\u0005\u0007\u0000\u0000\u04a9\u04ae\u0003\u0098"+
		"L\u0000\u04aa\u04ab\u0005\u0004\u0000\u0000\u04ab\u04ad\u0003\u0098L\u0000"+
		"\u04ac\u04aa\u0001\u0000\u0000\u0000\u04ad\u04b0\u0001\u0000\u0000\u0000"+
		"\u04ae\u04ac\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000"+
		"\u04af\u04b1\u0001\u0000\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000"+
		"\u04b1\u04b2\u0005\b\u0000\u0000\u04b2\u0097\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b5\u0003\u00ceg\u0000\u04b4\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b8"+
		"\u0001\u0000\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b7"+
		"\u0001\u0000\u0000\u0000\u04b7\u04ba\u0001\u0000\u0000\u0000\u04b8\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b9\u04bb\u0007\u0004\u0000\u0000\u04ba\u04b9"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc"+
		"\u0001\u0000\u0000\u0000\u04bc\u04be\u0005P\u0000\u0000\u04bd\u04bf\u0003"+
		"\u009eO\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000"+
		"\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1\u00034\u001a"+
		"\u0000\u04c1\u0099\u0001\u0000\u0000\u0000\u04c2\u04c3\u0005\u0007\u0000"+
		"\u0000\u04c3\u04c8\u0003\u009cN\u0000\u04c4\u04c5\u0005\u0004\u0000\u0000"+
		"\u04c5\u04c7\u0003\u009cN\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c7"+
		"\u04ca\u0001\u0000\u0000\u0000\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8"+
		"\u04c9\u0001\u0000\u0000\u0000\u04c9\u04cb\u0001\u0000\u0000\u0000\u04ca"+
		"\u04c8\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005\b\u0000\u0000\u04cc\u009b"+
		"\u0001\u0000\u0000\u0000\u04cd\u04cf\u0003\u00ceg\u0000\u04ce\u04cd\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d5\u0005"+
		"P\u0000\u0000\u04d4\u04d6\u0003\u009eO\u0000\u04d5\u04d4\u0001\u0000\u0000"+
		"\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000"+
		"\u0000\u04d7\u04d8\u00032\u0019\u0000\u04d8\u009d\u0001\u0000\u0000\u0000"+
		"\u04d9\u04da\u0005\u0007\u0000\u0000\u04da\u04df\u0003\u00a0P\u0000\u04db"+
		"\u04dc\u0005\u0004\u0000\u0000\u04dc\u04de\u0003\u00a0P\u0000\u04dd\u04db"+
		"\u0001\u0000\u0000\u0000\u04de\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd"+
		"\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e2"+
		"\u0001\u0000\u0000\u0000\u04e1\u04df\u0001\u0000\u0000\u0000\u04e2\u04e3"+
		"\u0005\b\u0000\u0000\u04e3\u009f\u0001\u0000\u0000\u0000\u04e4\u04e6\u0003"+
		"\u00ceg\u0000\u04e5\u04e4\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000"+
		"\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000"+
		"\u0000\u0000\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000"+
		"\u0000\u0000\u04ea\u04ec\u0007\u0004\u0000\u0000\u04eb\u04ea\u0001\u0000"+
		"\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000\u0000\u04ec\u04f2\u0001\u0000"+
		"\u0000\u0000\u04ed\u04ef\u0005P\u0000\u0000\u04ee\u04f0\u0003\u009eO\u0000"+
		"\u04ef\u04ee\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000\u0000\u0000"+
		"\u04f0\u04f3\u0001\u0000\u0000\u0000\u04f1\u04f3\u0005\u0018\u0000\u0000"+
		"\u04f2\u04ed\u0001\u0000\u0000\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000"+
		"\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u00032\u0019\u0000\u04f5"+
		"\u00a1\u0001\u0000\u0000\u0000\u04f6\u04f8\u0003\u00a4R\u0000\u04f7\u04f6"+
		"\u0001\u0000\u0000\u0000\u04f8\u04fb\u0001\u0000\u0000\u0000\u04f9\u04f7"+
		"\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa\u0506"+
		"\u0001\u0000\u0000\u0000\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fc\u04fe"+
		"\u0005\r\u0000\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001"+
		"\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0501\u0005"+
		"\f\u0000\u0000\u0500\u0502\u00054\u0000\u0000\u0501\u0500\u0001\u0000"+
		"\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000"+
		"\u0000\u0000\u0503\u0504\u0003\u00a6S\u0000\u0504\u0505\u0005\r\u0000"+
		"\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506\u04fd\u0001\u0000\u0000"+
		"\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u00a3\u0001\u0000\u0000"+
		"\u0000\u0508\u050a\u0005\r\u0000\u0000\u0509\u0508\u0001\u0000\u0000\u0000"+
		"\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000"+
		"\u050b\u050c\u0005\f\u0000\u0000\u050c\u050d\u0003\u00a6S\u0000\u050d"+
		"\u050e\u0005\r\u0000\u0000\u050e\u051b\u0001\u0000\u0000\u0000\u050f\u0511"+
		"\u0005\r\u0000\u0000\u0510\u050f\u0001\u0000\u0000\u0000\u0510\u0511\u0001"+
		"\u0000\u0000\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0513\u0005"+
		"\f\u0000\u0000\u0513\u0516\u0005,\u0000\u0000\u0514\u0517\u0003\u00a6"+
		"S\u0000\u0515\u0517\u0003&\u0013\u0000\u0516\u0514\u0001\u0000\u0000\u0000"+
		"\u0516\u0515\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000"+
		"\u0518\u0519\u0005\r\u0000\u0000\u0519\u051b\u0001\u0000\u0000\u0000\u051a"+
		"\u0509\u0001\u0000\u0000\u0000\u051a\u0510\u0001\u0000\u0000\u0000\u051b"+
		"\u00a5\u0001\u0000\u0000\u0000\u051c\u0521\u0003\u00a8T\u0000\u051d\u051e"+
		"\u0005\u0004\u0000\u0000\u051e\u0520\u0003\u00a8T\u0000\u051f\u051d\u0001"+
		"\u0000\u0000\u0000\u0520\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001"+
		"\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u00a7\u0001"+
		"\u0000\u0000\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0524\u0526\u0003"+
		"\u00ceg\u0000\u0525\u0524\u0001\u0000\u0000\u0000\u0526\u0529\u0001\u0000"+
		"\u0000\u0000\u0527\u0525\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000"+
		"\u0000\u0000\u0528\u0531\u0001\u0000\u0000\u0000\u0529\u0527\u0001\u0000"+
		"\u0000\u0000\u052a\u052c\u0003\u00c6c\u0000\u052b\u052a\u0001\u0000\u0000"+
		"\u0000\u052c\u052f\u0001\u0000\u0000\u0000\u052d\u052b\u0001\u0000\u0000"+
		"\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u0530\u0001\u0000\u0000"+
		"\u0000\u052f\u052d\u0001\u0000\u0000\u0000\u0530\u0532\u0007\u0005\u0000"+
		"\u0000\u0531\u052d\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000"+
		"\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0534\u0003\u00c0`\u0000"+
		"\u0534\u00a9\u0001\u0000\u0000\u0000\u0535\u0539\u0003\u00acV\u0000\u0536"+
		"\u0538\u0003\u00acV\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0538\u053b"+
		"\u0001\u0000\u0000\u0000\u0539\u0537\u0001\u0000\u0000\u0000\u0539\u053a"+
		"\u0001\u0000\u0000\u0000\u053a\u00ab\u0001\u0000\u0000\u0000\u053b\u0539"+
		"\u0001\u0000\u0000\u0000\u053c\u0540\u0003\u00b2Y\u0000\u053d\u0540\u0003"+
		"\u00b6[\u0000\u053e\u0540\u0003\u00b8\\\u0000\u053f\u053c\u0001\u0000"+
		"\u0000\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u053f\u053e\u0001\u0000"+
		"\u0000\u0000\u0540\u00ad\u0001\u0000\u0000\u0000\u0541\u0545\u0003\u00b0"+
		"X\u0000\u0542\u0544\u0003\u00b0X\u0000\u0543\u0542\u0001\u0000\u0000\u0000"+
		"\u0544\u0547\u0001\u0000\u0000\u0000\u0545\u0543\u0001\u0000\u0000\u0000"+
		"\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u00af\u0001\u0000\u0000\u0000"+
		"\u0547\u0545\u0001\u0000\u0000\u0000\u0548\u054b\u0003\u00b6[\u0000\u0549"+
		"\u054b\u0003\u00b8\\\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a\u0549"+
		"\u0001\u0000\u0000\u0000\u054b\u00b1\u0001\u0000\u0000\u0000\u054c\u054e"+
		"\u0005\r\u0000\u0000\u054d\u054c\u0001\u0000\u0000\u0000\u054d\u054e\u0001"+
		"\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0005"+
		"\u0007\u0000\u0000\u0550\u0555\u0003\u00b4Z\u0000\u0551\u0552\u0005\u0004"+
		"\u0000\u0000\u0552\u0554\u0003\u00b4Z\u0000\u0553\u0551\u0001\u0000\u0000"+
		"\u0000\u0554\u0557\u0001\u0000\u0000\u0000\u0555\u0553\u0001\u0000\u0000"+
		"\u0000\u0555\u0556\u0001\u0000\u0000\u0000\u0556\u0558\u0001\u0000\u0000"+
		"\u0000\u0557\u0555\u0001\u0000\u0000\u0000\u0558\u0559\u0005\b\u0000\u0000"+
		"\u0559\u00b3\u0001\u0000\u0000\u0000\u055a\u055c\u0003\u00ceg\u0000\u055b"+
		"\u055a\u0001\u0000\u0000\u0000\u055c\u055f\u0001\u0000\u0000\u0000\u055d"+
		"\u055b\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e"+
		"\u0560\u0001\u0000\u0000\u0000\u055f\u055d\u0001\u0000\u0000\u0000\u0560"+
		"\u0562\u0005P\u0000\u0000\u0561\u0563\u0003\u009eO\u0000\u0562\u0561\u0001"+
		"\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0564\u0001"+
		"\u0000\u0000\u0000\u0564\u0565\u00034\u001a\u0000\u0565\u00b5\u0001\u0000"+
		"\u0000\u0000\u0566\u0568\u0005\r\u0000\u0000\u0567\u0566\u0001\u0000\u0000"+
		"\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000"+
		"\u0000\u0569\u056b\u0005\f\u0000\u0000\u056a\u056c\u0003\u00bc^\u0000"+
		"\u056b\u056a\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000"+
		"\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0005\r\u0000\u0000\u056e"+
		"\u00b7\u0001\u0000\u0000\u0000\u056f\u0571\u0005\r\u0000\u0000\u0570\u056f"+
		"\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000\u0000\u0000\u0571\u0572"+
		"\u0001\u0000\u0000\u0000\u0572\u0573\u0005\f\u0000\u0000\u0573\u0576\u0005"+
		",\u0000\u0000\u0574\u0577\u0003\u00bc^\u0000\u0575\u0577\u0003&\u0013"+
		"\u0000\u0576\u0574\u0001\u0000\u0000\u0000\u0576\u0575\u0001\u0000\u0000"+
		"\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u0579\u0005\r\u0000\u0000"+
		"\u0579\u00b9\u0001\u0000\u0000\u0000\u057a\u057c\u0005\r\u0000\u0000\u057b"+
		"\u057a\u0001\u0000\u0000\u0000\u057b\u057c\u0001\u0000\u0000\u0000\u057c"+
		"\u057d\u0001\u0000\u0000\u0000\u057d\u057e\u0005\f\u0000\u0000\u057e\u057f"+
		"\u00054\u0000\u0000\u057f\u0580\u0003\u00bc^\u0000\u0580\u0581\u0005\r"+
		"\u0000\u0000\u0581\u00bb\u0001\u0000\u0000\u0000\u0582\u0587\u0003\u00be"+
		"_\u0000\u0583\u0584\u0005\u0004\u0000\u0000\u0584\u0586\u0003\u00be_\u0000"+
		"\u0585\u0583\u0001\u0000\u0000\u0000\u0586\u0589\u0001\u0000\u0000\u0000"+
		"\u0587\u0585\u0001\u0000\u0000\u0000\u0587\u0588\u0001\u0000\u0000\u0000"+
		"\u0588\u00bd\u0001\u0000\u0000\u0000\u0589\u0587\u0001\u0000\u0000\u0000"+
		"\u058a\u058c\u0003\u00ceg\u0000\u058b\u058a\u0001\u0000\u0000\u0000\u058c"+
		"\u058f\u0001\u0000\u0000\u0000\u058d\u058b\u0001\u0000\u0000\u0000\u058d"+
		"\u058e\u0001\u0000\u0000\u0000\u058e\u0591\u0001\u0000\u0000\u0000\u058f"+
		"\u058d\u0001\u0000\u0000\u0000\u0590\u0592\u0005\u0019\u0000\u0000\u0591"+
		"\u0590\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592"+
		"\u0593\u0001\u0000\u0000\u0000\u0593\u0594\u0003\u00c0`\u0000\u0594\u00bf"+
		"\u0001\u0000\u0000\u0000\u0595\u0596\u0005P\u0000\u0000\u0596\u0597\u0005"+
		"\u000e\u0000\u0000\u0597\u059a\u0003(\u0014\u0000\u0598\u0599\u0005#\u0000"+
		"\u0000\u0599\u059b\u00038\u001c\u0000\u059a\u0598\u0001\u0000\u0000\u0000"+
		"\u059a\u059b\u0001\u0000\u0000\u0000\u059b\u00c1\u0001\u0000\u0000\u0000"+
		"\u059c\u05a5\u0005\f\u0000\u0000\u059d\u05a2\u0003\u00c4b\u0000\u059e"+
		"\u059f\u0005\u0004\u0000\u0000\u059f\u05a1\u0003\u00c4b\u0000\u05a0\u059e"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a4\u0001\u0000\u0000\u0000\u05a2\u05a0"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000\u05a3\u05a6"+
		"\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000\u0000\u05a5\u059d"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6\u05a7"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005\r\u0000\u0000\u05a8\u00c3\u0001"+
		"\u0000\u0000\u0000\u05a9\u05ac\u0007\u0006\u0000\u0000\u05aa\u05ab\u0005"+
		"\u000e\u0000\u0000\u05ab\u05ad\u0003\f\u0006\u0000\u05ac\u05aa\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad\u00c5\u0001\u0000"+
		"\u0000\u0000\u05ae\u05b3\u0003\u00c8d\u0000\u05af\u05b3\u0003\u00cae\u0000"+
		"\u05b0\u05b3\u00057\u0000\u0000\u05b1\u05b3\u00058\u0000\u0000\u05b2\u05ae"+
		"\u0001\u0000\u0000\u0000\u05b2\u05af\u0001\u0000\u0000\u0000\u05b2\u05b0"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b1\u0001\u0000\u0000\u0000\u05b3\u00c7"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b5\u0007\u0007\u0000\u0000\u05b5\u00c9"+
		"\u0001\u0000\u0000\u0000\u05b6\u05b8\u0007\b\u0000\u0000\u05b7\u05b9\u0003"+
		"\u00ccf\u0000\u05b8\u05b7\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000"+
		"\u0000\u0000\u05b9\u00cb\u0001\u0000\u0000\u0000\u05ba\u05bb\u0005\u0007"+
		"\u0000\u0000\u05bb\u05bc\u0005P\u0000\u0000\u05bc\u05bd\u0005\b\u0000"+
		"\u0000\u05bd\u00cd\u0001\u0000\u0000\u0000\u05be\u05bf\u00052\u0000\u0000"+
		"\u05bf\u05c3\u0003 \u0010\u0000\u05c0\u05c2\u0003^/\u0000\u05c1\u05c0"+
		"\u0001\u0000\u0000\u0000\u05c2\u05c5\u0001\u0000\u0000\u0000\u05c3\u05c1"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u00cf"+
		"\u0001\u0000\u0000\u0000\u05c5\u05c3\u0001\u0000\u0000\u0000\u05c6\u05c7"+
		"\u0005B\u0000\u0000\u05c7\u05cc\u0003\u00d4j\u0000\u05c8\u05c9\u0005\u0004"+
		"\u0000\u0000\u05c9\u05cb\u0003\u00d4j\u0000\u05ca\u05c8\u0001\u0000\u0000"+
		"\u0000\u05cb\u05ce\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000"+
		"\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000\u05cd\u00d1\u0001\u0000\u0000"+
		"\u0000\u05ce\u05cc\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005C\u0000\u0000"+
		"\u05d0\u05d5\u0003\u00d4j\u0000\u05d1\u05d2\u0005\u0004\u0000\u0000\u05d2"+
		"\u05d4\u0003\u00d4j\u0000\u05d3\u05d1\u0001\u0000\u0000\u0000\u05d4\u05d7"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d3\u0001\u0000\u0000\u0000\u05d5\u05d6"+
		"\u0001\u0000\u0000\u0000\u05d6\u00d3\u0001\u0000\u0000\u0000\u05d7\u05d5"+
		"\u0001\u0000\u0000\u0000\u05d8\u05dd\u0003\b\u0004\u0000\u05d9\u05da\u0005"+
		"\u0003\u0000\u0000\u05da\u05dc\u0005P\u0000\u0000\u05db\u05d9\u0001\u0000"+
		"\u0000\u0000\u05dc\u05df\u0001\u0000\u0000\u0000\u05dd\u05db\u0001\u0000"+
		"\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de\u05e0\u0001\u0000"+
		"\u0000\u0000\u05df\u05dd\u0001\u0000\u0000\u0000\u05e0\u05e1\u0005\u0003"+
		"\u0000\u0000\u05e1\u05e2\u0003\u00d6k\u0000\u05e2\u05e8\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e4\u0003\b\u0004\u0000\u05e4\u05e5\u0005D\u0000\u0000"+
		"\u05e5\u05e6\u0005P\u0000\u0000\u05e6\u05e8\u0001\u0000\u0000\u0000\u05e7"+
		"\u05d8\u0001\u0000\u0000\u0000\u05e7\u05e3\u0001\u0000\u0000\u0000\u05e8"+
		"\u00d5\u0001\u0000\u0000\u0000\u05e9\u05f0\u0003\u00d8l\u0000\u05ea\u05f0"+
		"\u0003\u00dam\u0000\u05eb\u05ec\u0005\u0010\u0000\u0000\u05ec\u05ed\u0003"+
		"\u00dcn\u0000\u05ed\u05ee\u0005\u0011\u0000\u0000\u05ee\u05f0\u0001\u0000"+
		"\u0000\u0000\u05ef\u05e9\u0001\u0000\u0000\u0000\u05ef\u05ea\u0001\u0000"+
		"\u0000\u0000\u05ef\u05eb\u0001\u0000\u0000\u0000\u05f0\u00d7\u0001\u0000"+
		"\u0000\u0000\u05f1\u05f4\u0005P\u0000\u0000\u05f2\u05f3\u0005D\u0000\u0000"+
		"\u05f3\u05f5\u0007\u0006\u0000\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f5\u0001\u0000\u0000\u0000\u05f5\u00d9\u0001\u0000\u0000\u0000"+
		"\u05f6\u05fc\u0005\u0015\u0000\u0000\u05f7\u05f9\u00053\u0000\u0000\u05f8"+
		"\u05fa\u0003\u0018\f\u0000\u05f9\u05f8\u0001\u0000\u0000\u0000\u05f9\u05fa"+
		"\u0001\u0000\u0000\u0000\u05fa\u05fc\u0001\u0000\u0000\u0000\u05fb\u05f6"+
		"\u0001\u0000\u0000\u0000\u05fb\u05f7\u0001\u0000\u0000\u0000\u05fc\u00db"+
		"\u0001\u0000\u0000\u0000\u05fd\u0600\u0003\u00d8l\u0000\u05fe\u05ff\u0005"+
		"\u0004\u0000\u0000\u05ff\u0601\u0003\u00dcn\u0000\u0600\u05fe\u0001\u0000"+
		"\u0000\u0000\u0600\u0601\u0001\u0000\u0000\u0000\u0601\u060b\u0001\u0000"+
		"\u0000\u0000\u0602\u0607\u0003\u00dam\u0000\u0603\u0604\u0005\u0004\u0000"+
		"\u0000\u0604\u0606\u0003\u00dam\u0000\u0605\u0603\u0001\u0000\u0000\u0000"+
		"\u0606\u0609\u0001\u0000\u0000\u0000\u0607\u0605\u0001\u0000\u0000\u0000"+
		"\u0607\u0608\u0001\u0000\u0000\u0000\u0608\u060b\u0001\u0000\u0000\u0000"+
		"\u0609\u0607\u0001\u0000\u0000\u0000\u060a\u05fd\u0001\u0000\u0000\u0000"+
		"\u060a\u0602\u0001\u0000\u0000\u0000\u060b\u00dd\u0001\u0000\u0000\u0000"+
		"\u060c\u060d\u0005E\u0000\u0000\u060d\u060e\u0003\u00e0p\u0000\u060e\u00df"+
		"\u0001\u0000\u0000\u0000\u060f\u0610\u0007\t\u0000\u0000\u0610\u00e1\u0001"+
		"\u0000\u0000\u0000\u0611\u0612\u00055\u0000\u0000\u0612\u061e\u0003\u00e4"+
		"r\u0000\u0613\u0614\u0005G\u0000\u0000\u0614\u061e\u0003\u00e6s\u0000"+
		"\u0615\u0619\u0005\u0013\u0000\u0000\u0616\u0618\u0005\r\u0000\u0000\u0617"+
		"\u0616\u0001\u0000\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000\u0619"+
		"\u0617\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a"+
		"\u061c\u0001\u0000\u0000\u0000\u061b\u0619\u0001\u0000\u0000\u0000\u061c"+
		"\u061e\u0003\u00f0x\u0000\u061d\u0611\u0001\u0000\u0000\u0000\u061d\u0613"+
		"\u0001\u0000\u0000\u0000\u061d\u0615\u0001\u0000\u0000\u0000\u061e\u00e3"+
		"\u0001\u0000\u0000\u0000\u061f\u0620\u0003\u0006\u0003\u0000\u0620\u0621"+
		"\u0005\u000e\u0000\u0000\u0621\u0622\u0003\f\u0006\u0000\u0622\u00e5\u0001"+
		"\u0000\u0000\u0000\u0623\u0624\u0003\u00eew\u0000\u0624\u0625\u0005\u000e"+
		"\u0000\u0000\u0625\u0626\u0003\f\u0006\u0000\u0626\u00e7\u0001\u0000\u0000"+
		"\u0000\u0627\u0628\u00055\u0000\u0000\u0628\u0637\u0003\u00eau\u0000\u0629"+
		"\u062a\u00056\u0000\u0000\u062a\u0637\u0003\u00eau\u0000\u062b\u062c\u0005"+
		"G\u0000\u0000\u062c\u0637\u0003\u00ecv\u0000\u062d\u0631\u0005\u0013\u0000"+
		"\u0000\u062e\u0630\u0005\r\u0000\u0000\u062f\u062e\u0001\u0000\u0000\u0000"+
		"\u0630\u0633\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000"+
		"\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0634\u0001\u0000\u0000\u0000"+
		"\u0633\u0631\u0001\u0000\u0000\u0000\u0634\u0637\u0003\u00f0x\u0000\u0635"+
		"\u0637\u0003\u00f2y\u0000\u0636\u0627\u0001\u0000\u0000\u0000\u0636\u0629"+
		"\u0001\u0000\u0000\u0000\u0636\u062b\u0001\u0000\u0000\u0000\u0636\u062d"+
		"\u0001\u0000\u0000\u0000\u0636\u0635\u0001\u0000\u0000\u0000\u0637\u00e9"+
		"\u0001\u0000\u0000\u0000\u0638\u063b\u0003\u0006\u0003\u0000\u0639\u063a"+
		"\u0005\u000e\u0000\u0000\u063a\u063c\u0003\f\u0006\u0000\u063b\u0639\u0001"+
		"\u0000\u0000\u0000\u063b\u063c\u0001\u0000\u0000\u0000\u063c\u063d\u0001"+
		"\u0000\u0000\u0000\u063d\u063e\u0005#\u0000\u0000\u063e\u063f\u00038\u001c"+
		"\u0000\u063f\u0649\u0001\u0000\u0000\u0000\u0640\u0643\u0003\u0088D\u0000"+
		"\u0641\u0642\u0005\u000e\u0000\u0000\u0642\u0644\u0003\f\u0006\u0000\u0643"+
		"\u0641\u0001\u0000\u0000\u0000\u0643\u0644\u0001\u0000\u0000\u0000\u0644"+
		"\u0645\u0001\u0000\u0000\u0000\u0645\u0646\u0005#\u0000\u0000\u0646\u0647"+
		"\u00038\u001c\u0000\u0647\u0649\u0001\u0000\u0000\u0000\u0648\u0638\u0001"+
		"\u0000\u0000\u0000\u0648\u0640\u0001\u0000\u0000\u0000\u0649\u00eb\u0001"+
		"\u0000\u0000\u0000\u064a\u064d\u0003\u00eew\u0000\u064b\u064c\u0005\u000e"+
		"\u0000\u0000\u064c\u064e\u0003\f\u0006\u0000\u064d\u064b\u0001\u0000\u0000"+
		"\u0000\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u064f\u0001\u0000\u0000"+
		"\u0000\u064f\u0650\u0005#\u0000\u0000\u0650\u0651\u00038\u001c\u0000\u0651"+
		"\u065b\u0001\u0000\u0000\u0000\u0652\u0653\u0005\u0005\u0000\u0000\u0653"+
		"\u0655\u0003\u00aeW\u0000\u0654\u0656\u0003\u00ba]\u0000\u0655\u0654\u0001"+
		"\u0000\u0000\u0000\u0655\u0656\u0001\u0000\u0000\u0000\u0656\u0657\u0001"+
		"\u0000\u0000\u0000\u0657\u0658\u0005#\u0000\u0000\u0658\u0659\u0003\u0116"+
		"\u008b\u0000\u0659\u065b\u0001\u0000\u0000\u0000\u065a\u064a\u0001\u0000"+
		"\u0000\u0000\u065a\u0652\u0001\u0000\u0000\u0000\u065b\u00ed\u0001\u0000"+
		"\u0000\u0000\u065c\u065e\u0005P\u0000\u0000\u065d\u065f\u0003\u00aaU\u0000"+
		"\u065e\u065d\u0001\u0000\u0000\u0000\u065e\u065f\u0001\u0000\u0000\u0000"+
		"\u065f\u0661\u0001\u0000\u0000\u0000\u0660\u0662\u0003\u00ba]\u0000\u0661"+
		"\u0660\u0001\u0000\u0000\u0000\u0661\u0662\u0001\u0000\u0000\u0000\u0662"+
		"\u00ef\u0001\u0000\u0000\u0000\u0663\u0665\u0005P\u0000\u0000\u0664\u0666"+
		"\u0003\u009eO\u0000\u0665\u0664\u0001\u0000\u0000\u0000\u0665\u0666\u0001"+
		"\u0000\u0000\u0000\u0666\u066a\u0001\u0000\u0000\u0000\u0667\u0669\u0003"+
		"\u0012\t\u0000\u0668\u0667\u0001\u0000\u0000\u0000\u0669\u066c\u0001\u0000"+
		"\u0000\u0000\u066a\u0668\u0001\u0000\u0000\u0000\u066a\u066b\u0001\u0000"+
		"\u0000\u0000\u066b\u066d\u0001\u0000\u0000\u0000\u066c\u066a\u0001\u0000"+
		"\u0000\u0000\u066d\u0670\u00032\u0019\u0000\u066e\u066f\u0005#\u0000\u0000"+
		"\u066f\u0671\u0003\f\u0006\u0000\u0670\u066e\u0001\u0000\u0000\u0000\u0670"+
		"\u0671\u0001\u0000\u0000\u0000\u0671\u00f1\u0001\u0000\u0000\u0000\u0672"+
		"\u0674\u0005/\u0000\u0000\u0673\u0672\u0001\u0000\u0000\u0000\u0673\u0674"+
		"\u0001\u0000\u0000\u0000\u0674\u0675\u0001\u0000\u0000\u0000\u0675\u0678"+
		"\u0005H\u0000\u0000\u0676\u0678\u0005I\u0000\u0000\u0677\u0673\u0001\u0000"+
		"\u0000\u0000\u0677\u0676\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000"+
		"\u0000\u0000\u0679\u0684\u0003\u00f4z\u0000\u067a\u067c\u0005/\u0000\u0000"+
		"\u067b\u067a\u0001\u0000\u0000\u0000\u067b\u067c\u0001\u0000\u0000\u0000"+
		"\u067c\u067d\u0001\u0000\u0000\u0000\u067d\u067e\u0005J\u0000\u0000\u067e"+
		"\u0684\u0003\u00fa}\u0000\u067f\u0680\u0005K\u0000\u0000\u0680\u0684\u0003"+
		"\u00fc~\u0000\u0681\u0682\u00053\u0000\u0000\u0682\u0684\u0003\u00fe\u007f"+
		"\u0000\u0683\u0677\u0001\u0000\u0000\u0000\u0683\u067b\u0001\u0000\u0000"+
		"\u0000\u0683\u067f\u0001\u0000\u0000\u0000\u0683\u0681\u0001\u0000\u0000"+
		"\u0000\u0684\u00f3\u0001\u0000\u0000\u0000\u0685\u0686\u0005P\u0000\u0000"+
		"\u0686\u0688\u0003\u00f6{\u0000\u0687\u0689\u0003\u010c\u0086\u0000\u0688"+
		"\u0687\u0001\u0000\u0000\u0000\u0688\u0689\u0001\u0000\u0000\u0000\u0689"+
		"\u00f5\u0001\u0000\u0000\u0000\u068a\u068c\u0003\u0096K\u0000\u068b\u068a"+
		"\u0001\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068e"+
		"\u0001\u0000\u0000\u0000\u068d\u068f\u0003\u00f8|\u0000\u068e\u068d\u0001"+
		"\u0000\u0000\u0000\u068e\u068f\u0001\u0000\u0000\u0000\u068f\u0690\u0001"+
		"\u0000\u0000\u0000\u0690\u0691\u0003\u00a2Q\u0000\u0691\u00f7\u0001\u0000"+
		"\u0000\u0000\u0692\u0694\u0003\u00ceg\u0000\u0693\u0692\u0001\u0000\u0000"+
		"\u0000\u0694\u0697\u0001\u0000\u0000\u0000\u0695\u0693\u0001\u0000\u0000"+
		"\u0000\u0695\u0696\u0001\u0000\u0000\u0000\u0696\u0699\u0001\u0000\u0000"+
		"\u0000\u0697\u0695\u0001\u0000\u0000\u0000\u0698\u069a\u0003\u00cae\u0000"+
		"\u0699\u0698\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000\u0000\u0000"+
		"\u069a\u00f9\u0001\u0000\u0000\u0000\u069b\u069d\u0005P\u0000\u0000\u069c"+
		"\u069e\u0003\u010c\u0086\u0000\u069d\u069c\u0001\u0000\u0000\u0000\u069d"+
		"\u069e\u0001\u0000\u0000\u0000\u069e\u00fb\u0001\u0000\u0000\u0000\u069f"+
		"\u06a0\u0005P\u0000\u0000\u06a0\u06a1\u0003\u00f6{\u0000\u06a1\u06a2\u0003"+
		"\u010e\u0087\u0000\u06a2\u06a3\u0003\u0126\u0093\u0000\u06a3\u00fd\u0001"+
		"\u0000\u0000\u0000\u06a4\u06a6\u0003\u0100\u0080\u0000\u06a5\u06a4\u0001"+
		"\u0000\u0000\u0000\u06a5\u06a6\u0001\u0000\u0000\u0000\u06a6\u06ad\u0001"+
		"\u0000\u0000\u0000\u06a7\u06aa\u0003\u001c\u000e\u0000\u06a8\u06a9\u0005"+
		"#\u0000\u0000\u06a9\u06ab\u00038\u001c\u0000\u06aa\u06a8\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06ae\u0001\u0000\u0000"+
		"\u0000\u06ac\u06ae\u0003\u0102\u0081\u0000\u06ad\u06a7\u0001\u0000\u0000"+
		"\u0000\u06ad\u06ac\u0001\u0000\u0000\u0000\u06ae\u00ff\u0001\u0000\u0000"+
		"\u0000\u06af\u06b1\u0005P\u0000\u0000\u06b0\u06af\u0001\u0000\u0000\u0000"+
		"\u06b0\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b3\u0001\u0000\u0000\u0000"+
		"\u06b2\u06b4\u0003\u00b2Y\u0000\u06b3\u06b2\u0001\u0000\u0000\u0000\u06b3"+
		"\u06b4\u0001\u0000\u0000\u0000\u06b4\u06b8\u0001\u0000\u0000\u0000\u06b5"+
		"\u06b7\u0003\u00b8\\\u0000\u06b6\u06b5\u0001\u0000\u0000\u0000\u06b7\u06ba"+
		"\u0001\u0000\u0000\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b8\u06b9"+
		"\u0001\u0000\u0000\u0000\u06b9\u06bb\u0001\u0000\u0000\u0000\u06ba\u06b8"+
		"\u0001\u0000\u0000\u0000\u06bb\u06bc\u0005\u000e\u0000\u0000\u06bc\u0101"+
		"\u0001\u0000\u0000\u0000\u06bd\u06c2\u0003\u0112\u0089\u0000\u06be\u06bf"+
		"\u0005)\u0000\u0000\u06bf\u06c1\u0003\u0112\u0089\u0000\u06c0\u06be\u0001"+
		"\u0000\u0000\u0000\u06c1\u06c4\u0001\u0000\u0000\u0000\u06c2\u06c0\u0001"+
		"\u0000\u0000\u0000\u06c2\u06c3\u0001\u0000\u0000\u0000\u06c3\u06c7\u0001"+
		"\u0000\u0000\u0000\u06c4\u06c2\u0001\u0000\u0000\u0000\u06c5\u06c6\u0005"+
		")\u0000\u0000\u06c6\u06c8\u0003\u011c\u008e\u0000\u06c7\u06c5\u0001\u0000"+
		"\u0000\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u0103\u0001\u0000"+
		"\u0000\u0000\u06c9\u06cb\u0005F\u0000\u0000\u06ca\u06cc\u0003\u00b2Y\u0000"+
		"\u06cb\u06ca\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000"+
		"\u06cc\u06d0\u0001\u0000\u0000\u0000\u06cd\u06cf\u0003\u00b8\\\u0000\u06ce"+
		"\u06cd\u0001\u0000\u0000\u0000\u06cf\u06d2\u0001\u0000\u0000\u0000\u06d0"+
		"\u06ce\u0001\u0000\u0000\u0000\u06d0\u06d1\u0001\u0000\u0000\u0000\u06d1"+
		"\u06d3\u0001\u0000\u0000\u0000\u06d2\u06d0\u0001\u0000\u0000\u0000\u06d3"+
		"\u06d4\u0005\f\u0000\u0000\u06d4\u06d5\u0003\u00be_\u0000\u06d5\u06d9"+
		"\u0005\r\u0000\u0000\u06d6\u06d8\u0003\u00b8\\\u0000\u06d7\u06d6\u0001"+
		"\u0000\u0000\u0000\u06d8\u06db\u0001\u0000\u0000\u0000\u06d9\u06d7\u0001"+
		"\u0000\u0000\u0000\u06d9\u06da\u0001\u0000\u0000\u0000\u06da\u06dc\u0001"+
		"\u0000\u0000\u0000\u06db\u06d9\u0001\u0000\u0000\u0000\u06dc\u06dd\u0003"+
		"\u0106\u0083\u0000\u06dd\u0105\u0001\u0000\u0000\u0000\u06de\u06e3\u0003"+
		"\u010a\u0085\u0000\u06df\u06e0\u0005\f\u0000\u0000\u06e0\u06e2\u0003\u010a"+
		"\u0085\u0000\u06e1\u06df\u0001\u0000\u0000\u0000\u06e2\u06e5\u0001\u0000"+
		"\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000"+
		"\u0000\u0000\u06e4\u0107\u0001\u0000\u0000\u0000\u06e5\u06e3\u0001\u0000"+
		"\u0000\u0000\u06e6\u06f5\u0003\u010a\u0085\u0000\u06e7\u06e9\u0005\r\u0000"+
		"\u0000\u06e8\u06e7\u0001\u0000\u0000\u0000\u06e8\u06e9\u0001\u0000\u0000"+
		"\u0000\u06e9\u06f2\u0001\u0000\u0000\u0000\u06ea\u06eb\u0005\u0010\u0000"+
		"\u0000\u06eb\u06ec\u0003\u0106\u0083\u0000\u06ec\u06ed\u0005\u0011\u0000"+
		"\u0000\u06ed\u06f3\u0001\u0000\u0000\u0000\u06ee\u06ef\u0005Q\u0000\u0000"+
		"\u06ef\u06f0\u0003\u0106\u0083\u0000\u06f0\u06f1\u0005R\u0000\u0000\u06f1"+
		"\u06f3\u0001\u0000\u0000\u0000\u06f2\u06ea\u0001\u0000\u0000\u0000\u06f2"+
		"\u06ee\u0001\u0000\u0000\u0000\u06f3\u06f5\u0001\u0000\u0000\u0000\u06f4"+
		"\u06e6\u0001\u0000\u0000\u0000\u06f4\u06e8\u0001\u0000\u0000\u0000\u06f5"+
		"\u0109\u0001\u0000\u0000\u0000\u06f6\u06f8\u0003\u00ceg\u0000\u06f7\u06f9"+
		"\u0005\r\u0000\u0000\u06f8\u06f7\u0001\u0000\u0000\u0000\u06f8\u06f9\u0001"+
		"\u0000\u0000\u0000\u06f9\u06fb\u0001\u0000\u0000\u0000\u06fa\u06f6\u0001"+
		"\u0000\u0000\u0000\u06fb\u06fe\u0001\u0000\u0000\u0000\u06fc\u06fa\u0001"+
		"\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000\u0000\u0000\u06fd\u0702\u0001"+
		"\u0000\u0000\u0000\u06fe\u06fc\u0001\u0000\u0000\u0000\u06ff\u0701\u0003"+
		"\u00c6c\u0000\u0700\u06ff\u0001\u0000\u0000\u0000\u0701\u0704\u0001\u0000"+
		"\u0000\u0000\u0702\u0700\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000"+
		"\u0000\u0000\u0703\u0705\u0001\u0000\u0000\u0000\u0704\u0702\u0001\u0000"+
		"\u0000\u0000\u0705\u0706\u0005G\u0000\u0000\u0706\u0709\u0003\u00ecv\u0000"+
		"\u0707\u0709\u0003\u00d2i\u0000\u0708\u06fc\u0001\u0000\u0000\u0000\u0708"+
		"\u0707\u0001\u0000\u0000\u0000\u0709\u010b\u0001\u0000\u0000\u0000\u070a"+
		"\u070c\u0003\u010e\u0087\u0000\u070b\u070d\u0003\u011e\u008f\u0000\u070c"+
		"\u070b\u0001\u0000\u0000\u0000\u070c\u070d\u0001\u0000\u0000\u0000\u070d"+
		"\u010d\u0001\u0000\u0000\u0000\u070e\u070f\u0005L\u0000\u0000\u070f\u0711"+
		"\u0003\u0110\u0088\u0000\u0710\u070e\u0001\u0000\u0000\u0000\u0710\u0711"+
		"\u0001\u0000\u0000\u0000\u0711\u071b\u0001\u0000\u0000\u0000\u0712\u0713"+
		"\u0005M\u0000\u0000\u0713\u0718\u0003\u0004\u0002\u0000\u0714\u0715\u0005"+
		"\u0004\u0000\u0000\u0715\u0717\u0003\u0004\u0002\u0000\u0716\u0714\u0001"+
		"\u0000\u0000\u0000\u0717\u071a\u0001\u0000\u0000\u0000\u0718\u0716\u0001"+
		"\u0000\u0000\u0000\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u071c\u0001"+
		"\u0000\u0000\u0000\u071a\u0718\u0001\u0000\u0000\u0000\u071b\u0712\u0001"+
		"\u0000\u0000\u0000\u071b\u071c\u0001\u0000\u0000\u0000\u071c\u010f\u0001"+
		"\u0000\u0000\u0000\u071d\u072c\u0003\u0112\u0089\u0000\u071e\u071f\u0005"+
		"\u0004\u0000\u0000\u071f\u0721\u0003\u0112\u0089\u0000\u0720\u071e\u0001"+
		"\u0000\u0000\u0000\u0721\u0724\u0001\u0000\u0000\u0000\u0722\u0720\u0001"+
		"\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u072d\u0001"+
		"\u0000\u0000\u0000\u0724\u0722\u0001\u0000\u0000\u0000\u0725\u0726\u0005"+
		")\u0000\u0000\u0726\u0728\u0003\u0112\u0089\u0000\u0727\u0725\u0001\u0000"+
		"\u0000\u0000\u0728\u072b\u0001\u0000\u0000\u0000\u0729\u0727\u0001\u0000"+
		"\u0000\u0000\u0729\u072a\u0001\u0000\u0000\u0000\u072a\u072d\u0001\u0000"+
		"\u0000\u0000\u072b\u0729\u0001\u0000\u0000\u0000\u072c\u0722\u0001\u0000"+
		"\u0000\u0000\u072c\u0729\u0001\u0000\u0000\u0000\u072d\u0111\u0001\u0000"+
		"\u0000\u0000\u072e\u0732\u0003 \u0010\u0000\u072f\u0731\u0003\u00ceg\u0000"+
		"\u0730\u072f\u0001\u0000\u0000\u0000\u0731\u0734\u0001\u0000\u0000\u0000"+
		"\u0732\u0730\u0001\u0000\u0000\u0000\u0732\u0733\u0001\u0000\u0000\u0000"+
		"\u0733\u0738\u0001\u0000\u0000\u0000\u0734\u0732\u0001\u0000\u0000\u0000"+
		"\u0735\u0737\u0003^/\u0000\u0736\u0735\u0001\u0000\u0000\u0000\u0737\u073a"+
		"\u0001\u0000\u0000\u0000\u0738\u0736\u0001\u0000\u0000\u0000\u0738\u0739"+
		"\u0001\u0000\u0000\u0000\u0739\u0113\u0001\u0000\u0000\u0000\u073a\u0738"+
		"\u0001\u0000\u0000\u0000\u073b\u0740\u0003\u0118\u008c\u0000\u073c\u073d"+
		"\u0005\f\u0000\u0000\u073d\u073f\u0003h4\u0000\u073e\u073c\u0001\u0000"+
		"\u0000\u0000\u073f\u0742\u0001\u0000\u0000\u0000\u0740\u073e\u0001\u0000"+
		"\u0000\u0000\u0740\u0741\u0001\u0000\u0000\u0000\u0741\u0115\u0001\u0000"+
		"\u0000\u0000\u0742\u0740\u0001\u0000\u0000\u0000\u0743\u074f\u0003\u0118"+
		"\u008c\u0000\u0744\u0745\u0005\u0010\u0000\u0000\u0745\u0746\u0003\u0114"+
		"\u008a\u0000\u0746\u0747\u0005\u0011\u0000\u0000\u0747\u074d\u0001\u0000"+
		"\u0000\u0000\u0748\u0749\u0005Q\u0000\u0000\u0749\u074a\u0003\u0114\u008a"+
		"\u0000\u074a\u074b\u0005R\u0000\u0000\u074b\u074d\u0001\u0000\u0000\u0000"+
		"\u074c\u0744\u0001\u0000\u0000\u0000\u074c\u0748\u0001\u0000\u0000\u0000"+
		"\u074d\u074f\u0001\u0000\u0000\u0000\u074e\u0743\u0001\u0000\u0000\u0000"+
		"\u074e\u074c\u0001\u0000\u0000\u0000\u074f\u0117\u0001\u0000\u0000\u0000"+
		"\u0750\u0751\u0005\u0005\u0000\u0000\u0751\u0755\u0003`0\u0000\u0752\u0754"+
		"\u0003`0\u0000\u0753\u0752\u0001\u0000\u0000\u0000\u0754\u0757\u0001\u0000"+
		"\u0000\u0000\u0755\u0753\u0001\u0000\u0000\u0000\u0755\u0756\u0001\u0000"+
		"\u0000\u0000\u0756\u0119\u0001\u0000\u0000\u0000\u0757\u0755\u0001\u0000"+
		"\u0000\u0000\u0758\u075a\u0003\u0122\u0091\u0000\u0759\u0758\u0001\u0000"+
		"\u0000\u0000\u0759\u075a\u0001\u0000\u0000\u0000\u075a\u075b\u0001\u0000"+
		"\u0000\u0000\u075b\u075c\u0003\u0120\u0090\u0000\u075c\u075d\u0005\f\u0000"+
		"\u0000\u075d\u075e\u0003\u0120\u0090\u0000\u075e\u011b\u0001\u0000\u0000"+
		"\u0000\u075f\u0760\u0005\u0010\u0000\u0000\u0760\u0761\u0003\u011a\u008d"+
		"\u0000\u0761\u0762\u0005\u0011\u0000\u0000\u0762\u0768\u0001\u0000\u0000"+
		"\u0000\u0763\u0764\u0005Q\u0000\u0000\u0764\u0765\u0003\u011a\u008d\u0000"+
		"\u0765\u0766\u0005R\u0000\u0000\u0766\u0768\u0001\u0000\u0000\u0000\u0767"+
		"\u075f\u0001\u0000\u0000\u0000\u0767\u0763\u0001\u0000\u0000\u0000\u0768"+
		"\u011d\u0001\u0000\u0000\u0000\u0769\u076b\u0005\r\u0000\u0000\u076a\u0769"+
		"\u0001\u0000\u0000\u0000\u076a\u076b\u0001\u0000\u0000\u0000\u076b\u076c"+
		"\u0001\u0000\u0000\u0000\u076c\u076d\u0005\u0010\u0000\u0000\u076d\u076e"+
		"\u0003\u011a\u008d\u0000\u076e\u076f\u0005\u0011\u0000\u0000\u076f\u0776"+
		"\u0001\u0000\u0000\u0000\u0770\u0771\u0005S\u0000\u0000\u0771\u0772\u0005"+
		"Q\u0000\u0000\u0772\u0773\u0003\u011a\u008d\u0000\u0773\u0774\u0005R\u0000"+
		"\u0000\u0774\u0776\u0001\u0000\u0000\u0000\u0775\u076a\u0001\u0000\u0000"+
		"\u0000\u0775\u0770\u0001\u0000\u0000\u0000\u0776\u011f\u0001\u0000\u0000"+
		"\u0000\u0777\u078d\u0003\u00d0h\u0000\u0778\u078d\u0003\u00d2i\u0000\u0779"+
		"\u077b\u0003\u00ceg\u0000\u077a\u077c\u0005\r\u0000\u0000\u077b\u077a"+
		"\u0001\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u077e"+
		"\u0001\u0000\u0000\u0000\u077d\u0779\u0001\u0000\u0000\u0000\u077e\u0781"+
		"\u0001\u0000\u0000\u0000\u077f\u077d\u0001\u0000\u0000\u0000\u077f\u0780"+
		"\u0001\u0000\u0000\u0000\u0780\u0785\u0001\u0000\u0000\u0000\u0781\u077f"+
		"\u0001\u0000\u0000\u0000\u0782\u0784\u0003\u00c6c\u0000\u0783\u0782\u0001"+
		"\u0000\u0000\u0000\u0784\u0787\u0001\u0000\u0000\u0000\u0785\u0783\u0001"+
		"\u0000\u0000\u0000\u0785\u0786\u0001\u0000\u0000\u0000\u0786\u0788\u0001"+
		"\u0000\u0000\u0000\u0787\u0785\u0001\u0000\u0000\u0000\u0788\u078d\u0003"+
		"\u00e8t\u0000\u0789\u078d\u0003\u0104\u0082\u0000\u078a\u078d\u0003>\u001f"+
		"\u0000\u078b\u078d\u0003\u00deo\u0000\u078c\u0777\u0001\u0000\u0000\u0000"+
		"\u078c\u0778\u0001\u0000\u0000\u0000\u078c\u077f\u0001\u0000\u0000\u0000"+
		"\u078c\u0789\u0001\u0000\u0000\u0000\u078c\u078a\u0001\u0000\u0000\u0000"+
		"\u078c\u078b\u0001\u0000\u0000\u0000\u078d\u0121\u0001\u0000\u0000\u0000"+
		"\u078e\u0791\u0005P\u0000\u0000\u078f\u0790\u0005\u000e\u0000\u0000\u0790"+
		"\u0792\u0003\u0018\f\u0000\u0791\u078f\u0001\u0000\u0000\u0000\u0791\u0792"+
		"\u0001\u0000\u0000\u0000\u0792\u0793\u0001\u0000\u0000\u0000\u0793\u079a"+
		"\u0005\n\u0000\u0000\u0794\u0795\u0005\u0005\u0000\u0000\u0795\u0796\u0005"+
		"\u000e\u0000\u0000\u0796\u0797\u0003\u0018\f\u0000\u0797\u0798\u0005\n"+
		"\u0000\u0000\u0798\u079a\u0001\u0000\u0000\u0000\u0799\u078e\u0001\u0000"+
		"\u0000\u0000\u0799\u0794\u0001\u0000\u0000\u0000\u079a\u0123\u0001\u0000"+
		"\u0000\u0000\u079b\u079d\u0003\u0122\u0091\u0000\u079c\u079b\u0001\u0000"+
		"\u0000\u0000\u079c\u079d\u0001\u0000\u0000\u0000\u079d\u079e\u0001\u0000"+
		"\u0000\u0000\u079e\u07a3\u0003\u0128\u0094\u0000\u079f\u07a0\u0005\f\u0000"+
		"\u0000\u07a0\u07a2\u0003\u0128\u0094\u0000\u07a1\u079f\u0001\u0000\u0000"+
		"\u0000\u07a2\u07a5\u0001\u0000\u0000\u0000\u07a3\u07a1\u0001\u0000\u0000"+
		"\u0000\u07a3\u07a4\u0001\u0000\u0000\u0000\u07a4\u0125\u0001\u0000\u0000"+
		"\u0000\u07a5\u07a3\u0001\u0000\u0000\u0000\u07a6\u07a8\u0005\r\u0000\u0000"+
		"\u07a7\u07a6\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001\u0000\u0000\u0000"+
		"\u07a8\u07a9\u0001\u0000\u0000\u0000\u07a9\u07b0\u0003\u0124\u0092\u0000"+
		"\u07aa\u07ab\u0005S\u0000\u0000\u07ab\u07ac\u0005Q\u0000\u0000\u07ac\u07ad"+
		"\u0003\u0124\u0092\u0000\u07ad\u07ae\u0005R\u0000\u0000\u07ae\u07b0\u0001"+
		"\u0000\u0000\u0000\u07af\u07a7\u0001\u0000\u0000\u0000\u07af\u07aa\u0001"+
		"\u0000\u0000\u0000\u07b0\u0127\u0001\u0000\u0000\u0000\u07b1\u07c3\u0003"+
		"\u0120\u0090\u0000\u07b2\u07b4\u0003\u00ceg\u0000\u07b3\u07b5\u0005\r"+
		"\u0000\u0000\u07b4\u07b3\u0001\u0000\u0000\u0000\u07b4\u07b5\u0001\u0000"+
		"\u0000\u0000\u07b5\u07b7\u0001\u0000\u0000\u0000\u07b6\u07b2\u0001\u0000"+
		"\u0000\u0000\u07b7\u07ba\u0001\u0000\u0000\u0000\u07b8\u07b6\u0001\u0000"+
		"\u0000\u0000\u07b8\u07b9\u0001\u0000\u0000\u0000\u07b9\u07be\u0001\u0000"+
		"\u0000\u0000\u07ba\u07b8\u0001\u0000\u0000\u0000\u07bb\u07bd\u0003\u00c6"+
		"c\u0000\u07bc\u07bb\u0001\u0000\u0000\u0000\u07bd\u07c0\u0001\u0000\u0000"+
		"\u0000\u07be\u07bc\u0001\u0000\u0000\u0000\u07be\u07bf\u0001\u0000\u0000"+
		"\u0000\u07bf\u07c1\u0001\u0000\u0000\u0000\u07c0\u07be\u0001\u0000\u0000"+
		"\u0000\u07c1\u07c3\u0003\u012a\u0095\u0000\u07c2\u07b1\u0001\u0000\u0000"+
		"\u0000\u07c2\u07b8\u0001\u0000\u0000\u0000\u07c3\u0129\u0001\u0000\u0000"+
		"\u0000\u07c4\u07cc\u0005/\u0000\u0000\u07c5\u07c6\u0005P\u0000\u0000\u07c6"+
		"\u07c9\u0003\u00f6{\u0000\u07c7\u07c8\u0005L\u0000\u0000\u07c8\u07ca\u0003"+
		"\u0110\u0088\u0000\u07c9\u07c7\u0001\u0000\u0000\u0000\u07c9\u07ca\u0001"+
		"\u0000\u0000\u0000\u07ca\u07cd\u0001\u0000\u0000\u0000\u07cb\u07cd\u0003"+
		"\u0006\u0003\u0000\u07cc\u07c5\u0001\u0000\u0000\u0000\u07cc\u07cb\u0001"+
		"\u0000\u0000\u0000\u07cd\u012b\u0001\u0000\u0000\u0000\u07ce\u07d3\u0003"+
		"\u012e\u0097\u0000\u07cf\u07d0\u0005\f\u0000\u0000\u07d0\u07d2\u0003\u012e"+
		"\u0097\u0000\u07d1\u07cf\u0001\u0000\u0000\u0000\u07d2\u07d5\u0001\u0000"+
		"\u0000\u0000\u07d3\u07d1\u0001\u0000\u0000\u0000\u07d3\u07d4\u0001\u0000"+
		"\u0000\u0000\u07d4\u012d\u0001\u0000\u0000\u0000\u07d5\u07d3\u0001\u0000"+
		"\u0000\u0000\u07d6\u07ed\u0003\u00d0h\u0000\u07d7\u07ed\u0003\u00d2i\u0000"+
		"\u07d8\u07da\u0003\u00ceg\u0000\u07d9\u07db\u0005\r\u0000\u0000\u07da"+
		"\u07d9\u0001\u0000\u0000\u0000\u07da\u07db\u0001\u0000\u0000\u0000\u07db"+
		"\u07dd\u0001\u0000\u0000\u0000\u07dc\u07d8\u0001\u0000\u0000\u0000\u07dd"+
		"\u07e0\u0001\u0000\u0000\u0000\u07de\u07dc\u0001\u0000\u0000\u0000\u07de"+
		"\u07df\u0001\u0000\u0000\u0000\u07df\u07e4\u0001\u0000\u0000\u0000\u07e0"+
		"\u07de\u0001\u0000\u0000\u0000\u07e1\u07e3\u0003\u00c6c\u0000\u07e2\u07e1"+
		"\u0001\u0000\u0000\u0000\u07e3\u07e6\u0001\u0000\u0000\u0000\u07e4\u07e2"+
		"\u0001\u0000\u0000\u0000\u07e4\u07e5\u0001\u0000\u0000\u0000\u07e5\u07e7"+
		"\u0001\u0000\u0000\u0000\u07e6\u07e4\u0001\u0000\u0000\u0000\u07e7\u07ed"+
		"\u0003\u00e8t\u0000\u07e8\u07ed\u0003\u0104\u0082\u0000\u07e9\u07ed\u0003"+
		"\u0130\u0098\u0000\u07ea\u07ed\u0003\u0132\u0099\u0000\u07eb\u07ed\u0003"+
		"\u00deo\u0000\u07ec\u07d6\u0001\u0000\u0000\u0000\u07ec\u07d7\u0001\u0000"+
		"\u0000\u0000\u07ec\u07de\u0001\u0000\u0000\u0000\u07ec\u07e8\u0001\u0000"+
		"\u0000\u0000\u07ec\u07e9\u0001\u0000\u0000\u0000\u07ec\u07ea\u0001\u0000"+
		"\u0000\u0000\u07ec\u07eb\u0001\u0000\u0000\u0000\u07ed\u012f\u0001\u0000"+
		"\u0000\u0000\u07ee\u07ef\u0005N\u0000\u0000\u07ef\u07f1\u0003\u0004\u0002"+
		"\u0000\u07f0\u07f2\u0005\r\u0000\u0000\u07f1\u07f0\u0001\u0000\u0000\u0000"+
		"\u07f1\u07f2\u0001\u0000\u0000\u0000\u07f2\u07ff\u0001\u0000\u0000\u0000"+
		"\u07f3\u07f5\u0005\r\u0000\u0000\u07f4\u07f3\u0001\u0000\u0000\u0000\u07f4"+
		"\u07f5\u0001\u0000\u0000\u0000\u07f5\u07f6\u0001\u0000\u0000\u0000\u07f6"+
		"\u07f7\u0005\u0010\u0000\u0000\u07f7\u07f8\u0003\u012c\u0096\u0000\u07f8"+
		"\u07f9\u0005\u0011\u0000\u0000\u07f9\u0800\u0001\u0000\u0000\u0000\u07fa"+
		"\u07fb\u0005S\u0000\u0000\u07fb\u07fc\u0005Q\u0000\u0000\u07fc\u07fd\u0003"+
		"\u012c\u0096\u0000\u07fd\u07fe\u0005R\u0000\u0000\u07fe\u0800\u0001\u0000"+
		"\u0000\u0000\u07ff\u07f4\u0001\u0000\u0000\u0000\u07ff\u07fa\u0001\u0000"+
		"\u0000\u0000\u0800\u0131\u0001\u0000\u0000\u0000\u0801\u0802\u0005N\u0000"+
		"\u0000\u0802\u0803\u0005J\u0000\u0000\u0803\u0804\u0003\u00fa}\u0000\u0804"+
		"\u0133\u0001\u0000\u0000\u0000\u0805\u0806\u0005N\u0000\u0000\u0806\u0807"+
		"\u0003\u0004\u0002\u0000\u0807\u0808\u0005\f\u0000\u0000\u0808\u080a\u0001"+
		"\u0000\u0000\u0000\u0809\u0805\u0001\u0000\u0000\u0000\u080a\u080d\u0001"+
		"\u0000\u0000\u0000\u080b\u0809\u0001\u0000\u0000\u0000\u080b\u080c\u0001"+
		"\u0000\u0000\u0000\u080c\u080e\u0001\u0000\u0000\u0000\u080d\u080b\u0001"+
		"\u0000\u0000\u0000\u080e\u080f\u0003\u012c\u0096\u0000\u080f\u0135\u0001"+
		"\u0000\u0000\u0000\u010f\u0137\u013b\u0141\u0147\u014e\u0156\u015c\u0161"+
		"\u0165\u0169\u017a\u0184\u0189\u018d\u0195\u01a8\u01ad\u01b2\u01b7\u01bc"+
		"\u01c3\u01ca\u01dc\u01e3\u01e5\u01eb\u01f2\u01f8\u01ff\u0203\u0209\u0210"+
		"\u0214\u0218\u021c\u0227\u022b\u022f\u0236\u023e\u024a\u0255\u025a\u025d"+
		"\u0266\u026b\u026f\u0272\u0279\u027d\u0286\u0295\u029b\u02a1\u02a7\u02b8"+
		"\u02be\u02c7\u02ca\u02cf\u02d3\u02db\u02e3\u02e5\u02f1\u02f4\u0308\u030c"+
		"\u0314\u0322\u0324\u0329\u032e\u0338\u0344\u0351\u035e\u0365\u036d\u0371"+
		"\u037d\u0383\u0387\u038b\u0395\u039c\u03a0\u03a7\u03ac\u03b0\u03b6\u03bd"+
		"\u03c6\u03d2\u03d6\u03e1\u03e5\u03ee\u03f3\u03f8\u03fe\u0400\u0408\u040f"+
		"\u0412\u041f\u0425\u042d\u0436\u043c\u0441\u0448\u0450\u0456\u045c\u0460"+
		"\u0467\u046c\u0473\u0479\u047c\u0480\u048a\u0494\u0499\u04a0\u04a6\u04ae"+
		"\u04b6\u04ba\u04be\u04c8\u04d0\u04d5\u04df\u04e7\u04eb\u04ef\u04f2\u04f9"+
		"\u04fd\u0501\u0506\u0509\u0510\u0516\u051a\u0521\u0527\u052d\u0531\u0539"+
		"\u053f\u0545\u054a\u054d\u0555\u055d\u0562\u0567\u056b\u0570\u0576\u057b"+
		"\u0587\u058d\u0591\u059a\u05a2\u05a5\u05ac\u05b2\u05b8\u05c3\u05cc\u05d5"+
		"\u05dd\u05e7\u05ef\u05f4\u05f9\u05fb\u0600\u0607\u060a\u0619\u061d\u0631"+
		"\u0636\u063b\u0643\u0648\u064d\u0655\u065a\u065e\u0661\u0665\u066a\u0670"+
		"\u0673\u0677\u067b\u0683\u0688\u068b\u068e\u0695\u0699\u069d\u06a5\u06aa"+
		"\u06ad\u06b0\u06b3\u06b8\u06c2\u06c7\u06cb\u06d0\u06d9\u06e3\u06e8\u06f2"+
		"\u06f4\u06f8\u06fc\u0702\u0708\u070c\u0710\u0718\u071b\u0722\u0729\u072c"+
		"\u0732\u0738\u0740\u074c\u074e\u0755\u0759\u0767\u076a\u0775\u077b\u077f"+
		"\u0785\u078c\u0791\u0799\u079c\u07a3\u07a7\u07af\u07b4\u07b8\u07be\u07c2"+
		"\u07c9\u07cc\u07d3\u07da\u07de\u07e4\u07ec\u07f1\u07f4\u07ff\u080b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}