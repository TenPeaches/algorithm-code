package com.linked_list.leetcode142;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (true){
            if(fast==null||fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                fast=head;
                break;
            }
        }
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
