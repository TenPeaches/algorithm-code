package com.krahets.linked_list.leetcode237;

import com.krahets.linked_list.leetcode21.ListNode;

// 定义一个名为Method01的类
public class Method01 {
    // 定义一个删除节点的方法，接收一个ListNode类型的节点作为参数
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }



}

