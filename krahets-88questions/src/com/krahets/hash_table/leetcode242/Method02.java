package com.krahets.hash_table.leetcode242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 定义一个方法，用于判断两个字符串是否为字母异位词
public class Method02 {
    // 判断字符串 s 和 t 是否为字母异位词
    public boolean isAnagram(String s, String t) {
        // 将字符串转换为字符数组
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        // 对字符数组进行排序
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        // 比较两个排序后的字符数组是否相等
        return Arrays.equals(sArr, tArr);
    }
}
