package com.divide_algorithm.lcr124;

import com.search_backtracking.lcr149.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    int[] preorder;
    Map<Integer, Integer> inorderMap=new HashMap<>();
    public TreeNode deduceTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return helper(0,0,inorder.length-1);
    }

    private TreeNode helper(int root, int start, int end) {
        if(start>end){
            return null;
        }
        int val=preorder[root];
        TreeNode node=new TreeNode(val);
        int index=inorderMap.get(val);
        node.left=helper(root+1,start,index-1);
        node.right=helper(root+index-start+1,index+1,end);
        return node;
    }
}
