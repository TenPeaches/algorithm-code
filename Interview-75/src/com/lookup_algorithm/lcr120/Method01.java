package com.lookup_algorithm.lcr120;

import java.util.Arrays;

public class Method01 {
    public int findRepeatDocument(int[] documents) {
        Arrays.sort(documents);
        for (int i = 0; i < documents.length - 1; i++) {
            if (documents[i] == documents[i + 1]) {
                return documents[i];
            }
        }
        return -1;
    }
}
