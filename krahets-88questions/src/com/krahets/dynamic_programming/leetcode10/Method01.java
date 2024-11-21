package com.krahets.dynamic_programming.leetcode10;

public class Method01 {

    // 方法：判断字符串s是否与模式p匹配
    public boolean isMatch(String s, String p) {
        // m和n分别表示s和p的长度，加1是为了处理边界情况
        int m = s.length() + 1, n = p.length() + 1;
        // 创建一个二维布尔数组dp，其中dp[i][j]表示s的前i个字符是否与p的前j个字符匹配
        boolean[][] dp = new boolean[m][n];

        // 空字符串和空模式匹配
        dp[0][0] = true;

        // 处理模式p开头的*，如a*，允许空字符串匹配
        for(int j = 2; j < n; j += 2) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }

        // 遍历字符串s和模式p的每个字符
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                // 如果模式当前位置是'*'，则有两种情况：
                dp[i][j] = p.charAt(j - 1) == '*' ?
                        // 1. '*'匹配0个前一个字符，即dp[i][j-2]
                        // 2. '*'匹配1个或多个前一个字符，条件是当前字符匹配或者前一个字符为'.'
                        dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) :
                        // 如果当前字符不是'*'，则检查是否匹配
                        dp[i - 1][j - 1] && (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1));
            }
        }

        // 返回s与p的匹配结果
        return dp[m - 1][n - 1];
    }
}

