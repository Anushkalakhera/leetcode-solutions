class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int r=0;
        int maxLen=0;
        int n=nums.length;
        for(int l=0;l<n;l++){
            while(r<n && (long)nums[r]<=(long)nums[l]*k){
                r++;
            }
            maxLen=Math.max(maxLen,r-l);
        }
        return n-maxLen;
    }
}