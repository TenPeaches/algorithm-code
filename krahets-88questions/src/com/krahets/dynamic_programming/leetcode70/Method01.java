package com.krahets.dynamic_programming.leetcode70;

public class Method01 {
    // 计算登楼梯的方式，总共有n阶楼梯
    public int climbStairs(int n) {
        // a表示到达第i-1阶的方式（初始为1，表示第一阶）
        int a = 1;
        // b表示到达第i阶的方式（初始为2，表示第二阶，1步或2步）
        int b = 2;
        // c用于存储当前阶梯的方式
        int c;

        // 从第1阶开始循环到第n阶
        for (int i = 1; i < n; i++) {
            // c为到达第i阶的方式，总是为到达前两阶方式的和
            c = a + b;
            // 将a更新为b，即将到达第i阶的方式保存为上一个状态
            a = b;
            // 将b更新为c，即更新当前阶梯的方式为新计算的方式
            b = c;
        }
        // 返回到达第n阶的方式
        return a;
    }
}

