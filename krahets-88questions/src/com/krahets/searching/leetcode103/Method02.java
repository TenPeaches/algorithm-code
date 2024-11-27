package com.krahets.searching.leetcode103;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method02 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // 创建一个队列，用于存储即将被访问的节点，以实现层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        // 创建一个列表，用于存放每一层的结果
        List<List<Integer>> result = new LinkedList<>();

        // 如果根节点不为空，将其加入队列
        if (root != null) {
            queue.offer(root);
        }

        // 进行层序遍历，只要队列不为空，就继续循环
        while (!queue.isEmpty()) {
            // 创建一个列表用于存储当前层的节点值
            List<Integer> level = new LinkedList<>();

            // 遍历当前层的所有节点
            for (int i = queue.size(); i > 0; i--) {
                // 从队列中取出一个节点
                TreeNode node = queue.poll();

                // 将当前节点的值加入到该层结果列表中
                level.add(node.val);

                // 将当前节点的左子节点加入队列（如果存在）
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // 将当前节点的右子节点加入队列（如果存在）
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // 如果当前层是奇数层，则反转层的顺序
            if (result.size() % 2 == 1) {
                Collections.reverse(level);
            }
            // 将当前层的节点值列表添加到结果中
            result.add(level);
        }

        // 返回最终的结果列表，其中包含每一层的节点值
        return result;
    }
}

