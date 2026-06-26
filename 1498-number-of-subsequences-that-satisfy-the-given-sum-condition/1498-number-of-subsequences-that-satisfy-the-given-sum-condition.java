class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1000000007;
        int[] pow = new int[nums.length];
        pow[0] = 1;

        for (int i = 1; i <nums.length; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }

        int n=nums.length;

        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int result=0;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                result = (result + pow[r - l]) % MOD;
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}