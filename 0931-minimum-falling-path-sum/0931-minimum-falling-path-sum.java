class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];

        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int min = dp[i - 1][j];

                if (j>0) {
                    min = Math.min(min, dp[i - 1][j - 1]);
                }
                if (j < n - 1) {
                    min = Math.min(min, dp[i - 1][j + 1]);
                }

                dp[i][j] = matrix[i][j] + min;
            }
        }
        int minAns = dp[n - 1][0];
        for(int i=0;i<n;i++){
            if(dp[n-1][i]<minAns){
                minAns=dp[n-1][i];
            }
        }
        return minAns;
    }
}