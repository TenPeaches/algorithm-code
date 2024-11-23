package com.krahets.dual_pointer.leetcode3;

import java.util.HashMap;
import java.util.Map;


public class Method01 {

    // 找到给定字符串中不重复字符的最长子串的长度
    public int lengthOfLongestSubstring(String s) {
        int i = 0; // 右指针，遍历字符串
        int j = -1; // 左指针，表示当前无重复字符子串的起始位置
        int max = 0; // 记录最大无重复字符子串的长度

        // 创建一个 HashMap，用于存储字符及其最新出现的位置
        Map<Character, Integer> map = new HashMap<>();

        // 遍历字符串，直到右指针 i 到达字符串末尾
        while (i < s.length()) {
            // 如果字符 s[i] 已经在 map 中，更新 j 为它上次出现的位置
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)));
            }

            // 更新当前无重复字符子串的最大长度
            max = Math.max(max, i - j);

            // 存储当前字符及其最新出现的位置
            map.put(s.charAt(i), i);
            i++; // 移动右指针
        }

        // 返回找到的最大长度
        return max;
    }
}

