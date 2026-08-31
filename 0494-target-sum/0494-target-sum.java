class Solution {
    public int solve(int i, int target, int[] nums,int total, Integer[][] dp) {

        // Saare elements use ho gaye
        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }
        // Target ko DP index mein convert karna
        int index = target + total;

        if (target > total || target < -total) {
            return 0;
        }

        // Already calculated
        if (dp[i][index] != null) {
            return dp[i][index];
        }

        int plus = solve( i + 1,target - nums[i],nums,total,dp);
        int minus = solve(i + 1,target + nums[i],nums,total,dp);

        return dp[i][index] = plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int num : nums){
            total+=num;
        }

        if (Math.abs(target) > total) {
            return 0;
        }

        Integer[][] dp = new Integer[n][2 * total + 1];
        return solve(0, target, nums, total, dp);
    }
}