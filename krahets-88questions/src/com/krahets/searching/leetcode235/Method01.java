package com.krahets.searching.leetcode235;
import com.krahets.divide_conquer.leetcode226.TreeNode;
public class Method01 {
    // 找到二叉搜索树中两个节点的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 判断当前节点是否在p和q之间
        if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val)) {
            return root; // 当前节点是最近公共祖先
        }

        // 如果当前节点的值小于p的值，说明p和q在右子树中
        if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else { // 否则，p和q在左子树中
            return lowestCommonAncestor(root.left, p, q);
        }
    }
}

