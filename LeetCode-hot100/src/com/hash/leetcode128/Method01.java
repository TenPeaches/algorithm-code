package com.hash.leetcode128;

import java.util.HashSet;
import java.util.Set;

public class Method01 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxCount=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int count=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                maxCount=Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
