class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            ans+=word.charAt(0);
        }

        if(ans.equals(s)) return true;
        return false;
    }
}