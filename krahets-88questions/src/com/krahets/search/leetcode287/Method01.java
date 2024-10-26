package com.krahets.search.leetcode287;

public class Method01 {
    /**
     * 使用快慢指针方法查找数组中的重复数字。
     *
     * @param nums 输入的数组，其中的数字范围在 [1, n] 之间，并且数组长度为 n + 1，
     *             必定存在一个重复的数字。
     * @return 返回找到的重复数字。
     */
    public int findDuplicate(int[] nums) {
        // 快指针和慢指针初始化
        int slow = nums[0];              // 慢指针从数组的第一个元素开始
        int fast = nums[nums[0]]; // 快指针从数组的第一个元素的指向位置开始

        // 找到慢指针和快指针相遇的位置
        while (slow != fast) {
            slow = nums[slow];           // 慢指针每次移动一步
            fast = nums[nums[fast]]; // 快指针每次移动两步
        }

        // 重置快指针为 0
        fast = 0;

        // 找到重复数字所在的位置
        // 此时慢指针和快指针相遇处即为环的入口
        while (slow != fast) {
            slow = nums[slow];       // 慢指针也从相遇点开始，移动一步
            fast = nums[fast];       // 快指针从 0 开始，移动一步
        }

        // 返回重复的数字
        return slow;                 // slow 和 fast 在环的入口相遇，因此返回 slow
    }
}

