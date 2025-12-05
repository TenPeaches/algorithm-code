package com.stack.leetcode739;

import java.util.Stack;

public class Method01 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] trr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                int j = stack.pop();
                trr[j] = i-j;
            }
            stack.push(i);
        }
        return trr;
    }
}
