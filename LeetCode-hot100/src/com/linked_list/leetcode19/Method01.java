package com.linked_list.leetcode19;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=new ListNode(0);
        ListNode pre=slow;
        slow.next=head;
        while (n--!=0){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return pre.next;
    }
}
