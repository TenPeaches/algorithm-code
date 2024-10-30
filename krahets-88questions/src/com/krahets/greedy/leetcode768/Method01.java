package com.krahets.greedy.leetcode768;



import java.util.Stack;
import java.util.Stack; // 导入 stack 类库

public class Method01 {
    // 方法：计算可以划分为的最大块数
    public static int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>(); // 创建一个栈，用于存储当前块的最大元素

        // 遍历数组中的每个数字
        for (int num : arr) {
            // 如果栈为空或当前数字大于等于栈顶元素，则将其压入栈中
            if (stack.isEmpty() || num >= stack.peek()) {
                stack.push(num);
            } else {
                // 否则，弹出栈顶元素，并维护当前块的最大值
                int mx = stack.pop(); // 保存当前最大值
                // 继续弹出栈元素直到栈为空或者找到一个比当前数字小的元素
                while (!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                // 将之前保存的最大值重新压入栈中
                stack.push(mx);
            }
        }

        // 返回栈的大小，即可以分成的块的数量
        return stack.size();
    }
}



