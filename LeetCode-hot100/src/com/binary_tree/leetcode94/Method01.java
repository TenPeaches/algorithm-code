package com.binary_tree.leetcode94;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversal(root, result);
        return result;
    }
    private void inorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null){
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
