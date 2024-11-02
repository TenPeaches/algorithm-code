package com.krahets.divide_conquer.leetcode101;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method01 {
    /**
     * 判断一棵二叉树是否是对称的。
     *
     * @param root 二叉树的根节点
     * @return 如果二叉树是对称的，返回 true；否则返回 false
     */
    public boolean isSymmetric(TreeNode root) {
        // 调用辅助方法检查根节点的左子树和右子树是否对称
        return cheakSymmetric(root.left, root.right);
    }

    /**
     * 辅助方法，检查两个子树是否对称。
     *
     * @param left  左子树的根节点
     * @param right 右子树的根节点
     * @return 如果两个子树是对称的，返回 true；否则返回 false
     */
    private boolean cheakSymmetric(TreeNode left, TreeNode right) {
        // 如果两个子树都为空，返回 true
        if (left == null && right == null) {
            return true;
        }
        // 如果一个子树为空而另一个不为空，返回 false
        if (left == null || right == null) {
            return false;
        }
        // 检查当前两个节点的值是否相等，并递归检查子树的对称性
        return left.val == right.val
                && cheakSymmetric(left.left, right.right) // 递归检查左子树的左节点与右子树的右节点
                && cheakSymmetric(left.right, right.left); // 递归检查左子树的右节点与右子树的左节点
    }
}
