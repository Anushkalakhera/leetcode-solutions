class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int k=0;
        int[] arr=new int[2];
        for(int key : map.keySet()){
            if(map.get(key)==2){
                arr[k]=key;
                k++;
            }
        }
        return arr;
    }
}