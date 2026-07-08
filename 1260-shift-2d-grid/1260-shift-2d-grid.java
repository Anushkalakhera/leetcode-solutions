class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] arr = new int[rows * cols];

        int index = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[index++] = grid[i][j];
            }
        }  

        int n=arr.length;
        k=k%n;
        int[] shifted = new int[n];
        for(int i=0;i<n;i++){
            shifted[(i + k) % n] = arr[i];
        }

        int idx = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < rows; i++) {

        List<Integer> row = new ArrayList<>();

            for(int j = 0; j < cols; j++) {
                row.add(shifted[idx++]);
            }

            ans.add(row);
        }
        return ans;
    }
}