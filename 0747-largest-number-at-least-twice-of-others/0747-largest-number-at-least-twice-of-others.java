class Solution {
    public int dominantIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean check=true;
            for(int j=0;j<nums.length;j++){
                if(nums[i]<2*nums[j] && i!=j){
                    check=false;
                    break;
                }
            }
            if(check==true){
                return i;
            }
        }  
        return -1;      
    }
}