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
    public int getDecimalValue(ListNode head) {
      String n="";
      ListNode temp=head;
      while(temp!=null){
        n+=temp.val;
        temp=temp.next;
      }  
      return Integer.parseInt(n,2);
    }
}