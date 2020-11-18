// $ANTLR 3.5.1 C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g 2020-11-18 12:20:47

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class trabalhoParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATRIB", "COMMA", "COMP_OP", "DIGITOS", 
		"FIRST_OP", "FallThrough", "L_BRACKET", "L_PAREN", "L_SQUARE", "R_BRACKET", 
		"R_PAREN", "R_SQUARE", "SECOND_OP", "SEMICOLON", "UNDER_SCORE", "VAR", 
		"WS", "'.'", "'do'", "'else'", "'if '", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int ATRIB=4;
	public static final int COMMA=5;
	public static final int COMP_OP=6;
	public static final int DIGITOS=7;
	public static final int FIRST_OP=8;
	public static final int FallThrough=9;
	public static final int L_BRACKET=10;
	public static final int L_PAREN=11;
	public static final int L_SQUARE=12;
	public static final int R_BRACKET=13;
	public static final int R_PAREN=14;
	public static final int R_SQUARE=15;
	public static final int SECOND_OP=16;
	public static final int SEMICOLON=17;
	public static final int UNDER_SCORE=18;
	public static final int VAR=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "iteracao", "termo", "atribuicao", "comando", "num", "block", 
		"fracao", "exprRela", "parse", "teste_else", "fator", "expr", "teste"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public trabalhoParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public trabalhoParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public trabalhoParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return trabalhoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g"; }


		String s;
		HashMap<String, Integer> memory = new HashMap<String, Integer>();



	// $ANTLR start "parse"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:1: parse : block EOF ;
	public final void parse() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parse");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:7: ( block EOF )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:10: block EOF
			{
			dbg.location(16,10);
			pushFollow(FOLLOW_block_in_parse33);
			block();
			state._fsp--;
			dbg.location(16,16);

						for (Map.Entry<String, Integer> entry : memory.entrySet()) {
					            	String key = entry.getKey();
					            	int value = entry.getValue();
					            	System.out.println("Variavel: " + key + " - Valor: " + value);
					        }
						
					dbg.location(23,5);
			match(input,EOF,FOLLOW_EOF_in_parse37); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parse");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parse"



	// $ANTLR start "block"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:25:1: block : ( comando )* ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:25:7: ( ( comando )* )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:25:9: ( comando )*
			{
			dbg.location(25,9);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:25:9: ( comando )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||LA1_0==24||LA1_0==26) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:25:9: comando
					{
					dbg.location(25,9);
					pushFollow(FOLLOW_comando_in_block47);
					comando();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "comando"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:27:1: comando : ( atribuicao | teste | iteracao );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:27:9: ( atribuicao | teste | iteracao )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt2=1;
				}
				break;
			case 24:
				{
				alt2=2;
				}
				break;
			case 26:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:27:11: atribuicao
					{
					dbg.location(27,11);
					pushFollow(FOLLOW_atribuicao_in_comando56);
					atribuicao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:27:24: teste
					{
					dbg.location(27,24);
					pushFollow(FOLLOW_teste_in_comando60);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:27:32: iteracao
					{
					dbg.location(27,32);
					pushFollow(FOLLOW_iteracao_in_comando64);
					iteracao();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "atribuicao"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:29:1: atribuicao : VAR ATRIB expr SEMICOLON ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		int expr2 =0;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:30:2: ( VAR ATRIB expr SEMICOLON )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:31:3: VAR ATRIB expr SEMICOLON
			{
			dbg.location(31,3);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao81); dbg.location(31,7);
			match(input,ATRIB,FOLLOW_ATRIB_in_atribuicao83); dbg.location(31,13);
			pushFollow(FOLLOW_expr_in_atribuicao85);
			expr2=expr();
			state._fsp--;
			dbg.location(31,18);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_atribuicao87); dbg.location(31,28);

						memory.put((VAR1!=null?VAR1.getText():null), expr2);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:36:1: teste : ( 'if ' exprRela 'then' comando teste_else ) ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:36:7: ( ( 'if ' exprRela 'then' comando teste_else ) )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:36:10: ( 'if ' exprRela 'then' comando teste_else )
			{
			dbg.location(36,10);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:36:10: ( 'if ' exprRela 'then' comando teste_else )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:36:11: 'if ' exprRela 'then' comando teste_else
			{
			dbg.location(36,11);
			match(input,24,FOLLOW_24_in_teste102); dbg.location(36,17);
			pushFollow(FOLLOW_exprRela_in_teste104);
			exprRela();
			state._fsp--;
			dbg.location(36,26);
			match(input,25,FOLLOW_25_in_teste106); dbg.location(36,33);
			pushFollow(FOLLOW_comando_in_teste108);
			comando();
			state._fsp--;
			dbg.location(36,41);
			pushFollow(FOLLOW_teste_else_in_teste110);
			teste_else();
			state._fsp--;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste_else"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:38:1: teste_else : ( ( 'else' comando ) |);
	public final void teste_else() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste_else");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:39:2: ( ( 'else' comando ) |)
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==23) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==VAR||LA3_0==24||LA3_0==26) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:40:3: ( 'else' comando )
					{
					dbg.location(40,3);
					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:40:3: ( 'else' comando )
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:40:4: 'else' comando
					{
					dbg.location(40,4);
					match(input,23,FOLLOW_23_in_teste_else127); dbg.location(40,11);
					pushFollow(FOLLOW_comando_in_teste_else129);
					comando();
					state._fsp--;

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:42:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste_else");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste_else"



	// $ANTLR start "iteracao"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:44:1: iteracao : 'while' exprRela 'do' comando ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:44:9: ( 'while' exprRela 'do' comando )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:44:11: 'while' exprRela 'do' comando
			{
			dbg.location(44,11);
			match(input,26,FOLLOW_26_in_iteracao143); dbg.location(44,19);
			pushFollow(FOLLOW_exprRela_in_iteracao145);
			exprRela();
			state._fsp--;
			dbg.location(44,28);
			match(input,22,FOLLOW_22_in_iteracao147); dbg.location(44,33);
			pushFollow(FOLLOW_comando_in_iteracao149);
			comando();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "exprRela"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:46:1: exprRela returns [boolean value] : d= expr COMP_OP e= expr ;
	public final boolean exprRela() throws RecognitionException {
		boolean value = false;


		Token COMP_OP3=null;
		int d =0;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "exprRela");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:47:2: (d= expr COMP_OP e= expr )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:47:4: d= expr COMP_OP e= expr
			{
			dbg.location(47,5);
			pushFollow(FOLLOW_expr_in_exprRela164);
			d=expr();
			state._fsp--;
			dbg.location(47,11);
			COMP_OP3=(Token)match(input,COMP_OP,FOLLOW_COMP_OP_in_exprRela166); dbg.location(47,20);
			pushFollow(FOLLOW_expr_in_exprRela170);
			e=expr();
			state._fsp--;
			dbg.location(47,26);

						if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("=")) value = (d == e);
						else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("!=")) value = d != e;
						else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("<")) value = d < e;
						else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals(">")) value = d > e;
						else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("<=")) value = d <= e;
						else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals(">=")) value = d >= e;
						else System.err.println("Occurred some errors to compare values");
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprRela");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "exprRela"



	// $ANTLR start "expr"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:58:1: expr returns [int value] : d= termo ( FIRST_OP e= termo )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		Token FIRST_OP4=null;
		int d =0;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:59:2: (d= termo ( FIRST_OP e= termo )* )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:60:3: d= termo ( FIRST_OP e= termo )*
			{
			dbg.location(60,4);
			pushFollow(FOLLOW_termo_in_expr192);
			d=termo();
			state._fsp--;
			dbg.location(60,11);
			 
						value += d;
					dbg.location(63,3);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:63:3: ( FIRST_OP e= termo )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==FIRST_OP) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:63:4: FIRST_OP e= termo
					{
					dbg.location(63,4);
					FIRST_OP4=(Token)match(input,FIRST_OP,FOLLOW_FIRST_OP_in_expr200); dbg.location(63,14);
					pushFollow(FOLLOW_termo_in_expr204);
					e=termo();
					state._fsp--;
					dbg.location(63,21);

								if ((FIRST_OP4!=null?FIRST_OP4.getText():null).equals("+")) value += e;
								else value -= e;
							
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "termo"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:69:1: termo returns [int value] : d= fator ( SECOND_OP e= fator )* ;
	public final int termo() throws RecognitionException {
		int value = 0;


		Token SECOND_OP5=null;
		int d =0;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "termo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:70:2: (d= fator ( SECOND_OP e= fator )* )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:71:3: d= fator ( SECOND_OP e= fator )*
			{
			dbg.location(71,4);
			pushFollow(FOLLOW_fator_in_termo228);
			d=fator();
			state._fsp--;
			dbg.location(71,11);

						value += d;
					dbg.location(74,3);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:74:3: ( SECOND_OP e= fator )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==SECOND_OP) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:74:4: SECOND_OP e= fator
					{
					dbg.location(74,4);
					SECOND_OP5=(Token)match(input,SECOND_OP,FOLLOW_SECOND_OP_in_termo235); dbg.location(74,15);
					pushFollow(FOLLOW_fator_in_termo239);
					e=fator();
					state._fsp--;
					dbg.location(74,22);

								if ((SECOND_OP5!=null?SECOND_OP5.getText():null).equals("*")) value *= e;
								else value /= e;
							
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "termo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "termo"



	// $ANTLR start "fator"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:80:1: fator returns [int value] : ( VAR |e= num | L_PAREN e= expr R_PAREN );
	public final int fator() throws RecognitionException {
		int value = 0;


		Token VAR6=null;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "fator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:81:2: ( VAR |e= num | L_PAREN e= expr R_PAREN )
			int alt6=3;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt6=1;
				}
				break;
			case DIGITOS:
				{
				alt6=2;
				}
				break;
			case L_PAREN:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:82:3: VAR
					{
					dbg.location(82,3);
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_fator262); dbg.location(82,7);

								value = 0;
								if (memory.containsKey((VAR6!=null?VAR6.getText():null))) value = (Integer)memory.get((VAR6!=null?VAR6.getText():null));
								else System.err.println("Undefined variable " + (VAR6!=null?VAR6.getText():null));
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:87:5: e= num
					{
					dbg.location(87,6);
					pushFollow(FOLLOW_num_in_fator272);
					e=num();
					state._fsp--;
					dbg.location(87,11);
					 value = e; 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:88:5: L_PAREN e= expr R_PAREN
					{
					dbg.location(88,5);
					match(input,L_PAREN,FOLLOW_L_PAREN_in_fator281); dbg.location(88,14);
					pushFollow(FOLLOW_expr_in_fator285);
					e=expr();
					state._fsp--;
					dbg.location(88,20);
					match(input,R_PAREN,FOLLOW_R_PAREN_in_fator287); dbg.location(88,28);
					 value = e; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "fator"



	// $ANTLR start "num"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:92:1: num returns [int value] : DIGITOS (d= fracao )? ;
	public final int num() throws RecognitionException {
		int value = 0;


		Token DIGITOS7=null;
		String d =null;

		try { dbg.enterRule(getGrammarFileName(), "num");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:93:2: ( DIGITOS (d= fracao )? )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:94:3: DIGITOS (d= fracao )?
			{
			dbg.location(94,3);
			DIGITOS7=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_num312); dbg.location(94,12);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:94:12: (d= fracao )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==21) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:94:12: d= fracao
					{
					dbg.location(94,12);
					pushFollow(FOLLOW_fracao_in_num316);
					d=fracao();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(94,21);

						//value = Integer.parseInt((DIGITOS7!=null?DIGITOS7.getText():null) + d + $e.value);
						value = Integer.parseInt((DIGITOS7!=null?DIGITOS7.getText():null)); // ALTERAR AQUII
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "num");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "num"



	// $ANTLR start "fracao"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:100:1: fracao returns [String value] : '.' DIGITOS ;
	public final String fracao() throws RecognitionException {
		String value = null;


		Token DIGITOS8=null;

		try { dbg.enterRule(getGrammarFileName(), "fracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:101:2: ( '.' DIGITOS )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:102:3: '.' DIGITOS
			{
			dbg.location(102,3);
			match(input,21,FOLLOW_21_in_fracao337); dbg.location(102,6);
			DIGITOS8=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_fracao338); dbg.location(102,14);
			 value = ("." + (DIGITOS8!=null?DIGITOS8.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "fracao"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_parse33 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_block47 = new BitSet(new long[]{0x0000000005080002L});
	public static final BitSet FOLLOW_atribuicao_in_comando56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao81 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ATRIB_in_atribuicao83 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_atribuicao85 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SEMICOLON_in_atribuicao87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_teste102 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_exprRela_in_teste104 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_teste106 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_teste108 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_teste_else_in_teste110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_teste_else127 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_teste_else129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_iteracao143 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_exprRela_in_iteracao145 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_iteracao147 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_iteracao149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprRela164 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMP_OP_in_exprRela166 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_exprRela170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_expr192 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_FIRST_OP_in_expr200 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_termo_in_expr204 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_fator_in_termo228 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_SECOND_OP_in_termo235 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_fator_in_termo239 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_VAR_in_fator262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_fator272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_PAREN_in_fator281 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_fator285 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_R_PAREN_in_fator287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITOS_in_num312 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_fracao_in_num316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_fracao337 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DIGITOS_in_fracao338 = new BitSet(new long[]{0x0000000000000002L});
}
