class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int count=0;
        while(low<high){
            if(nums[low]+nums[high]==k){
                count++;
                low++;
                high--;
            }else if(nums[low]+nums[high]>k){
                high--;
            }else{
                low++;
            }
        }
        return count;
    }
}