package com.krahets.simulation.leetcode8;

public class Method01 {
    public int myAtoi(String s) {
        // 将输入字符串去除首尾空格，并转换为字符数组
        char[] chars = s.trim().toCharArray();

        // 如果字符数组为空，返回 0
        if (chars.length == 0) {
            return 0;
        }

        // 初始化符号（默认为正数）和结果变量
        int sign = 1;
        int result = 0;
        int i = 0;

        // 检查符号，并更新 sign 和 i
        if (chars[i] == '+') {
            i++; // 正号，继续处理
        } else if (chars[i] == '-') {
            sign = -1; // 负号，更新符号为 -1
            i++; // 移动到下一个字符
        }

        // 遍历字符数组，构建数字
        for (; i < chars.length; i++) {
            // 如果当前字符不是数字，则停止解析
            if (chars[i] < '0' || chars[i] > '9') {
                break;
            }

            // 检查是否会出现整数溢出
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && chars[i] > '7')) {
                // 根据符号返回对应的最大或最小值
                if (sign == 1) {
                    return Integer.MAX_VALUE; // 超出最大值，返回最大值
                } else {
                    return Integer.MIN_VALUE; // 超出最小值，返回最小值
                }
            }

            // 更新结果：将当前数字加入到结果中
            result = result * 10 + (chars[i] - '0');
        }
        // 返回结果乘以符号
        return sign * result;
    }
}
