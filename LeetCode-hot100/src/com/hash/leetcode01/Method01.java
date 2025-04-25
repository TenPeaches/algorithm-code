package com.hash.leetcode01;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int shengyu=target-nums[i];
            if(map.containsKey(shengyu)) {
                return new int[] {i,map.get(shengyu)};
            }
            map.put(nums[i], i);
        }
        return new int[] {0};
    }
}
