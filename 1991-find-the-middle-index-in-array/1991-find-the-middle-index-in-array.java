class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] suff=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            pre[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum=sum+nums[i];
            suff[i]=sum;
        }

        
        for(int i=0;i<n;i++){
            if(pre[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}