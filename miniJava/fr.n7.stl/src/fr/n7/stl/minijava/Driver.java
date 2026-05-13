package fr.n7.stl.minijava;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import fr.n7.stl.minijava.parser.*;

import java.io.FileNotFoundException;
import java.io.IOException;

class Driver {

	public static void main(String[] args) throws Exception {
        String[] files; 
        if (args.length == 0) {
            System.out.println("Using default file : input.mjava");
            files = new String[1];
            files[0] = "input.mjava";
        } else {
            files = args;
        }
        for (String name : files) {
            String fname = name.split("\\.")[0];
            try {
                CharStream input = CharStreams.fromFileName(name);
                ParsingErrorListener errorListener = new ParsingErrorListener();
                MiniJavaLexer lexer = new MiniJavaLexer(input);
                lexer.addErrorListener(errorListener);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MiniJavaParser parser = new MiniJavaParser(tokens);
                parser.addErrorListener(errorListener);
                ParseTree tree = parser.programme();
                ParseTreeWalker walker = new ParseTreeWalker();
                ASTBuilder astBuilder = new ASTBuilder(fname + ".tam");
                walker.walk(astBuilder, tree);
                if (errorListener.hasError()) {
                    System.err.println("Errors in parsing phase.");
                } else {
                    astBuilder.startCompilation();
                }
            } catch (FileNotFoundException e) {
                System.err.println("File : " + name + " not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	
}