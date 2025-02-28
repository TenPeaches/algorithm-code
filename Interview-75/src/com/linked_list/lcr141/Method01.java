package com.linked_list.lcr141;

import com.linked_list.lcr123.ListNode;

public class Method01 {
    public ListNode trainningPlan(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr!= null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
