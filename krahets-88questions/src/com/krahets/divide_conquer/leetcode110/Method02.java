package com.krahets.divide_conquer.leetcode110;


import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method02 {
    // 判断一棵树是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        // 如果树的高度大于等于0，说明是平衡的，否则返回false
        return height(root) >= 0;
    }

    // 计算树的高度，并判断树是否平衡
    public int height(TreeNode root) {
        // 如果当前节点为空，返回0，表示空树的高度
        if (root == null) {
            return 0;
        }

        // 递归计算左子树和右子树的高度
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // 如果左子树或右子树不平衡，返回-1
        // 或者左右子树的高度差大于1，返回-1
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // 表示不平衡
        } else {
            // 返回当前节点的高度
            return Math.max(leftHeight, rightHeight) + 1; // 高度为左右子树的最大高度加1
        }
    }
}
