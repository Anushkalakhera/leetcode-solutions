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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        Queue<Pair<TreeNode,Long>> q=new LinkedList<>();
        q.add(new Pair<>(root, 0L));
        long ans = 0;

        while(!q.isEmpty()){
            int size=q.size();
            long first=q.peek().getValue();
            long last=first;

            for(int i=0;i<size;i++){
                Pair<TreeNode, Long> p = q.poll();

                TreeNode node=p.getKey();
                long index=p.getValue();

                last = index;

                if (node.left != null) {
                    q.add(new Pair<>(
                        node.left,
                        2 * index + 1
                    ));
                }

                if (node.right != null) {
                    q.add(new Pair<>(
                        node.right,
                        2 * index + 2
                    ));
                }
            }
            long width=last-first+1;
            ans=Math.max(ans,width);
        }

        return (int)ans;
    }
}