// $ANTLR 3.4 /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g 2019-03-06 14:53:16

package tb.antlr;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends MyTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "PRINT", "RP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int PRINT=13;
    public static final int RP=14;
    public static final int VAR=15;
    public static final int WS=16;

    // delegates
    public MyTreeParser[] getDelegates() {
        return new MyTreeParser[] {};
    }

    // delegators


    public TExpr1(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr1(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TExpr1.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g"; }



    // $ANTLR start "prog"
    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:1: prog : (e= expr | print )* ;
    public final void prog() throws RecognitionException {
        Integer e =null;


        try {
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:9: ( (e= expr | print )* )
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:11: (e= expr | print )*
            {
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:11: (e= expr | print )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||LA1_0==INT||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==PRINT) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:12: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog51);
            	    e=expr();

            	    state._fsp--;


            	    drukuj ("");

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:14:36: print
            	    {
            	    pushFollow(FOLLOW_print_in_prog57);
            	    print();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "print"
    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:15:1: print : ^( PRINT (e= expr )* ) ;
    public final void print() throws RecognitionException {
        Integer e =null;


        try {
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:15:10: ( ^( PRINT (e= expr )* ) )
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:15:12: ^( PRINT (e= expr )* )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print71); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:15:19: (e= expr )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==DIV||LA2_0==INT||(LA2_0 >= MINUS && LA2_0 <= MUL)||(LA2_0 >= PLUS && LA2_0 <= PODST)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:15:20: e= expr
                	    {
                	    pushFollow(FOLLOW_expr_in_print75);
                	    e=expr();

                	    state._fsp--;


                	    drukuj (e.toString());

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
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
        return ;
    }
    // $ANTLR end "print"



    // $ANTLR start "expr"
    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:17:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT );
    public final Integer expr() throws RecognitionException {
        Integer out = null;


        CommonTree i1=null;
        CommonTree INT1=null;
        Integer e1 =null;

        Integer e2 =null;


        try {
            // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:18:8: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT )
            int alt3=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt3=1;
                }
                break;
            case MINUS:
                {
                alt3=2;
                }
                break;
            case MUL:
                {
                alt3=3;
                }
                break;
            case DIV:
                {
                alt3=4;
                }
                break;
            case PODST:
                {
                alt3=5;
                }
                break;
            case INT:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:18:10: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr101); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr106);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr110);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 + e2;

                    }
                    break;
                case 2 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:19:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr126); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr130);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr134);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 - e2;

                    }
                    break;
                case 3 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:20:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr150); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr156);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr160);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 * e2;

                    }
                    break;
                case 4 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:21:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr176); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr182);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr186);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 / e2;

                    }
                    break;
                case 5 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:22:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr202); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr206); 

                    pushFollow(FOLLOW_expr_in_expr212);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // /home/uml/Pobrane/1/tbabczynski-antlr_swing-cf4d98c6ee79/antlr_swing/src/tb/antlr/TExpr1.g:23:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr225); 

                    out = getInt((INT1!=null?INT1.getText():null));

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
        return out;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog51 = new BitSet(new long[]{0x0000000000003B52L});
    public static final BitSet FOLLOW_print_in_prog57 = new BitSet(new long[]{0x0000000000003B52L});
    public static final BitSet FOLLOW_PRINT_in_print71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print75 = new BitSet(new long[]{0x0000000000001B58L});
    public static final BitSet FOLLOW_PLUS_in_expr101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr106 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr130 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr182 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr206 = new BitSet(new long[]{0x0000000000001B50L});
    public static final BitSet FOLLOW_expr_in_expr212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr225 = new BitSet(new long[]{0x0000000000000002L});

}