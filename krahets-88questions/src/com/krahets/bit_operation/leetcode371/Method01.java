package com.krahets.bit_operation.leetcode371;

public class Method01 {

    public int getSum(int a, int b) {
        int c = 0; // 初始化 c，用于存储进位

        // 当 b 不为 0 时，继续进行加法运算
        while (b != 0) {
            c = a & b; // 计算进位部分，使用位与运算
            a = a ^ b; // 计算和部分，不考虑进位，使用位异或运算
            b = c << 1; // 将进位左移一位，以便加到下一高位
        }

        return a; // 返回最终的和
    }
}

