package com.dynamic_programming.lcr161;

public class Method01 {
    public int maxSales(int[] sales) {
        if(sales.length==1){
            return sales[0];
        }
        int jinE=sales[0];
        for (int i = 1; i < sales.length; i++) {
            sales[i]+=Math.max(0,sales[i-1]);
            jinE=Math.max(jinE,sales[i]);
        }
        return jinE;
    }
}
