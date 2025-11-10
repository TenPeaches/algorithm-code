package com.ordinary_array.leetcode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int len =list.size();
            if(len==0||list.get(len-1)[1]<intervals[i][0]){
                list.add(intervals[i]);
            }else{
                list.set(len-1,new int[]{list.get(len-1)[0],Math.max(list.get(len-1)[1],intervals[i][1])});
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
