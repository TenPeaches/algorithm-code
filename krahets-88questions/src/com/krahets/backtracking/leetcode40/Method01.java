package com.krahets.backtracking.leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    // 存储所有满足条件的组合结果
    List<List<Integer>> res = new ArrayList<>();
    // 存储当前的组合状态
    List<Integer> nums = new ArrayList<>();

    // 主方法，计算组合和为目标值的组合
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 首先对候选数组进行排序，以便于后续处理
        Arrays.sort(candidates);
        // 调用回溯法进行组合查找
        backtrack(candidates, target, 0, nums, res);
        // 返回所有找到的组合
        return res;
    }

    // 回溯法实现
    void backtrack(int[] choices, int target, int start, List<Integer> state, List<List<Integer>> res) {
        // 如果当前目标值为0，说明找到了一组有效组合
        if (target == 0) {
            res.add(new ArrayList<>(state)); // 将当前组合加入结果列表
            return;
        }

        // 遍历候选数组
        for (int i = start; i < choices.length; i++) {
            // 如果当前选项超过目标值，后续的选项也不可能满足条件，直接退出循环
            if (target - choices[i] < 0) {
                break;
            }
            // 跳过重复的元素以避免产生重复的组合
            if (i > start && choices[i] == choices[i - 1]) {
                continue;
            }
            // 选择当前元素并加入组合
            state.add(choices[i]);
            // 继续递归查找剩余的目标值
            backtrack(choices, target - choices[i], i + 1, state, res);
            // 撤销选择，回溯到上一步
            state.remove(state.size() - 1);
        }
    }
}

