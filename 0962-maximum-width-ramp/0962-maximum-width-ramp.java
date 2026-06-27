class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        
        int[] rightMax=new int[n];
        rightMax[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(nums[i],rightMax[i+1]);
        }

        int ramp=0;
        int i=0;
        int j=0;

        while(j<n){

            if(i<j && nums[i]>rightMax[j]){
                i++;
            }
            ramp=j-i;
            j++;
        }
        return ramp;
    }
}