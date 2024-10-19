package com.krahets.stack_queque.leetcode232;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        } else {
            return outputStack.pop();
        }
        return outputStack.pop();
    }

    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        } else {
            return outputStack.peek();
        }
        return outputStack.peek();
    }

    public boolean empty() {
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
