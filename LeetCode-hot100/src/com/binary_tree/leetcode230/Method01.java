package com.binary_tree.leetcode230;

import com.binary_tree.leetcode94.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<Integer> list= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        isvalidbst(root);
        return list.get(k-1);
    }

    private void isvalidbst(TreeNode root){
        if(root==null){
            return;
        }
        isvalidbst(root.left);
        list.add(root.val);
        isvalidbst(root.right);
    }
}
