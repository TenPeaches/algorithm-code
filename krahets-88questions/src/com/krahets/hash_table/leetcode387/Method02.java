package com.krahets.hash_table.leetcode387;

import java.util.HashMap;
import java.util.Map;

// 方法02类
public class Method02 {
    // 找到字符串中第一个唯一字符的索引，若不存在则返回-1
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

