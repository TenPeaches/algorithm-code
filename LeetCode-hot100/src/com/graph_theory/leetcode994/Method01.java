package com.graph_theory.leetcode994;

import java.util.LinkedList;
import java.util.Queue;

public class Method01 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int count1=0;
        int gao=grid.length;
        int kuan=grid[0].length;
        for (int i = 0; i < gao; i++) {
            for (int j = 0; j < kuan; j++) {
                if(grid[i][j]==1){
                    count1++;
                }
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int time=0;
        while (count1!=0&&!queue.isEmpty()){
            time++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] num=queue.poll();
                int hang=num[0],lie=num[1];
                if(hang>0&&grid[hang-1][lie]==1){
                    grid[hang-1][lie]=2;
                    queue.add(new int[]{hang-1,lie});
                    count1--;
                }
                if(hang<gao-1&&grid[hang+1][lie]==1){
                    grid[hang+1][lie]=2;
                    queue.add(new int[]{hang+1,lie});
                    count1--;
                }
                if(lie>0&&grid[hang][lie-1]==1){
                    grid[hang][lie-1]=2;
                    queue.add(new int[]{hang,lie-1});
                    count1--;
                }
                if(lie<kuan-1&&grid[hang][lie+1]==1){
                    grid[hang][lie+1]=2;
                    queue.add(new int[]{hang,lie+1});
                    count1--;
                }
            }
        }
        if(count1!=0){
            return -1;
        }
        return time;
    }
}
