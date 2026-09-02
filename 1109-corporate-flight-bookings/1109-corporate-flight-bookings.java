class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n + 2];

        for(int[] booking : bookings){
            int start=booking[0];
            int end=booking[1];
            int seats=booking[2];

            diff[start]+=seats;
            diff[end+1]-=seats;
        }

        int[] res=new int[n];
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum += diff[i];
            res[i - 1] = sum;
        }
        return res;
    }
}