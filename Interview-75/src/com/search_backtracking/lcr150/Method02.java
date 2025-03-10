package com.search_backtracking.lcr150;

import com.search_backtracking.lcr149.TreeNode;

import java.util.*;

public class Method02 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(level);
            if (queue.isEmpty()) {
                break;
            }
            level = new ArrayList<>();
            int size2 = queue.size();
            for (int i = 0; i < size2; i++) {
                TreeNode node = queue.removeLast();
                level.add(node.val);
                if (node.right != null) {
                    queue.offerFirst(node.right);
                }
                if (node.left != null) {
                    queue.offerFirst(node.left);
                }
            }
            result.add(level);
        }
        return result;
    }
}
