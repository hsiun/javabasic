package com.gaospot.algorithm;

import java.util.Stack;

/**
 * Created by gao on 2018/10/8.
 */
public class MinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public MinStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public void push(int newNum) {
        if(this.stackMin.empty())
            this.stackMin.push(newNum);
        else if(newNum < this.getmin())
            this.stackMin.push(newNum);

        this.stackData.push(newNum);
    }

    public int pop() {
        if(this.stackData.isEmpty())
            throw new RuntimeException("your stack is empty");
        int value = this.stackData.pop();
        if(value == this.stackMin.pop())
            this.stackMin.pop();

        return value;
    }

    public int getmin() {
        if(this.stackMin.isEmpty())
            throw new RuntimeException("no value in the stack");

        return this.stackMin.peek();
    }
}
