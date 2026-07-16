class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] ans=new int[nums.length];
        int n=ans.length-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[n]=nums[i]*nums[i];
                n--;
                i++;
            }else{
                ans[n]=nums[j]*nums[j];
                n--;
                j--;
            }
        }
        return ans;
    }
}