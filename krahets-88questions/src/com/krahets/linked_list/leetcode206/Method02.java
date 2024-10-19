package com.krahets.linked_list.leetcode206;

import com.krahets.linked_list.leetcode21.ListNode;

// 方法02类，用于操作链表
public class Method02 {
    // 反转链表的方法，传入链表头节点
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }
}

