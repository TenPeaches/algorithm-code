package com.binary_search.leetcode33;

public class Method01 {
    public int search(int[] nums, int target) {
        int i =0 , j = nums.length-1;
        if(nums[0]==target){
            return 0;
        }
        while (i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<nums[0]){
                if(target<nums[mid]||target>nums[0]){
                    j=mid-1;
                }else {
                    i=mid+1;
                }
            }else {
                if(target>nums[mid]||target<nums[0]){
                    i=mid+1;
                }else {
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}
