package com.krahets.dual_pointer.leetcode392;

public class Method01 {

    // 检查字符串 s 是否为字符串 t 的子序列
    public boolean isSubsequence(String s, String t) {
        // 获取字符串 s 和 t 的长度
        int n = s.length();
        int m = t.length();

        // 创建一个布尔数组 dp，长度为 n+1，表示是否匹配到当前字符
        boolean[] dp = new boolean[n + 1];

        // 初始化 dp[0] 为 true，表示空字符串 s 一定是任意字符串 t 的子序列
        dp[0] = true;

        // 遍历字符串 t
        for (int i = 1; i <= m; i++) {
            // 遍历字符串 s
            for (int j = 1; j <= n; j++) {
                // 如果 dp[j] 为 true，说明这个字符已经匹配成功，继续下一个字符
                if (dp[j]) {
                    continue;
                }
                // 如果 s 的当前字符与 t 的当前字符匹配
                if (s.charAt(j - 1) == t.charAt(i - 1)) {
                    // 记录当前状态，如果匹配，说明可以通过 dp[j-1] 的状态来更新 dp[j]
                    dp[j] = dp[j - 1];
                    break; // 匹配成功后退出内层循环，继续检查 t 的下一个字符
                }
            }
        }
        // 返回 s 是否完整匹配到 t
        return dp[n];
    }
}

