package com.greedy_algorithm.leetcode763;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public List<Integer> partitionLabels(String s) {
        int[] ret = new int[26];
        int n = s.length();
        for (int i = 0; i<n; i++) {
            ret[s.charAt(i)-'a']=i;
        }
        List<Integer> list = new ArrayList<>();
        int start = 0 , end = 0;
        for (int i = 0; i < n; i++) {
            end=Math.max(end,ret[s.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start=end+1;
            }
        }
        return list;
    }
}
