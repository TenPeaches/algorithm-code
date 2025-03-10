package com.search_backtracking.lcr151;

import com.search_backtracking.lcr149.TreeNode;

import java.util.*;


public class Method01 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Deque<Integer> level = new LinkedList<>();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(result.size()%2==0){
                    level.addLast(node.val);
                }else{
                    level.addFirst(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            List<Integer> levelList=new ArrayList<>(level);
            result.add(levelList);
        }
        return result;
    }
}
