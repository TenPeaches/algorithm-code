package com.krahets.dynamic_programming.leetcode53;

public class Method01 {
    // 计算给定数组的最大子数组和
    public int maxSubArray(int[] nums) {
        // 初始化最大子数组和为数组的第一个元素
        int max = nums[0];

        // 遍历数组，从第二个元素开始
        for (int i = 1; i < nums.length; i++) {
            // 更新当前元素为当前元素与前一个累积和的和（如果前一个累积和大于0）
            // 否则当前元素保持不变（即从当前元素重新开始累积）
            nums[i] += nums[i - 1] > 0 ? nums[i - 1] : 0;

            // 更新最大子数组和
            max = Math.max(max, nums[i]);
        }
        // 返回最大子数组和
        return max;
    }
}

