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
    public ListNode mergeNodes(ListNode head) {
       ListNode head2=new ListNode(-1);
       ListNode n=head2;
       ListNode temp=head.next;
       int sum=0;
       while(temp!=null){
          if(temp.val==0){
            n.next = new ListNode(sum); 
            n = n.next;                
            sum = 0; 
          }else{
            sum += temp.val;
          }
          
          temp=temp.next;
       }
       return head2.next;
    }
}