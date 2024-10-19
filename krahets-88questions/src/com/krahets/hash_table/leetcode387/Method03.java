package com.krahets.hash_table.leetcode387;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Method03 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, -1); // 标记为重复字符
                // 移除所有已经标记为重复的字符
                while (!queue.isEmpty() && map.get(queue.peek().ch) == -1) {
                    queue.poll();
                }
            } else {
                map.put(ch, i); // 记录字符位置
                queue.offer(new Pair(ch, i)); // 加入队列
            }
        }

        return queue.isEmpty() ? -1 : queue.peek().index; // 返回第一个唯一字符的索引
    }

    class Pair { // 将类名更改为大写
        char ch; // 修改为 char 型
        int index;

        public Pair(char ch, int index) { // 修改构造函数
            this.ch = ch;
            this.index = index;
        }
    }
}
