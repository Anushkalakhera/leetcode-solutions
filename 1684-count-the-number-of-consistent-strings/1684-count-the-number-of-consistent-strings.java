class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();

        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }

        int count=0;
        for(String word : words){
            boolean consistent=true;

            for(char ch : word.toCharArray()){
                if(!set.contains(ch)){
                    consistent=false;
                    break;
                }
            }
            if(consistent) count++;
        }
        return count;
    }
}