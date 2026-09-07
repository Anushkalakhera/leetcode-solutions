class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[2];
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=m-1;i>=0;i--){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
                if(count>=max){
                    max=Math.max(max,count);
                    idx=i;
                }
            }
        }
        ans[0]=idx;
        ans[1]=max;
        return ans;
    }
}