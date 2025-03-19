/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
       if(root==null){
        return l;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       int c=0;
       while(!q.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                l1.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            c++;
            if(c%2==0){
                Collections.reverse(l1);
            }
            l.add(l1);
        }
        return l;
    }
}