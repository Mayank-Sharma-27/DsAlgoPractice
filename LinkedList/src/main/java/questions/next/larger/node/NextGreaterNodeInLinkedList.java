package questions.next.larger.node;

import questions.ListNode;

import java.util.Stack;

// problem link : https://leetcode.com/problems/next-greater-node-in-linked-list/
public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        if(head==null){
            return new int[1];
        }
        head = reverseLinkedList(head);

        Stack<Integer> stack = new Stack<>();
        int k=0;
        ListNode current = head;
        while(current!=null){
            current =current.next;

            k++;
        }
        current = head;
        int[] ans = new int[k];
        int index=0;

        while(current!=null){
            if(stack.isEmpty()){
                ans[index]= 0;
            }
            else if(!stack.isEmpty() && stack.peek()>current.val){
                ans[index] = stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek()<=current.val){
                while(!stack.isEmpty() &&stack.peek()<=current.val){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[index] = 0;
                }
                else{
                    ans[index] = stack.peek();
                }
            }
            stack.push(current.val);
            index++;
            current= current.next;
        }

        return  reverse(ans, k);

    }

    int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;

    }

    ListNode reverseLinkedList(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}
