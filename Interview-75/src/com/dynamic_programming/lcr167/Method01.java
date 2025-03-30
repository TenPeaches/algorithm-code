package com.dynamic_programming.lcr167;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public int dismantlingAction(String arr) {
        Map<Character, Integer> map = new HashMap<>();
        int left = -1, maxLen = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (map.containsKey(arr.charAt(i)))
                left = Math.max(left, map.get(arr.charAt(i)));
            map.put(arr.charAt(i), i);
            maxLen = Math.max(maxLen, i - left);
        }
        return maxLen;
    }
}
