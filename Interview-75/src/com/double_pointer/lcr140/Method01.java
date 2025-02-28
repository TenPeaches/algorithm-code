package com.double_pointer.lcr140;

import com.linked_list.lcr123.ListNode;

public class Method01 {
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode prev=new ListNode(0);
        prev.next=head;
        for (int i = 0; i < cnt; i++) {
            prev=prev.next;
        }
        ListNode curr=new ListNode(0);
        curr.next=head;
        while (prev!=null){
            prev=prev.next;
            curr=curr.next;
        }
        return curr;
    }
}
