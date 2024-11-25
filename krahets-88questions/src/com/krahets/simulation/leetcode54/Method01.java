package com.krahets.simulation.leetcode54;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 创建一个列表来存储结果
        List<Integer> res = new ArrayList<>();
        // 定义四个边界，left、right、top、bottom分别表示左、右、上、下边界
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

        // 不断螺旋遍历，直到所有元素都被访问
        while (true) {
            // 从左到右遍历当前的上边界
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // 更新上边界
            if (++top > bottom) {
                break; // 如果上边界超过下边界，结束循环
            }

            // 从上到下遍历当前的右边界
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            // 更新右边界
            if (--right < left) {
                break; // 如果右边界小于左边界，结束循环
            }

            // 从右到左遍历当前的下边界
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            // 更新下边界
            if (--bottom < top) {
                break; // 如果下边界小于上边界，结束循环
            }

            // 从下到上遍历当前的左边界
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            // 更新左边界
            if (++left > right) {
                break; // 如果左边界超过右边界，结束循环
            }
        }
        // 返回结果列表
        return res;
    }
}

