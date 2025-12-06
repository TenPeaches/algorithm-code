package com.greedy_algorithm.leetcode55;

public class Method01 {
    public boolean canJump(int[] nums) {
        int max=0;
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            if(i<=max){
                max=Math.max(max,nums[i]+i);
            }
        }
        return max>=n-1;
    }
}
