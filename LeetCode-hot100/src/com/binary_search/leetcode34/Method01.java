package com.binary_search.leetcode34;

public class Method01 {
    public int[] searchRange(int[] nums, int target) {
        int left=ff(nums,target);
        if(left==nums.length||nums[left]!=target){
            return new int[]{-1,-1};
        }
        int right=ff(nums,target+1);
        return new int[]{left,right-1};
    }

    private int ff(int[] nums, int target){
        int i = 0 , j = nums.length-1;
        while (i<=j){
            int k = i+(j-i)/2;
            if(nums[k]>=target){
                j=k-1;
            }else if(nums[k]<target){
                i=k+1;
            }
        }
        return i;
    }
}
