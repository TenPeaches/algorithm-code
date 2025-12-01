package com.binary_search.leetcode35;

public class Method01 {
    public int searchInsert(int[] nums, int target) {
        int i = 0,j=nums.length-1;
        while (i<=j){
            int k=i+(j-i)/2;
            if(target>nums[k]){
                i=k+1;
            }else if(target<nums[k]){
                j=k-1;
            }else {
                return k;
            }
        }
        return i;
    }
}
