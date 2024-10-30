package com.krahets.greedy.leetcode205;

// 方法01类，用于计算股票的最大利润
public class Method01 {
    // maxProfit方法，接收股票价格数组，返回最大利润
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<=1){
            return 0;
        }
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }
}

