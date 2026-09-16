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
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node=q.poll();

            if(node.left!=null){
                if(node.left.val!=node.val) return false;
                q.add(node.left);
            }

            if(node.right!=null){
                if(node.right.val!=node.val) return false;
                q.add(node.right);
            }
        }
        return true;
    }
}