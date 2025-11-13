package com.binary_tree.leetcode108;

import com.binary_tree.leetcode94.TreeNode;

public class Method01 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left=sortedArrayToBST(nums,left,mid-1);
        treeNode.right=sortedArrayToBST(nums,mid+1,right);
        return treeNode;
    }

}
