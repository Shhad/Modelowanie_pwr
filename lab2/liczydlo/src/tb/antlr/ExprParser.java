// $ANTLR 3.4 /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g 2019-03-06 16:25:10

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:16:1: prog : ( stat )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.stat_return stat1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:17:5: ( ( stat )+ EOF !)
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:17:7: ( stat )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:17:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= LP)||LA1_0==NL||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:17:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog49);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog54); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:19:1: stat : ( expr NL -> expr | PRINT ^ expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token PRINT5=null;
        Token ID7=null;
        Token PODST8=null;
        Token NL10=null;
        Token NL11=null;
        ExprParser.expr_return expr3 =null;

        ExprParser.expr_return expr6 =null;

        ExprParser.expr_return expr9 =null;


        CommonTree NL4_tree=null;
        CommonTree PRINT5_tree=null;
        CommonTree ID7_tree=null;
        CommonTree PODST8_tree=null;
        CommonTree NL10_tree=null;
        CommonTree NL11_tree=null;
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:20:5: ( expr NL -> expr | PRINT ^ expr | ID PODST expr NL -> ^( PODST ID expr ) | NL ->)
            int alt2=4;
            switch ( input.LA(1) ) {
            case INT:
            case LP:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==PODST) ) {
                    alt2=3;
                }
                else if ( (LA2_2==DIV||(LA2_2 >= MINUS && LA2_2 <= PLUS)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case PRINT:
                {
                alt2=2;
                }
                break;
            case NL:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:20:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;

                    stream_expr.add(expr3.getTree());

                    NL4=(Token)match(input,NL,FOLLOW_NL_in_stat69);  
                    stream_NL.add(NL4);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:22:7: PRINT ^ expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PRINT5=(Token)match(input,PRINT,FOLLOW_PRINT_in_stat82); 
                    PRINT5_tree = 
                    (CommonTree)adaptor.create(PRINT5)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(PRINT5_tree, root_0);


                    pushFollow(FOLLOW_expr_in_stat85);
                    expr6=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr6.getTree());

                    }
                    break;
                case 3 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:23:7: ID PODST expr NL
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_stat93);  
                    stream_ID.add(ID7);


                    PODST8=(Token)match(input,PODST,FOLLOW_PODST_in_stat95);  
                    stream_PODST.add(PODST8);


                    pushFollow(FOLLOW_expr_in_stat97);
                    expr9=expr();

                    state._fsp--;

                    stream_expr.add(expr9.getTree());

                    NL10=(Token)match(input,NL,FOLLOW_NL_in_stat99);  
                    stream_NL.add(NL10);


                    // AST REWRITE
                    // elements: expr, PODST, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:23:27: ^( PODST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:25:7: NL
                    {
                    NL11=(Token)match(input,NL,FOLLOW_NL_in_stat118);  
                    stream_NL.add(NL11);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 25:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:28:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS13=null;
        Token MINUS15=null;
        ExprParser.multExpr_return multExpr12 =null;

        ExprParser.multExpr_return multExpr14 =null;

        ExprParser.multExpr_return multExpr16 =null;


        CommonTree PLUS13_tree=null;
        CommonTree MINUS15_tree=null;

        try {
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:29:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:29:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr137);
            multExpr12=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr12.getTree());

            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:30:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PLUS) ) {
                    alt3=1;
                }
                else if ( (LA3_0==MINUS) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:30:9: PLUS ^ multExpr
            	    {
            	    PLUS13=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr147); 
            	    PLUS13_tree = 
            	    (CommonTree)adaptor.create(PLUS13)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS13_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr150);
            	    multExpr14=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr14.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:31:9: MINUS ^ multExpr
            	    {
            	    MINUS15=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr160); 
            	    MINUS15_tree = 
            	    (CommonTree)adaptor.create(MINUS15)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS15_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr163);
            	    multExpr16=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr16.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:35:1: multExpr : atom ( MUL ^ atom | DIV ^ atom )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL18=null;
        Token DIV20=null;
        ExprParser.atom_return atom17 =null;

        ExprParser.atom_return atom19 =null;

        ExprParser.atom_return atom21 =null;


        CommonTree MUL18_tree=null;
        CommonTree DIV20_tree=null;

        try {
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:36:5: ( atom ( MUL ^ atom | DIV ^ atom )* )
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:36:7: atom ( MUL ^ atom | DIV ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr189);
            atom17=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom17.getTree());

            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:37:7: ( MUL ^ atom | DIV ^ atom )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MUL) ) {
                    alt4=1;
                }
                else if ( (LA4_0==DIV) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:37:9: MUL ^ atom
            	    {
            	    MUL18=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr199); 
            	    MUL18_tree = 
            	    (CommonTree)adaptor.create(MUL18)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL18_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr202);
            	    atom19=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom19.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:38:9: DIV ^ atom
            	    {
            	    DIV20=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr212); 
            	    DIV20_tree = 
            	    (CommonTree)adaptor.create(DIV20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV20_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr215);
            	    atom21=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom21.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:42:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT22=null;
        Token ID23=null;
        Token LP24=null;
        Token RP26=null;
        ExprParser.expr_return expr25 =null;


        CommonTree INT22_tree=null;
        CommonTree ID23_tree=null;
        CommonTree LP24_tree=null;
        CommonTree RP26_tree=null;

        try {
            // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:43:5: ( INT | ID | LP ! expr RP !)
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case LP:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:43:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT22=(Token)match(input,INT,FOLLOW_INT_in_atom241); 
                    INT22_tree = 
                    (CommonTree)adaptor.create(INT22)
                    ;
                    adaptor.addChild(root_0, INT22_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:44:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID23=(Token)match(input,ID,FOLLOW_ID_in_atom249); 
                    ID23_tree = 
                    (CommonTree)adaptor.create(ID23)
                    ;
                    adaptor.addChild(root_0, ID23_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/Dokumenty/lab2_fb/git/Modelowanie_pwr/lab2/liczydlo/src/tb/antlr/Expr.g:45:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP24=(Token)match(input,LP,FOLLOW_LP_in_atom257); 

                    pushFollow(FOLLOW_expr_in_atom260);
                    expr25=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr25.getTree());

                    RP26=(Token)match(input,RP,FOLLOW_RP_in_atom262); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x00000000000024E0L});
    public static final BitSet FOLLOW_EOF_in_prog54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_stat82 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_stat85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat93 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PODST_in_stat95 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_stat97 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr137 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_PLUS_in_expr147 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr150 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_MINUS_in_expr160 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr163 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_atom_in_multExpr189 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_MUL_in_multExpr199 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr202 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_DIV_in_multExpr212 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr215 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_INT_in_atom241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom257 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_atom260 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_atom262 = new BitSet(new long[]{0x0000000000000002L});

}