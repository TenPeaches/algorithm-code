package com.krahets.dual_pointer.leetcode151;

public class Method01 {

    // 反转给定字符串中的单词顺序
    public String reverseWords(String s) {
        // 去除字符串首尾的空白字符
        s = s.trim();
        StringBuilder sb = new StringBuilder(); // 创建一个 StringBuilder 用于构建结果字符串
        int i = s.length() - 1; // 设置指针 i 指向字符串的最后一个字符
        int j = i; // 设置指针 j，初始化为 i

        // 遍历字符串，从后往前反转单词
        while (i >= 0) {
            // 找到当前单词的开始位置
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            // 提取当前单词并追加到 StringBuilder 中，后面加一个空格
            sb.append(s.substring(i + 1, j + 1) + " ");

            // 跳过空格，移动指针到下一个单词的开头
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i; // 更新指针 j 为当前指针 i
        }

        // 返回构建的字符串，去掉最后的多余空格
        return sb.toString().trim();
    }
}

