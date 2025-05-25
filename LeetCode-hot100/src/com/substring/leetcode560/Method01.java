package com.substring.leetcode560;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] sum = new int[len + 1];
        sum[0] = 0;
        for (int i = 0; i < len; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer i : sum){
            int j = i - k;
            if (map.containsKey(j)) {
                count += map.get(j);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }
}
