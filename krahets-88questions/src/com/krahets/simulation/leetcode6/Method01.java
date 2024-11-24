package com.krahets.simulation.leetcode6;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public String convert(String s, int numRows) {
        // 处理边界条件：当输入字符串为 null 或者行数小于 2 时，直接返回原字符串
        if (s == null || numRows < 2) return s;

        // 创建一个 ArrayList，存储每一行的字符串内容
        List<StringBuilder> rows = new ArrayList<StringBuilder>();

        // 初始化每一行，以 StringBuilder 的形式存储
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        // 初始化行索引 i 和方向标志 flag
        int i = 0, flag = -1; // flag 用于控制行的移动方向

        // 遍历输入字符串的每一个字符
        for (char c : s.toCharArray()) {
            // 将字符追加到当前行
            rows.get(i).append(c);

            // 当到达顶行或底行时，反转方向
            if (i == 0 || i == numRows - 1) {
                flag = -flag; // 反转方向
            }

            // 根据当前方向更新行索引 i
            i += flag; // flag 为 -1 时，i 减 1；为 1 时，i 加 1
        }

        // 创建一个新的 StringBuilder，用于构建最终结果
        StringBuilder res = new StringBuilder();

        // 将每一行的 StringBuilder 内容添加到最终结果中
        for (StringBuilder row : rows) {
            res.append(row); // 拼接每一行的内容
        }

        // 返回最终结果的字符串形式
        return res.toString();
    }
}


