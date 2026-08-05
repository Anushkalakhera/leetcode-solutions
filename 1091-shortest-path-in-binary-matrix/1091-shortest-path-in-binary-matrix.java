class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        if(n == 1)  return 1;
        Queue<int[]> q=new LinkedList<>();

        boolean[][] visited=new boolean[n][n];

        q.offer(new int[]{0,0});
        visited[0][0]=true;

        int steps=1;

        int[][] directions = {
            {-1,0},   // up
            {1,0},    // down
            {0,-1},   // left
            {0,1},    // right
            {-1,-1},  // up-left
            {-1,1},   // up-right
            {1,-1},   // down-left
            {1,1}     // down-right
        };

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];

                for(int[] dir : directions){
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if(newRow>=0 && newCol>=0 && newRow<n && newCol<n && !visited[newRow][newCol] && grid[newRow][newCol]==0){

                        if(newRow==n-1 && newCol==n-1){
                            return steps + 1;
                        }
                        visited[newRow][newCol]=true;
                        q.offer(new int[]{newRow,newCol});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}