/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean contains(TreeNode root,TreeNode curr){
        if(root==null) return false;
        if(root==curr) return true;
        return contains(root.left,curr) || contains(root.right,curr);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(p==q) return p;
       if(p==root || q==root) return root;
       boolean leftP=contains(root.left,p);
       boolean rightQ=contains(root.right,q);
       if(leftP==true && rightQ==true) return root;
       if(leftP==false && rightQ==false) return root;
       if(leftP==true && rightQ==false) return lowestCommonAncestor(root.left,p,q);
       if(leftP==false && rightQ==true) return lowestCommonAncestor(root.right,p,q);
       return null;
    }
}