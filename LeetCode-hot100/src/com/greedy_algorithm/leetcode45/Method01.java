package com.greedy_algorithm.leetcode45;

public class Method01 {
    public int jump(int[] nums) {
        int max = 0;
        int end = 0;
        int bushu=0;
        for (int i = 0; i < nums.length-1; i++) {
            max=Math.max(max,i+nums[i]);
            if(i==end){
                bushu++;
                end=max;
            }
        }
        return bushu;
    }
}
