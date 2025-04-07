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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer>l=new ArrayList<>();
        ListNode root=head;
        while(root!=null){
            l.add(root.val);
            root=root.next;
        }
        List<Integer> list=l.subList(left-1,right);
        Collections.reverse(list);
        ListNode curr=new ListNode(0);
        ListNode mm=curr;
        System.out.print(l);
        for(int i:l){
            mm.next=new ListNode(i);
            mm=mm.next;
            
        }
        return curr.next;
    }
}