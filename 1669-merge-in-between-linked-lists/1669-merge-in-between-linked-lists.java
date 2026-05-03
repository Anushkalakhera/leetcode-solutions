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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(a == 0){
            ListNode tail = list2;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = list1;
            return list2;
        }

       ListNode temp=list1;
       int count=0;
       while(temp!=null){
         if(count==b+1){
            break;
         }
         temp=temp.next;
         count++;
       }
       ListNode temp2=list1;
       count=0;
       while(temp2!=null){
         if(count==a-1){
            break;
         }
         temp2=temp2.next;
         count++;
       }
        
        ListNode temp3=list2;
        while(temp3.next!=null){
            temp3=temp3.next;
        }
        temp2.next=list2;
        temp3.next=temp;

        return list1;
    }
}