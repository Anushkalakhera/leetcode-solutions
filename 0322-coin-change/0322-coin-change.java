class Solution {
    public int solve(int amount,int[] coins,int i,int[][] dp){
        if(amount==0){
            return 0;
        }

        if(amount <0){
            return Integer.MAX_VALUE;
        }

        if (i >= coins.length) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount][i] != -1) {
            return dp[amount][i];
        }

        int include=solve(amount-coins[i],coins,i,dp);
        if (include != Integer.MAX_VALUE) {
            include = include + 1;
        }
        int exclude=solve(amount,coins,i+1,dp);

        return dp[amount][i]= Math.min(include, exclude);
    }

    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[amount + 1][coins.length];
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=solve(amount,coins,0,dp);
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}