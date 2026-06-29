class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        long MOD = 1_000_000_007;
        int n=arr.length;
        Arrays.sort(arr);
        long ans = 0;
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=0;i<n;i++){

            long ways=1;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    int right=arr[i]/arr[j];
                    if(map.containsKey(right)){
                        ways=(ways+map.get(arr[j]) * map.get(right))%MOD;
                    }
                }
            }
            map.put(arr[i],ways);
            ans=(ans + ways) % MOD;
        }
        return (int)ans;
    }
}