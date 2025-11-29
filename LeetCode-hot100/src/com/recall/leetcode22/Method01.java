package com.recall.leetcode22;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<String> list = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        method(0,0,n);
        return list;
    }

    private void method(int left, int right, int n) {
        if(stringBuilder.length()==n*2){
            list.add(stringBuilder.toString());
        }
        if(left<n){
            stringBuilder.append("(");
            method(left+1,right,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if(right<left){
            stringBuilder.append(")");
            method(left,right+1,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
