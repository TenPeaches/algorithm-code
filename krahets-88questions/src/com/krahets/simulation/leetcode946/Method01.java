package com.krahets.simulation.leetcode946;

import java.util.Stack;

public class Method01 {
    // 方法：验证推入和弹出序列是否可以表示栈的合法操作
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>(); // 创建一个栈
        int i = 0; // 初始化弹出序列的索引

        // 遍历每一个推入的元素
        for (int push : pushed) {
            stack.push(push); // 将当前元素推入栈
            // 当栈不为空，并且栈顶元素等于当前要弹出的元素时
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop(); // 弹出栈顶元素
                i++; // 移动到下一个要弹出的元素
            }
        }

        // 返回栈是否为空，即所有元素是否都已按照顺序弹出
        return stack.isEmpty();
    }
}

