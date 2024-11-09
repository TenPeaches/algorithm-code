package com.krahets.backtracking.leetcode46;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method01 {
    // 存储输入的数字列表
    List<Integer> nums = new ArrayList<>();
    // 存储所有排列结果的列表
    List<List<Integer>> res = new ArrayList<>();

    // 深度优先搜索函数，参数 x 表示当前固定的位置
    void dfs(int x) {
        // 如果 x 达到 nums 的最后一个索引，表示已生成一个完整的排列
        if (x == nums.size() - 1) {
            // 将当前排列方案添加到结果列表中
            res.add(new ArrayList<>(nums));
            return;
        }
        // 遍历当前位置 x 到列表末尾的每个元素
        for (int i = x; i < nums.size(); i++) {
            // 交换，将 nums[i] 固定在第 x 位
            Collections.swap(nums, x, i);
            // 递归调用，固定下一个位置
            dfs(x + 1);
            // 恢复交换，回到原始状态，便于下一次循环
            Collections.swap(nums, x, i);
        }
    }

    // 主函数，接收一个整型数组并生成所有排列
    public List<List<Integer>> permute(int[] nums) {
        // 将传入的数组元素添加到成员变量 nums 中
        for (int num : nums) {
            this.nums.add(num);
        }
        // 从第一个位置开始进行深度优先搜索
        dfs(0);
        // 返回所有生成的排列结果
        return res;
    }
}




