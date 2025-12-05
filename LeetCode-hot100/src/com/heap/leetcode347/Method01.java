package com.heap.leetcode347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Method01 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            if(map.containsKey(num)){
                int value=map.get(num);
                map.put(num,value+1);
            }else {
                map.put(num,1);
            }
        }
        PriorityQueue<int []> queue = new PriorityQueue<>((a,b)->(b[1]-a[1]));
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey(),value=entry.getValue();
            queue.add(new int[]{key,value});
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i]=queue.poll()[0];
        }
        return ret;
    }
}
