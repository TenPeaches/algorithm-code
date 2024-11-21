package com.krahets.dynamic_programming.leetcode121;

public class Method01 {
    // 计算股票的最大利润
    public int maxProfit(int[] prices) {
        // 初始化利润为0
        int profit = 0;
        // 初始化最低价格为最大整数值
        int minPrice = Integer.MAX_VALUE;

        // 遍历价格数组
        for (int i = 0; i < prices.length; i++) {
            // 如果当前价格小于已知的最低价格，更新最低价格
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // 计算当前利润，并更新最大利润
            profit = Math.max(profit, prices[i] - minPrice);
        }
        // 返回计算得到的最大利润
        return profit;
    }
}

