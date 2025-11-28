package com.recall.leetcode46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method01 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        swap(lists,list,0,n);
        return lists;
    }

    private void swap(List<List<Integer>> lists,List<Integer> list , int first, int n){
        if(first==n){
            lists.add(new ArrayList<>(list));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(list,first,i);
            swap(lists,list,first+1,n);
            Collections.swap(list,first,i);
        }
    }
}
