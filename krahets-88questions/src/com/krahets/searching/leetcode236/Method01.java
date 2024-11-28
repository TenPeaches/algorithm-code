package com.krahets.searching.leetcode236;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method01 {
    // 找到二叉树中两个节点的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果当前节点为空，或者当前节点是p或q，则返回当前节点
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        // 递归查找左子树中的p和q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 递归查找右子树中的p和q
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 如果左子树没有找到，则返回右子树的结果
        if (left == null) {
            return right;
        }
        // 如果右子树没有找到，则返回左子树的结果
        if (right == null) {
            return left;
        }
        // 如果左右子树都找到了p和q，说明当前节点是最近公共祖先
        return root;
    }
}

