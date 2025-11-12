package com.linked_list.leetcode02;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0),pre=list;
        int jinwei=0;
        while (l1!=null||l2!=null){
            int shu1=l1!=null?l1.val:0,shu2=l2!=null?l2.val:0;
            int sum=shu1+shu2+jinwei;
            int yushu=sum%10;
            pre.next=new ListNode(yushu);
            pre=pre.next;
            jinwei=sum/10;
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
        }
        if(jinwei!=0){
            pre.next=new ListNode(jinwei);
        }
        return list.next;
    }
}
