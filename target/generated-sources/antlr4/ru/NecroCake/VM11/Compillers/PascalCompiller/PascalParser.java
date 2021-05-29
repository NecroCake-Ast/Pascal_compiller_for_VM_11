// Generated from ru/NecroCake/VM11/Compillers/PascalCompiller/Pascal.g4 by ANTLR 4.9.2
package ru.NecroCake.VM11.Compillers.PascalCompiller;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_PROGRAMM=1, KW_VAR=2, KW_BEGIN=3, KW_END=4, KW_READLN=5, KW_WRITELN=6, 
		KW_IF=7, KW_ELSE=8, KW_THEN=9, KW_WHILE=10, KW_DO=11, KW_OR=12, KW_AND=13, 
		KW_DIV=14, KW_MOD=15, KW_SET=16, KW_LPAR=17, KW_RPAR=18, KW_LQPAR=19, 
		KW_RQPAR=20, KW_DOT=21, KW_COMMA=22, KW_COLON=23, KW_SEMICOLON=24, KW_PLUS=25, 
		KW_MINUS=26, KW_MULT=27, KW_SLASH=28, KW_EXP=29, TYPE=30, NUMBER=31, EXP=32, 
		COMPAR_OPS=33, NAME=34, STRING=35, DIGIT=36, CHARACTER=37, NEXT_OP=38, 
		INDEX=39, END_SYMBOL=40, COMMENT=41;
	public static final int
		RULE_programm = 0, RULE_declare_block = 1, RULE_block = 2, RULE_operator = 3, 
		RULE_declare = 4, RULE_read_operator = 5, RULE_write_operator = 6, RULE_if_operator = 7, 
		RULE_else_operator = 8, RULE_while_operator = 9, RULE_set_operator = 10, 
		RULE_compare = 11, RULE_expr = 12, RULE_expr_pr3 = 13, RULE_expr_pr2 = 14, 
		RULE_expr_pr1 = 15, RULE_signed_number = 16, RULE_unsigned_real_number = 17, 
		RULE_real_number = 18, RULE_set = 19, RULE_variable = 20, RULE_value = 21, 
		RULE_param = 22, RULE_name_list = 23, RULE_param_list = 24, RULE_any_number = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "declare_block", "block", "operator", "declare", "read_operator", 
			"write_operator", "if_operator", "else_operator", "while_operator", "set_operator", 
			"compare", "expr", "expr_pr3", "expr_pr2", "expr_pr1", "signed_number", 
			"unsigned_real_number", "real_number", "set", "variable", "value", "param", 
			"name_list", "param_list", "any_number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programm'", "'var'", "'begin'", "'end'", "'readln'", "'writeln'", 
			"'if'", "'else'", "'then'", "'while'", "'do'", "'or'", "'and'", "'div'", 
			"'mod'", "':='", "'('", "')'", "'['", "']'", "'.'", "','", "':'", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_PROGRAMM", "KW_VAR", "KW_BEGIN", "KW_END", "KW_READLN", "KW_WRITELN", 
			"KW_IF", "KW_ELSE", "KW_THEN", "KW_WHILE", "KW_DO", "KW_OR", "KW_AND", 
			"KW_DIV", "KW_MOD", "KW_SET", "KW_LPAR", "KW_RPAR", "KW_LQPAR", "KW_RQPAR", 
			"KW_DOT", "KW_COMMA", "KW_COLON", "KW_SEMICOLON", "KW_PLUS", "KW_MINUS", 
			"KW_MULT", "KW_SLASH", "KW_EXP", "TYPE", "NUMBER", "EXP", "COMPAR_OPS", 
			"NAME", "STRING", "DIGIT", "CHARACTER", "NEXT_OP", "INDEX", "END_SYMBOL", 
			"COMMENT"
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
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
		public TerminalNode KW_PROGRAMM() { return getToken(PascalParser.KW_PROGRAMM, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public TerminalNode EOF() { return getToken(PascalParser.EOF, 0); }
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_DOT() { return getToken(PascalParser.KW_DOT, 0); }
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(KW_PROGRAMM);
			setState(53);
			match(NEXT_OP);
			setState(54);
			match(NAME);
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(55);
				match(NEXT_OP);
				setState(56);
				declare_block();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				match(NEXT_OP);
				setState(60);
				block();
				setState(61);
				match(KW_DOT);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(62);
					match(NEXT_OP);
					}
					break;
				}
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(67);
				match(NEXT_OP);
				}
			}

			setState(70);
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

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode KW_VAR() { return getToken(PascalParser.KW_VAR, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<TerminalNode> KW_SEMICOLON() { return getTokens(PascalParser.KW_SEMICOLON); }
		public TerminalNode KW_SEMICOLON(int i) {
			return getToken(PascalParser.KW_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(KW_VAR);
			setState(73);
			match(NEXT_OP);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(74);
				declare();
				setState(75);
				match(KW_SEMICOLON);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(76);
					match(NEXT_OP);
					}
					break;
				}
				}
				}
				setState(83);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode KW_BEGIN() { return getToken(PascalParser.KW_BEGIN, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public TerminalNode KW_END() { return getToken(PascalParser.KW_END, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(KW_BEGIN);
			setState(85);
			match(NEXT_OP);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_READLN) | (1L << KW_WRITELN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(86);
				operator();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(87);
					match(NEXT_OP);
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(KW_END);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(96);
				match(NEXT_OP);
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

	public static class OperatorContext extends ParserRuleContext {
		public Read_operatorContext read_operator() {
			return getRuleContext(Read_operatorContext.class,0);
		}
		public If_operatorContext if_operator() {
			return getRuleContext(If_operatorContext.class,0);
		}
		public While_operatorContext while_operator() {
			return getRuleContext(While_operatorContext.class,0);
		}
		public Write_operatorContext write_operator() {
			return getRuleContext(Write_operatorContext.class,0);
		}
		public Set_operatorContext set_operator() {
			return getRuleContext(Set_operatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				read_operator();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				if_operator();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				while_operator();
				}
				break;
			case KW_WRITELN:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				write_operator();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				set_operator();
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

	public static class DeclareContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PascalParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PascalParser.NAME, i);
		}
		public TerminalNode KW_COLON() { return getToken(PascalParser.KW_COLON, 0); }
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public List<TerminalNode> KW_COMMA() { return getTokens(PascalParser.KW_COMMA); }
		public TerminalNode KW_COMMA(int i) {
			return getToken(PascalParser.KW_COMMA, i);
		}
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(PascalParser.INDEX, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(NAME);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(107);
						match(NEXT_OP);
						}
					}

					setState(110);
					match(KW_COMMA);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(111);
						match(NEXT_OP);
						}
					}

					setState(114);
					match(NAME);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(120);
				match(NEXT_OP);
				}
			}

			setState(123);
			match(KW_COLON);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(124);
				match(NEXT_OP);
				}
			}

			setState(127);
			match(TYPE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_SET) | (1L << NEXT_OP) | (1L << INDEX))) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(128);
					match(NEXT_OP);
					}
				}

				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_SET:
					{
					setState(131);
					set();
					}
					break;
				case INDEX:
					{
					setState(132);
					match(INDEX);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Read_operatorContext extends ParserRuleContext {
		public TerminalNode KW_READLN() { return getToken(PascalParser.KW_READLN, 0); }
		public TerminalNode KW_LPAR() { return getToken(PascalParser.KW_LPAR, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public TerminalNode KW_RPAR() { return getToken(PascalParser.KW_RPAR, 0); }
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Read_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRead_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRead_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitRead_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_operatorContext read_operator() throws RecognitionException {
		Read_operatorContext _localctx = new Read_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(KW_READLN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(138);
				match(NEXT_OP);
				}
			}

			setState(141);
			match(KW_LPAR);
			setState(142);
			name_list();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(143);
				match(NEXT_OP);
				}
			}

			setState(146);
			match(KW_RPAR);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(147);
				match(NEXT_OP);
				}
			}

			setState(150);
			match(KW_SEMICOLON);
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

	public static class Write_operatorContext extends ParserRuleContext {
		public TerminalNode KW_WRITELN() { return getToken(PascalParser.KW_WRITELN, 0); }
		public TerminalNode KW_LPAR() { return getToken(PascalParser.KW_LPAR, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode KW_RPAR() { return getToken(PascalParser.KW_RPAR, 0); }
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Write_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWrite_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWrite_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitWrite_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_operatorContext write_operator() throws RecognitionException {
		Write_operatorContext _localctx = new Write_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(KW_WRITELN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(153);
				match(NEXT_OP);
				}
			}

			setState(156);
			match(KW_LPAR);
			setState(157);
			param_list();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(158);
				match(NEXT_OP);
				}
			}

			setState(161);
			match(KW_RPAR);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(162);
				match(NEXT_OP);
				}
			}

			setState(165);
			match(KW_SEMICOLON);
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

	public static class If_operatorContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(PascalParser.KW_IF, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode KW_THEN() { return getToken(PascalParser.KW_THEN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public Else_operatorContext else_operator() {
			return getRuleContext(Else_operatorContext.class,0);
		}
		public If_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIf_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIf_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIf_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_operatorContext if_operator() throws RecognitionException {
		If_operatorContext _localctx = new If_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(KW_IF);
			setState(168);
			match(NEXT_OP);
			setState(169);
			compare();
			setState(170);
			match(NEXT_OP);
			setState(171);
			match(KW_THEN);
			setState(172);
			match(NEXT_OP);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READLN:
			case KW_WRITELN:
			case KW_IF:
			case KW_WHILE:
			case NAME:
				{
				setState(173);
				operator();
				}
				break;
			case KW_BEGIN:
				{
				setState(174);
				block();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(175);
					match(NEXT_OP);
					}
				}

				setState(178);
				match(KW_SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(182);
					match(NEXT_OP);
					}
				}

				setState(185);
				else_operator();
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

	public static class Else_operatorContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(PascalParser.KW_ELSE, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public Else_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterElse_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitElse_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitElse_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_operatorContext else_operator() throws RecognitionException {
		Else_operatorContext _localctx = new Else_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(KW_ELSE);
			setState(189);
			match(NEXT_OP);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READLN:
			case KW_WRITELN:
			case KW_IF:
			case KW_WHILE:
			case NAME:
				{
				setState(190);
				operator();
				}
				break;
			case KW_BEGIN:
				{
				setState(191);
				block();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(192);
					match(NEXT_OP);
					}
				}

				setState(195);
				match(KW_SEMICOLON);
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

	public static class While_operatorContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(PascalParser.KW_WHILE, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public TerminalNode KW_DO() { return getToken(PascalParser.KW_DO, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public While_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWhile_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWhile_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitWhile_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_operatorContext while_operator() throws RecognitionException {
		While_operatorContext _localctx = new While_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(KW_WHILE);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(200);
				match(NEXT_OP);
				}
				break;
			}
			setState(203);
			compare();
			setState(204);
			match(NEXT_OP);
			setState(205);
			match(KW_DO);
			setState(206);
			match(NEXT_OP);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_READLN:
			case KW_WRITELN:
			case KW_IF:
			case KW_WHILE:
			case NAME:
				{
				setState(207);
				operator();
				}
				break;
			case KW_BEGIN:
				{
				setState(208);
				block();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(209);
					match(NEXT_OP);
					}
				}

				setState(212);
				match(KW_SEMICOLON);
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

	public static class Set_operatorContext extends ParserRuleContext {
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode KW_SEMICOLON() { return getToken(PascalParser.KW_SEMICOLON, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Set_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSet_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSet_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSet_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_operatorContext set_operator() throws RecognitionException {
		Set_operatorContext _localctx = new Set_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			name_list();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(217);
				match(NEXT_OP);
				}
			}

			setState(220);
			set();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(221);
				match(NEXT_OP);
				}
			}

			setState(224);
			match(KW_SEMICOLON);
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

	public static class CompareContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPAR_OPS() { return getToken(PascalParser.COMPAR_OPS, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			expr();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(227);
				match(NEXT_OP);
				}
			}

			setState(230);
			match(COMPAR_OPS);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(231);
				match(NEXT_OP);
				}
				break;
			}
			setState(234);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_pr3Context expr_pr3() {
			return getRuleContext(Expr_pr3Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_PLUS() { return getToken(PascalParser.KW_PLUS, 0); }
		public TerminalNode KW_MINUS() { return getToken(PascalParser.KW_MINUS, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expr_pr3();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(237);
					match(NEXT_OP);
					}
				}

				setState(240);
				_la = _input.LA(1);
				if ( !(_la==KW_PLUS || _la==KW_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(241);
					match(NEXT_OP);
					}
					break;
				}
				setState(244);
				expr();
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

	public static class Expr_pr3Context extends ParserRuleContext {
		public Expr_pr2Context expr_pr2() {
			return getRuleContext(Expr_pr2Context.class,0);
		}
		public Expr_pr3Context expr_pr3() {
			return getRuleContext(Expr_pr3Context.class,0);
		}
		public TerminalNode KW_MULT() { return getToken(PascalParser.KW_MULT, 0); }
		public TerminalNode KW_SLASH() { return getToken(PascalParser.KW_SLASH, 0); }
		public TerminalNode KW_DIV() { return getToken(PascalParser.KW_DIV, 0); }
		public TerminalNode KW_MOD() { return getToken(PascalParser.KW_MOD, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Expr_pr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_pr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr_pr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr_pr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpr_pr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_pr3Context expr_pr3() throws RecognitionException {
		Expr_pr3Context _localctx = new Expr_pr3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_pr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			expr_pr2();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(248);
					match(NEXT_OP);
					}
				}

				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_DIV) | (1L << KW_MOD) | (1L << KW_MULT) | (1L << KW_SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(252);
					match(NEXT_OP);
					}
					break;
				}
				setState(255);
				expr_pr3();
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

	public static class Expr_pr2Context extends ParserRuleContext {
		public Expr_pr1Context expr_pr1() {
			return getRuleContext(Expr_pr1Context.class,0);
		}
		public TerminalNode NEXT_OP() { return getToken(PascalParser.NEXT_OP, 0); }
		public TerminalNode KW_PLUS() { return getToken(PascalParser.KW_PLUS, 0); }
		public TerminalNode KW_MINUS() { return getToken(PascalParser.KW_MINUS, 0); }
		public Expr_pr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_pr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr_pr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr_pr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpr_pr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_pr2Context expr_pr2() throws RecognitionException {
		Expr_pr2Context _localctx = new Expr_pr2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_pr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PLUS || _la==KW_MINUS) {
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(_la==KW_PLUS || _la==KW_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_OP) {
				{
				setState(261);
				match(NEXT_OP);
				}
			}

			setState(264);
			expr_pr1();
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

	public static class Expr_pr1Context extends ParserRuleContext {
		public Unsigned_real_numberContext unsigned_real_number() {
			return getRuleContext(Unsigned_real_numberContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PascalParser.NUMBER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode KW_LPAR() { return getToken(PascalParser.KW_LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_RPAR() { return getToken(PascalParser.KW_RPAR, 0); }
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Expr_pr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_pr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr_pr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr_pr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpr_pr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_pr1Context expr_pr1() throws RecognitionException {
		Expr_pr1Context _localctx = new Expr_pr1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_pr1);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				unsigned_real_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(KW_LPAR);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(270);
					match(NEXT_OP);
					}
					break;
				}
				setState(273);
				expr();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEXT_OP) {
					{
					setState(274);
					match(NEXT_OP);
					}
				}

				setState(277);
				match(KW_RPAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PascalParser.NUMBER, 0); }
		public TerminalNode KW_PLUS() { return getToken(PascalParser.KW_PLUS, 0); }
		public TerminalNode KW_MINUS() { return getToken(PascalParser.KW_MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PLUS || _la==KW_MINUS) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==KW_PLUS || _la==KW_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(284);
			match(NUMBER);
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

	public static class Unsigned_real_numberContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(PascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PascalParser.NUMBER, i);
		}
		public TerminalNode KW_DOT() { return getToken(PascalParser.KW_DOT, 0); }
		public TerminalNode EXP() { return getToken(PascalParser.EXP, 0); }
		public Unsigned_real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterUnsigned_real_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitUnsigned_real_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnsigned_real_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_real_numberContext unsigned_real_number() throws RecognitionException {
		Unsigned_real_numberContext _localctx = new Unsigned_real_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsigned_real_number);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(NUMBER);
				setState(287);
				match(KW_DOT);
				setState(288);
				match(NUMBER);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXP) {
					{
					setState(289);
					match(EXP);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(NUMBER);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DOT) {
					{
					setState(293);
					match(KW_DOT);
					setState(294);
					match(NUMBER);
					}
				}

				setState(297);
				match(EXP);
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

	public static class Real_numberContext extends ParserRuleContext {
		public Unsigned_real_numberContext unsigned_real_number() {
			return getRuleContext(Unsigned_real_numberContext.class,0);
		}
		public TerminalNode KW_PLUS() { return getToken(PascalParser.KW_PLUS, 0); }
		public TerminalNode KW_MINUS() { return getToken(PascalParser.KW_MINUS, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitReal_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitReal_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_real_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PLUS || _la==KW_MINUS) {
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==KW_PLUS || _la==KW_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(303);
			unsigned_real_number();
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(PascalParser.KW_SET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public TerminalNode NEXT_OP() { return getToken(PascalParser.NEXT_OP, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(KW_SET);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(306);
				match(NEXT_OP);
				}
				break;
			}
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LPAR:
			case KW_PLUS:
			case KW_MINUS:
			case NUMBER:
			case NAME:
			case NEXT_OP:
				{
				setState(309);
				expr();
				}
				break;
			case STRING:
				{
				setState(310);
				match(STRING);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public TerminalNode INDEX() { return getToken(PascalParser.INDEX, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(NAME);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(314);
				match(INDEX);
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

	public static class ValueContext extends ParserRuleContext {
		public Any_numberContext any_number() {
			return getRuleContext(Any_numberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PLUS:
			case KW_MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				any_number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(STRING);
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

	public static class ParamContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PLUS:
			case KW_MINUS:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				value();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(NAME);
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

	public static class Name_listContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> KW_COMMA() { return getTokens(PascalParser.KW_COMMA); }
		public TerminalNode KW_COMMA(int i) {
			return getToken(PascalParser.KW_COMMA, i);
		}
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitName_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitName_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_name_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			variable();
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(326);
						match(NEXT_OP);
						}
					}

					setState(329);
					match(KW_COMMA);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(330);
						match(NEXT_OP);
						}
					}

					setState(333);
					variable();
					}
					} 
				}
				setState(338);
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

	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> KW_COMMA() { return getTokens(PascalParser.KW_COMMA); }
		public TerminalNode KW_COMMA(int i) {
			return getToken(PascalParser.KW_COMMA, i);
		}
		public List<TerminalNode> NEXT_OP() { return getTokens(PascalParser.NEXT_OP); }
		public TerminalNode NEXT_OP(int i) {
			return getToken(PascalParser.NEXT_OP, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			param();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(340);
						match(NEXT_OP);
						}
					}

					setState(343);
					match(KW_COMMA);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEXT_OP) {
						{
						setState(344);
						match(NEXT_OP);
						}
					}

					setState(347);
					param();
					}
					} 
				}
				setState(352);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Any_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PascalParser.NUMBER, 0); }
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Any_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAny_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAny_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitAny_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_numberContext any_number() throws RecognitionException {
		Any_numberContext _localctx = new Any_numberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_any_number);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				real_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				signed_number();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\2\3\2\3\2\3\2\5\2"+
		"B\n\2\5\2D\n\2\3\2\5\2G\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\7\3R"+
		"\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\3\4\5\4[\n\4\7\4]\n\4\f\4\16\4`\13\4\3"+
		"\4\3\4\5\4d\n\4\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\5\6o\n\6\3\6\3\6"+
		"\5\6s\n\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\5\6|\n\6\3\6\3\6\5\6\u0080\n"+
		"\6\3\6\3\6\5\6\u0084\n\6\3\6\3\6\5\6\u0088\n\6\5\6\u008a\n\6\3\7\3\7\5"+
		"\7\u008e\n\7\3\7\3\7\3\7\5\7\u0093\n\7\3\7\3\7\5\7\u0097\n\7\3\7\3\7\3"+
		"\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\b\3\b\5\b\u00a6\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\5\t\u00b7"+
		"\n\t\3\t\5\t\u00ba\n\t\3\t\5\t\u00bd\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c4"+
		"\n\n\3\n\3\n\5\n\u00c8\n\n\3\13\3\13\5\13\u00cc\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\5\13\u00d9\n\13\3\f\3\f\5"+
		"\f\u00dd\n\f\3\f\3\f\5\f\u00e1\n\f\3\f\3\f\3\r\3\r\5\r\u00e7\n\r\3\r\3"+
		"\r\5\r\u00eb\n\r\3\r\3\r\3\16\3\16\5\16\u00f1\n\16\3\16\3\16\5\16\u00f5"+
		"\n\16\3\16\5\16\u00f8\n\16\3\17\3\17\5\17\u00fc\n\17\3\17\3\17\5\17\u0100"+
		"\n\17\3\17\5\17\u0103\n\17\3\20\5\20\u0106\n\20\3\20\5\20\u0109\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0112\n\21\3\21\3\21\5\21\u0116"+
		"\n\21\3\21\3\21\5\21\u011a\n\21\3\22\5\22\u011d\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\5\23\u0125\n\23\3\23\3\23\3\23\5\23\u012a\n\23\3\23\5\23"+
		"\u012d\n\23\3\24\5\24\u0130\n\24\3\24\3\24\3\25\3\25\5\25\u0136\n\25\3"+
		"\25\3\25\5\25\u013a\n\25\3\26\3\26\5\26\u013e\n\26\3\27\3\27\5\27\u0142"+
		"\n\27\3\30\3\30\5\30\u0146\n\30\3\31\3\31\5\31\u014a\n\31\3\31\3\31\5"+
		"\31\u014e\n\31\3\31\7\31\u0151\n\31\f\31\16\31\u0154\13\31\3\32\3\32\5"+
		"\32\u0158\n\32\3\32\3\32\5\32\u015c\n\32\3\32\7\32\u015f\n\32\f\32\16"+
		"\32\u0162\13\32\3\33\3\33\3\33\5\33\u0167\n\33\3\33\2\2\34\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\33\34\4\2\20\21"+
		"\35\36\2\u0195\2\66\3\2\2\2\4J\3\2\2\2\6V\3\2\2\2\bj\3\2\2\2\nl\3\2\2"+
		"\2\f\u008b\3\2\2\2\16\u009a\3\2\2\2\20\u00a9\3\2\2\2\22\u00be\3\2\2\2"+
		"\24\u00c9\3\2\2\2\26\u00da\3\2\2\2\30\u00e4\3\2\2\2\32\u00ee\3\2\2\2\34"+
		"\u00f9\3\2\2\2\36\u0105\3\2\2\2 \u0119\3\2\2\2\"\u011c\3\2\2\2$\u012c"+
		"\3\2\2\2&\u012f\3\2\2\2(\u0133\3\2\2\2*\u013b\3\2\2\2,\u0141\3\2\2\2."+
		"\u0145\3\2\2\2\60\u0147\3\2\2\2\62\u0155\3\2\2\2\64\u0166\3\2\2\2\66\67"+
		"\7\3\2\2\678\7(\2\28;\7$\2\29:\7(\2\2:<\5\4\3\2;9\3\2\2\2;<\3\2\2\2<C"+
		"\3\2\2\2=>\7(\2\2>?\5\6\4\2?A\7\27\2\2@B\7(\2\2A@\3\2\2\2AB\3\2\2\2BD"+
		"\3\2\2\2C=\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\7(\2\2FE\3\2\2\2FG\3\2\2\2GH"+
		"\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\7\4\2\2KS\7(\2\2LM\5\n\6\2MO\7\32\2\2"+
		"NP\7(\2\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QL\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2VW\7\5\2\2W^\7(\2\2XZ\5\b\5\2Y[\7(\2\2"+
		"ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_a\3\2\2\2`^\3\2\2\2ac\7\6\2\2bd\7(\2\2cb\3\2\2\2cd\3\2\2\2d\7\3\2\2"+
		"\2ek\5\f\7\2fk\5\20\t\2gk\5\24\13\2hk\5\16\b\2ik\5\26\f\2je\3\2\2\2jf"+
		"\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lw\7$\2\2mo\7(\2\2nm"+
		"\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\30\2\2qs\7(\2\2rq\3\2\2\2rs\3\2\2\2s"+
		"t\3\2\2\2tv\7$\2\2un\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2z|\7(\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\31\2\2~\u0080"+
		"\7(\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0089"+
		"\7 \2\2\u0082\u0084\7(\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0088\5(\25\2\u0086\u0088\7)\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\13\3\2\2\2\u008b\u008d\7\7\2\2\u008c\u008e\7(\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\7\23\2\2\u0090\u0092\5\60\31\2\u0091\u0093\7(\2\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\24\2\2\u0095\u0097"+
		"\7(\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7\32\2\2\u0099\r\3\2\2\2\u009a\u009c\7\b\2\2\u009b\u009d\7(\2\2"+
		"\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\7\23\2\2\u009f\u00a1\5\62\32\2\u00a0\u00a2\7(\2\2\u00a1\u00a0\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\24\2\2\u00a4\u00a6"+
		"\7(\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\32\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\7(\2"+
		"\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7\13\2\2\u00ae"+
		"\u00b6\7(\2\2\u00af\u00b7\5\b\5\2\u00b0\u00b2\5\6\4\2\u00b1\u00b3\7(\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7\32\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2\2\2"+
		"\u00b7\u00bc\3\2\2\2\u00b8\u00ba\7(\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\5\22\n\2\u00bc\u00b9\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c7"+
		"\7(\2\2\u00c0\u00c8\5\b\5\2\u00c1\u00c3\5\6\4\2\u00c2\u00c4\7(\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\32"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8"+
		"\23\3\2\2\2\u00c9\u00cb\7\f\2\2\u00ca\u00cc\7(\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf"+
		"\7(\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d8\7(\2\2\u00d1\u00d9\5\b\5\2\u00d2"+
		"\u00d4\5\6\4\2\u00d3\u00d5\7(\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00dc\5\60\31"+
		"\2\u00db\u00dd\7(\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\5(\25\2\u00df\u00e1\7(\2\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\32\2\2\u00e3\27\3\2\2"+
		"\2\u00e4\u00e6\5\32\16\2\u00e5\u00e7\7(\2\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7#\2\2\u00e9\u00eb\7(\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\5\32\16\2\u00ed\31\3\2\2\2\u00ee\u00f7\5\34\17\2\u00ef\u00f1\7(\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\t\2"+
		"\2\2\u00f3\u00f5\7(\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f0\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\33\3\2\2\2\u00f9\u0102\5\36\20\2\u00fa\u00fc\7(\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\t\3"+
		"\2\2\u00fe\u0100\7(\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\5\34\17\2\u0102\u00fb\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\35\3\2\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\7(\2\2\u0108\u0107\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\5 \21\2\u010b"+
		"\37\3\2\2\2\u010c\u011a\5$\23\2\u010d\u011a\7!\2\2\u010e\u011a\5*\26\2"+
		"\u010f\u0111\7\23\2\2\u0110\u0112\7(\2\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\5\32\16\2\u0114\u0116\7(\2\2"+
		"\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\7\24\2\2\u0118\u011a\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u010d\3\2\2\2"+
		"\u0119\u010e\3\2\2\2\u0119\u010f\3\2\2\2\u011a!\3\2\2\2\u011b\u011d\t"+
		"\2\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7!\2\2\u011f#\3\2\2\2\u0120\u0121\7!\2\2\u0121\u0122\7\27\2\2\u0122"+
		"\u0124\7!\2\2\u0123\u0125\7\"\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u012d\3\2\2\2\u0126\u0129\7!\2\2\u0127\u0128\7\27\2\2\u0128"+
		"\u012a\7!\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\7\"\2\2\u012c\u0120\3\2\2\2\u012c\u0126\3\2\2\2\u012d"+
		"%\3\2\2\2\u012e\u0130\t\2\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0132\5$\23\2\u0132\'\3\2\2\2\u0133\u0135\7"+
		"\22\2\2\u0134\u0136\7(\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u013a\5\32\16\2\u0138\u013a\7%\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u0138\3\2\2\2\u013a)\3\2\2\2\u013b\u013d\7$\2\2\u013c\u013e"+
		"\7)\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e+\3\2\2\2\u013f\u0142"+
		"\5\64\33\2\u0140\u0142\7%\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2"+
		"\u0142-\3\2\2\2\u0143\u0146\5,\27\2\u0144\u0146\7$\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0144\3\2\2\2\u0146/\3\2\2\2\u0147\u0152\5*\26\2\u0148\u014a"+
		"\7(\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\7\30\2\2\u014c\u014e\7(\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\5*\26\2\u0150\u0149\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\61\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0155\u0160\5.\30\2\u0156\u0158\7(\2\2\u0157\u0156"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\30\2\2"+
		"\u015a\u015c\7(\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\5.\30\2\u015e\u0157\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\63\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0167\7!\2\2\u0164\u0167\5&\24\2\u0165\u0167\5\"\22\2\u0166\u0163"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\65\3\2\2\2C;AC"+
		"FOSZ^cjnrw{\177\u0083\u0087\u0089\u008d\u0092\u0096\u009c\u00a1\u00a5"+
		"\u00b2\u00b6\u00b9\u00bc\u00c3\u00c7\u00cb\u00d4\u00d8\u00dc\u00e0\u00e6"+
		"\u00ea\u00f0\u00f4\u00f7\u00fb\u00ff\u0102\u0105\u0108\u0111\u0115\u0119"+
		"\u011c\u0124\u0129\u012c\u012f\u0135\u0139\u013d\u0141\u0145\u0149\u014d"+
		"\u0152\u0157\u015b\u0160\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}