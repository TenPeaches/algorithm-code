package com.krahets.search.leetcode724;

import java.util.Arrays; // 导入 Arrays 类以使用流操作

public class Method01 {
    /**
     * 找到数组的枢轴索引
     * @param nums 输入的整数数组
     * @return 数组的枢轴索引，如果不存在则返回 -1
     */
    public int pivotIndex(int[] nums) {
        // 计算数组元素的总和
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0; // 初始化左边的和为 0

        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 检查左边的和是否等于右边的和
            // 右边的和可以通过总和减去左边的和和当前元素得到
            if (leftSum == sum - leftSum - nums[i]) {
                return i; // 如果相等，返回当前索引 i 作为枢轴索引
            }
            // 更新左边的和，加入当前元素
            leftSum += nums[i];
        }

        // 如果没有找到枢轴索引，返回 -1
        return -1;
    }
}




