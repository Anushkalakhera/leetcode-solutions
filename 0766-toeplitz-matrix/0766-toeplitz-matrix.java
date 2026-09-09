class Solution {
    public boolean solve(int i,int j ,int[][] mat){ 
        int m=mat.length;
        int n=mat[0].length; 
        ArrayList<Integer> li=new ArrayList<>();
        while(i<m && j<n){
            if(!li.isEmpty() && li.get(li.size() - 1)!=mat[i][j]){
                return false;
            }
            li.add(mat[i][j]);
            i+=1;
            j+=1;
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean ans=false;
        boolean ans2=false;
        for(int i=0;i<n;i++){
            if(!solve(0,i,matrix)){
                return false;
            }
        }

        for(int i=1;i<m;i++){
           if(!solve(i,0,matrix)){
                return false;
           }
        }

        return true;
    }
}