package com.krahets.stack_queque.leetcode394;

import java.util.Stack;

public class Method01 {
    public String decodeString(String s) {
        int num = 0;
        StringBuilder sb = new StringBuilder();
        Stack<String>  stack_str= new Stack<>();
        Stack<Integer> stack_num = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack_str.push(sb.toString());
                stack_num.push(num);
                sb = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int count = stack_num.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(sb);
                }
                sb = new StringBuilder(stack_str.pop()+temp.toString());
            } else if (c >= '0' && c <= '9') {
                num = num * 10 + Integer.parseInt(c + "");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
