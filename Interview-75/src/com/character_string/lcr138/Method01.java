package com.character_string.lcr138;

public class Method01 {
    public boolean validNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char[] chars = s.trim().toCharArray();
        boolean numberFound = false;
        boolean eFound = false;
        boolean dotFound = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= '0' && c <= '9') {
                numberFound = true;
            } else if (c == 'e' || c == 'E') {
                if (eFound || !numberFound) {
                    return false;
                }
                numberFound = false;
                eFound = true;
            } else if (c == '+' || c == '-') {
                if (i != 0 && chars[i - 1] != 'e' && chars[i - 1] != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (dotFound || eFound) {
                    return false;
                }
                dotFound = true;
            } else {
                return false;
            }
        }
        return numberFound;
    }
}
