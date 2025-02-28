package com.double_pointer.lcr136;

import com.linked_list.lcr123.ListNode;

public class Method01 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode prev=head;
        while (prev!=null){
            if (prev.next!=null && prev.next.val==val){
                prev.next=prev.next.next;
            }
            prev=prev.next;
        }
        return head;
    }
}
