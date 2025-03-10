package com.search_backtracking.lcr130;

public class Method01 {
    public static int wardrobeFinishing(int m, int n, int cnt) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (digit(i) + digit(j) <= cnt&& ((i>0&&dp[i-1][j] == 1)||(j>0&&dp[i][j-1] == 1))) {
                    res++;
                    dp[i][j]=1;
                }
            }
        }
        return res+1;
    }
    private static int digit(int x){
        int res=0;
        while(x!=0){
            res+=x%10;
            x/=10;
        }
        return res;
    }
}
