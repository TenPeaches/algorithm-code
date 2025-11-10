package com.matrix.leetcode54;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int shang=0,xia=matrix.length-1,zuo=0,you=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while (true){
            for (int i = zuo; i <=you ; i++) {
                list.add(matrix[shang][i]);
            }
            if(++shang>xia){
                break;
            }
            for (int i = shang; i <=xia ; i++) {
                list.add(matrix[i][you]);
            }
            if(--you<zuo){
                break;
            }
            for (int i = you; i >=zuo ; i--) {
                list.add(matrix[xia][i]);
            }
            if(--xia<shang){
                break;
            }
            for (int i = xia; i >=shang ; i--) {
                list.add(matrix[i][zuo]);
            }
            if(++zuo>you){
                break;
            }
        }
        return list;
    }
}
