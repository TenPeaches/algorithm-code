package com.simulation.lcr146;

public class Method01 {
    public int[] spiralArray(int[][] array) {
        if(array.length == 0||array[0].length == 0){
            return new int[0];
        }
        int top = 0, bottom = array.length - 1, left = 0, right = array[0].length - 1;
        int[] result=new int[(bottom+1)*(right+1)];
        int index=0;
        while (top <= bottom && left <= right){
            for (int i = left; i <=right ; i++) {
                result[index++]=array[top][i];
            }
            if(++top > bottom)break;
            for (int i = top; i <=bottom ; i++) {
                result[index++]=array[i][right];
            }
            if(--right < left)break;
            for (int i = right; i >=left ; i--) {
                result[index++]=array[bottom][i];
                }
            if(--bottom < top)break;
            for (int i = bottom; i >=top ; i--) {
                result[index++]=array[i][left];
            }
            if(++left > right)break;
        }
        return result;
    }
}
