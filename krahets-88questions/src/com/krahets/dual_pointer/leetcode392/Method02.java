package com.krahets.dual_pointer.leetcode392;

public class Method02 {

    // 检查字符串 s 是否为字符串 t 的子序列
    public boolean isSubsequence(String s, String t) {
        // 初始化两个指针，i 指向 s，j 指向 t
        int i = 0, j = 0;

        // 当 i 小于 s 的长度且 j 小于 t 的长度时继续循环
        while (i < s.length() && j < t.length()) {
            // 如果 s 和 t 当前字符匹配
            if (s.charAt(i) == t.charAt(j)) {
                i++; // 移动 s 的指针，匹配下一个字符
            }
            j++; // 始终移动 t 的指针，继续检查下一个字符
        }

        // 如果 i 等于 s 的长度，则说明所有字符均被匹配，返回 true
        return i == s.length();
    }
}

