package com.krahets.mathematics.leetcode1823;

public class Method01 {
    public int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1; // 当只有一个人时，赢家是第一人
        }
        // 使用递归公式计算赢家
        return (k + findTheWinner(n - 1, k) - 1) % n + 1;
    }
}

