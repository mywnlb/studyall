package cn.zhangyis.compiler.craftinginterpreters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 李波
 * @description:
 * @date 2022/1/14 15:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Token {
    private TokenType type;
    private String lexeme;
    private Object literal;
    private int line;
}
