package com.binary_tree.leetcode437;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    public int pathSum(TreeNode root, long targetSum) {
        if(root==null){
            return 0;
        }
        int sum = pS(root,targetSum);
        sum+=pathSum(root.left,targetSum);
        sum+=pathSum(root.right,targetSum);
        return sum;
    }

    private int pS(TreeNode root, long targetSum) {
        if(root==null){
            return 0;
        }
        int sum=0;
        long val=targetSum-root.val;
        if(val==0){
            sum++;
        }
        sum+=pS(root.left,val);
        sum+=pS(root.right,val);
        return sum;
    }
}
