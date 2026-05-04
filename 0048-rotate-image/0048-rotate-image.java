class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] temp=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[j][i]=matrix[i][j];
            }
        }
        int[][] ans=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=temp[i][row-j-1];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}