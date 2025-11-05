package com.sliding_window.leetcode03;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left=-1,max=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c));
            }
            max=Math.max(max,i-left);
            map.put(c,i);
        }
        return max;
    }
}
