class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                dfs(0,i,board);
            }
        }

        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O'){
                dfs(m-1,i,board);
            }
        }

        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(i,0,board);
            }
        }

        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O'){
                dfs(i,n-1,board);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='S'){
                    board[i][j]='O';
                }else if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void  dfs(int row,int col,char[][] board){
        if(row<0 || col<0 || row>=board.length || col>=board[0].length) return;

        if(board[row][col]!='O') return;
        board[row][col]='S';

        dfs(row+1,col,board);
        dfs(row-1,col,board);
        dfs(row,col+1,board);
        dfs(row,col-1,board);
    }
}