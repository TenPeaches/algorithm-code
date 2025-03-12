package com.search_backtracking.lcr175;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    public int calculateDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = calculateDepth(root.left);
        int rightDepth = calculateDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
