class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;

        long TotalPair=(long)n*(n-1)/2;
        long goodPair=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int key=nums[i]-i;
            goodPair+=map.getOrDefault(key, 0);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return TotalPair - goodPair;
    }
}