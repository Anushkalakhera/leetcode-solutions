class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight : weights){
            left=Math.max(left,weight);
            right+=weight;
        }

        while(left<right){
            int mid = left + (right - left) / 2;
            if(canShip(weights,days,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    public boolean canShip(int[] weights ,int days ,int capacity){
        int daysNeeded=1;
        int curr=0;

        for (int w : weights) {
            if (curr + w > capacity) {
                daysNeeded++;
                curr = 0;
            }
            curr += w;
        }

        return daysNeeded <= days;
    }
}