class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowsum=0;
        int count=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int target=threshold*k;
        if(windowsum>=target) count++;

        for(int i=k;i<arr.length;i++){
            windowsum+=arr[i];
            windowsum-=arr[i-k];
            if(windowsum>=target) count++;
        }
        return count;
    }
}