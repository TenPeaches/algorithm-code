package com.search_backtracking.lcr193;

import com.search_backtracking.lcr149.TreeNode;

public class Method02 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        return helper(root, p, q);
    }

    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val< p.val){
            return helper(root.right, p, q);
        }else if(root.val > q.val){
            return helper(root.left, p, q);
        }else {
            return root;
        }
    }
}
