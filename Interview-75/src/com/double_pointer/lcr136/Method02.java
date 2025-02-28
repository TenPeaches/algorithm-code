package com.double_pointer.lcr136;

import com.linked_list.lcr123.ListNode;

public class Method02 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr!=null){
            if (curr.val == val){
                prev.next=curr.next;
                return head;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
