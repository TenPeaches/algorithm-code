package com.krahets.backtracking.leetcode104;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method01 {
    // 定义一个方法，用来计算二叉树的最大深度
    public int maxDepth(TreeNode root) {
        // 如果当前节点为空，则返回深度0
        if(root == null){
            return 0;
        } else {
            // 递归计算左子树的深度
            int leftDepth = maxDepth(root.left);
            // 递归计算右子树的深度
            int rightDepth = maxDepth(root.right);
            // 返回左子树和右子树深度的最大值加1（当前节点）
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}

