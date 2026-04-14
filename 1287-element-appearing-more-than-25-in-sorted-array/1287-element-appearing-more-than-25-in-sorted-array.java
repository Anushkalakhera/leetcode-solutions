class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int n=arr.length/4;
        for(int key : map.keySet()){
            if(map.get(key)>n){
                return key;
            }
        }
        return -1;
    }
}