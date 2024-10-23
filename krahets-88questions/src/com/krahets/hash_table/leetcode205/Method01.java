package com.krahets.hash_table.leetcode205;

import java.util.HashMap;
import java.util.Map;

// 定义一个方法类 Method01
public class Method01 {
    // 判断两个字符串是否是同构的
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Character> mapt = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char sc = s.charAt(i);
            char tc =t.charAt(i);
            if((maps.containsKey(sc)&&tc!=maps.get(sc))||(mapt.containsKey(tc)&&sc!=mapt.get(tc))){
                return false;
            }
            maps.put(sc, tc);
            mapt.put(tc, sc);
        }
        return true;
    }
}
