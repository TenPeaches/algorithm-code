package com.krahets.divide_conquer.leetcode101;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Method02 {
    /**
     * 判断一棵二叉树是否是对称的。
     *
     * @param root 二叉树的根节点
     * @return 如果二叉树是对称的，返回 true；否则返回 false
     */
    public boolean isSymmetric(TreeNode root) {
        // 调用辅助方法检查树的左右子树是否对称
        return checkSymmetric(root, root);
    }

    /**
     * 辅助方法，通过队列实现广度优先搜索，检查两棵子树是否对称。
     *
     * @param root1 第一棵子树的根节点
     * @param root2 第二棵子树的根节点
     * @return 如果两棵子树是对称的，返回 true；否则返回 false
     */
    private boolean checkSymmetric(TreeNode root1, TreeNode root2) {
        // 使用队列进行广度优先遍历
        Queue<TreeNode> queue = new LinkedList<>();
        // 将两棵子树的根节点加入队列
        queue.offer(root1);
        queue.offer(root2);

        // 当队列不为空时循环处理
        while (!queue.isEmpty()) {
            // 从队列中取出两个节点进行比较
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            // 如果两个节点都为 null，继续下一轮循环
            if (node1 == null && node2 == null) {
                continue;
            }

            // 如果其中一个节点为 null，另一个不为 null，则树不对称
            if (node1 == null || node2 == null) {
                return false;
            }

            // 如果两个节点的值不相等，则树不对称
            if (node1.val != node2.val) {
                return false;
            }

            // 将左子树和右子树的节点以相反的顺序加入队列
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }

        // 如果遍历完成且没有发现不对称的情况，则树是对称的
        return true;
    }
}


