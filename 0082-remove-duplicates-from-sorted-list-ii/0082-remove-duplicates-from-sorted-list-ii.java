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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=new ListNode(0);
        curr.next=head;
        ListNode root= curr;
        while(root.next!=null && root.next.next!=null){
            if(root.next.val==root.next.next.val){
                int dup=root.next.val;
                while(root.next!=null && root.next.val==dup){
                    root.next=root.next.next;
                }
            }
            else{
                root=root.next;
            }
        }
        return curr.next;
    }
}