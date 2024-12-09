package com.krahets.mathematics.leetcode169;

import java.util.Arrays;

public class Method01 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
