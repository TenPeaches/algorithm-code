package com.linked_list.leetcode260;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode reverseList(ListNode head) {
        return fanzhuan(head,null);
    }

    private ListNode fanzhuan(ListNode head, ListNode o) {
        if(head==null){
            return o;
        }
        ListNode next=head.next;
        head.next=o;
        return fanzhuan(next,head);
    }
}
