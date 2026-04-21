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

    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root);
        int sum=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i)>=low && li.get(i)<=high){
                sum+=li.get(i);
            }
        }
        return sum;
    }
}