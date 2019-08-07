package com.gaospot.design.interpreter;

import java.util.StringTokenizer;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 10:39
 */

public class TerminalExpression extends Expression {


    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    /**
     * 看不懂这个函数。。。
     * @param str
     * @return
     */
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
