package com.linked_list.lcr123;

import java.util.ArrayList;
import java.util.List;

public class Method02 {
    List<Integer> list = new ArrayList<>();
    public int[] reverseBookList(ListNode head) {
        addToList(head);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public void addToList(ListNode head) {
        if (head == null) {
            return;
        }
        addToList(head.next);
        list.add(head.val);
    }
}
