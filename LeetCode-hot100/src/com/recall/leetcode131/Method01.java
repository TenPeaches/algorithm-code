package com.recall.leetcode131;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    List<List<String>> lists = new ArrayList<>();
    List<String> list = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0);
        return lists;
    }

    private void dfs(String s, int i) {
        if(i==s.length()){
            lists.add(new ArrayList<>(list));
        }
        for (int j = i; j < s.length(); j++) {
            if(ifhuiwen(s,i,j)){
                list.add(s.substring(i,j+1));
                dfs(s,j+1);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean ifhuiwen(String s, int i, int j) {
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
