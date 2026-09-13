class Solution {

    public List<Integer> postorder(Node root) {

        List<Integer> ans = new ArrayList<>();

        postorderHelper(root, ans);

        return ans;
    }

    private void postorderHelper(Node root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            postorderHelper(child, ans);
        }

        ans.add(root.val);
    }
}