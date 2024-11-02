package com.krahets.divide_conquer.leetcode226;



public class Method01 {
    /**
     * 反转一棵二叉树。
     *
     * @param root 二叉树的根节点
     * @return 返回反转后的二叉树的根节点
     */
    public TreeNode invertTree(TreeNode root) {
        // 如果当前节点为空，返回null
        if (root == null) {
            return null;
        }

        // 递归反转左子树，并将结果保存在left中
        TreeNode left = invertTree(root.left);

        // 递归反转右子树，并将右子树赋值给当前节点的左子树
        root.left = invertTree(root.right);

        // 将之前保存的左子树赋值给当前节点的右子树
        root.right = left;

        // 返回反转后的根节点
        return root;
    }
}

