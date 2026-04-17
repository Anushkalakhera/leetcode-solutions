class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            ans.append(word.charAt(0));
        }

        if(ans.toString().equals(s)) return true;
        return false;
    }
}