package com.krahets.dual_pointer.leetcode167;

public class Method02 {

    // 找到数组中两个数的索引，使得这两个数的和等于目标值
    public int[] twoSum(int[] nums, int target) {
        int left = 0; // 初始化左指针，指向数组的开始
        int right = nums.length - 1; // 初始化右指针，指向数组的末尾

        // 当左指针小于右指针时，继续查找
        while (left < right) {
            int sum = nums[left] + nums[right]; // 计算当前左指针和右指针指向元素的和

            // 如果和等于目标值，返回两个指针索引（加1以符合题目要求）
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            // 如果和小于目标值，移动左指针向右
            else if (sum < target) {
                left++;
            }
            // 如果和大于目标值，移动右指针向左
            else {
                right--;
            }
        }

        // 如果没有找到符合条件的两个元素，返回一组表示未找到的索引
        return new int[]{-1, -1};
    }
}

