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
    long totalSum = 0;
    long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        totalSum=getSum(root);
        getMaxProduct(root);
        return (int)(maxProduct % 1000000007);
    }

    public long getSum(TreeNode root){
        if(root==null) return 0;
        return root.val+getSum(root.left)+getSum(root.right);
    }

    public long getMaxProduct(TreeNode root){
        if(root==null) return 0;

        long leftSum=getMaxProduct(root.left);
        long rightSum = getMaxProduct(root.right);

        long subSum = root.val + leftSum + rightSum;
        long otherSum = totalSum - subSum;

        long product = subSum * otherSum;
        maxProduct = Math.max(maxProduct, product);

        return subSum;
    }
}