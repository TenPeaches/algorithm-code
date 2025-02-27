package com.linked_list.lcr123;

import java.util.Stack;

public class Method01 {
    public int[] reverseBookList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!= null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}
