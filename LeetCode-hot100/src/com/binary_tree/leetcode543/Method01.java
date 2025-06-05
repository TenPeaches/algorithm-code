package com.binary_tree.leetcode543;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dpth(root);
        return max;
    }

    private int dpth(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = dpth(root.left)+1;
        int right = dpth(root.right)+1;
        max = Math.max(max, left+right);
        return Math.max(left, right);
    }
}
