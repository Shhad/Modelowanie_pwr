// $ANTLR 3.5.1 /home/uml/Dokumenty/225981/lab1/lab1.g 2019-02-27 16:41:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class lab1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIV", "ID", "INT", 
		"MINUS", "MUL", "NL", "NP", "PLUS", "RP", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "atom", "expr", "term", "plik"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public lab1Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public lab1Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public lab1Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return lab1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/uml/Dokumenty/225981/lab1/lab1.g"; }



	// $ANTLR start "plik"
	// /home/uml/Dokumenty/225981/lab1/lab1.g:3:1: plik : ( expr ( NL )+ )* EOF ;
	public final void plik() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plik");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/uml/Dokumenty/225981/lab1/lab1.g:3:6: ( ( expr ( NL )+ )* EOF )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/225981/lab1/lab1.g:3:8: ( expr ( NL )+ )* EOF
			{
			dbg.location(3,8);
			// /home/uml/Dokumenty/225981/lab1/lab1.g:3:8: ( expr ( NL )+ )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT||LA2_0==NP) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:3:9: expr ( NL )+
					{
					dbg.location(3,9);
					pushFollow(FOLLOW_expr_in_plik11);
					expr();
					state._fsp--;
					dbg.location(3,14);
					// /home/uml/Dokumenty/225981/lab1/lab1.g:3:14: ( NL )+
					int cnt1=0;
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==NL) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// /home/uml/Dokumenty/225981/lab1/lab1.g:3:14: NL
							{
							dbg.location(3,14);
							match(input,NL,FOLLOW_NL_in_plik13); 
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt1++;
					}
					} finally {dbg.exitSubRule(1);}

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(3,20);
			match(input,EOF,FOLLOW_EOF_in_plik18); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(3, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plik");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plik"



	// $ANTLR start "expr"
	// /home/uml/Dokumenty/225981/lab1/lab1.g:4:1: expr : term ( ( PLUS term | MINUS term ) )* ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// /home/uml/Dokumenty/225981/lab1/lab1.g:4:6: ( term ( ( PLUS term | MINUS term ) )* )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/225981/lab1/lab1.g:4:8: term ( ( PLUS term | MINUS term ) )*
			{
			dbg.location(4,8);
			pushFollow(FOLLOW_term_in_expr25);
			term();
			state._fsp--;
			dbg.location(4,13);
			// /home/uml/Dokumenty/225981/lab1/lab1.g:4:13: ( ( PLUS term | MINUS term ) )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:4:14: ( PLUS term | MINUS term )
					{
					dbg.location(4,14);
					// /home/uml/Dokumenty/225981/lab1/lab1.g:4:14: ( PLUS term | MINUS term )
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==PLUS) ) {
						alt3=1;
					}
					else if ( (LA3_0==MINUS) ) {
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

							// /home/uml/Dokumenty/225981/lab1/lab1.g:4:15: PLUS term
							{
							dbg.location(4,15);
							match(input,PLUS,FOLLOW_PLUS_in_expr29); dbg.location(4,20);
							pushFollow(FOLLOW_term_in_expr31);
							term();
							state._fsp--;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/uml/Dokumenty/225981/lab1/lab1.g:4:27: MINUS term
							{
							dbg.location(4,27);
							match(input,MINUS,FOLLOW_MINUS_in_expr35); dbg.location(4,33);
							pushFollow(FOLLOW_term_in_expr37);
							term();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

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
		dbg.location(4, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// /home/uml/Dokumenty/225981/lab1/lab1.g:5:1: term : atom ( MUL atom | DIV atom )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// /home/uml/Dokumenty/225981/lab1/lab1.g:5:6: ( atom ( MUL atom | DIV atom )* )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/225981/lab1/lab1.g:5:8: atom ( MUL atom | DIV atom )*
			{
			dbg.location(5,8);
			pushFollow(FOLLOW_atom_in_term48);
			atom();
			state._fsp--;
			dbg.location(5,13);
			// /home/uml/Dokumenty/225981/lab1/lab1.g:5:13: ( MUL atom | DIV atom )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=3;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==MUL) ) {
					alt5=1;
				}
				else if ( (LA5_0==DIV) ) {
					alt5=2;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:5:14: MUL atom
					{
					dbg.location(5,14);
					match(input,MUL,FOLLOW_MUL_in_term51); dbg.location(5,18);
					pushFollow(FOLLOW_atom_in_term53);
					atom();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:5:25: DIV atom
					{
					dbg.location(5,25);
					match(input,DIV,FOLLOW_DIV_in_term57); dbg.location(5,29);
					pushFollow(FOLLOW_atom_in_term59);
					atom();
					state._fsp--;

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
		dbg.location(5, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "atom"
	// /home/uml/Dokumenty/225981/lab1/lab1.g:6:1: atom : ( INT | ( NP expr RP ) );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /home/uml/Dokumenty/225981/lab1/lab1.g:6:6: ( INT | ( NP expr RP ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
				alt6=1;
			}
			else if ( (LA6_0==NP) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:6:8: INT
					{
					dbg.location(6,8);
					match(input,INT,FOLLOW_INT_in_atom68); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:7:3: ( NP expr RP )
					{
					dbg.location(7,3);
					// /home/uml/Dokumenty/225981/lab1/lab1.g:7:3: ( NP expr RP )
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/225981/lab1/lab1.g:7:4: NP expr RP
					{
					dbg.location(7,4);
					match(input,NP,FOLLOW_NP_in_atom73); dbg.location(7,7);
					pushFollow(FOLLOW_expr_in_atom75);
					expr();
					state._fsp--;
					dbg.location(7,12);
					match(input,RP,FOLLOW_RP_in_atom77); 
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
		dbg.location(8, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_plik11 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NL_in_plik13 = new BitSet(new long[]{0x0000000000000C80L});
	public static final BitSet FOLLOW_EOF_in_plik18 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr25 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_PLUS_in_expr29 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_term_in_expr31 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_MINUS_in_expr35 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_term_in_expr37 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_atom_in_term48 = new BitSet(new long[]{0x0000000000000222L});
	public static final BitSet FOLLOW_MUL_in_term51 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_atom_in_term53 = new BitSet(new long[]{0x0000000000000222L});
	public static final BitSet FOLLOW_DIV_in_term57 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_atom_in_term59 = new BitSet(new long[]{0x0000000000000222L});
	public static final BitSet FOLLOW_INT_in_atom68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NP_in_atom73 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_expr_in_atom75 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom77 = new BitSet(new long[]{0x0000000000000002L});
}
