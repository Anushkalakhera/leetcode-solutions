class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();

        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch))
                lower.add(ch);
            else
                upper.add(ch);
        }

        int count=0;

        for(char i='a';i<='z';i++){
            if(lower.contains(i) && upper.contains(Character.toUpperCase(i))) count++;
        }
        return count;
    }
}