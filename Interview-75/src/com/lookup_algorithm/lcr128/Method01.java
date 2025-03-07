package com.lookup_algorithm.lcr128;

public class Method01 {
    public int inventoryManagement(int[] stock) {
        int i=0, j=stock.length-1;
        while(i<j){
            int m=(i+j)/2;
            if(stock[j]<stock[m]){
                i=m+1;
            }else if(stock[j]>stock[m]){
                j=m;
            }else{
                j--;
            }
        }
        return stock[i];
    }
}
