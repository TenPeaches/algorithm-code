package com.heap.leetcode215;


import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }
        return fkl(list,k);
    }

    private int fkl(List<Integer> list, int k) {
        List<Integer> big = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        int num= list.get(0);
        for (int n:list){
            if(n>num){
                big.add(n);
            }else if(n<num){
                small.add(n);
            }else {
                equal.add(n);
            }
        }
        if(k<=big.size()){
            return fkl(big,k);
        }
        if(k<=big.size()+equal.size()){
            return num;
        }
        return fkl(small,k-big.size()-equal.size());
    }
}
