/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     icurr = (char)(root.val + 'a') + curr;nt val;
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
    String ans = null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return ans;
    }

    private void dfs(TreeNode root, String curr){
        if(root==null) return;
        curr = (char)(root.val + 'a') + curr;

        if(root.left==null && root.right==null){
            if(ans==null || curr.compareTo(ans)<0){
                ans=curr;
            }
            return;
        }

        dfs(root.left, curr);
        dfs(root.right, curr);
    }
}