// $ANTLR 3.5.1 /home/uml/Dokumenty/225981/lab1/lab1.g 2019-02-27 16:41:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lab1Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DIV=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int MINUS=8;
	public static final int MUL=9;
	public static final int NL=10;
	public static final int NP=11;
	public static final int PLUS=12;
	public static final int RP=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public lab1Lexer() {} 
	public lab1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public lab1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/uml/Dokumenty/225981/lab1/lab1.g"; }

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:10:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:10:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/uml/Dokumenty/225981/lab1/lab1.g:10:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/uml/Dokumenty/225981/lab1/lab1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:13:5: ( ( '0' .. '9' )+ )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:13:7: ( '0' .. '9' )+
			{
			// /home/uml/Dokumenty/225981/lab1/lab1.g:13:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/uml/Dokumenty/225981/lab1/lab1.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:17:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/uml/Dokumenty/225981/lab1/lab1.g:17:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/uml/Dokumenty/225981/lab1/lab1.g:17:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/uml/Dokumenty/225981/lab1/lab1.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop3;
						}
					}

					// /home/uml/Dokumenty/225981/lab1/lab1.g:17:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/uml/Dokumenty/225981/lab1/lab1.g:17:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /home/uml/Dokumenty/225981/lab1/lab1.g:18:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/uml/Dokumenty/225981/lab1/lab1.g:18:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/uml/Dokumenty/225981/lab1/lab1.g:18:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:21:5: ( ( ' ' | '\\t' | '\\r' ) )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:21:9: ( ' ' | '\\t' | '\\r' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:27:6: ( '+' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:27:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:30:5: ( '*' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:30:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:33:5: ( '/' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:33:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:36:7: ( '-' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:36:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:39:4: ( '\\n' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:39:6: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "NP"
	public final void mNP() throws RecognitionException {
		try {
			int _type = NP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:42:4: ( '(' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:42:5: '('
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
	// $ANTLR end "NP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/uml/Dokumenty/225981/lab1/lab1.g:45:4: ( ')' )
			// /home/uml/Dokumenty/225981/lab1/lab1.g:45:5: ')'
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
	// $ANTLR end "RP"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/uml/Dokumenty/225981/lab1/lab1.g:1:8: ( ID | INT | COMMENT | WS | PLUS | MUL | DIV | MINUS | NL | NP | RP )
		int alt7=11;
		switch ( input.LA(1) ) {
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
		case '_':
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
			alt7=1;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt7=2;
			}
			break;
		case '/':
			{
			int LA7_3 = input.LA(2);
			if ( (LA7_3=='*'||LA7_3=='/') ) {
				alt7=3;
			}

			else {
				alt7=7;
			}

			}
			break;
		case '\t':
		case '\r':
		case ' ':
			{
			alt7=4;
			}
			break;
		case '+':
			{
			alt7=5;
			}
			break;
		case '*':
			{
			alt7=6;
			}
			break;
		case '-':
			{
			alt7=8;
			}
			break;
		case '\n':
			{
			alt7=9;
			}
			break;
		case '(':
			{
			alt7=10;
			}
			break;
		case ')':
			{
			alt7=11;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:10: ID
				{
				mID(); 

				}
				break;
			case 2 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:13: INT
				{
				mINT(); 

				}
				break;
			case 3 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:17: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 4 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:25: WS
				{
				mWS(); 

				}
				break;
			case 5 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:28: PLUS
				{
				mPLUS(); 

				}
				break;
			case 6 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:33: MUL
				{
				mMUL(); 

				}
				break;
			case 7 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:37: DIV
				{
				mDIV(); 

				}
				break;
			case 8 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:41: MINUS
				{
				mMINUS(); 

				}
				break;
			case 9 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:47: NL
				{
				mNL(); 

				}
				break;
			case 10 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:50: NP
				{
				mNP(); 

				}
				break;
			case 11 :
				// /home/uml/Dokumenty/225981/lab1/lab1.g:1:53: RP
				{
				mRP(); 

				}
				break;

		}
	}



}
