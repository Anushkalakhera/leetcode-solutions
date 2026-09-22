class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int count1=0;
        int count2=0;
        for(int i=piles.length-1;i>0;i-=2){
            count1+=piles[i];
            count2+=piles[i-1];
        }

        return count1>count2;
    }
}