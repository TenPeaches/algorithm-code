package com.krahets.dynamic_programming.leetcode300;

public class Method01 {

    // 主方法：计算给定数组的最长递增子序列的长度
    public int lengthOfLIS(int[] nums) {
        int n = nums.length; // 获取数组的长度
        int[] dp = new int[n]; // dp 数组，用于存储以每个元素结尾的最长递增子序列的长度
        int maxLen = 0; // 记录最长递增子序列的最大长度

        // 从第二个元素开始遍历
        for (int i = 1; i < n; i++) {
            // 遍历当前元素之前的所有元素
            for (int j = 0; j < i; j++) {
                // 如果当前元素大于之前的元素，说明可以形成递增序列
                if (nums[i] > nums[j]) {
                    // 更新 dp[i]：取 dp[j] + 1 与 dp[i] 的最大值
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // 更新 maxLen：取当前最大长度与 dp[i] 的最大值
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }

        // 返回最长递增子序列的长度，+1 是因为 dp 数组初始值为 0
        return maxLen + 1;
    }
}

