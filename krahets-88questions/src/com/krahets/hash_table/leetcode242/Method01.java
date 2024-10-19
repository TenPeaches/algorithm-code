package com.krahets.hash_table.leetcode242;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sLen; i++) {
            char sc = s.charAt(i);
            if (map.containsKey(sc)) {
                map.put(sc, map.get(sc) + 1);
            }else{
                map.put(sc, 1);
            }
        }
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
