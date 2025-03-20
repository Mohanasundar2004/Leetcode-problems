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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        List<Integer>l=new ArrayList<>();
        helper(l,root);
        return l.get(k-1);
    }
    public void helper(List<Integer>l,TreeNode root){
        if(root==null){
            return ;
        }
        helper(l,root.left);
        l.add(root.val);
        helper(l,root.right);
    }
}