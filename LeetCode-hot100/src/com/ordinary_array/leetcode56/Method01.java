package com.ordinary_array.leetcode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            int len = result.size();
            if(len == 0 || result.get(len-1)[1] < interval[0]){
                result.add(interval);
            }else{
                result.set(len-1, new int[]{result.get(len-1)[0], Math.max(result.get(len-1)[1], interval[1])});
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
