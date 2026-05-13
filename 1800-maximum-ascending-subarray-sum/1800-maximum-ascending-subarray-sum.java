class Solution {
    public int maxAscendingSum(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Continue ascending subarray
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            }

            // Start new subarray
            else {
                currentSum = nums[i];
            }

            // Update maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}