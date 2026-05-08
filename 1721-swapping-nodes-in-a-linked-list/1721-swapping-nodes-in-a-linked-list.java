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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        ListNode temp2=head;
        temp=head;
        int n=1;
        while(n < k){
            temp = temp.next;
            n++;
        }

        n=1;
        
        while(n<(count-k+1)){
            temp2=temp2.next;
            n++;
        }
    
        int x=temp.val;
        temp.val=temp2.val;
        temp2.val=x;
        return head;

    }
}