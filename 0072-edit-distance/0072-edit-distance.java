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
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                dp[i][j]=-1;
            }
        }
        int ans=solve(word1,word2,0,0,dp);
        return ans;
    }
}