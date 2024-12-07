package com.krahets.bit_operation.leetcode137;

public class Method01 {
    // 方法：找到只出现一次的数字，其他数字均出现三次
    public int singleNumber(int[] nums) {
        // 初始化：ones 表示当前只出现一次的数字的位状态
        int ones = 0;
        // 初始化：twos 表示当前出现两次的数字的位状态
        int twos = 0;

        // 遍历输入数组中的每个数字
        for (int num : nums) {
            // 更新 ones：在 num 还未在 twos 中的情况下更新
            // 具体逻辑为：ones = (ones ^ num) 仅在 num 不在 twos
            ones = ones ^ num & ~twos;

            // 更新 twos：在 num 还未在 ones 中的情况下更新
            // 具体逻辑为：twos = (twos ^ num) 仅在 num 不在 ones
            twos = twos ^ num & ~ones;
        }

        // 返回结果：ones 中存储的就是只出现一次的数字
        return ones;
    }
}

