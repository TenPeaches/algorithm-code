package com.dynamic_programming.lcr165;

public class Method01 {
    public int crackNumber(int ciphertext) {
        String s = ciphertext + "";
        int a = 1, b = 1;
        for (int i = 2; i <= s.length(); i++) {
            String sub = s.substring(i - 2, i);
            int c = sub.compareTo("10") >= 0 && sub.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }
}
