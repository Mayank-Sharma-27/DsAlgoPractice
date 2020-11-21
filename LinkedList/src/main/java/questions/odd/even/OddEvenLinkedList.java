package questions.odd.even;

import questions.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode head1 = head;
        ListNode head2= head.next;
        ListNode evenHead = head2;
        while(head2!=null && head2.next!=null){
            head1.next = head1.next.next;
            head2.next = head2.next.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        head1.next = evenHead;
        return head;
    }

}
