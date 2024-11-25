package com.krahets.simulation.leetcode48;

public class Method02 {
    public void rotate(int[][] matrix) {
        // 获取矩阵的大小 n
        int n = matrix.length;

        // 对矩阵的层进行旋转，遍历前半部分的行数
        for (int i = 0; i < n / 2; i++) {
            // 遍历当前层的元素（为了完美旋转，每层需要处理的元素是当前行的一半）
            for (int j = 0; j < (n + 1) / 2; j++) {
                // 保存当前元素
                int temp = matrix[i][j];

                // 进行四个位置之间的元素交换
                // 当前位置 (i, j) 变为 (n - 1 - j, i)
                matrix[i][j] = matrix[n - 1 - j][i];

                // (n - 1 - j, i) 变为 (n - 1 - i, n - 1 - j)
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                // (n - 1 - i, n - 1 - j) 变为 (j, n - 1 - i)
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                // (j, n - 1 - i) 变为原来的 (i, j)
                matrix[j][n - 1 - i] = temp;
            }
        }
    }
}

