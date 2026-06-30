class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int h : hand){
            map.put(h,map.getOrDefault(h,0)+1);
        }
        if(n%groupSize!=0) return false;
        while(!map.isEmpty() ){
            int curr= map.firstKey();
            for(int i=0;i<groupSize;i++){
                int card = curr+i;
                if(!map.containsKey(card)){
                    return false;
                }
                map.put(card, map.get(card) - 1);
                if (map.get(card) == 0) {
                    map.remove(card);
                }
            }
        }
        return true;
    }
}