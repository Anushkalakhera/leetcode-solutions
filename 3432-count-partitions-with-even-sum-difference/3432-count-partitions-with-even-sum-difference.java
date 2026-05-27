class Solution {
    public int countPartitions(int[] nums) {
        int[] prefix=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            prefix[i]=sum+nums[i];
            sum=prefix[i];
        }

        int low=0;
        int high=nums.length-1;
        int count=0;
        while(low<high){
            if((prefix[low]-(prefix[high]-prefix[low]))%2==0){
                count++;
            }
            low++;
        }
        return count;
    }
}