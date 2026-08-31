class Solution {
    public int solve(int amount , int[] coins ,int i,int[][] dp){
        if(amount==0){
            return 1;
        }

        if(amount<0) return 0;
        if(i>=coins.length) return 0;
        if(dp[i][amount] != -1) return dp[i][amount];

        int includeCoin=solve(amount-coins[i],coins,i,dp);
        int excludeCoin=solve(amount,coins,i+1,dp);

        return dp[i][amount] =includeCoin+excludeCoin;
    }


    public int change(int amount, int[] coins) {
        int idx=0;
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        int ans=solve(amount,coins,idx,dp);
        return ans;
    }
}