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
    ArrayList<Integer> li=new ArrayList<>();

    public void inOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);    
        li.add(root.val);      
        inOrder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<li.size()-1;i++){
            int diff=li.get(i+1)-li.get(i);
            min=Math.min(min,diff);
        }
        return min;
    }
    
}