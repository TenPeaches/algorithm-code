package com.krahets.backtracking.leetcode104;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Method02 {
    // 定义一个方法，用来计算二叉树的最大深度
    public int maxDepth(TreeNode root) {
        // 如果当前节点为空，则返回深度0
        if (root == null) {
            return 0;
        }

        // 创建一个队列用于广度优先搜索（BFS）
        Queue<TreeNode> queue = new LinkedList<>();
        // 将根节点加入队列
        queue.offer(root);
        // 初始化树的高度
        int height = 0;

        // 当队列不为空时，不断进行层级遍历
        while (!queue.isEmpty()) {
            // 记录当前层的节点数量
            int size = queue.size();
            // 遍历当前层的每一个节点
            for (int i = 0; i < size; i++) {
                // 从队列中取出一个节点
                TreeNode node = queue.poll();
                // 如果左子节点不为空，则加入队列
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // 如果右子节点不为空，则加入队列
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // 层级遍历完当前层，高度加1
            height++;
        }
        // 返回二叉树的最大深度
        return height;
    }
}
