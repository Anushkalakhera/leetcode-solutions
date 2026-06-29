class Solution {
    int ans=0;
    private void solve(char[][] board ,int row ,int n){
        if(row==n){
            ans++;
            return;
        }

        for(int j=0;j<n;j++){
        if(isSafe(board,row,j)){
          board[row][j] = 'Q'; //choose
          solve(board, row+1,n); ///recursion
          board[row][j] = '.'; 
        }
      }
    } 

    public static boolean isSafe(char[][] board , int row, int col){
      int n=board.length;
      // horizontally
      for(int j=0;j<n;j++){
        if(board[row][j]=='Q') return false;
      }

      // vertically
      for(int i=0;i<n;i++){
        if(board[i][col]=='Q') return false;
      }

      // north east;
      int i=row;
      int j=col;
      while(i>=0 && j<n){
        if(board[i][j]=='Q') return false;
        i--;
        j++;
      }


      // north west
      i=row;
      j=col;
      while(i>=0 && j>=0){
        if(board[i][j]=='Q') return false;
        i--;
        j--;
      }

      // south east
      i=row;
      j=col;
      while(i<n && j<n){
        if(board[i][j]=='Q') return false;
        i++;
        j++;
      }


      i=row;
      j=col;
      while(i<n && j>=0){
        if(board[i][j]=='Q') return false;
        i++;
        j--;
      }

      return true;
    }



    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        solve(board,0,n);
        return ans;
    }
}