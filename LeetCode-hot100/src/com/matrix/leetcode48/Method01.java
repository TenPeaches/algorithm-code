package com.matrix.leetcode48;

public class Method01 {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        for (int i = 0; i < m/2; i++) {
            for (int j = 0; j < (m+1)/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[m-1-j][i];
                matrix[m-1-j][i]=matrix[m-1-i][m-1-j];
                matrix[m-1-i][m-1-j]=matrix[j][m-1-i];
                matrix[j][m-1-i]=temp;
            }
        }
    }
}
