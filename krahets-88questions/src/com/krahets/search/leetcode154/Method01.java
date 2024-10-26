package com.krahets.search.leetcode154;

public class Method01 {
    /**
     * 寻找旋转排序数组中的最小值。
     * 假设数组是通过某种方式旋转过的，可能包含重复元素。
     *
     * @param nums 输入的旋转排序数组
     * @return 数组中的最小值
     */
    public int findMin(int[] nums) {
        int left = 0;                          // 初始化左指针为数组的起始位置
        int right = nums.length - 1;          // 初始化右指针为数组的结束位置

        // 当左指针小于右指针时继续循环
        while (left < right) {
            int mid = left + (right - left) / 2; // 计算中间指针，避免可能的溢出
            if (nums[mid] < nums[right]) { // 判断中间值与右边值的大小关系
                right = mid;                  // 当中间值小于右边值，说明最小值在左半部分
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;               // 当中间值大于右边值，说明最小值在右半部分
            } else { // 当中间值等于右边值时，可能会错过最小值，缩小右边界
                right--;                       // 缩小右边界，排除掉右边的重复值
            }
        }
        // 循环结束，left 指向最小值
        return nums[left];                    // 返回最小值
    }
}

