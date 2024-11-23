package com.krahets.dual_pointer.leetcode142;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {

    // 找到链表中的环的起始节点，如果没有环则返回 null
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head; // 初始化慢指针，指向链表的头节点
        ListNode fast = head; // 初始化快指针，指向链表的头节点

        // 使用快慢指针找环
        while (fast != null && fast.next != null) {
            slow = slow.next;       // 慢指针每次移动一步
            fast = fast.next.next;  // 快指针每次移动两步

            // 如果慢指针和快指针相遇，说明链表有环
            if (slow == fast) {
                // 从链表头开始，另一个指针也从相遇点开始
                slow = head; // 将慢指针重新指向头节点

                // 匹配两个指针，相遇的点就是环的起始点
                while (slow != fast) {
                    slow = slow.next; // 慢指针向前移动一步
                    fast = fast.next; // 快指针向前移动一步
                }

                return slow; // 返回环的起始节点
            }
        }

        // 如果没有环，返回 null
        return null;
    }
}

