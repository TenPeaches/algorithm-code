package com.hash.leetcode128;

import java.util.HashSet;
import java.util.Set;

public class Method01 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if(set.contains(num-1)){
                continue;
            }
            int count = 1;
            while (set.contains(++num)){
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
