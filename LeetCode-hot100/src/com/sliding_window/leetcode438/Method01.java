package com.sliding_window.leetcode438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length() > s.length()){
            return result;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(pCount, sCount)){
            result.add(0);
        }
        for (int i = 1; i <s.length() - p.length() + 1 ; i++) {
            sCount[s.charAt(i - 1) - 'a']--;
            sCount[s.charAt(i + p.length() - 1) - 'a']++;
            if(Arrays.equals(pCount, sCount)){
                result.add(i);
            }
        }
        return result;
    }
}
