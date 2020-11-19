// $ANTLR 3.5.1 C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g 2020-11-18 21:12:06

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
public class trabalho3Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONST", "SEMICOLON", "VAR", "':='"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int CONST=4;
	public static final int SEMICOLON=5;
	public static final int VAR=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "block", "atribuicao", "comando"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public trabalho3Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public trabalho3Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public trabalho3Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return trabalho3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g"; }


		String s;
		HashMap<String, Integer> memory = new HashMap<String, Integer>();
		boolean rightStatement = false;



	// $ANTLR start "block"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:17:1: block : ( comando )* ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:17:7: ( ( comando )* )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:17:9: ( comando )*
			{
			dbg.location(17,9);
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:17:9: ( comando )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:17:9: comando
					{
					dbg.location(17,9);
					pushFollow(FOLLOW_comando_in_block31);
					comando();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(17,18);

				for (Map.Entry<String, Integer> entry : memory.entrySet()) {
				         	String key = entry.getKey();
				          	int value = entry.getValue();
				           	System.out.println("Variavel: " + key + " - Valor: " + value);
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
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "comando"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:25:1: comando : atribuicao SEMICOLON ;
	public final void comando() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:25:9: ( atribuicao SEMICOLON )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:25:11: atribuicao SEMICOLON
			{
			dbg.location(25,11);
			pushFollow(FOLLOW_atribuicao_in_comando42);
			atribuicao();
			state._fsp--;
			dbg.location(25,22);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_comando44); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "atribuicao"
	// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:27:1: atribuicao : VAR ':=' CONST ;
	public final void atribuicao() throws RecognitionException {
		Token VAR1=null;
		Token CONST2=null;

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:28:2: ( VAR ':=' CONST )
			dbg.enterAlt(1);

			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:29:3: VAR ':=' CONST
			{
			dbg.location(29,3);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_atribuicao57); dbg.location(29,7);
			match(input,7,FOLLOW_7_in_atribuicao59); dbg.location(29,12);
			CONST2=(Token)match(input,CONST,FOLLOW_CONST_in_atribuicao61); dbg.location(29,19);

					        System.out.println("Chegouuu");
						memory.put((VAR1!=null?VAR1.getText():null), Integer.parseInt((CONST2!=null?CONST2.getText():null)));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"

	// Delegated rules



	public static final BitSet FOLLOW_comando_in_block31 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_atribuicao_in_comando42 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOLON_in_comando44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atribuicao57 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_atribuicao59 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CONST_in_atribuicao61 = new BitSet(new long[]{0x0000000000000002L});
}
