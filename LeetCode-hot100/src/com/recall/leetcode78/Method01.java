package com.recall.leetcode78;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < (1<<n); i++) {
            list.clear();
            for (int j = 0; j < n; j++) {
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            lists.add(new ArrayList<>(list));
        }
        return lists;
    }
}
