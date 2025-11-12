package com.binary_tree.leetcode543;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    int max=1;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max-1;
    }

    private int depth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        max = Math.max(max,left+right+1);
        return Math.max(left,right)+1;
    }

}
