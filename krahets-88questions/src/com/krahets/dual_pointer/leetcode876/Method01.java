package com.krahets.dual_pointer.leetcode876;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {
    public ListNode middleNode(ListNode head) {
            ListNode[] arr = new ListNode[100];
            int i = 0;
            while (head!= null) {
                arr[i++] = head;
                head = head.next;
            }
            return arr[i/2];
    }
}
