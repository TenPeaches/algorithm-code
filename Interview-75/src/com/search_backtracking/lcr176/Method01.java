package com.search_backtracking.lcr176;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    public boolean isBalanced(TreeNode root) {
        return isBalancedHelper(root)!= -1;
    }

    private int isBalancedHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = isBalancedHelper(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = isBalancedHelper(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
