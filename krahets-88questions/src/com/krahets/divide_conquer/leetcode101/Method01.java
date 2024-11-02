package com.krahets.divide_conquer.leetcode101;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method01 {
    public boolean isSymmetric(TreeNode root) {
        return cheakSymmetric(root.left, root.right);
    }
    private boolean cheakSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val==right.val && cheakSymmetric(left.left, right.right) && cheakSymmetric(left.right, right.left);
    }
}
