class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i]<students[i]){
                int diff=seats[i]-students[i];
                ans+=diff;
            }else if(seats[i]>students[i]){
                ans+=(students[i]-seats[i]);
            }
        }
        return Math.abs(ans);
    }
}