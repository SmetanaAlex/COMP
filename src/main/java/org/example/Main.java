package org.example;

import org.example.classes.LexerCool;
import org.example.classes.ParserCool;

public class Main {
    public static void main(String[] args){
        try {
            String fileForCompiler = "coolfiles/test_good_cool_file.cl";
            if (args.length >= 1)
                fileForCompiler = args[0];
            LexerCool lexer = new LexerCool(fileForCompiler);
            lexer.WTokens(fileForCompiler + "-lexer");
            ParserCool parser = new ParserCool(lexer);
            parser.WriteCST(fileForCompiler + "-parser");
        }
        catch (Exception e){
            System.out.println("Error is:" + e);
        }
    }
}