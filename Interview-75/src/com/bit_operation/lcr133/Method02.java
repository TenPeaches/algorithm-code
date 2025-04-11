package com.bit_operation.lcr133;

public class Method02 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}
