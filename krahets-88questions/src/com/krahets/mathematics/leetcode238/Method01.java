package com.krahets.mathematics.leetcode238;

public class Method01 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // 获取输入数组的长度
        int[] res = new int[n]; // 初始化结果数组
        res[0] = 1; // 有效地设置 res[0] 的初始值为 1

        // 第一个循环：计算每个位置左侧所有元素的乘积
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1]; // res[i] 是 nums[0] 到 nums[i-1] 的乘积
        }

        int right = 1; // 初始化右侧乘积为 1

        // 第二个循环：从右到左，计算每个位置右侧所有元素的乘积，并与左侧乘积相乘
        for (int i = n - 2; i >= 0; i--) {
            right *= nums[i + 1]; // 计算右侧元素的乘积
            res[i] *= right; // 将右侧乘积与左侧乘积相乘，存储结果到 res[i]
        }

        return res; // 返回最终结果数组
    }
}

