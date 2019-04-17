package com.gaospot.algorithm.stack;

import java.util.Stack;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/2 4:39 PM
 * @description: 通过栈来排序栈
 */

public class SortStack {


    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }

    }
}
