package com.krahets.mathematics.leetcode1823;

public class Method02 {

    public int findTheWinner(int n, int k) {
        int winner = 1; // 初始化赢家，假设在第一个人中选择赢家

        // 从第二个人开始迭代到第 n 个人
        for (int i = 2; i <= n; i++) {
            // 根据当前人数和步长计算赢家的位置
            winner = (k + winner - 1) % i + 1;
        }

        return winner; // 返回最终赢家
    }
}

