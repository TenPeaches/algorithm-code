package com.greedy_algorithm.leetcode121;

public class Method01 {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0;
        for (int i = 0; i < prices.length; i++) {
            max=Math.max(max,prices[i]-min);
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return max;
    }
}
