class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        ArrayList<Boolean> li=new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            boolean check=false;
            int ans=candies[i]+extraCandies;
            if(ans>=max){
                check=true;
            }
            li.add(check);
        }
        return li;
    }
}