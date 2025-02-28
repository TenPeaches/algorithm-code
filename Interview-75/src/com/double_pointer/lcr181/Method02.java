package com.double_pointer.lcr181;

public class Method02 {
    public String reverseMessage(String message) {
        String[] strArr = message.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if(strArr[i].equals(" "))continue;
            sb.append(strArr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
