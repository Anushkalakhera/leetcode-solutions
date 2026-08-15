class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        int n=cost.length;
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}