package com.linked_list.leetcode160;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode preA=headA,preB=headB;
        while (preA!=preB){
            preA=preA!=null?preA.next:headB;
            preB=preB!=null?preB.next:headA;
        }
        return preA;
    }
}
