package com.sort.lcr164;

import java.util.Arrays;

public class Method01 {
    public String crackPassword(int[] password) {
        String[] str=new String[password.length];
        for (int i = 0; i < password.length; i++) {
            str[i]=password[i]+"";
        }
        Arrays.sort(str,(a,b)->(a+b).compareTo(b+a));
        StringBuilder sb=new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
