package com.krahets.dynamic_programming.leetcode64;

public class Method01 {
    // 计算从网格左上角到右下角的最小路径和
    public int minPathSum(int[][] grid) {
        // 获取网格的行数和列数
        int m = grid.length; // 行数
        int n = grid[0].length; // 列数
        // 创建一维数组dp用于存储到达每一列的最小路径和
        int[] dp = new int[n];
        // 初始化dp的第一个元素为网格的左上角元素
        dp[0] = grid[0][0];

        // 填充第一行的最小路径和
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + grid[0][i]; // 从左边累加
        }

        // 从第二行开始，遍历整个网格
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // 如果在第一列，只能从上方累加
                    dp[j] += grid[i][j];
                } else {
                    // 在其他位置，选择上方和左方的最小值，然后累加当前格子的值
                    dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
                }
            }
        }
        // 返回到达右下角的最小路径和
        return dp[n - 1];
    }
}

