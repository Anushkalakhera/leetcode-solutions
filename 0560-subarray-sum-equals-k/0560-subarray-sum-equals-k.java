class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int prefixSum=0;
        for(int r=0;r<nums.length;r++){
            prefixSum+=nums[r];
            int target=prefixSum-k;

            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}