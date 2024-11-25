package com.krahets.simulation.leetcode48;

public class Method01 {
    public void rotate(int[][] matrix) {
        // 获取矩阵的大小 n
        int n = matrix.length;
        // 创建一个临时矩阵，用于存储旋转后的结果
        int[][] temp = new int[n][n];

        // 将原矩阵的元素按顺时针方向旋转 90 度填充到临时矩阵中
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 对于位置 (i, j)，旋转后的位置是 (j, n-1-i)
                temp[j][n - 1 - i] = matrix[i][j];
            }
        }

        // 将临时矩阵的内容复制回原矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}

