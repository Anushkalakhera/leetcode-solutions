class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int max=0;
        int sum=0;
        for(int key : map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)==max){
                sum+=map.get(key);
            }
        }
        return sum;
    }
}