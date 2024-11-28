package com.krahets.searching.leetcode235;

import com.krahets.divide_conquer.leetcode226.TreeNode;

public class Method02 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root!= null){
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
                } else {
                    return root;
            }
        }
        return null;
    }
}
