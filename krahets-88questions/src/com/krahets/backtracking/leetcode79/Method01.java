package com.krahets.backtracking.leetcode79;


public class Method01 {
    // 主方法，检查字符矩阵中是否包含给定单词
    public boolean exist(char[][] board, String word) {
        // 将单词转换为字符数组
        char[] words = word.toCharArray();
        // 遍历每个位置作为起始点
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                // 从当前位置开始进行深度优先搜索
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        // 如果遍历完所有位置都没有找到单词，则返回 false
        return false;
    }

    // 深度优先搜索方法
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        // 检查当前索引是否越界或字符是否不匹配
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;

        // 如果当前字符是单词的最后一个字符，返回 true
        if (k == word.length - 1) return true;

        // 标记当前字符为已访问（使用一个特殊字符，如'\0'）
        board[i][j] = '\0';

        // 进行四个方向的深度优先搜索，检查下一个字符
        boolean res = dfs(board, word, i + 1, j, k + 1) ||  // 下方
                dfs(board, word, i - 1, j, k + 1) ||  // 上方
                dfs(board, word, i, j + 1, k + 1) ||  // 右侧
                dfs(board, word, i, j - 1, k + 1);    // 左侧

        // 将当前字符恢复为原来的值，以便下次搜索使用
        board[i][j] = word[k];
        return res; // 返回是否找到完整的单词
    }
}

