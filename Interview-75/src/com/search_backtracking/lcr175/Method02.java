package com.search_backtracking.lcr175;

import com.search_backtracking.lcr149.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method02 {
    public int calculateDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        list.add(root);
        int depth = 0;
        while (list.size() > 0){
            queue.addAll(list);
            list.clear();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
