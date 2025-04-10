package com.divide_algorithm.lcr134;

public class Method02 {
    public double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        double result = 1;
        while(N > 0){
            if(N % 2 == 1){
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }
}
