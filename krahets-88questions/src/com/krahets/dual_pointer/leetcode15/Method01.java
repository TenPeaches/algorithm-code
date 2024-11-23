package com.krahets.dual_pointer.leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {

    // 找到所有和为0的三元组
    public List<List<Integer>> threeSum(int[] nums) {
        // 对数组进行排序
        Arrays.sort(nums);
        int n = nums.length; // 数组长度
        List<List<Integer>> res = new ArrayList<>(); // 存储满足条件的三元组

        // 遍历数组，外层循环选定第一个数字
        for (int i = 0; i < n - 2; i++) {
            // 如果当前数字大于0，直接结束循环，因为后面的数字也都大于0，无法构成和为0的三元组
            if (nums[i] > 0) {
                break;
            }

            // 跳过重复元素以避免重复的三元组
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 内层使用双指针法，j 指向 i 后面的元素，k 指向数组的最后一个元素
            int j = i + 1, k = n - 1;
            while (j < k) {
                // 计算三个数的和
                int sum = nums[i] + nums[j] + nums[k];

                // 如果和为0，找到一个三元组
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k])); // 添加三元组到结果列表
                    j++; // 移动左指针
                    k--; // 移动右指针

                    // 跳过重复的元素，避免添加重复的三元组
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    // 如果和小于0，说明需要更大的数，移动左指针
                    j++;
                } else {
                    // 如果和大于0，说明需要更小的数，移动右指针
                    k--;
                }
            }
        }

        // 返回所有找到的和为0的三元组
        return res;
    }
}
