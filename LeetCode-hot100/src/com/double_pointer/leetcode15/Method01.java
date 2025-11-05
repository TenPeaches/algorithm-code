package com.double_pointer.leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len=nums.length;
        for (int i = 0; i <len-2; i++) {
            if(nums[i]>0){
                return res;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=len-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    while (j<k&&nums[j]==nums[++j]);
                }else if(sum>0){
                    while (j<k&&nums[k]==nums[--k]);
                }else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while (j<k&&nums[j]==nums[++j]);
                    while (j<k&&nums[k]==nums[--k]);
                }
            }
        }
        return res;
    }
}
