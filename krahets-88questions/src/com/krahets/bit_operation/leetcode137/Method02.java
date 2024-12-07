package com.krahets.bit_operation.leetcode137;

public class Method02 {
    // 方法：找到只出现一次的数字，其他数字均出现三次
    public int singleNumber(int[] nums) {
        // 创建一个数组 counts，用于统计每个位上 1 的出现次数
        int[] counts = new int[32];

        // 遍历输入数组中的每个数字
        for (int num : nums) {
            // 对 32 位整数的每一位进行统计
            for (int j = 0; j < 32; j++) {
                // 将当前位 (num & 1) 加入 counts 中对应的计数
                counts[j] += num & 1;
                // 右移 num，继续处理下一位
                num >>= 1;
            }
        }

        // 初始化结果 res
        int res = 0;
        // 定义 m 为 3，表示我们将考虑出现次数对 3 取模
        int m = 3;

        // 处理 counts 数组，将结果构造到 res 中
        for (int i = 0; i < 32; i++) {
            // 左移 res，为下一位腾出空间
            res <<= 1;
            // 将 counts 中对应位的出现次数对 3 取模，添加到 res
            res |= counts[31 - i] % m;
        }

        // 返回结果，res 中现在存储的是只出现一次的数字
        return res;
    }
}

