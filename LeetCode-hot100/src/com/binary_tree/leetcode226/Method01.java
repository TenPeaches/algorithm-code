package com.binary_tree.leetcode226;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
