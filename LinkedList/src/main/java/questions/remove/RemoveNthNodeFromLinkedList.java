package questions.remove;

import questions.ListNode;

// problem link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromLinkedList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = null;
        while(n>0){
            node1= node1.next;
            n--;
        }

        while(node1!=null){
            node1=node1.next;
            if(node2==null){
                node2=head;
            }
            else{

                node2=  node2.next;
            }
        }
        if(node2== null){
            head = head.next;
            return head;
        }
        if(node2.next==null){
            return node2;
        }
        if(node2==head){
            node2.next = node2.next.next;
            return head;
        }
        node2.next = node2.next.next;
        return head;

    }

}
