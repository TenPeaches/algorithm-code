package com.krahets.dual_pointer.leetcode876;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method02 {

    // 找到链表的中间节点
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // 初始化慢指针
        ListNode fast = head; // 初始化快指针

        // 使用快慢指针找到中间节点
        while (fast != null && fast.next != null) {
            slow = slow.next;       // 慢指针每次移动一步
            fast = fast.next.next;  // 快指针每次移动两步
        }

        // 返回慢指针指向的中间节点
        return slow;
    }
}

