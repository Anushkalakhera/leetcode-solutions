class Solution {
    public int findLucky(int[] arr) {
        int maxVal=-1;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for (int key :freq.keySet()){
            if(key==freq.get(key)){
                maxVal=Math.max(maxVal,key);
            }
        }
        return maxVal;
    }
}