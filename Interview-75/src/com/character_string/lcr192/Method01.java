package com.character_string.lcr192;

public class Method01 {
    public int myAtoi(String str) {
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0) {
            return 0;
        }
        int sign = 1;
        int result = 0;
        int i = 0;
        int limit = Integer.MAX_VALUE / 10;
        if (chars[0] == '-') {
            sign = -1;
            i++;
        } else if (chars[0] == '+') {
            i++;
        }
        for (int j = i; j < chars.length; j++) {
            if (chars[j] < '0' || chars[j] > '9') {
                break;
            }
            if (result > limit || (result == limit && chars[j] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (chars[j] - '0');
        }
        return sign * result;
    }
}
