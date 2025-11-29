package com.recall.leetcode79;

public class Method01 {
    public boolean exist(char[][] board, String word) {
        int gao=board.length;
        int kuan=board[0].length;
        boolean[][] trr=new boolean[gao][kuan];
        char start=word.charAt(0);
        for (int i = 0; i < gao; i++) {
            for (int j = 0; j < kuan; j++) {
                if(start==board[i][j]&&ifexist(board,i,j,word,0,trr)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean ifexist(char[][] board, int i, int j, String word,int index,boolean[][] trr) {
        if(index==word.length()-1){
            return true;
        }
        trr[i][j]=true;
        char start = word.charAt(index+1);
        if(i>0&&!trr[i-1][j]&&board[i-1][j]==start){
            if(ifexist(board,i-1,j,word,index+1,trr))return true;
        }
        if(i<board.length-1&&!trr[i+1][j]&&board[i+1][j]==start){
            if(ifexist(board,i+1,j,word,index+1,trr))return true;
        }
        if(j>0&&!trr[i][j-1]&&board[i][j-1]==start){
            if(ifexist(board,i,j-1,word,index+1,trr))return true;
        }
        if(j<board[0].length-1&&!trr[i][j+1]&&board[i][j+1]==start){
            if(ifexist(board,i,j+1,word,index+1,trr))return true;
        }
        trr[i][j]=false;
        return false;
    }
}
