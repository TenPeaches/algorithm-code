package com.krahets.dynamic_programming.leetcode264;


public class Method02 {

    // 方法：获取第n个丑数
    public int nthUglyNumber(int n) {
        // 用于追踪当前2、3、5的乘数的索引
        int a = 0, b = 0, c = 0;
        // dp数组，用于存储前n个丑数
        int[] dp = new int[n];
        dp[0] = 1; // 第一个丑数是1

        // 循环，生成前n个丑数
        for (int i = 1; i < n; i++) {
            // 计算当前最小的丑数，比较乘以2、3和5的结果
            int min = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
            dp[i] = min; // 将最小的丑数放入dp数组中

            // 根据最小值，更新对应的索引
            if (min == dp[a] * 2) a++; // 如果min是2的倍数，则增加a的索引
            if (min == dp[b] * 3) b++; // 如果min是3的倍数，则增加b的索引
            if (min == dp[c] * 5) c++; // 如果min是5的倍数，则增加c的索引
        }

        // 返回第n个丑数
        return dp[n - 1];
    }
}

