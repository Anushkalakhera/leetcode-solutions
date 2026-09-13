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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            TreeNode xParent=null;
            TreeNode yParent=null;

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                if(curr.left!=null){

                    if(curr.left.val==x){
                        xParent=curr;
                    }
                    if(curr.left.val==y){
                        yParent=curr;
                    }

                    q.add(curr.left);
                }

                if(curr.right!=null){

                    if(curr.right.val==x){
                        xParent=curr;
                    }
                    if(curr.right.val==y){
                        yParent=curr;
                    }

                    q.add(curr.right);
                }
            }

            if (xParent != null && yParent != null) {
                return xParent != yParent;
            }

            // Only one found at this level
            if (xParent != null || yParent != null) {
                return false;
            }
        }
        return false;
    }
}