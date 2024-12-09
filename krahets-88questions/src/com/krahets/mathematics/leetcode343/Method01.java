package com.krahets.mathematics.leetcode343;

public class Method01 {

    public int integerBreak(int n) {
        // 当 n 小于等于 3 时，返回 n - 1
        // 因为 2 只能拆分成 1 + 1，3 只能拆分成 1 + 2
        if (n <= 3) return n - 1;

        int beishu = n / 3; // 计算可以拆分为多少个 3
        int yushu = n % 3;  // 计算 n 除以 3 的余数

        // 根据余数的值计算结果：
        // - 如果余数为 0，返回 3^(beishu-1) * 3
        // - 如果余数为 1，返回 3^(beishu-1) * 4
        // - 如果余数为 2，返回 3^(beishu-1) * 6
        return (int) Math.pow(3, beishu - 1) * (yushu == 0 ? 3 : yushu == 1 ? 4 : 6);
    }
}

