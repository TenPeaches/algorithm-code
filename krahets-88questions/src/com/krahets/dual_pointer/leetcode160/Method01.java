package com.krahets.dual_pointer.leetcode160;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {

    // 找到两个链表的交点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA; // 指针 pA 初始化为链表 A 的头节点
        ListNode pB = headB; // 指针 pB 初始化为链表 B 的头节点

        // 当两个指针还未相遇时，继续遍历
        while (pA != pB) {
            // 如果 pA 到达链表 A 的末尾，则将其指向链表 B 的头节点
            pA = pA == null ? headB : pA.next;
            // 如果 pB 到达链表 B 的末尾，则将其指向链表 A 的头节点
            pB = pB == null ? headA : pB.next;
        }

        // 返回相遇的节点（交点），如果没有交点，则返回 null
        return pA;
    }
}

