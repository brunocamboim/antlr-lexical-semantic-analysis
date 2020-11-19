// $ANTLR 3.5.1 C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g 2020-11-18 23:06:25

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
		"invalidRule", "exprRela", "parse", "block", "teste_else", "iteracao", 
		"expr", "fracao", "fator", "teste", "atribuicao", "comando", "num", "termo"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g"; }


		String s;
		HashMap<String, Double> memory = new HashMap<String, Double>();
		boolean considerThisBlock = true;



	// $ANTLR start "parse"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:16:1: parse : block EOF ;
	public final void parse() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parse");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:16:7: ( block EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:16:10: block EOF
			{
			dbg.location(16,10);
			pushFollow(FOLLOW_block_in_parse31);
			block();
			state._fsp--;
			dbg.location(16,16);

						System.out.println("\n\n Logs das variáveis\n\n");
						for (Map.Entry<String, Double> entry : memory.entrySet()) {
					            	String key = entry.getKey();
					            	double value = entry.getValue();
					            	System.out.println("Variavel: " + key + " - Valor: " + value);
					        }
						
					dbg.location(24,5);
			match(input,EOF,FOLLOW_EOF_in_parse35); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(24, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parse");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parse"



	// $ANTLR start "block"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:26:1: block : ( comando )* ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:26:7: ( ( comando )* )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( comando )*
			{
			dbg.location(26,9);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: ( comando )*
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

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:26:9: comando
					{
					dbg.location(26,9);
					pushFollow(FOLLOW_comando_in_block45);
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
		dbg.location(26, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "comando"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:28:1: comando : ( atribuicao | teste | iteracao );
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:28:9: ( atribuicao | teste | iteracao )
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

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:28:11: atribuicao
					{
					dbg.location(28,11);
					pushFollow(FOLLOW_atribuicao_in_comando54);
					atribuicao();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:28:24: teste
					{
					dbg.location(28,24);
					pushFollow(FOLLOW_teste_in_comando58);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:28:32: iteracao
					{
					dbg.location(28,32);
					pushFollow(FOLLOW_iteracao_in_comando62);
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
		dbg.location(28, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "atribuicao"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:30:1: atribuicao : VAR ATRIB expr SEMICOLON ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		double expr2 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:31:2: ( VAR ATRIB expr SEMICOLON )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:32:3: VAR ATRIB expr SEMICOLON
			{
			dbg.location(32,3);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao79); dbg.location(32,7);
			match(input,ATRIB,FOLLOW_ATRIB_in_atribuicao81); dbg.location(32,13);
			pushFollow(FOLLOW_expr_in_atribuicao83);
			expr2=expr();
			state._fsp--;
			dbg.location(32,18);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_atribuicao85); dbg.location(32,28);

						if(considerThisBlock){
							memory.put((VAR1!=null?VAR1.getText():null), expr2);
							System.out.println("Valor "+expr2+" atribuido a variavel "+(VAR1!=null?VAR1.getText():null));
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
		dbg.location(38, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "teste"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:40:1: teste : ( 'if ' exprRela 'then' comando teste_else ) ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:40:7: ( ( 'if ' exprRela 'then' comando teste_else ) )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:40:10: ( 'if ' exprRela 'then' comando teste_else )
			{
			dbg.location(40,10);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:40:10: ( 'if ' exprRela 'then' comando teste_else )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:40:11: 'if ' exprRela 'then' comando teste_else
			{
			dbg.location(40,11);
			match(input,24,FOLLOW_24_in_teste100); dbg.location(40,17);
			pushFollow(FOLLOW_exprRela_in_teste102);
			exprRela();
			state._fsp--;
			dbg.location(40,26);
			match(input,25,FOLLOW_25_in_teste104); dbg.location(40,33);
			pushFollow(FOLLOW_comando_in_teste106);
			comando();
			state._fsp--;
			dbg.location(41,4);
			considerThisBlock=!considerThisBlock;dbg.location(41,44);
			pushFollow(FOLLOW_teste_else_in_teste114);
			teste_else();
			state._fsp--;
			dbg.location(41,55);
			considerThisBlock=!considerThisBlock;
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
		dbg.location(41, 94);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "teste_else"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:43:1: teste_else : 'else' comando ;
	public final void teste_else() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste_else");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:44:2: ( 'else' comando )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:45:3: 'else' comando
			{
			dbg.location(45,3);
			match(input,23,FOLLOW_23_in_teste_else132); dbg.location(45,10);
			pushFollow(FOLLOW_comando_in_teste_else134);
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
		dbg.location(45, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste_else");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste_else"



	// $ANTLR start "iteracao"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:47:1: iteracao : 'while' exprRela 'do' comando ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:47:9: ( 'while' exprRela 'do' comando )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:47:11: 'while' exprRela 'do' comando
			{
			dbg.location(47,11);
			match(input,26,FOLLOW_26_in_iteracao141); dbg.location(47,19);
			pushFollow(FOLLOW_exprRela_in_iteracao143);
			exprRela();
			state._fsp--;
			dbg.location(47,28);
			match(input,22,FOLLOW_22_in_iteracao145); dbg.location(47,33);
			pushFollow(FOLLOW_comando_in_iteracao147);
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
		dbg.location(47, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "exprRela"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:49:1: exprRela : d= expr COMP_OP e= expr ;
	public final void exprRela() throws RecognitionException {
		Token COMP_OP3=null;
		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "exprRela");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:49:9: (d= expr COMP_OP e= expr )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:50:2: d= expr COMP_OP e= expr
			{
			dbg.location(50,3);
			pushFollow(FOLLOW_expr_in_exprRela157);
			d=expr();
			state._fsp--;
			dbg.location(50,9);
			COMP_OP3=(Token)match(input,COMP_OP,FOLLOW_COMP_OP_in_exprRela159); dbg.location(50,18);
			pushFollow(FOLLOW_expr_in_exprRela163);
			e=expr();
			state._fsp--;
			dbg.location(50,24);

					if(considerThisBlock){
						if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("=")){
							considerThisBlock = (d == e);
							System.out.print("Comparação de igualdade entre "+d+" e "+e);
						}else if((COMP_OP3!=null?COMP_OP3.getText():null).equals("!=")){
							 considerThisBlock = d != e;
							 System.out.print("Comparação de diferença entre "+d+" e "+e);
						}else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("<")){
							 considerThisBlock = d < e;
							 System.out.print("Comparação de menor entre "+d+" e "+e);
						}else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals(">")){
							 considerThisBlock = d > e;
							 System.out.print("Comparação de maior entre "+d+" e "+e);
						}else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals("<=")){
							 considerThisBlock = d <= e;
							 System.out.print("Comparação de menor igual entre "+d+" e "+e);
						}else if ((COMP_OP3!=null?COMP_OP3.getText():null).equals(">=")){
							 considerThisBlock = d >= e;
							 System.out.print("Comparação de maior igual entre "+d+" e "+e);
						}
						System.out.println(" | Resultado -> "+considerThisBlock);
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
		dbg.location(74, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprRela");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprRela"



	// $ANTLR start "expr"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:76:1: expr returns [double value] : d= termo ( FIRST_OP e= termo )* ;
	public final double expr() throws RecognitionException {
		double value = 0.0;


		Token FIRST_OP4=null;
		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:77:2: (d= termo ( FIRST_OP e= termo )* )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:78:3: d= termo ( FIRST_OP e= termo )*
			{
			dbg.location(78,4);
			pushFollow(FOLLOW_termo_in_expr185);
			d=termo();
			state._fsp--;
			dbg.location(78,11);
			 
						value += d;
					dbg.location(81,3);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:81:3: ( FIRST_OP e= termo )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==FIRST_OP) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:81:4: FIRST_OP e= termo
					{
					dbg.location(81,4);
					FIRST_OP4=(Token)match(input,FIRST_OP,FOLLOW_FIRST_OP_in_expr193); dbg.location(81,14);
					pushFollow(FOLLOW_termo_in_expr197);
					e=termo();
					state._fsp--;
					dbg.location(81,21);

								if ((FIRST_OP4!=null?FIRST_OP4.getText():null).equals("+")) value += e;
								else value -= e;
							
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(85, 1);

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
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:87:1: termo returns [double value] : d= fator ( SECOND_OP e= fator )* ;
	public final double termo() throws RecognitionException {
		double value = 0.0;


		Token SECOND_OP5=null;
		double d =0.0;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "termo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:88:2: (d= fator ( SECOND_OP e= fator )* )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:89:3: d= fator ( SECOND_OP e= fator )*
			{
			dbg.location(89,4);
			pushFollow(FOLLOW_fator_in_termo221);
			d=fator();
			state._fsp--;
			dbg.location(89,11);

						value += d;
					dbg.location(92,3);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:92:3: ( SECOND_OP e= fator )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==SECOND_OP) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:92:4: SECOND_OP e= fator
					{
					dbg.location(92,4);
					SECOND_OP5=(Token)match(input,SECOND_OP,FOLLOW_SECOND_OP_in_termo228); dbg.location(92,15);
					pushFollow(FOLLOW_fator_in_termo232);
					e=fator();
					state._fsp--;
					dbg.location(92,22);

								if ((SECOND_OP5!=null?SECOND_OP5.getText():null).equals("*")) value *= e;
								else value /= e;
							
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
		dbg.location(96, 1);

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
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:98:1: fator returns [double value] : ( VAR |e= num | L_PAREN e= expr R_PAREN );
	public final double fator() throws RecognitionException {
		double value = 0.0;


		Token VAR6=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "fator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:99:2: ( VAR |e= num | L_PAREN e= expr R_PAREN )
			int alt5=3;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt5=1;
				}
				break;
			case DIGITOS:
				{
				alt5=2;
				}
				break;
			case L_PAREN:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:100:3: VAR
					{
					dbg.location(100,3);
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_fator255); dbg.location(100,7);

								value = 0;
								if (memory.containsKey((VAR6!=null?VAR6.getText():null))) {
									value = memory.get((VAR6!=null?VAR6.getText():null));
								}else {
									System.out.println("Undefined variable " + (VAR6!=null?VAR6.getText():null));
								}
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:108:5: e= num
					{
					dbg.location(108,6);
					pushFollow(FOLLOW_num_in_fator265);
					e=num();
					state._fsp--;
					dbg.location(108,11);
					 value = e; 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:109:5: L_PAREN e= expr R_PAREN
					{
					dbg.location(109,5);
					match(input,L_PAREN,FOLLOW_L_PAREN_in_fator274); dbg.location(109,14);
					pushFollow(FOLLOW_expr_in_fator278);
					e=expr();
					state._fsp--;
					dbg.location(109,20);
					match(input,R_PAREN,FOLLOW_R_PAREN_in_fator280); dbg.location(109,28);
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
		dbg.location(110, 1);

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
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:113:1: num returns [double value] : DIGITOS (d= fracao )? ;
	public final double num() throws RecognitionException {
		double value = 0.0;


		Token DIGITOS7=null;
		String d =null;

		try { dbg.enterRule(getGrammarFileName(), "num");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:114:2: ( DIGITOS (d= fracao )? )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:115:3: DIGITOS (d= fracao )?
			{
			dbg.location(115,3);
			DIGITOS7=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_num305); dbg.location(115,12);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:115:12: (d= fracao )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==21) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:115:12: d= fracao
					{
					dbg.location(115,12);
					pushFollow(FOLLOW_fracao_in_num309);
					d=fracao();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(115,21);

						value = Double.parseDouble((DIGITOS7!=null?DIGITOS7.getText():null)); 
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 1);

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
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:120:1: fracao returns [String value] : '.' DIGITOS ;
	public final String fracao() throws RecognitionException {
		String value = null;


		Token DIGITOS8=null;

		try { dbg.enterRule(getGrammarFileName(), "fracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:121:2: ( '.' DIGITOS )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho.g:122:3: '.' DIGITOS
			{
			dbg.location(122,3);
			match(input,21,FOLLOW_21_in_fracao330); dbg.location(122,6);
			DIGITOS8=(Token)match(input,DIGITOS,FOLLOW_DIGITOS_in_fracao331); dbg.location(122,14);
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
		dbg.location(123, 1);

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



	public static final BitSet FOLLOW_block_in_parse31 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comando_in_block45 = new BitSet(new long[]{0x0000000005080002L});
	public static final BitSet FOLLOW_atribuicao_in_comando54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_comando58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_comando62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ATRIB_in_atribuicao81 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_atribuicao83 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SEMICOLON_in_atribuicao85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_teste100 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_exprRela_in_teste102 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_teste104 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_teste106 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_teste_else_in_teste114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_teste_else132 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_teste_else134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_iteracao141 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_exprRela_in_iteracao143 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_iteracao145 = new BitSet(new long[]{0x0000000005080000L});
	public static final BitSet FOLLOW_comando_in_iteracao147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprRela157 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMP_OP_in_exprRela159 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_exprRela163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termo_in_expr185 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_FIRST_OP_in_expr193 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_termo_in_expr197 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_fator_in_termo221 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_SECOND_OP_in_termo228 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_fator_in_termo232 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_VAR_in_fator255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_fator265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_PAREN_in_fator274 = new BitSet(new long[]{0x0000000000080880L});
	public static final BitSet FOLLOW_expr_in_fator278 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_R_PAREN_in_fator280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIGITOS_in_num305 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_fracao_in_num309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_fracao330 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DIGITOS_in_fracao331 = new BitSet(new long[]{0x0000000000000002L});
}
