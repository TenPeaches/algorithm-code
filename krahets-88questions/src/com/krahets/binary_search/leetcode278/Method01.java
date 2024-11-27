package com.krahets.binary_search.leetcode278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/*public class Method01 extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 1; // 左边界初始化为 1，表示从第 1 个版本开始
        int right = n; // 右边界初始化为 n，表示到第 n 个版本为止

        // 二分查找，直到 left 和 right 相遇
        while (left < right) {
            int mid = left + (right - left) / 2; // 计算中间版本

            // 如果 mid 是坏的版本
            if (isBadVersion(mid)) {
                right = mid; // 则第一个坏版本在 mid 左侧（包括 mid）
            } else {
                left = mid + 1; // 否则第一个坏版本在 mid 的右侧
            }
        }

        // 当结束时，left 和 right 相等，指向第一个坏版本
        return left; // 返回第一个坏版本的版本号
    }
}*/


