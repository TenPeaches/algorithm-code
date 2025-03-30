package com.dynamic_programming.lcr165;

public class Method02 {
    public int crackNumber(int ciphertext) {
        int a=1,b=1,x,y=ciphertext%10;
        while (ciphertext/10>0){
            ciphertext/=10;
            x=ciphertext%10;
            int c=x*10+y>=10&&x*10+y<=25?a+b:a;
            b=a;
            a=c;
            y=x;
        }
        return a;
    }
}
