class Solution {
    public static boolean isValid(char[][] board,int rows,int cols,char ch){
        // rows
        for(int j=0;j<9;j++){
            if(board[rows][j]==ch) return false;
        }

        // col
        for(int i=0;i<9;i++){
            if(board[i][cols]==ch) return false;
        }

        // matrix
        int rGrid=rows/3*3;
        int cGrid=cols/3*3;
        for(int i=rGrid;i<rGrid+3;i++){
            for(int j=cGrid;j<cGrid+3;j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char ch=board[i][j];
                board[i][j]='.';
                if(!isValid(board,i,j,ch)) return false;
                board[i][j]=ch;
            }
        }
        return true;
    }
}