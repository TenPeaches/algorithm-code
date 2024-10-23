package com.krahets.hash_table.leetcode409;

import java.util.HashMap;
import java.util.Map;

// 该类包含一个方法来计算给定字符串中最长回文子串的长度
public class Method01 {
    // 该方法接受一个字符串作为输入，并返回可以构成的最长回文长度
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        int count = 0;
        int jishu=0;
        for (int value : map.values()) {
            count += value / 2 * 2;
            jishu += value % 2;
        }
        if(jishu > 0){
            count += 1;
        }
        return count;
    }
}

