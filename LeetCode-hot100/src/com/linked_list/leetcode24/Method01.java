package com.linked_list.leetcode24;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;
    }
}
