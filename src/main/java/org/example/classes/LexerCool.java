package org.example.classes;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.gen.CoolLexer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LexerCool {
    private final CoolLexer lexer;
    public CommonTokenStream tStream;
    private final List<Token> tokens;
    private List<Token> errors;
    private List<String> outputTokens;

    public LexerCool(String fileName) {
        CharStream charStream;
        try {
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolLexer(charStream);
        tStream = new CommonTokenStream(lexer);
        tStream.fill();
        tokens = tStream.getTokens();
        LTokens();
    }

    private void LTokens() {
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();

        for (Token token : tokens) {
            if (token.getType() > 0) {
                if (ruleNames[token.getType() - 1].equals("ERROR")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(token.getLine()));
                    outputTokens.add(ruleNames[token.getType() - 1]);
                    if (Objects.equals(ruleNames[token.getType() - 1], "ID"))
                        outputTokens.add(token.getText());
                }
            }
        }

        if (errors.size() > 0)
            PrintError();
    }


    public void PrintError() {
        for (Token errorToken : errors) {
            System.out.print("\nLexical error in line: " + errorToken.getLine());
            System.out.print("\nLexical error: " + errorToken.getText());
        }
        System.exit(0);
    }

    public void WTokens(String outputFilePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            for (String token : outputTokens) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

