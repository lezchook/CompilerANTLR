package ru.leshchenko.itmolabs;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        langLexer lexer = new langLexer(CharStreams.fromFileName(
                "C:\\Users\\lesch\\IdeaProjects\\CompilerANTLR\\src\\main\\java\\ru\\leshchenko\\itmolabs\\test.lang"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langParser parser = new langParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new langInterpreterListener(), tree);
    }
}