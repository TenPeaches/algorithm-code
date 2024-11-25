package com.krahets.simulation.leetcode59;

public class Method01 {
    public int[][] generateMatrix(int n) {
        // 创建一个 n x n 的二维数组，用于存储结果
        int[][] res = new int[n][n];
        // 定义四个边界，left、right、top、bottom分别表示左、右、上、下边界
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        // 定义一个变量用于填充矩阵的数字，从 1 开始
        int num = 1;

        // 不断螺旋填充矩阵，直到所有位置都被填充
        while (true) {
            // 从左到右遍历当前的上边界并填充数字
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            // 更新上边界
            if (++top > bottom) {
                break; // 如果上边界超过下边界，结束循环
            }

            // 从上到下遍历当前的右边界并填充数字
            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            // 更新右边界
            if (--right < left) {
                break; // 如果右边界小于左边界，结束循环
            }

            // 从右到左遍历当前的下边界并填充数字
            for (int i = right; i >= left; i--) {
                res[bottom][i] = num++;
            }
            // 更新下边界
            if (--bottom < top) {
                break; // 如果下边界小于上边界，结束循环
            }

            // 从下到上遍历当前的左边界并填充数字
            for (int i = bottom; i >= top; i--) {
                res[i][left] = num++;
            }
            // 更新左边界
            if (++left > right) {
                break; // 如果左边界超过右边界，结束循环
            }
        }

        // 返回填充完成的矩阵
        return res;
    }
}

