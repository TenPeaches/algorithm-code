package com.divide_algorithm.lcr152;

public class Method01 {
    public boolean verifyTreeOrder(int[] postorder) {
        return helper(postorder, 0, postorder.length - 1);
    }

    private boolean helper(int[] postorder, int i, int i1) {
        if (i >= i1) {
            return true;
        }
        int root = postorder[i1];
        int left = i;
        while (postorder[left] < root) {
            left++;
        }
        int j = left;
        while ( postorder[left] > root) {
            left++;
        }
        return left == i1 && helper(postorder, i, j - 1) && helper(postorder, j, i1 - 1);
    }
}
