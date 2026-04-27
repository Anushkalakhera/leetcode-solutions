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
    public static void helper(TreeNode root,List<String> res,String curr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            curr+=root.val;
            res.add(curr);
            return;
        }
        helper(root.left,res,curr+root.val+"->");
        helper(root.right,res,curr+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res=new ArrayList<>();
        helper(root,res,"");
        return res;
    }
}