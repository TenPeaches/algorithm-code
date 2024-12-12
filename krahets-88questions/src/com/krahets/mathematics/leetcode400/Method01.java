package com.krahets.mathematics.leetcode400;

public class Method01 {
    // 该方法用于找到第n个数字
    public int findNthDigit(int n) {
        // count 表示当前位数下的数字总数
        long count = 9;
        // digit 表示当前数字的位数
        int digit = 1;
        // start 表示当前位数下的第一个数字
        long start = 1;

        // 当 n 大于当前位数下的数字总数时，继续循环
        while (n > count) {
            // 从 n 中减去当前位数下的数字总数
            n -= count;
            // 将 start 更新为下一个位数下的第一个数字
            start *= 10;
            // 将 digit 增加1，并更新 count 为下一个位数下的数字总数
            count = ++digit * 9 * start;
        }

        // 计算出第n个数字所在的数字
        long num = start + (n - 1) / digit;
        // 计算出第n个数字在 num 中的位置
        int index = (n - 1) % digit;
        // 返回 num 中对应位置的数字
        return Long.toString(num).charAt(index) - '0';
    }
}

