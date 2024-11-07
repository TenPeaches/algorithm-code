package com.krahets.backtracking.leetcode113;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    // 主方法，用于寻找路径和等于目标值的所有路径
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // 调用递归方法开始寻找路径
        pS(root, targetSum);
        // 返回所有符合条件的路径
        return res;
    }

    // 存储所有符合条件的路径结果
    List<List<Integer>> res = new ArrayList<>();
    // 存储当前路径的节点值
    List<Integer> path = new ArrayList<>();

    // 递归方法：用于遍历树并寻找路径
    public void pS(TreeNode root, int targetSum) {
        // 如果当前节点为空，直接返回
        if (root == null) {
            return;
        }

        // 将当前节点的值加入路径
        path.add(root.val);
        // 减去当前节点的值，更新目标值
        targetSum -= root.val;

        // 如果目标值为0且当前节点是叶子节点，表示找到一条有效路径
        if (targetSum == 0 && root.left == null && root.right == null) {
            // 添加当前路径的副本到结果中，确保后续的修改不影响结果
            res.add(new ArrayList<>(path));
        }

        // 递归查找左子树
        pS(root.left, targetSum);
        // 递归查找右子树
        pS(root.right, targetSum);

        // 回溯：移除当前节点，准备探索其他路径
        path.remove(path.size() - 1);
    }
}


