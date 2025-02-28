package com.linked_list.lcr141;

import com.linked_list.lcr123.ListNode;

public class Method02 {
    public ListNode trainningPlan(ListNode head) {
        return recursive(head, null);
    }
    public ListNode recursive(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode curr=recursive(head.next,head);
        head.next=prev;
        return curr;
    }
}
