package com.krahets.simulation.leetcode415;

public class Method01 {
    // 方法：将两个字符串表示的非负整数相加
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder(); // 创建一个 StringBuilder 用于存储结果
        int i = num1.length() - 1, j = num2.length() - 1; // 初始化指针 i 和 j 分别指向两个字符串的末尾
        int jinwei = 0; // 初始化进位
        int sum = 0; // 初始化和

        // 当 i 或 j 还在范围内时循环
        while (i >= 0 || j >= 0) {
            // 计算当前位的和，包括进位和当前位的数字
            sum = jinwei + (i >= 0 ? num1.charAt(i) - '0' : 0) + (j >= 0 ? num2.charAt(j) - '0' : 0);
            jinwei = sum / 10; // 更新进位
            sb.append(sum % 10); // 将当前位结果添加到 StringBuilder 中
            i--; // 指向 num1 的前一位
            j--; // 指向 num2 的前一位
        }

        // 如果最后还有进位，则在前面加上 '1'，否则直接返回结果
        return jinwei == 0 ? sb.reverse().toString() : ("1" + sb.reverse().toString());
    }
}

