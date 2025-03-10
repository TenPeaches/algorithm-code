package com.stack_queque.lcr184;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Checkout {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public Checkout() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int get_max() {
        return deque.isEmpty()? -1 : deque.peekFirst();
    }

    public void add(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value){
            deque.removeLast();
        }
        deque.offerLast(value);
    }

    public int remove() {
        if(queue.isEmpty()){
            return -1;
        }
        if(queue.peek().equals(deque.peekFirst())){
            deque.removeFirst();
        }
        return queue.poll();
    }
}
