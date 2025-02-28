package com.double_pointer.lcr139;

import java.util.ArrayList;

public class Method02 {
    public int[] trainingPlan(int[] actions) {
        int i = 0, j = actions.length - 1,temp;
        while (i < j){
            while (i < j && actions[i]%2 != 0)i++;
            while (i < j && actions[j]%2 == 0)j--;
            temp = actions[i];
            actions[i] = actions[j];
            actions[j] = temp;
            i++;
            j--;
        }
        return actions;
    }
}
