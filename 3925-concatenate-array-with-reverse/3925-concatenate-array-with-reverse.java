class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int x=nums.length-1;
        for(int i=nums.length;i<ans.length;i++){
            ans[i]=nums[x];
            x--;
        }
        return ans;
    }
}