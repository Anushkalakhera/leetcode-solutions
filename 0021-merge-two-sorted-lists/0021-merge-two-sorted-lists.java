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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode newNode=new ListNode(-1);
        ListNode head=newNode;
        if(temp1==null && temp2!=null) return temp2;
        if(temp2==null && temp1!=null) return temp1;
        if(temp1==null && temp2==null) return null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                newNode.next=temp1;
                newNode=newNode.next;
                temp1=temp1.next;
            }else{
                newNode.next=temp2;
                newNode=newNode.next;
                temp2=temp2.next;
            }
        }

        if(temp1 != null){
            newNode.next = temp1;
        }else{
            newNode.next = temp2;
        }
        return head.next;
    }
}