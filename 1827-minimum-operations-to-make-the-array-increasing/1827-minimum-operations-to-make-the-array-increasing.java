class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i]<=nums[i-1]){
                int needed = nums[i - 1] - nums[i] + 1;
                nums[i]+=needed;
                count+=needed;
            }
        }
        return count;
    }
}