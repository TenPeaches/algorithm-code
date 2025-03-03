package com.lookup_algorithm.lcr120;

import java.util.HashSet;

public class Method02 {
    public int findRepeatDocument(int[] documents) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < documents.length; i++) {
            if (set.contains(documents[i])) {
                return documents[i];
            }
            set.add(documents[i]);
        }
        return -1;
    }
}
