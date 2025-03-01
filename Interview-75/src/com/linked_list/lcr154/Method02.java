package com.linked_list.lcr154;

public class Method02 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null){
            Node newNode = new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }
        curr=head;
        while (curr!=null){
            if (curr.random==null){
                curr.next.random=null;
                curr=curr.next.next;
                continue;
            }
            curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        Node prev=head;
        curr=head.next;
        Node newHead=curr;
        while (curr!=null){
            prev.next=curr.next;
            if (curr.next==null){
                break;
            }
            curr.next=curr.next.next;
            prev=prev.next;
            curr=curr.next;
        }
        return newHead;
    }
}
