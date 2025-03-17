package com.divide_algorithm.lcr134;

public class Method01 {
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        if(n==Integer.MIN_VALUE){
            double a= myPow(1/x, Integer.MAX_VALUE);
            return a*x;
        }
        if (n == 0) {
            return 1;
        }else if (n < 0) {
            return  1/ myPow(x, -n);
        }else if (n == 1) {
            return x;
        }else if (n % 2 == 0) {
            double twoBase=x*x;
            return myPow(twoBase, n/2);
        }else {
            double twoBase=x*x;
            return x*myPow(twoBase, n/2);
        }
    }
}
