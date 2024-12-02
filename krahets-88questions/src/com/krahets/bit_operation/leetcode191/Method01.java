package com.krahets.bit_operation.leetcode191;

public class Method01 {

    public int hammingWeight(int n) {
        int count = 0; // 初始化计数器，用于记录'1'的数量

        // 当 n 不为 0 时继续循环
        while (n != 0) {
            n &= (n - 1); // 将 n 最右边的 '1' 置为 '0'
            count++; // 计数器加一
        }

        return count; // 返回汉明重量
    }
}

