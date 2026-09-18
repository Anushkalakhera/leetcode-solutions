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
    List<Integer> li=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {

        inorder(root);
        return build(li,0,li.size()-1);
    }

    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }

    public TreeNode build(List<Integer> li , int i , int j){
        if(i>j) return null;

        int mid=i+(j-i)/2;
        TreeNode root=new TreeNode(li.get(mid));
        root.left=build(li ,i ,mid-1);
        root.right=build(li,mid+1,j);
        return root;
    }
}