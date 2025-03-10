package com.search_backtracking.lcr149;

import com.search_backtracking.lcr149.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method01 {
    public int[] decorateRecord(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return new int[0];
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
