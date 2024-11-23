package com.krahets.dual_pointer.leetcode151;

public class Method02 {

    // 反转给定字符串中的单词顺序
    public String reverseWords(String s) {
        // 去除字符串首尾的空白字符
        s = s.trim();

        // 用空格分割字符串，得到单词数组
        String[] str = s.split(" ");

        // 创建一个 StringBuilder 用于构建结果字符串
        StringBuilder sb = new StringBuilder();

        // 从后往前遍历单词数组
        for (int i = str.length - 1; i >= 0; i--) {
            // 跳过空字符串（可能由于多空格导致拆分产生空元素）
            if (str[i].equals("")) continue;

            // 追加单词到 StringBuilder，后面加一个空格
            sb.append(str[i]).append(" ");
        }

        // 返回构建的字符串，去掉最后的多余空格
        return sb.toString().trim();
    }
}



