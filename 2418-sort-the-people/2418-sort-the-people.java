class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String> map=new HashMap<>();
       for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       int j=0;
       String[] ans=new String[heights.length];
       for(int i=heights.length-1;i>=0;i--){
         ans[j]=map.get(heights[i]);
         j++;
       }
       return ans;
    }
}