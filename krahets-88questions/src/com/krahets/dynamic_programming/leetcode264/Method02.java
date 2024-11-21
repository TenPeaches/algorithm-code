package com.krahets.dynamic_programming.leetcode264;


public class Method02 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
            dp[i] = min;
            if (min == dp[a] * 2) a++;
            if (min == dp[b] * 3) b++;
            if (min == dp[c] * 5) c++;
        }
        return dp[n-1];
    }
}
