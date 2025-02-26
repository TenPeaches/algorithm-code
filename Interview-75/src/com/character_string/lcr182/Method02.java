package com.character_string.lcr182;

public class Method02 {
    public String dynamicPassword(String password, int target) {
        String str = "";
        for (int i=target;i<password.length()+target;i++){
            str += password.charAt(i%password.length());
        }
        return str;
    }
}
