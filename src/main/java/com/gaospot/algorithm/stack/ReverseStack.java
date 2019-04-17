package com.gaospot.algorithm.stack;

import java.util.Stack;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/2 4:19 PM
 * @description: 通过递归转至一个栈
 */

public class ReverseStack {


    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();

        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        } else {
            int last = getAndRemoveLastElement(stack);
            reverse(stack);
            stack.push(last);
        }
    }
}
