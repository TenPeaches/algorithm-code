package com.dynamic_programming.lcr188;

public class Method01 {
    public int bestTiming(int[] prices) {
        int cost=Integer.MAX_VALUE;
        int profit=0;
        for (int price : prices){
            cost=Math.min(cost,price);
            profit=Math.max(profit,price-cost);
        }
        return profit;
    }
}
