class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        prefix = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                int top = prefix[i - 1][j];
                int left = prefix[i][j - 1];
                int topLeft = prefix[i - 1][j - 1];

                prefix[i][j] =
                    matrix[i-1][j-1]+top+left-topLeft;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int bottomRight = prefix[row2 + 1][col2 + 1];
        int top = prefix[row1][col2 + 1];

        int left = prefix[row2 + 1][col1];
        int common = prefix[row1][col1];

        return bottomRight - top - left + common;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */