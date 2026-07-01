class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> colorCount=new HashMap<>();
        HashMap<Integer,Integer> ballColor=new HashMap<>();
        int n=queries.length;
        int[] ans=new int[n];
        int distinct = 0;
        for(int i=0;i<n;i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballColor.containsKey(ball)){
                int oldColor = ballColor.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);

                if(colorCount.get(oldColor)==0){
                    colorCount.remove(oldColor);
                    distinct--;
                }
            }


            if(!colorCount.containsKey(color)) distinct++;
            
            colorCount.put(color,colorCount.getOrDefault(color,0)+1);
            ballColor.put(ball,color);

            ans[i]=distinct;
        }
        return ans;
    }
}