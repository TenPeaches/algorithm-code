package com.binary_tree.leetcode199;

import com.binary_tree.leetcode94.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return rightSideView(list,0,root);
    }

    private List<Integer> rightSideView(List<Integer> list,int depth,TreeNode root){
        if(root==null){
            return list;
        }
        if(depth==list.size()){
            list.add(root.val);
        }
        rightSideView(list,depth+1,root.right);
        rightSideView(list,depth+1,root.left);
        return list;
    }
}
