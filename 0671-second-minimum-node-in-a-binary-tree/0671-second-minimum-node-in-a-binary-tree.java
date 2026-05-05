class Solution {
    ArrayList<Integer> li = new ArrayList<>();

    public void preOrder(TreeNode root){
        if(root == null) return;
        li.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        li.clear();
        preOrder(root);

        Collections.sort(li);

        for(int i = 0; i < li.size() - 1; i++){
            if(!li.get(i).equals(li.get(i+1))){
                return li.get(i+1);
            }
        }
        return -1;
    }
}