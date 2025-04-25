package com.hash.leetcode49;

import java.util.*;

public class Method01 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s=strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String str=String.valueOf(c);
            if(map.containsKey(str)) {
                map.get(str).add(s);
            }else {
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(str, list);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
