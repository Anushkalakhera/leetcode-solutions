class Solution {
    public int[] applyOperations(int[] nums) {
        int low=0;
        for(int i=1;i<nums.length;i++){
            if(nums[low]==nums[i]){
                nums[low]=2*nums[low];
                nums[i]=0;
            }
            low++;
        }
        
        low=0;
        int high=nums.length-1;
        while
        (low<high){
            if(nums[low]==0 && nums[high]!=0){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            }else if(nums[low]!=0 && nums[high]==0){
                low++;
                high--;
            }else if(nums[low]==0 && nums[high]==0){
                high--;
            }
        }
        return nums;
    }
}