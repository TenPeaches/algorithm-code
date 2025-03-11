package com.search_backtracking.lcr174;

import com.search_backtracking.lcr149.TreeNode;

public class Method01 {
    int res, cnt;
    public int findTargetNode(TreeNode root, int cnt) {
        this.cnt = cnt;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(cnt == 0) return;
        if(--cnt == 0) res = root.val;
        dfs(root.left);
    }
}
