package com.krahets.searching.leetcode230;
import com.krahets.divide_conquer.leetcode226.TreeNode;
public class Method01 {
    int k, res; // k为要查找的第k小元素，res为结果

    // 主方法：找到二叉搜索树中第k小的元素
    public int kthSmallest(TreeNode root, int k) {
        this.k = k; // 初始化k
        inorder(root); // 进行中序遍历
        return res; // 返回结果
    }

    // 中序遍历方法
    public void inorder(TreeNode root) {
        if (root == null) return; // 如果节点为空，直接返回

        inorder(root.left); // 递归遍历左子树

        if (k == 0) {
            return; // 如果k已经为0，说明已经找到第k小元素，直接返回
        }

        if (--k == 0) { // 访问当前节点
            res = root.val; // 更新结果为当前节点的值
        }

        inorder(root.right); // 递归遍历右子树
    }
}

