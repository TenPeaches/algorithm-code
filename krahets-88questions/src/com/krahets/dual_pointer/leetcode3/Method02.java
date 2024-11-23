package com.krahets.dual_pointer.leetcode3;

import java.util.HashMap;
import java.util.Map;

public class Method02 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int temp = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            int j;
            if (map.containsKey(s.charAt(i))) {
                j = map.get(s.charAt(i));
            }else {
                j=-1;
            }
            map.put(s.charAt(i), i);
            temp = temp<i-j?temp+1:i-j;
            if (temp > res) {
                res = temp;
            }
        }
        return res;
    }
}
