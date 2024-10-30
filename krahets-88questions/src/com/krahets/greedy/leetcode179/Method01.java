package com.krahets.greedy.leetcode179;

import java.util.Arrays; // 导入 Arrays 类，方便进行数组操作

public class Method01 {
    // 方法：根据给定的整数数组，构造能形成的最大数字
    public String largestNumber(int[] nums) {
        // 创建一个与 nums 长度相同的字符串数组
        String[] strs = new String[nums.length];

        // 将每个整数转换为字符串，并存入 strs 数组
        for (int n = 0; n < nums.length; n++) {
            strs[n] = (String) (nums[n] + ""); // 将整数转为字符串
        }

        // 自定义排序，基于拼接结果的字典序排序
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        // 创建一个 StringBuilder 用于构建最终的结果字符串
        StringBuilder sb = new StringBuilder();
        // 将排序后的字符串依次添加到 StringBuilder 中
        for (String s : strs) {
            sb.append(s);
        }

        // 返回结果：如果结果以 "0" 开头，说明所有数字都是 0，应该返回 "0"；否则返回拼接好的字符串
        return sb.toString().startsWith("0") ? "0" : sb.toString();
    }
}

