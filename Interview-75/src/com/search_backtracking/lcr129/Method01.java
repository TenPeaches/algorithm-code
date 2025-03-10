package com.search_backtracking.lcr129;

public class Method01 {
    public boolean wordPuzzle(char[][] grid, String target) {
        char[] targetChars = target.toCharArray();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, targetChars, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, char[] targetChars, int i, int j, int K) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || targetChars[K] != grid[i][j]) return false;
        if (K == targetChars.length - 1) return true;
        grid[i][j] = '*';
        if (dfs(grid, targetChars, i + 1, j, K + 1) || dfs(grid, targetChars, i - 1, j, K + 1) || dfs(grid, targetChars, i, j + 1, K + 1) || dfs(grid, targetChars, i, j - 1, K + 1))
            return true;
        grid[i][j] = targetChars[K];
        return false;
    }
}
