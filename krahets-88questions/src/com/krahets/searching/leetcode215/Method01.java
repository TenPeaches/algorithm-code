package com.krahets.searching.leetcode215;

import java.util.ArrayList;

import java.util.ArrayList;

public class Method01 {

    // 查找数组中第 k 大的元素
    public int findKthLargest(int[] nums, int k) {
        // 选择数组中间的元素作为基准
        int num = nums[nums.length / 2];

        // 创建三个列表来存储大于、小于和等于基准的元素
        ArrayList<Integer> maxList = new ArrayList<>(); // 大于基准的元素
        ArrayList<Integer> minList = new ArrayList<>(); // 小于基准的元素
        ArrayList<Integer> equalList = new ArrayList<>(); // 等于基准的元素

        // 遍历数组，分类存储元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num) {
                maxList.add(nums[i]); // 大于基准，添加到 maxList
            } else if (nums[i] < num) {
                minList.add(nums[i]); // 小于基准，添加到 minList
            } else {
                equalList.add(nums[i]); // 等于基准，添加到 equalList
            }
        }

        // 如果 k 小于等于最大元素集合的大小，递归查找
        if (k <= maxList.size()) {
            int arr[] = new int[maxList.size()]; // 创建数组保存 maxList 的元素
            for (int i = 0; i < maxList.size(); i++) {
                arr[i] = maxList.get(i); // 将 maxList 的元素复制到数组
            }
            return findKthLargest(arr, k); // 递归查找第 k 大的元素
        }
        // 如果 k 大于最大元素集合加上等于基准的元素数量
        else if (k > maxList.size() + equalList.size()) {
            int arr[] = new int[minList.size()]; // 创建数组保存 minList 的元素
            for (int i = 0; i < minList.size(); i++) {
                arr[i] = minList.get(i); // 将 minList 的元素复制到数组
            }
            return findKthLargest(arr, k - maxList.size() - equalList.size()); // 递归查找
        }
        // 否则，返回基准值
        else {
            return num; // 返回等于基准的值
        }
    }
}

