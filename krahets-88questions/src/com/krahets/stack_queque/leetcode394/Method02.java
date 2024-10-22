package com.krahets.stack_queque.leetcode394;

import java.util.Stack;

// 定义一个用于解码字符串的类
public class Method02 {
    // 解码字符串的方法，接收一个字符串并返回解码后的结果
    public String decodeString(String s) {
        return dfs(s, 0)[0];
    }

    // 深度优先搜索辅助方法，处理具体的解码逻辑
    private String[] dfs(String s, int index) {
        StringBuilder sb = new StringBuilder();
        int beishu = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c >= '0' && c <= '9') {
                beishu = beishu * 10 + Integer.parseInt(String.valueOf(c));
            } else if (c == '[') {
                String temp[] =dfs(s, index + 1);
                index = Integer.parseInt(temp[1]);
                while (beishu > 0){
                    sb.append(temp[0]);
                    beishu--;
                }
            } else if (c == ']') {
                return new String[]{sb.toString(), String.valueOf(index)};
            } else {
                sb.append(c);
            }
            index++;
        }
        return new String[]{sb.toString()};
    }

}
