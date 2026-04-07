class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=encrypt(nums[i]);
            sum=sum+n;
        }
        return sum;
    }
    public static int encrypt(int n){
        int count=0;
        int temp=n;
        int max=0;
        while(n!=0){
            int rem=n%10;
            max=Math.max(rem,max);
            n=n/10;
            count++;
        }
        int res=0;
        
        while(count>0){
            res=res*10+max;
            count--;
        }
        return res;
    }
}