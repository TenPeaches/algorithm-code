package com.krahets.dynamic_programming.leetcode264;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Method01 {

    // 方法：获取第n个丑数
    public int nthUglyNumber(int n) {
        // 定义丑数的因子
        int[] dps = {2, 3, 5}; // 丑数只可以被2, 3, 5整除
        // 使用优先队列来存储丑数
        Queue<Long> pq = new PriorityQueue<>();
        pq.offer(1L); // 初始化优先队列，先放入最小丑数1
        // 用集合来去重
        Set<Long> set = new HashSet<>();
        set.add(1L); // 把1加入集合中

        int num = 0; // 用于存储当前的丑数

        // 循环n次，找出第n个丑数
        for (int i = 0; i < n; i++) {
            // 从优先队列中取出当前最小的丑数
            long numL = pq.poll();
            // 将long类型的numL转换为int类型存入num
            num = (int) numL;
            // 生成新的丑数
            for (int dp : dps) {
                // 如果numL乘以dp生成的新丑数不在集合中
                // 那么将其加入集合和优先队列
                if (set.add(numL * dp)) {
                    pq.offer(numL * dp); // 将新的丑数放入优先队列
                }
            }
        }
        // 返回第n个丑数
        return num;
    }
}

