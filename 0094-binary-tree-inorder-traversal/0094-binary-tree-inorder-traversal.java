class Solution {
    ArrayList<Integer> li = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return li;

        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);

        return li; 
    }
}