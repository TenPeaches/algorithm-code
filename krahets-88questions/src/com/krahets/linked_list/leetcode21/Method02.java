package com.krahets.linked_list.leetcode21;

// 用于合并两个已排序链表的类
public class Method02 {
    // 合并两个已排序链表并返回合并后的链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                prev.next = list2;
                prev = prev.next;
                list2 = list2.next;
            } else {
                prev.next = list1;
                prev = prev.next;
                list1 = list1.next;
            }
        }
        prev.next = list1 == null ? list2 : list1;
        return prehead.next;
    }
}
