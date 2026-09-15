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
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] count=new int[10];
        dfs(root,count);
        return ans;
    }

    public void dfs(TreeNode root , int[] count){
        if(root==null) return;
        count[root.val]++;

        if(root.left==null && root.right==null){
            int odd=0;
            for(int i=1;i<=9;i++){
                if(count[i]%2!=0){
                    odd++;
                }
            }
            if (odd <= 1) {
                ans++;
            }
        }
        dfs(root.left,count);
        dfs(root.right,count);

        count[root.val]--;
    }
}