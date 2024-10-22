package com.krahets.stack_queque.leetcode155;

import java.util.Stack;

// 最小栈类，提供基本的栈操作以及获取最小值的功能
public class MinStack {
    private Stack<Integer> stack; // 存储栈元素的栈
    private Stack<Integer> minStack; // 存储当前最小值的栈

    // 构造函数，初始化栈和最小值栈
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    // 向栈中添加元素，并更新最小值栈
    public void push(int val) {
        stack.push(val);
        if (val < minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    // 移除栈顶元素，并同步更新最小值栈
    public void pop() {
        stack.pop();
        minStack.pop();
    }

    // 获取栈顶元素
    public int top() {
        return stack.peek();
    }

    // 获取当前最小值
    public int getMin() {
        return minStack.peek();
    }
}

