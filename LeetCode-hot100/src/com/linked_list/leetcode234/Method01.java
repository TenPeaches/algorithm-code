package com.linked_list.leetcode234;

import java.util.ArrayList;
import java.util.List;

public class Method01 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        while (i<j){
            if(list.get(i++)!=list.get(j--)){
                return false;
            }
        }
        return true;
    }
}
