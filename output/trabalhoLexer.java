// $ANTLR 3.5.1 C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g 2020-11-19 01:39:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class trabalhoLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public trabalhoLexer() {} 
	public trabalhoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public trabalhoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g"; }

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:7:7: ( '.' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:7:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:8:7: ( 'do' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:8:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:9:7: ( 'else' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:9:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:10:7: ( 'if ' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:10:9: 'if '
			{
			match("if "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:11:7: ( 'then' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:11:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:12:7: ( 'while' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:12:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "FIRST_OP"
	public final void mFIRST_OP() throws RecognitionException {
		try {
			int _type = FIRST_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:125:9: ( ( '+' | '-' ) )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIRST_OP"

	// $ANTLR start "SECOND_OP"
	public final void mSECOND_OP() throws RecognitionException {
		try {
			int _type = SECOND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:128:2: ( ( '*' | '/' ) )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SECOND_OP"

	// $ANTLR start "DIGITOS"
	public final void mDIGITOS() throws RecognitionException {
		try {
			int _type = DIGITOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:130:9: ( ( '0' .. '9' )+ )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:130:11: ( '0' .. '9' )+
			{
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:130:11: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGITOS"

	// $ANTLR start "UNDER_SCORE"
	public final void mUNDER_SCORE() throws RecognitionException {
		try {
			int _type = UNDER_SCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:133:2: ( '_' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:133:5: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDER_SCORE"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:135:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:135:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:135:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:4: ( ( ' ' | '\\n' | '\\t' | '\\r' | '\\cr' )+ )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:6: ( ' ' | '\\n' | '\\t' | '\\r' | '\\cr' )+
			{
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:6: ( ' ' | '\\n' | '\\t' | '\\r' | '\\cr' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=6;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt3=1;
					}
					break;
				case '\n':
					{
					alt3=2;
					}
					break;
				case '\t':
					{
					alt3=3;
					}
					break;
				case '\r':
					{
					alt3=4;
					}
					break;
				case '\u0000':
					{
					alt3=5;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:11: '\\n'
					{
					match('\n'); 
					}
					break;
				case 3 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:16: '\\t'
					{
					match('\t'); 
					}
					break;
				case 4 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:21: '\\r'
					{
					match('\r'); 
					}
					break;
				case 5 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:137:26: '\\cr'
					{
					match("cr"); 

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMP_OP"
	public final void mCOMP_OP() throws RecognitionException {
		try {
			int _type = COMP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:9: ( ( '=' | '!=' | '<' | '>' | '<=' | '>=' ) )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:11: ( '=' | '!=' | '<' | '>' | '<=' | '>=' )
			{
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:11: ( '=' | '!=' | '<' | '>' | '<=' | '>=' )
			int alt4=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt4=1;
				}
				break;
			case '!':
				{
				alt4=2;
				}
				break;
			case '<':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='=') ) {
					alt4=5;
				}

				else {
					alt4=3;
				}

				}
				break;
			case '>':
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4=='=') ) {
					alt4=6;
				}

				else {
					alt4=4;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:12: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:16: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:21: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:25: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:29: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:139:34: '>='
					{
					match(">="); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMP_OP"

	// $ANTLR start "ATRIB"
	public final void mATRIB() throws RecognitionException {
		try {
			int _type = ATRIB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:141:8: ( ':=' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:141:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATRIB"

	// $ANTLR start "L_PAREN"
	public final void mL_PAREN() throws RecognitionException {
		try {
			int _type = L_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:143:9: ( '(' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:143:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_PAREN"

	// $ANTLR start "R_PAREN"
	public final void mR_PAREN() throws RecognitionException {
		try {
			int _type = R_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:145:9: ( ')' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:145:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_PAREN"

	// $ANTLR start "L_BRACKET"
	public final void mL_BRACKET() throws RecognitionException {
		try {
			int _type = L_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:148:2: ( '{' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:148:5: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_BRACKET"

	// $ANTLR start "R_BRACKET"
	public final void mR_BRACKET() throws RecognitionException {
		try {
			int _type = R_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:151:2: ( '}' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:151:5: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_BRACKET"

	// $ANTLR start "L_SQUARE"
	public final void mL_SQUARE() throws RecognitionException {
		try {
			int _type = L_SQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:153:9: ( '[' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:153:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_SQUARE"

	// $ANTLR start "R_SQUARE"
	public final void mR_SQUARE() throws RecognitionException {
		try {
			int _type = R_SQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:155:9: ( ']' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:155:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R_SQUARE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:157:7: ( ',' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:157:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:160:2: ( ';' )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:160:5: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "FallThrough"
	public final void mFallThrough() throws RecognitionException {
		try {
			int _type = FallThrough;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:169:3: ( . )
			// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:169:6: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;

			  	throw new RuntimeException(String.format(
			      		"Caracter ilegal reconhecido na linha %d, coluna %d: '%s'",
			      		getLine(), getCharPositionInLine(), getText()
				));

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FallThrough"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | FIRST_OP | SECOND_OP | DIGITOS | UNDER_SCORE | VAR | WS | COMP_OP | ATRIB | L_PAREN | R_PAREN | L_BRACKET | R_BRACKET | L_SQUARE | R_SQUARE | COMMA | SEMICOLON | FallThrough )
		int alt5=23;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:10: T__21
				{
				mT__21(); 

				}
				break;
			case 2 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:16: T__22
				{
				mT__22(); 

				}
				break;
			case 3 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:22: T__23
				{
				mT__23(); 

				}
				break;
			case 4 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:28: T__24
				{
				mT__24(); 

				}
				break;
			case 5 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:34: T__25
				{
				mT__25(); 

				}
				break;
			case 6 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:40: T__26
				{
				mT__26(); 

				}
				break;
			case 7 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:46: FIRST_OP
				{
				mFIRST_OP(); 

				}
				break;
			case 8 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:55: SECOND_OP
				{
				mSECOND_OP(); 

				}
				break;
			case 9 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:65: DIGITOS
				{
				mDIGITOS(); 

				}
				break;
			case 10 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:73: UNDER_SCORE
				{
				mUNDER_SCORE(); 

				}
				break;
			case 11 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:85: VAR
				{
				mVAR(); 

				}
				break;
			case 12 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:89: WS
				{
				mWS(); 

				}
				break;
			case 13 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:92: COMP_OP
				{
				mCOMP_OP(); 

				}
				break;
			case 14 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:100: ATRIB
				{
				mATRIB(); 

				}
				break;
			case 15 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:106: L_PAREN
				{
				mL_PAREN(); 

				}
				break;
			case 16 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:114: R_PAREN
				{
				mR_PAREN(); 

				}
				break;
			case 17 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:122: L_BRACKET
				{
				mL_BRACKET(); 

				}
				break;
			case 18 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:132: R_BRACKET
				{
				mR_BRACKET(); 

				}
				break;
			case 19 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:142: L_SQUARE
				{
				mL_SQUARE(); 

				}
				break;
			case 20 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:151: R_SQUARE
				{
				mR_SQUARE(); 

				}
				break;
			case 21 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:160: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 22 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:166: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 23 :
				// C:\\Users\\stzgu\\git\\antlr-lexical-semantic-analysis\\trabalho.g:1:176: FallThrough
				{
				mFallThrough(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\5\41\11\uffff\1\36\1\uffff\1\36\2\uffff\1\36\12\uffff\1\65\1"+
		"\uffff\4\41\20\uffff\1\41\1\uffff\2\41\1\75\1\76\1\41\2\uffff\1\100\1"+
		"\uffff";
	static final String DFA5_eofS =
		"\101\uffff";
	static final String DFA5_minS =
		"\1\0\1\uffff\1\157\1\154\1\146\2\150\11\uffff\1\162\1\uffff\1\75\2\uffff"+
		"\1\75\12\uffff\1\60\1\uffff\1\163\1\40\1\145\1\151\20\uffff\1\145\1\uffff"+
		"\1\156\1\154\2\60\1\145\2\uffff\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\uffff\1\uffff\1\157\1\154\1\146\2\150\11\uffff\1\162\1\uffff\1\75\2"+
		"\uffff\1\75\12\uffff\1\172\1\uffff\1\163\1\40\1\145\1\151\20\uffff\1\145"+
		"\1\uffff\1\156\1\154\2\172\1\145\2\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\5\uffff\1\7\1\10\1\11\1\12\1\13\4\14\1\uffff\1\15\1\uffff"+
		"\2\15\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\1\1\uffff"+
		"\1\13\4\uffff\1\7\1\10\1\11\1\12\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1"+
		"\23\1\24\1\25\1\26\1\2\1\uffff\1\4\5\uffff\1\3\1\5\1\uffff\1\6";
	static final String DFA5_specialS =
		"\1\0\100\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\20\10\36\1\16\1\15\2\36\1\17\22\36\1\14\1\22\6\36\1\26\1\27\1\10\1"+
			"\7\1\34\1\7\1\1\1\10\12\11\1\25\1\35\1\23\1\21\1\24\2\36\32\13\1\32\1"+
			"\36\1\33\1\36\1\12\1\36\3\13\1\2\1\3\3\13\1\4\12\13\1\5\2\13\1\6\3\13"+
			"\1\30\1\36\1\31\uff82\36",
			"",
			"\1\40",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"",
			"\1\53",
			"",
			"",
			"\1\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\72",
			"",
			"\1\73",
			"\1\74",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\77",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | FIRST_OP | SECOND_OP | DIGITOS | UNDER_SCORE | VAR | WS | COMP_OP | ATRIB | L_PAREN | R_PAREN | L_BRACKET | R_BRACKET | L_SQUARE | R_SQUARE | COMMA | SEMICOLON | FallThrough );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA5_0 = input.LA(1);
						s = -1;
						if ( (LA5_0=='.') ) {s = 1;}
						else if ( (LA5_0=='d') ) {s = 2;}
						else if ( (LA5_0=='e') ) {s = 3;}
						else if ( (LA5_0=='i') ) {s = 4;}
						else if ( (LA5_0=='t') ) {s = 5;}
						else if ( (LA5_0=='w') ) {s = 6;}
						else if ( (LA5_0=='+'||LA5_0=='-') ) {s = 7;}
						else if ( (LA5_0=='*'||LA5_0=='/') ) {s = 8;}
						else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {s = 9;}
						else if ( (LA5_0=='_') ) {s = 10;}
						else if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'c')||(LA5_0 >= 'f' && LA5_0 <= 'h')||(LA5_0 >= 'j' && LA5_0 <= 's')||(LA5_0 >= 'u' && LA5_0 <= 'v')||(LA5_0 >= 'x' && LA5_0 <= 'z')) ) {s = 11;}
						else if ( (LA5_0==' ') ) {s = 12;}
						else if ( (LA5_0=='\n') ) {s = 13;}
						else if ( (LA5_0=='\t') ) {s = 14;}
						else if ( (LA5_0=='\r') ) {s = 15;}
						else if ( (LA5_0=='\u0000') ) {s = 16;}
						else if ( (LA5_0=='=') ) {s = 17;}
						else if ( (LA5_0=='!') ) {s = 18;}
						else if ( (LA5_0=='<') ) {s = 19;}
						else if ( (LA5_0=='>') ) {s = 20;}
						else if ( (LA5_0==':') ) {s = 21;}
						else if ( (LA5_0=='(') ) {s = 22;}
						else if ( (LA5_0==')') ) {s = 23;}
						else if ( (LA5_0=='{') ) {s = 24;}
						else if ( (LA5_0=='}') ) {s = 25;}
						else if ( (LA5_0=='[') ) {s = 26;}
						else if ( (LA5_0==']') ) {s = 27;}
						else if ( (LA5_0==',') ) {s = 28;}
						else if ( (LA5_0==';') ) {s = 29;}
						else if ( ((LA5_0 >= '\u0001' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||(LA5_0 >= '\"' && LA5_0 <= '\'')||(LA5_0 >= '?' && LA5_0 <= '@')||LA5_0=='\\'||LA5_0=='^'||LA5_0=='`'||LA5_0=='|'||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {s = 30;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 5, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
