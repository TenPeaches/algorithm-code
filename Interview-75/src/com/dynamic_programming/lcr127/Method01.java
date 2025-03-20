package com.dynamic_programming.lcr127;

public class Method01 {
    public int trainWays(int num) {
        if(num==0)return 1;
        if(num<=2)return num;
        int a=1,b=2,c=0;
        for (int i = 3; i <= num ; i++) {
            c=(a+b)%1000000007;a=b;b=c;
        }
        return b;
    }
}
