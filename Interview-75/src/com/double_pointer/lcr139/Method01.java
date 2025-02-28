package com.double_pointer.lcr139;

import java.util.ArrayList;

public class Method01 {
    public int[] trainingPlan(int[] actions) {
        if(actions.length ==0){
            return actions;
        }
        ArrayList<Integer> jishu= new ArrayList<>();
        ArrayList<Integer> oushu= new ArrayList<>();

        for (int i = 0; i <actions.length ; i++) {
            if(actions[i]%2==0){
                oushu.add(actions[i]);
            }else{
                jishu.add(actions[i]);
            }
        }
        for (int i = 0; i < jishu.size(); i++) {
            actions[i] = jishu.get(i);
        }
        for (int i = 0; i < oushu.size(); i++) {
            actions[i+jishu.size()] = oushu.get(i);
        }
        return actions;
    }
}
