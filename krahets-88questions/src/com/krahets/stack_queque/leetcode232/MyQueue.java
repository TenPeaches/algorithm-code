package com.krahets.stack_queque.leetcode232;

import java.util.Stack;

// 定义一个队列类 MyQueue
public class MyQueue {
    private Stack<Integer> inputStack; // 输入栈
    private Stack<Integer> outputStack; // 输出栈

    // 构造函数，初始化输入栈和输出栈
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // 将元素 x 推入队列中
    public void push(int x) {
        inputStack.push(x);
    }

    // 移除并返回队列的首元素
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

    // 返回队列的首元素但不移除它
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

    // 检查队列是否为空
    public boolean empty() {
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

