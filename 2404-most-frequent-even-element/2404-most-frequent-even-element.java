class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int ele: nums){
            if(ele%2==0){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
        }
       
        int maxFrequency=0;
        int ans=-1;

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(freq>maxFrequency){
                maxFrequency=freq;
                ans=key;
            }else if(freq == maxFrequency){
                ans = Math.min(ans, key);
            }
        }
        return ans;
    }
}