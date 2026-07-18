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
    int ans =0;

    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;

        if(root.left!=null){
            dfs(root.left,true,1);
        }

        if(root.right!=null){
            dfs(root.right,false,1);
        }

        return ans;
    }

    public void dfs(TreeNode node, boolean cameFromLeft, int len){
        if (node == null)
            return;

        ans = Math.max(ans, len);

        if(cameFromLeft){
            dfs(node.right,false,len+1);
            dfs(node.left,true,1);
        }else{
            dfs(node.right,false,1);
            dfs(node.left,true,len+1);
        }
    }
}