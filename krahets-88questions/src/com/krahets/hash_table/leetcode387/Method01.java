package com.krahets.hash_table.leetcode387;

import java.util.Map;

// 此类用于实现寻找字符串中第一个不重复字符的功能
public class Method01 {
    // 找到给定字符串中的第一个不重复字符，并返回其索引
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


