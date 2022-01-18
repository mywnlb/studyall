package cn.zhangyis.compiler.craftinginterpreters;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author 李波
 * @description: TODO
 * @date 2022/1/18 18:11
 */
public class Lox {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            processFill(args[1]);
        }
    }

    private static void processFill(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        run(new String(bytes, Charset.defaultCharset()));
    }

    private static void run(String source) {
        FillScanner fillScanner = new FillScanner(source);
        List<Token> tokenList = fillScanner.scanTokens();

        for (Token token : tokenList) {
            System.out.println(token);
        }
    }
}
