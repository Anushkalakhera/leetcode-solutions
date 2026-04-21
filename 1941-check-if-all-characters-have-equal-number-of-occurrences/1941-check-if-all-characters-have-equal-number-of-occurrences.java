class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int val = map.values().iterator().next();
        for(char ch : map.keySet()){
            if(map.get(ch)!=val){
                return false;
            }
        }
        return true;
    }
}