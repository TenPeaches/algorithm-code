package com.binary_tree.leetcode104;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
