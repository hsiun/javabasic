package com.gaospot.algorithm.stack;

import java.util.Stack;

/**
 * 使用两个栈来模拟队列
 *
 * Created by gao on 2018/10/8.
 */
public class TowStacksQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TowStacksQueue() {
        this.stackPop = new Stack<>();
        this.stackPush = new Stack<>();
    }

    public void add(int newNum) {
        stackPush.push(newNum);
    }

    public int poll() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Your Stack is empty");
        } else if (stackPop.isEmpty()) {
            while(!stackPush.isEmpty()) {
                int push = stackPush.pop();
                stackPop.push(push);
            }
        }

        return stackPop.pop();
    }


    public int peek() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        } else if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }

        return stackPop.peek();
    }
}
