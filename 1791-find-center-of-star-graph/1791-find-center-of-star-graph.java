class Solution {
    public int findCenter(int[][] edges) {
        int m=edges.length;
        int n=edges[0].length;
        int count=0;
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
                if(set.contains(edges[i][j])){
                    ans=edges[i][j];
                }else{
                    set.add(edges[i][j]);
                }
           } 
        }
         return ans;
    }
}