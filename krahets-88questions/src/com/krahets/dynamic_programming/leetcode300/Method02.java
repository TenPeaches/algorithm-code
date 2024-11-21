package com.krahets.dynamic_programming.leetcode300;

public class Method02 {

    // 主方法：计算给定数组的最长递增子序列的长度
    public int lengthOfLIS(int[] nums) {
        int res = 1; // 记录当前找到的最长递增子序列的长度
        int n = nums.length; // 获取数组的长度
        int[] d = new int[n + 1]; // 创建一个数组 d，用于存储递增子序列（长度 n + 1 以便处理边界情况）
        d[res] = nums[0]; // 数组的第一项初始化为第一个元素

        // 从第二个元素开始遍历
        for (int i = 1; i < n; ++i) {
            // 如果当前元素大于 d 数组末尾元素，说明可以扩展递增子序列
            if (nums[i] > d[res]) {
                d[++res] = nums[i]; // 更新 d 数组，增加最长递增子序列长度
            } else {
                // 二分查找，寻找当前元素的插入位置
                int l = 1, r = res, pos = 0; // l 为搜索的左边界，r 为右边界
                while (l <= r) {
                    int mid = (l + r) >> 1; // 中间位置
                    // 如果中间元素小于当前元素，则继续向右找
                    if (d[mid] < nums[i]) {
                        pos = mid; // 更新位置，记录当前 mid
                        l = mid + 1; // 向右移动左边界
                    } else {
                        r = mid - 1; // 向左移动右边界
                    }
                }
                // 将当前元素放置到适当的位置以保持 d 数组的有序性
                d[pos + 1] = nums[i];
            }
        }

        // 返回最长递增子序列的长度
        return res;
    }
}

