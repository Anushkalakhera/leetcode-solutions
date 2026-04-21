/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findLast(ListNode temp,int n){
        int count=1;
        while(temp!=null){
            if(count==n)return temp;
            count++;
            temp=temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int count=1;
        ListNode temp=head;

        while(temp.next!=null){
            temp=temp.next;
            count++;
        }

        k=k%count;
        if(k==0) return head;
        temp.next=head;
        
        ListNode newLastNode= findLast(head,count-k);
        head=newLastNode.next;
        newLastNode.next=null;
        return head;
    }
}