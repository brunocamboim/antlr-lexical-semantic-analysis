// $ANTLR 3.5.1 C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g 2020-11-12 21:38:56

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class trabalhoParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGITOS", "FIRST_OP", "SECOND_OP", 
		"VAR", "WS", "'('", "')'", "'.'", "':='", "';'", "'<'", "'<='", "'<>'", 
		"'='", "'>'", "'>='", "'do'", "'else'", "'if'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int DIGITOS=4;
	public static final int FIRST_OP=5;
	public static final int SECOND_OP=6;
	public static final int VAR=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred5_trabalho", "synpred3_trabalho", "num", "synpred9_trabalho", 
		"synpred4_trabalho", "prog", "comandos", "synpred2_trabalho", "synpred8_trabalho", 
		"synpred7_trabalho", "expr", "synpred12_trabalho", "atribuicao", "synpred16_trabalho", 
		"synpred14_trabalho", "teste", "synpred15_trabalho", "comando", "synpred6_trabalho", 
		"termo", "synpred1_trabalho", "fracao", "exprRela", "synpred10_trabalho", 
		"synpred11_trabalho", "fator", "synpred13_trabalho", "iteracao"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, true, false, true, false, false, false, false, false
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



	// $ANTLR start "prog"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:14:1: prog : comandos EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:14:7: ( comandos EOF )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:14:9: comandos EOF
			{
			dbg.location(14,9);
			pushFollow(FOLLOW_comandos_in_prog37);
			comandos();
			state._fsp--;
			if (state.failed) return;dbg.location(14,18);
			match(input,EOF,FOLLOW_EOF_in_prog39); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "comandos"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:1: comandos : ( ( comando ';' )+ | comando |);
	public final void comandos() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comandos");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:9: ( ( comando ';' )+ | comando |)
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				int LA2_1 = input.LA(2);
				if ( (synpred2_trabalho()) ) {
					alt2=1;
				}
				else if ( (synpred3_trabalho()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 22:
				{
				int LA2_2 = input.LA(2);
				if ( (synpred2_trabalho()) ) {
					alt2=1;
				}
				else if ( (synpred3_trabalho()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 24:
				{
				int LA2_3 = input.LA(2);
				if ( (synpred2_trabalho()) ) {
					alt2=1;
				}
				else if ( (synpred3_trabalho()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
			case 13:
			case 21:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:11: ( comando ';' )+
					{
					dbg.location(16,11);
					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:11: ( comando ';' )+
					int cnt1=0;
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==VAR||LA1_0==22||LA1_0==24) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:12: comando ';'
							{
							dbg.location(16,12);
							pushFollow(FOLLOW_comando_in_comandos47);
							comando();
							state._fsp--;
							if (state.failed) return;dbg.location(16,19);
							match(input,13,FOLLOW_13_in_comandos48); if (state.failed) return;
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(1, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt1++;
					}
					} finally {dbg.exitSubRule(1);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:27: comando
					{
					dbg.location(16,27);
					pushFollow(FOLLOW_comando_in_comandos54);
					comando();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:37: 
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
		dbg.location(16, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comandos");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comandos"



	// $ANTLR start "comando"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:18:1: comando : ( atribuicao | teste | iteracao );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:18:8: ( atribuicao | teste | iteracao )
			int alt3=3;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt3=1;
				}
				break;
			case 22:
				{
				alt3=2;
				}
				break;
			case 24:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:18:10: atribuicao
					{
					dbg.location(18,10);
					pushFollow(FOLLOW_atribuicao_in_comando64);
					atribuicao();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:18:21: teste
					{
					dbg.location(18,21);
					pushFollow(FOLLOW_teste_in_comando66);
					teste();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:18:27: iteracao
					{
					dbg.location(18,27);
					pushFollow(FOLLOW_iteracao_in_comando68);
					iteracao();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(18, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "atribuicao"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:20:1: atribuicao : VAR ':=' expr ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		int expr2 =0;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:20:11: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:20:13: VAR ':=' expr
			{
			dbg.location(20,13);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao79); if (state.failed) return;dbg.location(20,17);
			match(input,12,FOLLOW_12_in_atribuicao81); if (state.failed) return;dbg.location(20,22);
			pushFollow(FOLLOW_expr_in_atribuicao83);
			expr2=expr();
			state._fsp--;
			if (state.failed) return;dbg.location(20,27);
			if ( state.backtracking==0 ) {
						memory.put((VAR1!=null?VAR1.getText():null), expr2);
						System.out.println("Variavel = " + (VAR1!=null?VAR1.getText():null));
						System.out.println("Valor = " +expr2);
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
		dbg.location(24, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:1: teste : ( ( 'if' exprRela 'then' comandos ) | ( 'if' exprRela 'then' comandos 'else' comandos ) );
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:7: ( ( 'if' exprRela 'then' comandos ) | ( 'if' exprRela 'then' comandos 'else' comandos ) )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==22) ) {
				int LA4_1 = input.LA(2);
				if ( (synpred6_trabalho()) ) {
					alt4=1;
				}
				else if ( (true) ) {
					alt4=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( 'if' exprRela 'then' comandos )
					{
					dbg.location(26,9);
					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( 'if' exprRela 'then' comandos )
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:10: 'if' exprRela 'then' comandos
					{
					dbg.location(26,10);
					match(input,22,FOLLOW_22_in_teste94); if (state.failed) return;dbg.location(26,15);
					pushFollow(FOLLOW_exprRela_in_teste96);
					exprRela();
					state._fsp--;
					if (state.failed) return;dbg.location(26,24);
					match(input,23,FOLLOW_23_in_teste98); if (state.failed) return;dbg.location(26,31);
					pushFollow(FOLLOW_comandos_in_teste100);
					comandos();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:41: ( 'if' exprRela 'then' comandos 'else' comandos )
					{
					dbg.location(26,41);
					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:41: ( 'if' exprRela 'then' comandos 'else' comandos )
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:42: 'if' exprRela 'then' comandos 'else' comandos
					{
					dbg.location(26,42);
					match(input,22,FOLLOW_22_in_teste104); if (state.failed) return;dbg.location(26,47);
					pushFollow(FOLLOW_exprRela_in_teste106);
					exprRela();
					state._fsp--;
					if (state.failed) return;dbg.location(26,56);
					match(input,23,FOLLOW_23_in_teste108); if (state.failed) return;dbg.location(26,63);
					pushFollow(FOLLOW_comandos_in_teste110);
					comandos();
					state._fsp--;
					if (state.failed) return;dbg.location(26,72);
					match(input,21,FOLLOW_21_in_teste112); if (state.failed) return;dbg.location(26,79);
					pushFollow(FOLLOW_comandos_in_teste114);
					comandos();
					state._fsp--;
					if (state.failed) return;
					}

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
		dbg.location(26, 88);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "iteracao"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:28:1: iteracao : 'while' exprRela 'do' comandos ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:28:9: ( 'while' exprRela 'do' comandos )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:28:11: 'while' exprRela 'do' comandos
			{
			dbg.location(28,11);
			match(input,24,FOLLOW_24_in_iteracao123); if (state.failed) return;dbg.location(28,19);
			pushFollow(FOLLOW_exprRela_in_iteracao125);
			exprRela();
			state._fsp--;
			if (state.failed) return;dbg.location(28,28);
			match(input,20,FOLLOW_20_in_iteracao127); if (state.failed) return;dbg.location(28,33);
			pushFollow(FOLLOW_comandos_in_iteracao129);
			comandos();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "exprRela"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:30:1: exprRela : expr ( '=' | '<>' | '<' | '>' | '<=' | '>=' ) expr ;
	public final void exprRela() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprRela");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:30:9: ( expr ( '=' | '<>' | '<' | '>' | '<=' | '>=' ) expr )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:30:11: expr ( '=' | '<>' | '<' | '>' | '<=' | '>=' ) expr
			{
			dbg.location(30,11);
			pushFollow(FOLLOW_expr_in_exprRela136);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(30,15);
			if ( (input.LA(1) >= 14 && input.LA(1) <= 19) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(30,43);
			pushFollow(FOLLOW_expr_in_exprRela150);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 46);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprRela");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprRela"



	// $ANTLR start "expr"
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:32:1: expr returns [int value] : d= termo ( FIRST_OP e= termo )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		Token FIRST_OP3=null;
		int d =0;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:33:2: (d= termo ( FIRST_OP e= termo )* )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:34:3: d= termo ( FIRST_OP e= termo )*
			{
			dbg.location(34,4);
			pushFollow(FOLLOW_termo_in_expr168);
			d=termo();
			state._fsp--;
			if (state.failed) return value;dbg.location(34,11);
			if ( state.backtracking==0 ) { 
						value += d;
					}dbg.location(37,4);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:37:4: ( FIRST_OP e= termo )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==FIRST_OP) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:37:5: FIRST_OP e= termo
					{
					dbg.location(37,5);
					FIRST_OP3=(Token)match(input,FIRST_OP,FOLLOW_FIRST_OP_in_expr177); if (state.failed) return value;dbg.location(37,15);
					pushFollow(FOLLOW_termo_in_expr181);
					e=termo();
					state._fsp--;
					if (state.failed) return value;dbg.location(37,22);
					if ( state.backtracking==0 ) {
									if ((FIRST_OP3!=null?FIRST_OP3.getText():null).equals("+")) value += e;
									else value -= e;
								}
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
		dbg.location(41, 1);

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
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:43:1: termo returns [int value] : d= fator ( SECOND_OP e= fator )* ;
	public final int termo() throws RecognitionException {
		int value = 0;


		Token SECOND_OP4=null;
		int d =0;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "termo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:44:2: (d= fator ( SECOND_OP e= fator )* )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:44:4: d= fator ( SECOND_OP e= fator )*
			{
			dbg.location(44,5);
			pushFollow(FOLLOW_fator_in_termo202);
			d=fator();
			state._fsp--;
			if (state.failed) return value;dbg.location(44,12);
			if ( state.backtracking==0 ) {
						value += d;
					}dbg.location(47,4);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:47:4: ( SECOND_OP e= fator )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==SECOND_OP) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:47:5: SECOND_OP e= fator
					{
					dbg.location(47,5);
					SECOND_OP4=(Token)match(input,SECOND_OP,FOLLOW_SECOND_OP_in_termo210); if (state.failed) return value;dbg.location(47,16);
					pushFollow(FOLLOW_fator_in_termo214);
					e=fator();
					state._fsp--;
					if (state.failed) return value;dbg.location(47,23);
					if ( state.backtracking==0 ) {
									if ((SECOND_OP4!=null?SECOND_OP4.getText():null).equals("*")) value *= e;
									else value /= e;
								}
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 1);

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
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:53:1: fator returns [int value] : ( VAR |e= num | '(' e= expr ')' );
	public final int fator() throws RecognitionException {
		int value = 0;


		Token VAR5=null;
		int e =0;

		try { dbg.enterRule(getGrammarFileName(), "fator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:54:2: ( VAR |e= num | '(' e= expr ')' )
			int alt7=3;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt7=1;
				}
				break;
			case DIGITOS:
				{
				alt7=2;
				}
				break;
			case 9:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:54:5: VAR
					{
					dbg.location(54,5);
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_fator234); if (state.failed) return value;dbg.location(54,9);
					if ( state.backtracking==0 ) {
								value = 0;
								if (memory.containsKey((VAR5!=null?VAR5.getText():null))) value = (Integer)memory.get((VAR5!=null?VAR5.getText():null));
								else System.err.println("Undefined variable " + (VAR5!=null?VAR5.getText():null));
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:59:5: e= num
					{
					dbg.location(59,6);
					pushFollow(FOLLOW_num_in_fator244);
					e=num();
					state._fsp--;
					if (state.failed) return value;dbg.location(59,11);
					if ( state.backtracking==0 ) { value = e; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:60:5: '(' e= expr ')'
					{
					dbg.location(60,5);
					match(input,9,FOLLOW_9_in_fator253); if (state.failed) return value;dbg.location(60,10);
					pushFollow(FOLLOW_expr_in_fator257);
					e=expr();
					state._fsp--;
					if (state.failed) return value;dbg.location(60,16);
					match(input,10,FOLLOW_10_in_fator259); if (state.failed) return value;dbg.location(60,20);
					if ( state.backtracking==0 ) { value = e; }
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
		dbg.location(60, 41);

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
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:63:1: num returns [int value] : DIGITOS (d= fracao )? ;
	public final int num() throws RecognitionException {
		int value = 0;


		Token DIGITOS6=null;
		String d =null;

		try { dbg.enterRule(getGrammarFileName(), "num");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:64:2: ( DIGITOS (d= fracao )? )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:64:4: DIGITOS (d= fracao )?
			{
			dbg.location(64,4);
			DIGITOS6=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_num279); if (state.failed) return value;dbg.location(64,13);
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:64:13: (d= fracao )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==11) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:64:13: d= fracao
					{
					dbg.location(64,13);
					pushFollow(FOLLOW_fracao_in_num283);
					d=fracao();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(64,22);
			if ( state.backtracking==0 ) {
						//value = Integer.parseInt((DIGITOS6!=null?DIGITOS6.getText():null) + d + $e.value);
						value = Integer.parseInt((DIGITOS6!=null?DIGITOS6.getText():null)); // ALTERAR AQUII
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
		dbg.location(68, 1);

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
	// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:70:1: fracao returns [String value] : '.' DIGITOS ;
	public final String fracao() throws RecognitionException {
		String value = null;


		Token DIGITOS7=null;

		try { dbg.enterRule(getGrammarFileName(), "fracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:71:2: ( '.' DIGITOS )
			dbg.enterAlt(1);

			// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:71:4: '.' DIGITOS
			{
			dbg.location(71,4);
			match(input,11,FOLLOW_11_in_fracao301); if (state.failed) return value;dbg.location(71,7);
			DIGITOS7=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_fracao302); if (state.failed) return value;dbg.location(71,15);
			if ( state.backtracking==0 ) { value = ("." + (DIGITOS7!=null?DIGITOS7.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "fracao"

	// $ANTLR start synpred2_trabalho
	public final void synpred2_trabalho_fragment() throws RecognitionException {
		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:11: ( ( comando ';' )+ )
		dbg.enterAlt(1);

		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:11: ( comando ';' )+
		{
		dbg.location(16,11);
		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:11: ( comando ';' )+
		int cnt9=0;
		try { dbg.enterSubRule(9);

		loop9:
		while (true) {
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR||LA9_0==22||LA9_0==24) ) {
				alt9=1;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:12: comando ';'
				{
				dbg.location(16,12);
				pushFollow(FOLLOW_comando_in_synpred2_trabalho47);
				comando();
				state._fsp--;
				if (state.failed) return;dbg.location(16,19);
				match(input,13,FOLLOW_13_in_synpred2_trabalho48); if (state.failed) return;
				}
				break;

			default :
				if ( cnt9 >= 1 ) break loop9;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(9, input);
				dbg.recognitionException(eee);

				throw eee;
			}
			cnt9++;
		}
		} finally {dbg.exitSubRule(9);}

		}

	}
	// $ANTLR end synpred2_trabalho

	// $ANTLR start synpred3_trabalho
	public final void synpred3_trabalho_fragment() throws RecognitionException {
		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:27: ( comando )
		dbg.enterAlt(1);

		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:16:27: comando
		{
		dbg.location(16,27);
		pushFollow(FOLLOW_comando_in_synpred3_trabalho54);
		comando();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_trabalho

	// $ANTLR start synpred6_trabalho
	public final void synpred6_trabalho_fragment() throws RecognitionException {
		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( ( 'if' exprRela 'then' comandos ) )
		dbg.enterAlt(1);

		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( 'if' exprRela 'then' comandos )
		{
		dbg.location(26,9);
		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( 'if' exprRela 'then' comandos )
		dbg.enterAlt(1);

		// C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\trabalho.g:26:10: 'if' exprRela 'then' comandos
		{
		dbg.location(26,10);
		match(input,22,FOLLOW_22_in_synpred6_trabalho94); if (state.failed) return;dbg.location(26,15);
		pushFollow(FOLLOW_exprRela_in_synpred6_trabalho96);
		exprRela();
		state._fsp--;
		if (state.failed) return;dbg.location(26,24);
		match(input,23,FOLLOW_23_in_synpred6_trabalho98); if (state.failed) return;dbg.location(26,31);
		pushFollow(FOLLOW_comandos_in_synpred6_trabalho100);
		comandos();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred6_trabalho

	// Delegated rules

	public final boolean synpred6_trabalho() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred6_trabalho_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_trabalho() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_trabalho_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_trabalho() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_trabalho_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_comandos_in_prog37 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_comandos47 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_comandos48 = new BitSet(new long[]{0x0000000001400082L});
	public static final BitSet FOLLOW_comando_in_comandos54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribuicao_in_comando64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao79 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atribuicao81 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_expr_in_atribuicao83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste94 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_exprRela_in_teste96 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_teste98 = new BitSet(new long[]{0x0000000001400080L});
	public static final BitSet FOLLOW_comandos_in_teste100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste104 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_exprRela_in_teste106 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_teste108 = new BitSet(new long[]{0x0000000001600080L});
	public static final BitSet FOLLOW_comandos_in_teste110 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_teste112 = new BitSet(new long[]{0x0000000001400080L});
	public static final BitSet FOLLOW_comandos_in_teste114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_iteracao123 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_exprRela_in_iteracao125 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_iteracao127 = new BitSet(new long[]{0x0000000001400080L});
	public static final BitSet FOLLOW_comandos_in_iteracao129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprRela136 = new BitSet(new long[]{0x00000000000FC000L});
	public static final BitSet FOLLOW_set_in_exprRela137 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_expr_in_exprRela150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_expr168 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_FIRST_OP_in_expr177 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_termo_in_expr181 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_fator_in_termo202 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_SECOND_OP_in_termo210 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_fator_in_termo214 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_VAR_in_fator234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_fator244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_fator253 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_expr_in_fator257 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_fator259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITOS_in_num279 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_fracao_in_num283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_fracao301 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIGITOS_in_fracao302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_synpred2_trabalho47 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred2_trabalho48 = new BitSet(new long[]{0x0000000001400082L});
	public static final BitSet FOLLOW_comando_in_synpred3_trabalho54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_synpred6_trabalho94 = new BitSet(new long[]{0x0000000000000290L});
	public static final BitSet FOLLOW_exprRela_in_synpred6_trabalho96 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_synpred6_trabalho98 = new BitSet(new long[]{0x0000000001400080L});
	public static final BitSet FOLLOW_comandos_in_synpred6_trabalho100 = new BitSet(new long[]{0x0000000000000002L});
}
