package com.stack.leetocde394;

import java.util.Stack;

public class Method01 {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int bs=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                numStack.push(bs);
                bs=0;
                strStack.push(sb.toString());
                sb=new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                int num=numStack.pop();
                for (int j = 0; j < num; j++) {
                    tmp.append(sb);
                }
                sb=new StringBuilder(strStack.pop()).append(tmp);
            } else if (c >= '0' && c <= '9') {
                bs=bs*10+(c-'0');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
