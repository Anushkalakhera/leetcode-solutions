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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        int level=0;
        while(!q.isEmpty()) {
            int size=q.size();

            int prev;

            // even
            if(level%2==0){
                prev=Integer.MIN_VALUE;
            }else{
                prev=Integer.MAX_VALUE;
            }

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                int value = curr.val;
                
                // even
                if(level%2==0){
                    if(value%2==0) return false;

                    if(value<=prev) return false;
                }else{
                    if(value%2!=0) return false;

                    if(value>=prev) return false;
                }

                prev = value;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            level++;
        }
        return true;
    }
}