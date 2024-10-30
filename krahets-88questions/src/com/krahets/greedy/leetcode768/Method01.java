package com.krahets.greedy.leetcode768;



import java.util.Stack;

public class Method01 {
    public static int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int num : arr) {
            if (stack.isEmpty() || num >= stack.peek()) {
                stack.push(num);
            } else {
                int mx = stack.pop();
                while (!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                stack.push(mx);
            }
        }
        return stack.size();
    }
}
