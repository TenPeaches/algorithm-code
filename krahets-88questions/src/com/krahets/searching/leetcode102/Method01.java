package com.krahets.searching.leetcode102;

import com.krahets.divide_conquer.leetcode226.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method01 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root!=null)queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            for (int i = queue.size(); i >0; i--) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!= null)queue.offer(node.left);
                if(node.right!= null)queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
