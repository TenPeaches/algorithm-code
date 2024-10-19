package com.krahets.linked_list.leetcode206;

import com.krahets.linked_list.leetcode21.ListNode;

// 定义一个名为Method01的类
public class Method01 {
    // 反转链表的方法，接收链表头结点作为参数并返回反转后的链表头结点
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

