package com.search_backtracking.lcr189;

public class Method01 {
    public int mechanicalAccumulator(int target) {
        if(target==1){
            return 1;
        }
        return mechanicalAccumulator(target-1)+target;
    }
}
