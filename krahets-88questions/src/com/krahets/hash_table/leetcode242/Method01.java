package com.krahets.hash_table.leetcode242;

import java.util.HashMap;
import java.util.Map;

// 方法用于判断两个字符串是否为字母异位词
public class Method01 {
    // 检查字符串 s 和 t 是否为字母异位词
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        // 遍历字符串 s，统计每个字符出现的次数
        for (int i = 0; i < sLen; i++) {
            char sc = s.charAt(i);
            if (map.containsKey(sc)) {
                map.put(sc, map.get(sc) + 1);
            }else{
                map.put(sc, 1);
            }
        }
        // 遍历字符串 t，减少对应字符的计数
        for (int i = 0; i < tLen; i++) {
            char tc = t.charAt(i);
            if (map.containsKey(tc)) {
                map.put(tc, map.get(tc) - 1);
            }else{
                return false;
            }
            if (map.get(tc) < 0) {
                return false;
            }
        }
        return true;
    }
}

