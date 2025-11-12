package com.linked_list.leetcode21;

import com.linked_list.leetcode234.ListNode;

public class Method01 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist=new ListNode(0);
        ListNode prelist=newlist;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                prelist.next=list1;
                list1=list1.next;
            }else {
                prelist.next=list2;
                list2=list2.next;
            }
            prelist=prelist.next;
        }
        prelist.next=list1==null?list2:list1;
        return newlist.next;
    }
}
