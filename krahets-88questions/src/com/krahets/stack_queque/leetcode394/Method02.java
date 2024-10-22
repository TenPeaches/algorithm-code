package com.krahets.stack_queque.leetcode394;

import java.util.Stack;

public class Method02 {
    public String decodeString(String s) {
        return dfs(s, 1);
    }

    public String dfs(String s, int num) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<s.length()){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                for (int j = 1; j < num; j++) {
                    sb.append(sb);
                }
                num = num*10 + (c-'0');
            }else if (c == '['){
                sb=new StringBuilder(sb.toString()+dfs(, num));
            }else if (c == ']'){

            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
