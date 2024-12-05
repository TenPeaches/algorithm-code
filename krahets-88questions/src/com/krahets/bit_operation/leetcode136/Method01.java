package com.krahets.bit_operation.leetcode136;

public class Method01 {
    public int singleNumber(int[] nums) {
        int a = 0; // 初始化变量a为0，用于存储结果
        // 遍历数组中的每一个数字
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i]; // 使用异或运算更新a
        }
        // 返回只出现一次的数字
        return a;
    }
}

