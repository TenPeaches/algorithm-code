package com.krahets.hash_table.leetcode242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Method02 {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}

