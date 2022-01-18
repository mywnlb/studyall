package cn.zhangyis.compiler.craftinginterpreters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李波
 * @description:
 * @date 2022/1/18 18:12
 */
public class FillScanner {

    private String source;
    private List<Token> tokenList = new ArrayList<>();

    public FillScanner(String source) {
        this.source = source;
    }

    public List<Token> scanTokens() {

    }
}
