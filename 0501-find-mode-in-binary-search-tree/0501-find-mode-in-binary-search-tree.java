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
    ArrayList<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        ArrayList<Integer> ans = new ArrayList<>();

        int count = 1;
        int maxCount = 1;

        ans.add(list.get(0));

        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(list.get(i-1))){
                count++;
            }else{
                count=1;
            }
            if(count>maxCount){
                maxCount = count;
                ans.clear();
                ans.add(list.get(i));
            }else if(maxCount==count){
                if (!ans.contains(list.get(i))) {
                    ans.add(list.get(i));
                }
            }
        }

        int[] result=new int[ans.size()];
        for(int i=0;i<result.length;i++){
            result[i]=ans.get(i);
        }
        return result;
    }

    public void inorder(TreeNode root){
        if(root ==null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);

    }
}