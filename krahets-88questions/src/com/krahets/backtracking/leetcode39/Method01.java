package com.krahets.backtracking.leetcode39;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    // 存储所有符合条件的组合结果
    List<List<Integer>> res = new ArrayList<>();
    // 存储当前组合的临时列表
    List<Integer> tmp = new ArrayList<>();

    // 主函数，接收候选数组和目标值，返回所有组合
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates, target, 0); // 从索引 0 开始进行回溯
        return res; // 返回所有组合结果
    }

    // 回溯方法，candidates 是候选数组，target 是当前目标值，cur 是当前索引
    public void back(int[] candidates, int target, int cur) {
        // 如果当前目标值为 0，表示找到一个有效组合
        if (target == 0) {
            res.add(new ArrayList<>(tmp)); // 将当前组合添加到结果列表中
            return;
        }

        // 遍历 candidates 数组，从当前索引 cur 开始
        for (int i = cur; i < candidates.length; i++) {
            // 如果当前候选值小于等于目标值，则可以加入当前组合
            if (candidates[i] <= target) {
                tmp.add(candidates[i]); // 将候选值加入当前组合
                // 递归调用 back 方法，更新目标值和保持当前索引 i（允许重复）
                back(candidates, target - candidates[i], i);
                // 移除最后一个加入的元素，以尝试其他组合
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}


