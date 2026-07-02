class Solution {
    int[] dp;
    public int calc(int n){
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=calc(n-1)+calc(n-2)+calc(n-3);
    }
    public int tribonacci(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return calc(n);
    }
}