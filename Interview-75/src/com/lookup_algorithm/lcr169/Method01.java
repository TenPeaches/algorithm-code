package com.lookup_algorithm.lcr169;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public char dismantlingAction(String arr) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length(); i++) {
            char currentChar = arr.charAt(i);
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }
        }
        for (int i = 0; i < arr.length(); i++) {
            char currentChar = arr.charAt(i);
            if (map.get(currentChar) == 1) {
                return currentChar;
            }
        }
        return ' ';
    }
}
