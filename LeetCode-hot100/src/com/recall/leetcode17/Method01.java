package com.recall.leetcode17;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    private String letterMap[] = {
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    private ArrayList<String> res=new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        findCombinations(digits,0,"");
        return res;
    }

    private void findCombinations(String digits, int index, String s) {
        if(index==digits.length()){
            res.add(s);
            return;
        }
        char num= digits.charAt(index);
        String str=letterMap[num-'2'];
        for (int i = 0; i < str.length(); i++) {
            findCombinations(digits,index+1,s+str.charAt(i));
        }
    }
}
