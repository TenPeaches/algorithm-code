package com.krahets.divide_conquer.leetcode50;

public class Method01 {
    public double myPow(double x, int n) {
        return n >= 0 ? quickMul(x, n) : 1.0 / quickMul(x, -n);
    }

    private double quickMul(double x, int n) {
        if (n == 0) {
            return 1; // 任何数的0次幂都是1
        }
        double y = quickMul(x, n / 2); // 递归计算x的n/2次幂
        return n % 2 == 0 ? y * y : y * y * x; // 判定n是偶数还是奇数
    }
}

