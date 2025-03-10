package com.search_backtracking.lcr153;

import com.search_backtracking.lcr149.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        recursive(root, target);
        return res;
    }

    private void recursive(TreeNode root, int target) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        }
        recursive(root.left, target);
        recursive(root.right, target);
        path.remove(path.size() - 1);
    }
}
