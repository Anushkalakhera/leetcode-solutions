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
    HashMap<String ,Integer> map=new HashMap<>();
    List<TreeNode> ans=new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return ans;
    }

    String serialize(TreeNode root){
        if(root==null) return "#";

        String left=serialize(root.left);
        String right=serialize(root.right);

        String key=root.val+ "," + left+ ","+right;
        int count = map.getOrDefault(key, 0);

        if (count == 1) { //pehle ek baar mil chuka h
            ans.add(root);
        }
        map.put(key, count + 1);
        return key;
    }
}