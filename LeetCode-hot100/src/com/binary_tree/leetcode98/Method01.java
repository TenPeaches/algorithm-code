package com.binary_tree.leetcode98;

import com.binary_tree.leetcode94.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<Integer> list= new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        isvalidbst(root);
        if(list.size()<2){
            return true;
        }
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
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
