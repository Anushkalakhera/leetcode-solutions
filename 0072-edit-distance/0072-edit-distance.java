class Solution {
    public static int solve(String a,String b , int i,int j,int[][] dp){
        if(i==a.length()){
            return b.length()-j;
        }

        if(j==b.length()){
            return a.length()-i;
        }

        if(dp[i][j]!=-1) return dp[i][j]; 

        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            return solve(a,b,i+1,j+1,dp);
        }else{
            int insertAns=1+solve(a,b,i,j+1,dp);
            int delAns=1+solve(a,b,i+1,j,dp);
            int replaceAns=1+solve(a,b,i+1,j+1,dp);

            ans=Math.min(insertAns,Math.min(delAns,replaceAns));
            dp[i][j]=ans;
        }

        return dp[i][j];
    }



    // by tabulation 
    public int solveTab(String a,String b){
        int[][] dp=new int[a.length()+1][b.length()+1];

        for(int j=0;j<=b.length();j++){
            dp[a.length()][j]=b.length()-j;
        }
        for(int i=0;i<=a.length();i++){
            dp[i][b.length()]=a.length()-i;
        }

        for(int i=a.length()-1;i>=0;i--){
            for(int j=b.length()-1;j>=0;j--){
                int ans=0;
                if(a.charAt(i)==b.charAt(j)){
                    ans=dp[i+1][j+1];
                }else{
                    int insertAns=1+dp[i][j+1];
                    int delAns=1+dp[i+1][j];
                    int replaceAns=1+dp[i+1][j+1];
                    
                    ans=Math.min(insertAns,Math.min(delAns,replaceAns));
                }
                dp[i][j]=ans;
            }
        }
        return dp[0][0];
    }

    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                dp[i][j]=-1;
            }
        }
        // int ans=solve(word1,word2,0,0,dp);
        int ans=solveTab(word1,word2);
        return ans;
    }
}