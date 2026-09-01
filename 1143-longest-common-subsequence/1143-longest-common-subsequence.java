class Solution {
    public int tab(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int solve(String text1, String text2,int i,int j,int[][] dp){
        if(i==text1.length()){
            return 0;
        }
        if(j==text2.length()){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        int ans=0;
        if(text1.charAt(i)==text2.charAt(j)){
            ans=1+solve(text1,text2,i+1,j+1,dp);
        }else{
            ans=Math.max(solve(text1,text2,i+1,j,dp),solve(text1,text2,i,j+1,dp));
        }

        return dp[i][j]=ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        // return solve(text1,text2,0,0,dp);
        return tab(text1,text2);
    }
}