package com.krahets.dual_pointer.leetcode239;

import java.util.Deque;
import java.util.LinkedList;

public class Method01 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 如果输入数组为空或窗口大小为0，则返回空数组
        if (nums.length == 0 || k == 0) return new int[0];

        // 使用双端队列来存储当前窗口的元素
        Deque<Integer> deque = new LinkedList<>();
        // 结果数组，长度为输入数组长度 - 窗口大小 + 1
        int[] res = new int[nums.length - k + 1];

        // 未形成完整窗口的情况，填充前 k 个元素
        for (int i = 0; i < k; i++) {
            // 移除队列中比当前元素小的所有元素
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast(); // 去掉队尾元素
            }
            // 将当前元素添加到队列的尾部
            deque.addLast(nums[i]);
        }
        // 将队列的首部元素（当前窗口的最大值）存入结果数组
        res[0] = deque.peekFirst();

        // 从第 k 个元素开始，开始滑动窗口
        for (int i = k; i < nums.length; i++) {
            // 如果队列的首部元素是滑出窗口的元素，则将其移除
            if (deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            // 移除队列中所有比当前元素小的元素
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast(); // 去掉队尾元素
            }
            // 将当前元素添加到队列的尾部
            deque.addLast(nums[i]);
            // 将队列的首部元素（当前窗口的最大值）存入结果数组
            res[i - k + 1] = deque.peekFirst();
        }
        return res; // 返回记录最大值的数组
    }
}
