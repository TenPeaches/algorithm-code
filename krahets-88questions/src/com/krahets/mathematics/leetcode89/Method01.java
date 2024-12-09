package com.krahets.mathematics.leetcode89;

import java.util.ArrayList;
import java.util.List;

public class Method01 {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>(); // 创建一个列表用于存储结果
        res.add(0); // 将 0 添加到结果中，表示 Gray 码的起始值
        int head = 1; // 初始化头部值为 1

        // 外层循环迭代 n 次，每次增加一个二进制位
        for (int i = 0; i < n; i++) {
            int size = res.size(); // 当前结果列表的大小
            // 内层循环反向遍历已有结果列表，将新生成的 Gray 码添加到结果列表中
            for (int j = size - 1; j >= 0; j--) {
                res.add(res.get(j) + head); // 根据当前的头部值生成新的 Gray 码
            }
            head <<= 1; // 将头部值左移一位，以便为下一个二进制位生成 Gray 码
        }

        return res; // 返回最终生成的 Gray 码列表
    }
}

