package com.sliding_window.leetcode438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method01 {
    public List<Integer> findAnagrams(String s, String p) {
        int slen=s.length(),plen=p.length();
        if(slen<plen){
            return new ArrayList<Integer>();
        }
        List<Integer> arr=new ArrayList<>();
        int[] sarr=new int[26];
        int[] parr=new int[26];
        for (int i = 0; i < plen; i++) {
            sarr[s.charAt(i)-'a']++;
            parr[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(sarr,parr)){
            arr.add(0);
        }
        for (int i = 0; i < slen-plen; i++) {
            sarr[s.charAt(i)-'a']--;
            sarr[s.charAt(i+plen)-'a']++;
            if(Arrays.equals(sarr,parr)){
                arr.add(i+1);
            }
        }
        return arr;
    }
}
