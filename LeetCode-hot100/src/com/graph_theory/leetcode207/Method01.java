package com.graph_theory.leetcode207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method01 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ints = new int[numCourses];
        List<List<Integer>> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] trr:prerequisites) {
            int num=trr[0];
            ints[num]++;
            list.get(trr[1]).add(num);
        }
        for (int i = 0; i < numCourses; i++) {
            if(ints[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int n=queue.poll();
            List<Integer> list1=list.get(n);
            for (int i = 0; i < list1.size(); i++) {
                if(--ints[list1.get(i)]==0){
                    queue.add(list1.get(i));
                }
            }
            numCourses--;
        }
        return numCourses==0;
    }
}
