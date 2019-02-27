import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        lab1Lexer lex = new lab1Lexer(new ANTLRFileStream("/home/uml/Dokumenty/225981/lab1/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        lab1Parser g = new lab1Parser(tokens, 49100, null);
        try {
            g.plik();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}