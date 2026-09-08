class Solution {
    public void sortDiagonal(int i,int j,int[][] mat){
        int m=mat.length;
        int n=mat[0].length;

        ArrayList<Integer> li=new ArrayList<>();

        while(i<m && j<n){
            li.add(mat[i][j]);
            i++;
            j++;
        }

        Collections.sort(li);

        i-=li.size();
        j-=li.size();

        int k=0;
        while(i<m && j<n){
            mat[i][j]=li.get(k);
            i++;
            j++;
            k++;
        }
    }
    public int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat[0].length;i++){
            sortDiagonal(0,i,mat);
        }
        
        for(int i=1;i<mat.length;i++){
            sortDiagonal(i,0,mat);
        }
        return mat;
    }
}