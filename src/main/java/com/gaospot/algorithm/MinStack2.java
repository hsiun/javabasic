package com.gaospot.algorithm;

import java.util.Stack;

/**
 * 实现查找最小数的算法，算法复杂度O（1）
 * Created by gao on 2018/10/8.
 */
public class MinStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    MinStack2() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int num) {
        if(this.stackMin.isEmpty())
            this.stackMin.push(num);
        else if(num < this.getMin())
            this.stackMin.push(num);
        else {
            int min = this.stackMin.peek();
            this.stackMin.push(min);
        }

        this.stackData.push(num);
    }

    public int pop() {
        if(this.stackData.isEmpty())
            throw new RuntimeException("empty stack");
        this.stackMin.pop(); //先丢弃stackMin中的值
        return this.stackData.pop();
    }

    public int getMin() {
        if(this.stackMin.isEmpty())
            throw new RuntimeException("empt stack");

        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack2 mStack = new MinStack2();
        mStack.push(3);
        mStack.push(2);
        mStack.push(4);
        mStack.push(1);
        mStack.push(5);
        System.out.println("min= " +mStack.getMin());

    }
}
