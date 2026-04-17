class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fSmall=Integer.MAX_VALUE;
        int sSmall=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=fSmall){
                fSmall=nums[i];
            }else if(nums[i]<=sSmall){
                sSmall=nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}