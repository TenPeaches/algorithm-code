package com.krahets.stack_queque.leetcode20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 方法01类，用于验证括号字符串的有效性
public class Method01 {
    // 判断给定字符串s中的括号是否有效
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        // 保存括号对应关系的映射
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || stack.peek()!=map.get(c) ) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}




