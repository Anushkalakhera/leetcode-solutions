class Solution {
    int[] dp;
    public int calc(int n){
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        int left=calc(n-1);
        int right=calc(n-2);
        return dp[n]=left+right;
    }
    public int fib(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return calc(n);
    }
}