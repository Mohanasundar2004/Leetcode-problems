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
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=-1;
            }
        }
        if(head==null){
            return arr;
        }
        int l=0,up=0,r=m-1,down=n-1;
        while( head!=null){
            for(int i=l;i<=r&& head!=null;i++){
                arr[up][i]=head.val;
                head=head.next;
            }
            up++;
            for(int i=up;i<=down&& head!=null;i++){
                arr[i][r]=head.val;
                head=head.next;
            }
            r--;
            // if(up<=down){
                for(int i=r;i>=l&& head!=null;i--){
                    arr[down][i]=head.val;
                    head=head.next;
                }
                down--;
            // }
            // if(l<=r){
                for(int i=down;i>=up&& head!=null;i--){
                    arr[i][l]=head.val;
                    head=head.next;
                }
                l++;
            // }
        }
        return arr;
    }
}