package com.binary_search.leetcode153;

public class Method01 {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        while (i<j){
            int mid=(i+j)/2;
            if(nums[j]<nums[mid]){
                i=mid+1;
            }else {
                j=mid;
            }
        }
        return nums[i];
    }
}
