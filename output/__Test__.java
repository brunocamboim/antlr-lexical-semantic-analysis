import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        trabalhoLexer lex = new trabalhoLexer(new ANTLRFileStream("C:\\Users\\bruno\\Desktop\\Tradutores\\Trabalho GB\\antlr-lexical-semantic-analysis\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        trabalhoParser g = new trabalhoParser(tokens, 49100, null);
        try {
            g.parse();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}