package com.character_string.lcr122;

public class Method01 {
    public String pathEncryption(String path) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<path.length(); i++){
            if(path.charAt(i)=='.'){
                sb.append(' ');
            }else {
                sb.append(path.charAt(i));
            }
        }
        return sb.toString();
    }
}
