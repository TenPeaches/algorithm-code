package com.simulation.lcr148;

import java.util.Stack;

public class Methdo01 {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        if(putIn.length==0||putIn.length==1){
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        int len = putIn.length;
        int j = 0;
        for(int i=0;i<len;i++){
            stack.push(putIn[i]);
            while (!stack.isEmpty() && stack.peek() == takeOut[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
