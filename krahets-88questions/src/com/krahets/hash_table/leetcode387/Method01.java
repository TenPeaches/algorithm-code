package com.krahets.hash_table.leetcode387;

import java.util.Map;

public class Method01 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

