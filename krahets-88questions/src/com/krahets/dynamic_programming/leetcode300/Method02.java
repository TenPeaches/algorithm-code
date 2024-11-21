package com.krahets.dynamic_programming.leetcode300;

public class Method02 {
    public int lengthOfLIS(int[] nums) {
        int res = 1, n = nums.length;
        int[] d = new int[n + 1];
        d[res] = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > d[res]) {
                d[++res] = nums[i];
            } else {
                int l = 1, r = res, pos = 0;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                d[pos + 1] = nums[i];
            }
        }
        return res;
    }
}
