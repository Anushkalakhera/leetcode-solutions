class Solution {
    public boolean solve(int i,int[] nums , int n,int target,Boolean[][] dp){
        if(i >=n) return false;
        if(target<0) return false;
        if(target==0) return true;

        if(dp[i][target]!=null) return dp[i][target] ;

        boolean include=solve(i+1, nums,n,target-nums[i],dp);
        boolean exclude=solve(i+1, nums,n,target,dp);

        return dp[i][target]=  include  || exclude;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int num : nums){
            total+=num;
        }

        if(total%2!=0)  return false;
        int target=total/2;
        // return solve(0, nums , n , target);  


        Boolean[][] dp=new Boolean[n+1][target+1]; 
        return solve(0, nums , n , target , dp);
    }
}