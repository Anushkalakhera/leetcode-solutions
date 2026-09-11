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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> s1=new Stack<>();

        while(head!=null){
            s1.push(head.val);
            head=head.next;
        }

        int carry=0;
        ListNode dummy=null;

        while(!s1.isEmpty() || carry!=0){
            int a=0;

            if(!s1.isEmpty()){
                a=s1.pop();
            }

            int ans=a*2+carry;
            int digit=ans%10;
            carry=ans/10;

            ListNode newNode=new ListNode(digit);
            newNode.next=dummy;
            dummy=newNode;
        }
        return dummy;
    }
}