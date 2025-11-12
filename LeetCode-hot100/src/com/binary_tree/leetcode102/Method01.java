package com.binary_tree.leetcode102;

import com.binary_tree.leetcode94.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method01 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            for (int i = queue.size(); i >0; i--) {
                TreeNode node = queue.poll();
                list1.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(list1);
        }
        return list;
    }
}
