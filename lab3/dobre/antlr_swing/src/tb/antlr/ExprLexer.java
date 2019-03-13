// $ANTLR 3.4 /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g 2019-03-13 15:29:00

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int EXANTHAN=5;
    public static final int GRETHAN=6;
    public static final int GRETHANEXAN=7;
    public static final int ID=8;
    public static final int IF=9;
    public static final int INT=10;
    public static final int LOWEQUTHAN=11;
    public static final int LOWTHAN=12;
    public static final int LP=13;
    public static final int MINUS=14;
    public static final int MUL=15;
    public static final int NL=16;
    public static final int PLUS=17;
    public static final int PODST=18;
    public static final int RP=19;
    public static final int VAR=20;
    public static final int WS=21;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g"; }

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:56:5: ( 'int' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:56:6: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:58:3: ( 'if' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:58:5: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:60:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:60:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:60:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:
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
            } while (true);


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
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:62:5: ( ( '0' .. '9' )+ )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:62:7: ( '0' .. '9' )+
            {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:62:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:
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
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:64:4: ( ( '\\r' )? '\\n' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:64:6: ( '\\r' )? '\\n'
            {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:64:6: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:64:6: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:66:4: ( ( ' ' | '\\t' )+ )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:66:6: ( ' ' | '\\t' )+
            {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:66:6: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LOWTHAN"
    public final void mLOWTHAN() throws RecognitionException {
        try {
            int _type = LOWTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:68:10: ( '<' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:68:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWTHAN"

    // $ANTLR start "LOWEQUTHAN"
    public final void mLOWEQUTHAN() throws RecognitionException {
        try {
            int _type = LOWEQUTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:69:12: ( '=<' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:69:14: '=<'
            {
            match("=<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWEQUTHAN"

    // $ANTLR start "GRETHAN"
    public final void mGRETHAN() throws RecognitionException {
        try {
            int _type = GRETHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:70:10: ( '>' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:70:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRETHAN"

    // $ANTLR start "GRETHANEXAN"
    public final void mGRETHANEXAN() throws RecognitionException {
        try {
            int _type = GRETHANEXAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:71:13: ( '=>' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:71:15: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRETHANEXAN"

    // $ANTLR start "EXANTHAN"
    public final void mEXANTHAN() throws RecognitionException {
        try {
            int _type = EXANTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:72:11: ( '==' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:72:13: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXANTHAN"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:75:2: ( '(' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:75:4: '('
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
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:79:2: ( ')' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:79:4: ')'
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

    // $ANTLR start "PODST"
    public final void mPODST() throws RecognitionException {
        try {
            int _type = PODST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:83:2: ( '=' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:83:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PODST"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:87:2: ( '+' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:87:4: '+'
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

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:91:2: ( '-' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:91:4: '-'
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

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:95:2: ( '*' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:95:4: '*'
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
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:99:2: ( '/' )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:99:4: '/'
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

    public void mTokens() throws RecognitionException {
        // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:8: ( VAR | IF | ID | INT | NL | WS | LOWTHAN | LOWEQUTHAN | GRETHAN | GRETHANEXAN | EXANTHAN | LP | RP | PODST | PLUS | MINUS | MUL | DIV )
        int alt5=18;
        switch ( input.LA(1) ) {
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='t') ) {
                    int LA5_21 = input.LA(4);

                    if ( ((LA5_21 >= '0' && LA5_21 <= '9')||(LA5_21 >= 'A' && LA5_21 <= 'Z')||LA5_21=='_'||(LA5_21 >= 'a' && LA5_21 <= 'z')) ) {
                        alt5=3;
                    }
                    else {
                        alt5=1;
                    }
                }
                else {
                    alt5=3;
                }
                }
                break;
            case 'f':
                {
                int LA5_16 = input.LA(3);

                if ( ((LA5_16 >= '0' && LA5_16 <= '9')||(LA5_16 >= 'A' && LA5_16 <= 'Z')||LA5_16=='_'||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
                    alt5=3;
                }
                else {
                    alt5=2;
                }
                }
                break;
            default:
                alt5=3;
            }

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
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
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
            alt5=3;
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
            alt5=4;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=5;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=6;
            }
            break;
        case '<':
            {
            alt5=7;
            }
            break;
        case '=':
            {
            switch ( input.LA(2) ) {
            case '<':
                {
                alt5=8;
                }
                break;
            case '>':
                {
                alt5=10;
                }
                break;
            case '=':
                {
                alt5=11;
                }
                break;
            default:
                alt5=14;
            }

            }
            break;
        case '>':
            {
            alt5=9;
            }
            break;
        case '(':
            {
            alt5=12;
            }
            break;
        case ')':
            {
            alt5=13;
            }
            break;
        case '+':
            {
            alt5=15;
            }
            break;
        case '-':
            {
            alt5=16;
            }
            break;
        case '*':
            {
            alt5=17;
            }
            break;
        case '/':
            {
            alt5=18;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:10: VAR
                {
                mVAR(); 


                }
                break;
            case 2 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:14: IF
                {
                mIF(); 


                }
                break;
            case 3 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:17: ID
                {
                mID(); 


                }
                break;
            case 4 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:20: INT
                {
                mINT(); 


                }
                break;
            case 5 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:24: NL
                {
                mNL(); 


                }
                break;
            case 6 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:27: WS
                {
                mWS(); 


                }
                break;
            case 7 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:30: LOWTHAN
                {
                mLOWTHAN(); 


                }
                break;
            case 8 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:38: LOWEQUTHAN
                {
                mLOWEQUTHAN(); 


                }
                break;
            case 9 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:49: GRETHAN
                {
                mGRETHAN(); 


                }
                break;
            case 10 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:57: GRETHANEXAN
                {
                mGRETHANEXAN(); 


                }
                break;
            case 11 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:69: EXANTHAN
                {
                mEXANTHAN(); 


                }
                break;
            case 12 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:78: LP
                {
                mLP(); 


                }
                break;
            case 13 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:81: RP
                {
                mRP(); 


                }
                break;
            case 14 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:84: PODST
                {
                mPODST(); 


                }
                break;
            case 15 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:90: PLUS
                {
                mPLUS(); 


                }
                break;
            case 16 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:95: MINUS
                {
                mMINUS(); 


                }
                break;
            case 17 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:101: MUL
                {
                mMUL(); 


                }
                break;
            case 18 :
                // /home/uml/Pulpit/antlr_swing/src/tb/antlr/Expr.g:1:105: DIV
                {
                mDIV(); 


                }
                break;

        }

    }


 

}