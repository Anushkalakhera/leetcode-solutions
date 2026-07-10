class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];

        int row = 0;
        int col = 0;

        boolean up = true;

        for(int i=0;i<m*n;i++){
            ans[i]=mat[row][col];

            if(up){
                row--;
                col++;
            }else{
                row++;
                col--;
            }

            if (col == n) {
                col = n - 1;
                row += 2;
                up = false;
            }


            if(row == m) {
                row=m-1;
                col+=2;
                up=true;
            }

            if (row < 0) {
                row = 0;
                up = false;
            }

            if (col < 0) {
                col = 0;
                up = true;
            }
        }
        return ans;
    }
}