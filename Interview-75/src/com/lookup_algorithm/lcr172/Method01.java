package com.lookup_algorithm.lcr172;

public class Method01 {
    public int countTarget(int[] scores, int target) {
        if(scores==null  ||scores.length==0){
            return 0;
        }
        int i=0, j=scores.length-1, count=0;
        while (i<j){
             int mid = (i+j)/2;
             if(scores[mid]>target){
                 j=mid-1;
             }else if(scores[mid]< target){
                 i=mid+1;
             }else{
                 i=mid;
                 break;
             }
        }
        if(scores[i]!=target){
            return 0;
        }
        for (int k = i; k <scores.length ; k++) {
            if(scores[k]!=target){
                break;
            }
            count++;
        }
        for (int k = i; k >=0 ; k--) {
            if(scores[k]!=target){
                break;
            }
            count++;
        }
        return count-1;
    }
}
