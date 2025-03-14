package com.search_backtracking.lcr193;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        while (root!= null){
            if(p.val>root.val){
                root = root.right;
            }else if(q.val<root.val){
                root = root.left;
            }else{
                return root;
            }
        }
        return null;
    }
}
