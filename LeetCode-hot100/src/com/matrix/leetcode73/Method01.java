package com.matrix.leetcode73;

public class Method01 {
    public void setZeroes(int[][] matrix) {
        int[] hang=new int[matrix.length];
        int[] lie=new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    hang[i]=1;
                    lie[j]=1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(hang[i]==1||lie[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
