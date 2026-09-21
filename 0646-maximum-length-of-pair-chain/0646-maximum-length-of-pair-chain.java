class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) ->a[1]-b[1]);
        int count = 0;
        int last = Integer.MIN_VALUE;
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>last){
                count++;
                last=pairs[i][1];
            }
        }
        return count;
    }
}