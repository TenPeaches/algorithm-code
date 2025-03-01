package com.stack_queque.lcr183;

import java.util.Deque;
import java.util.LinkedList;

public class Method01 {
    public int[] maxAltitude(int[] heights, int limit) {
        if (heights == null || heights.length == 0) {
            return new int[0];
        }
        int[] arr=new int[heights.length-limit+1];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < limit; i++) {
            while (!deque.isEmpty()&&heights[i]>deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(heights[i]);
            arr[0]=deque.peekFirst();
        }
        for (int i = limit; i < heights.length; i++) {
            if(deque.peekFirst()==heights[i-limit]){
                deque.pollFirst();
            }
            while (!deque.isEmpty()&&heights[i]>deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(heights[i]);
            arr[i-limit+1]=deque.peekFirst();
        }
        return arr;
    }
}
