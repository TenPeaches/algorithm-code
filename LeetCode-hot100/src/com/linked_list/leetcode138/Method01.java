package com.linked_list.leetcode138;

import java.util.HashMap;
import java.util.Map;

public class Method01 {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map =new HashMap<>();
        Node pre = head;
        while (pre!=null){
            map.put(pre,new Node(pre.val));
            pre=pre.next;
        }
        pre = head;
        while (pre!=null){
            map.get(pre).next=map.get(pre.next);
            map.get(pre).random=map.get(pre.random);
            pre=pre.next;
        }
        return map.get(head);
    }
}
