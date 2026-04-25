class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr=new int[matrix.length];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            int colSum=0;
            for(int j=0;j<matrix[0].length;j++){
                colSum+=matrix[j][i];
            }
            arr[k]=colSum;
            k++;
        }
        return arr;
    }
}