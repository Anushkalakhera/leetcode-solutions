class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        // first row
        for(int j = 0; j < n; j++) {
            if(grid[0][j] == 1)
                dfs(0,j,grid);
        }
        for(int j=0;j<n;j++){
            if(grid[m-1][j]==1){
                dfs(m-1,j,grid);
            }
        }
        for(int j=0;j<m;j++){
            if(grid[j][0]==1){
                dfs(j,0,grid);
            }
        }

        for(int j=0;j<m;j++){
            if(grid[j][n-1]==1){
                dfs(j,n-1,grid);
            }
        }

        int count=0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]==1) {
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int row,int col,int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col >= grid[0].length) return ;
        if(grid[row][col] == 0) return;
        
        grid[row][col] = 0;
        dfs(row+1,col,grid);
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row,col-1,grid);
    }
}