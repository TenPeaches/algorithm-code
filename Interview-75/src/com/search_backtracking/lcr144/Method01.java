package com.search_backtracking.lcr144;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    public TreeNode flipTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left=right;
        root.right=left;
        flipTree(left);
        flipTree(right);
        return root;
    }
}
