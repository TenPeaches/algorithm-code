package com.krahets.mathematics.leetcode169;

public class Method02 {

    public int majorityElement(int[] nums) {
        int count = 0; // 计数器，初始化为 0
        int major_number = 0; // 存储当前的主要元素

        // 遍历数组中的每一个元素
        for (int num : nums) {
            // 当计数器为 0 时，更新主要元素为当前元素
            if (count == 0) {
                major_number = num; // 更新主要元素
                count++; // 计数器加 1
            } else {
                // 如果当前元素与主要元素相同，增加计数
                if (num == major_number) {
                    count++; // 计数器加 1
                } else {
                    count--; // 否则减少计数
                }
            }
        }

        return major_number; // 返回最终的主要元素
    }
}

