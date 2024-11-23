package com.krahets.dual_pointer.leetcode876;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {

    // 找到链表的中间节点
    public ListNode middleNode(ListNode head) {
        // 创建一个 ListNode 数组，用于存储链表的节点
        ListNode[] arr = new ListNode[100]; // 假设链表的最大长度不会超过 100
        int i = 0;

        // 遍历链表，将每个节点存入数组
        while (head != null) {
            arr[i++] = head; // 将当前节点赋值给数组
            head = head.next; // 移动到下一个节点
        }

        // 返回中间节点，如果链表节点数为偶数，则返回第二个中间节点
        return arr[i / 2];
    }
}

