package com.krahets.divide_conquer.leetcode110;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method01 {
    // 判断一棵树是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        // 如果根节点为空，返回true（空树是平衡的）
        if (root == null) {
            return true;
        }

        // 计算左子树和右子树的深度差
        // 如果深度差小于等于1，并且左子树和右子树均是平衡的，则返回true
        return Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    // 获取树的深度
    private int getDepth(TreeNode root) {
        // 如果节点为空，深度为0
        if (root == null) {
            return 0;
        }

        // 递归计算左右子树的深度，返回当前节点的深度（1 + 左右子树深度的最大值）
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}

