package com.binary_tree.leetcode114;

import com.binary_tree.leetcode94.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        ff(root);
        root=list.get(0);
        TreeNode pre = root;
        for (int i = 1; i < list.size(); i++) {
            pre.right=list.get(i);
            pre.left=null;
            pre=pre.right;
        }
    }

    private void ff(TreeNode root) {
        if(root==null){
            return;
        }
        list.add(root);
        ff(root.left);
        ff(root.right);
    }
}
