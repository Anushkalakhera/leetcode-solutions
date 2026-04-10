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
    int count=0;
    public int helper(TreeNode root,int max){
        if(root==null) return 0;
        if(root.val>=max){
            count++;
             max=Math.max(root.val,max);
        }
        helper(root.left,max);
        helper(root.right,max);
        return count;
    }
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
}