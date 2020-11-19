// $ANTLR 3.5.1 C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g 2020-11-18 21:12:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class trabalho3Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int CONST=4;
	public static final int SEMICOLON=5;
	public static final int VAR=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public trabalho3Lexer() {} 
	public trabalho3Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public trabalho3Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:7:6: ( ':=' )
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:7:8: ':='
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
	// $ANTLR end "T__7"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:35:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:35:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:35:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:
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
					break loop1;
				}
			}

			System.out.println("HAAA");
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:37:8: ( ( '0' .. '9' )* )
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:37:10: ( '0' .. '9' )*
			{
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:37:10: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:
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
	// $ANTLR end "CONST"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:40:2: ( ';' )
			// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:40:5: ';'
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:1:8: ( T__7 | VAR | CONST | SEMICOLON )
		int alt3=4;
		switch ( input.LA(1) ) {
		case ':':
			{
			alt3=1;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=2;
			}
			break;
		case ';':
			{
			alt3=4;
			}
			break;
		default:
			alt3=3;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:1:15: VAR
				{
				mVAR(); 

				}
				break;
			case 3 :
				// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:1:19: CONST
				{
				mCONST(); 

				}
				break;
			case 4 :
				// C:\\Users\\Bruno Pozzebon\\Desktop\\antlr-lexical-semantic-analysis\\trabalho3.g:1:25: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;

		}
	}



}
