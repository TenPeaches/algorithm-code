package com.character_string.lcr182;

public class Method01 {
    public String dynamicPassword(String password, int target) {
        StringBuilder sb = new StringBuilder();
        sb.append(password.substring(target, password.length()));
        sb.append(password.substring(0, target));
        return sb.toString();
    }
}
