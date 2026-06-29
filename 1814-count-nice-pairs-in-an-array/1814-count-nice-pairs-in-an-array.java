class Solution {
    public int countNicePairs(int[] nums) {
        long MOD = 1_000_000_007;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]-rev(nums[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        long ans = 0;

        for (long freq : map.values()) {
            ans = (ans + (freq * (freq - 1)) / 2) % MOD;
        }
        return (int)ans;
    }

    public int rev(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}