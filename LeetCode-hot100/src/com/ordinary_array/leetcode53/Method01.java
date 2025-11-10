package com.ordinary_array.leetcode53;

public class Method01 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=Math.max(nums[i-1],0 );
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}
