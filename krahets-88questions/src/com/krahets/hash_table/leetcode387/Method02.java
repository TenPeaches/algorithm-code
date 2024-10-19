package com.krahets.hash_table.leetcode387;

import java.util.HashMap;
import java.util.Map;

public class Method02 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))>=0) {
                return map.get(s.charAt(i));
            }
        }
        return -1;
    }
}
