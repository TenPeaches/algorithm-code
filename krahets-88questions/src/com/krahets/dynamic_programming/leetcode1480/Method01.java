package com.krahets.dynamic_programming.leetcode1480;

public class Method01 {
    // 计算数组的前缀和
    public int[] runningSum(int[] nums) {
        // 从第二个元素开始遍历数组
        for (int i = 1; i < nums.length; i++) {
            // 当前元素加上前一个元素的值，更新当前元素为前缀和
            nums[i] += nums[i - 1];
        }
        // 返回更新后的数组，即前缀和数组
        return nums;
    }
}

