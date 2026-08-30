class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=nums[0];
        for(int num : nums){
            if(num>max){
                max=num;
            }
        }

        int[] points=new int[max+1];
        for(int num : nums) {
            points[num] += num;
        }

        int[] dp=new int[points.length];
        int n=dp.length;
        dp[0]=points[0];
        dp[1]=Math.max(points[0],points[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],points[i]+dp[i-2]);
        }

        return Math.max(dp[n-1],dp[n-2]);
    }
}