package com.krahets.dynamic_programming.leetcode198;

public class Method01 {
    // 计算抢劫房屋的最大收益
    public int rob(int[] nums) {
        // 如果没有房屋，返回收益为0
        if (nums.length == 0) {
            return 0;
        }
        // 如果只有一间房屋，返回其价值
        if (nums.length == 1) {
            return nums[0];
        }

        // 初始化变量:
        // a表示抢劫到第i-2个房屋时的最大收益，初始为第一个房屋的价值
        int a = nums[0];
        // b表示抢劫到第i-1个房屋时的最大收益，初始为前两个房屋的较大者
        int b = Math.max(nums[0], nums[1]);
        int c; // 用于临时保存上一个的最大收益

        // 从第三间房屋开始遍历
        for (int i = 2; i < nums.length; i++) {
            c = b; // 将b的值赋给c，作为下一轮的a
            // 更新b为抢劫当前房屋和不抢劫当前房屋的最大值
            b = Math.max(a + nums[i], b);
            // a更新为上一个房屋的最大收益值
            a = c;
        }
        // 返回抢劫到最后一间房屋时的最大收益
        return b;
    }
}

