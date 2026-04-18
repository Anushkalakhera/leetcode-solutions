class Solution {
    public int minimumOperations(int[][] grid) {
        int count=0;
      for(int j=0;j<grid[0].length;j++){
        for(int i=0;i<grid.length-1;i++){
            if(grid[i+1][j]<=grid[i][j]){
                int needed = grid[i][j] - grid[i+1][j] + 1;
                grid[i+1][j] += needed;
                count += needed;
            }
        }
      } 
      return count; 
    }
}