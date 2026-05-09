class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean check1=true;
        boolean check2=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                check1=false;
            }else if(nums[i]<nums[i+1]){
                check2=false;
            }
        }
        return check1 || check2;
    }
}