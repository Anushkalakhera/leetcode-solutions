class Solution {
    private void dfs(int row,int col,int m,int n,char[][] grid){
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col]=='0'){
            return ;
        }

        grid[row][col] = '0';

        dfs(row - 1, col,m,n,grid);
        dfs(row + 1, col,m,n,grid);
        dfs(row, col - 1,m,n,grid);
        dfs(row, col + 1,m,n,grid);


    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,m,n,grid);
                }
            }
        }
        return count;
    }
}