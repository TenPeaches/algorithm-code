package com.ordinary_array.leetcode189;

public class Method01 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[(nums.length-k+i)%nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=temp[i];
        }
    }
}
