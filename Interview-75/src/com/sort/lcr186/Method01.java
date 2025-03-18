package com.sort.lcr186;

import java.util.Arrays;

public class Method01 {
    public boolean checkDynasty(int[] places) {
        Arrays.sort(places);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (places[i] == 0) count++;
            else if (places[i] == places[i + 1]) return false;
        }
        return places[4] - places[count] < 5;
    }
}
