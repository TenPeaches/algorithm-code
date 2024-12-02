package com.krahets.bit_operation.leetcode231;

public class Method01 {

    public boolean isPowerOfTwo(int n) {
        // 检查 n 是否小于或等于 0， 如果是则不是 2 的幂
        if (n <= 0) {
            return false;
        }
        // 检查 n 是否为 2 的幂，使用位与运算：2 的幂具有唯一一个 '1' 位
        return (n & (n - 1)) == 0;
    }
}

