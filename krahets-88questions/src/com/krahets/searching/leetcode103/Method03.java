package com.krahets.searching.leetcode103;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Method03 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // 创建一个双端队列用于存储节点
        Deque<TreeNode> queue = new LinkedList<>();
        // 创建一个结果列表用于存储每一层的节点值
        List<List<Integer>> result = new LinkedList<>();

        // 如果根节点不为空，则将其加入队列
        if (root != null) {
            queue.offer(root);
        }

        // 只要队列不为空，就继续处理
        while (!queue.isEmpty()) {
            // 创建一个当前层的节点值列表
            List<Integer> level = new LinkedList<>();
            // 从左到右遍历当前层的节点
            for (int i = queue.size(); i > 0; i--) {
                // 获取并移除队列的头部节点
                TreeNode node = queue.poll();
                level.add(node.val); // 将节点值添加到当前层列表中

                // 如果左子节点不为空，则加入队列
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // 如果右子节点不为空，则加入队列
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // 将当前层的节点值列表添加到结果中
            result.add(level);

            // 检查队列是否为空，如果不为空，则处理下一层
            if (!queue.isEmpty()) {
                // 创建一个新的当前层的节点值列表
                level = new LinkedList<>();
                // 从右到左遍历当前层的节点
                for (int i = queue.size(); i > 0; i--) {
                    // 获取并移除队列的尾部节点
                    TreeNode node = queue.pollLast();
                    level.add(node.val); // 将节点值添加到当前层列表中

                    // 如果右子节点不为空，则加入队列的头部
                    if (node.right != null) {
                        queue.offerFirst(node.right);
                    }
                    // 如果左子节点不为空，则加入队列的头部
                    if (node.left != null) {
                        queue.offerFirst(node.left);
                    }
                }
                // 将当前层的节点值列表添加到结果中
                result.add(level);
            }
        }
        // 返回最终的结果
        return result;
    }
}
