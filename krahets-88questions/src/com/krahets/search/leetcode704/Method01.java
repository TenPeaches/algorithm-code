package com.krahets.search.leetcode704;

public class Method01 {
    /**
     * 在有序数组中使用二分查找法查找目标值
     * @param nums 有序数组
     * @param target 需要查找的目标值
     * @return 目标值在数组中的索引，如果不存在则返回 -1
     */
    public int search(int[] nums, int target) {
        int len = nums.length; // 数组的长度
        int left = 0; // 左边界初始化为数组的起始索引
        int right = len - 1; // 右边界初始化为数组的末尾索引

        // 当左边界小于等于右边界时，继续进行查找
        while (left <= right) {
            int mid = left + (right - left) / 2; // 计算中间索引

            // 如果中间值大于目标值，说明目标值在左半部分
            if (nums[mid] > target) {
                right = mid - 1; // 更新右边界
            }
            // 如果中间值小于目标值，说明目标值在右半部分
            else if (nums[mid] < target) {
                left = mid + 1; // 更新左边界
            }
            // 如果中间值等于目标值，返回中间索引
            else {
                return mid; // 找到目标值，返回其索引
            }
        }

        // 如果目标值不存在于数组中，返回 -1
        return -1;
    }
}

