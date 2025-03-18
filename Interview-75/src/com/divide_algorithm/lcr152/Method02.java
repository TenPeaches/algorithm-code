package com.divide_algorithm.lcr152;

import java.util.Stack;

public class Method02 {
    public boolean verifyTreeOrder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!stack.isEmpty() && stack.peek() < postorder[i]) {
                root = stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}
