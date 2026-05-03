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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }

        Arrays.sort(arr);
        ListNode x=new ListNode(0);
        ListNode res=x;
        for(int i=0;i<arr.length;i++){
            ListNode n=new ListNode(arr[i]);
            x.next=n;
            x=x.next;
        }
        return res.next;
    }
}