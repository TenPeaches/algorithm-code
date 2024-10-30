package com.krahets.greedy.leetcode11;

public class Method01 {
    // 方法：计算盛水的最大面积
    public int maxArea(int[] height) {
        // 初始化左指针和右指针，分别指向数组的起始和结束位置
        int left = 0, right = height.length - 1;
        // 初始化最大面积为 0
        int maxArea = 0;

        // 当左指针小于右指针时，继续计算
        while (left < right) {
            // 使用当前左右指针的位置计算盛水的面积，并更新最大面积
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            // 移动指针以找到可能更大的面积
            // 如果左边的高度小于右边的高度，移动左指针向右
            if (height[left] < height[right]) {
                left++;
            } else {
                // 否则，移动右指针向左
                right--;
            }
        }
        // 返回最大面积
        return maxArea;
    }
}

