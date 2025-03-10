package com.search_backtracking.lcr143;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        return isSubStructureHelper(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSubStructureHelper(TreeNode a, TreeNode b) {
        if(b == null){
            return true;
        }
        if(a == null || a.val != b.val){
            return false;
        }
        return isSubStructureHelper(a.left, b.left) && isSubStructureHelper(a.right, b.right);
    }
}
