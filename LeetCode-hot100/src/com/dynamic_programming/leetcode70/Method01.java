package com.dynamic_programming.leetcode70;

public class Method01 {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1, b = 2;
        int c;
        for (int i = 3; i <= n; i++) {
            c = b;
            b += a;
            a = c;
        }
        return b;
    }
}
