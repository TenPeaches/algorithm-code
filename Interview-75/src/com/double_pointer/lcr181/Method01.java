package com.double_pointer.lcr181;

public class Method01 {
    public String reverseMessage(String message) {
        message = message.trim();
        int i=message.length()-1, j=i;
        StringBuilder sb = new StringBuilder();
        while (i>=0){
            while(i>=0 && message.charAt(i)!=' ')i--;
            sb.append(message.substring(i+1,j+1));
            sb.append(" ");
            while(i>=0 && message.charAt(i)==' ')i--;
            j=i;
        }
        return sb.toString().trim();
    }
}
