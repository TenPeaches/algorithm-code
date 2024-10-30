package com.krahets.greedy.leetcode240;

public class Method01 {
    // 方法：在一个二维矩阵中搜索目标值
    public boolean searchMatrix(int[][] matrix, int target) {
        // 初始化指针 i 指向矩阵的最后一行，j 指向第一列
        int i = matrix.length - 1, j = 0;

        // 当 i 在有效行范围内且 j 在有效列范围内时，继续搜索
        while (i >= 0 && j < matrix[0].length) {
            // 如果当前元素小于目标值，移动列指针向右
            if (matrix[i][j] < target) {
                j++;
            }
            // 如果当前元素大于目标值，移动行指针向上
            else if (matrix[i][j] > target) {
                i--;
            }
            // 如果当前元素等于目标值，返回 true
            else {
                return true;
            }
        }
        // 如果没有找到目标值，返回 false
        return false;
    }
}

