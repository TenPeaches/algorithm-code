package com.krahets.dynamic_programming.leetcode213;

public class Method01 {

    // 主方法：计算可抢劫的最大金额
    public int rob(int[] nums) {
        int n = nums.length; // 获取房屋的总数

        // 如果只有一栋房屋，直接返回其金额
        if(n == 1){
            return nums[0];
        }

        // 如果有两栋房屋，返回两者中较大的值
        if(n == 2){
            return Math.max(nums[0], nums[1]);
        }

        // 分两种情况，分别计算（1到倒数第二个房屋）和（2到最后一个房屋）的最大金额
        return Math.max(robRange(nums, 0, n-2), robRange(nums, 1, n-1));
    }

    // 辅助方法：计算从 i 到 j 房屋能抢劫到的最大金额
    private int robRange(int[] nums, int i, int j) {
        int a = nums[i]; // 初始化：抢劫第 i 个房屋后的最大金额
        int b = Math.max(nums[i], nums[i+1]); // 初始化：抢劫第 i 或第 i+1 个房屋的最大金额
        int c; // 临时变量，用于存储前一步的最大金额

        // 从第 i+2 个房屋开始遍历到第 j 个房屋
        for(int k = i + 2; k <= j; k++) {
            c = b; // 保存前一状态的最大金额
            // 更新最大金额：选择是否抢劫当前房屋
            b = Math.max(a + nums[k], b);
            a = c; // 更新 a 为前一步的最大金额
        }

        // 返回从 i 到 j 的区间内能够抢劫的最大金额
        return b;
    }
}

