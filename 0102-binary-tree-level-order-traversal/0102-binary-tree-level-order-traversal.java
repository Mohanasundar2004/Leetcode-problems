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
//  class Node{
//     int val;
//     Node left;
//     Node right;
//     public Node(int val){
//         this.val=val;
//         this.left=null;
//         this.right=null;
//     }
//  }
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            l1.add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            //l1.add(curr.val);
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
            l.add(l1);
        }
        return l;
    }
}