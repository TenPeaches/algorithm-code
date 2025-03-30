package com.dynamic_programming.lcr168;

public class Method01 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] ugly = new int[n];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(ugly[a] * 2, ugly[b] * 3), ugly[c] * 5);
            ugly[i] = min;
            if (min == ugly[a] * 2)
                a++;
            if (min == ugly[b] * 3)
                b++;
            if (min == ugly[c] * 5)
                c++;
        }
        return ugly[n - 1];
    }
}
