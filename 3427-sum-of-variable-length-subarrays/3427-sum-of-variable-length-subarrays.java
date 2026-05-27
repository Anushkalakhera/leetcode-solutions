class Solution {
    public int subarraySum(int[] nums) {
        int[] prefix=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            prefix[i]+=prefix[i-1]+nums[i-1];
        }

        int ans=0;
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            int sum=prefix[i+1]-prefix[start];
            ans+=sum;
        }
        
        return ans;
    }
}