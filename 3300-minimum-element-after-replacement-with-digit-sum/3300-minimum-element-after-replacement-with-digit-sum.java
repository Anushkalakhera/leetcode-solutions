class Solution {
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int n=nums[i];
            while(n!=0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            min=Math.min(sum,min);
            arr[i]=sum;
        }
        return min;
    }
}