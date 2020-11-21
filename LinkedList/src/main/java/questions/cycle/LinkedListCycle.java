package questions.cycle;

import questions.ListNode;

// problem link : https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode head1 = head;
        ListNode head2 = head;
        while(head1!=null || head2!=null){
            if(head1==null){
                return false;
            }
            if(head2==null){
                return false;
            }
            if(head1.next==null){
                return false;
            }
            head1=  head1.next.next;
            if(head1==head2){
                return true;
            }
            head2=head2.next;
            if(head1==head2){
                return true;
            }
        }
        return false;
    }

}
