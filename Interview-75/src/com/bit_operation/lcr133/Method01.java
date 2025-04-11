package com.bit_operation.lcr133;

public class Method01 {
    public int hammingWeight(int n) {
         int count = 0;
         while(n!=0){
             count+=n&1;
             n>>>=1;
         }
         return count;
    }
}
