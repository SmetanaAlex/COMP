package org.example.classes;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.gen.CoolParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ParserCool {
    public CoolParser ParserCool;

    public ParserCool(LexerCool lexer) {

        ParserCool = new CoolParser(lexer.tStream);
        ParserCool.removeErrorListeners();
        ParserCool.addErrorListener(ParserErrorListener.ParserErrorListenerObject);
    }

    public void WriteCST(String outFilePath) {
        ParseTree Tree = ParserCool.program();
        String tree = Tree.toStringTree(ParserCool);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFilePath));
            bufferedWriter.write(tree);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
