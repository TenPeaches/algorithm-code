package com.krahets.linked_list.leetcode86;

import com.krahets.linked_list.leetcode21.ListNode;

/**
 * 方法名称: Method01
 * 描述: 该类包含一个方法，用于将链表按照给定值x进行分区。
 */
public class Method01 {
    /**
     * 方法名称: partition
     * 描述: 将链表中节点的值根据给定值x进行重新排序，使得所有小于x的节点在前，所有大于或等于x的节点在后。
     *
     * @param head 链表的头节点
     * @param x    进行分区的基准值
     * @return 新的链表头节点
     */
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = new ListNode(0);
        ListNode left = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode right = rightHead;
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }
}
