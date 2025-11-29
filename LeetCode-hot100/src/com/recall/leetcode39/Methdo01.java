package com.recall.leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methdo01 {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        com(candidates,target,0);
        return lists;
    }

    private void com(int[] candidates, int target, int i) {
        if(target==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if(target-candidates[j]<0){
                break;
            }
            list.add(candidates[j]);
            com(candidates,target-candidates[j],j);
            list.remove(list.size()-1);
        }
    }
}
