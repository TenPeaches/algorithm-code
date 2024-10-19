package com.krahets.stack_queque.leetcode20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Method01 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
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



