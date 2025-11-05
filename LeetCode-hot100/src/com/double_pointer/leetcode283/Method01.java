package com.double_pointer.leetcode283;

public class Method01 {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length){
            if (nums[j]!= 0){
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
