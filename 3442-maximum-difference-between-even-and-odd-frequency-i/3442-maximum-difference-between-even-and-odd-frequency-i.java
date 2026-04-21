class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxEven=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        int maxOdd=Integer.MIN_VALUE;
        int minOdd=Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            if(map.get(ch)%2==0){
                minEven=Math.min(minEven,map.get(ch));
            }else{
                maxOdd=Math.max(maxOdd,map.get(ch));

            }
        }

        return maxOdd-minEven;
    }
}