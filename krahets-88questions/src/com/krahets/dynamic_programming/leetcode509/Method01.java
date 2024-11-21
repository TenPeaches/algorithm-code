package com.krahets.dynamic_programming.leetcode509;

public class Method01 {
    // 计算第n个斐波那契数
    public int fib(int n) {
        // a初始化为斐波那契数列中的第一个数 0
        int a = 0;
        // b初始化为斐波那契数列中的第二个数 1
        int b = 1;
        // c用于存储当前斐波那契数
        int c = 0;

        // 循环n次计算斐波那契数列
        for (int i = 0; i < n; i++) {
            // c为a和b的和，即当前的斐波那契数
            c = a + b;
            // 将a更新为b
            a = b;
            // 将b更新为c
            b = c;
        }
        // 返回斐波那契数列中的第n个数
        return a;
    }
}

