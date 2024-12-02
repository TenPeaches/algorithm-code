package com.krahets.bit_operation.leetcode191;

public class Method02 {

    public int hammingWeight(int n) {
        int count = 0; // 初始化计数器，用于记录'1'的数量

        // 当 n 不为 0 时继续循环
        while (n != 0) {
            count += n & 1; // 通过与运算获取 n 最右边的位，如果为 1 则 count 加 1
            n >>= 1; // 右移 n，准备检查下一个位
        }

        return count; // 返回汉明重量
    }
}

