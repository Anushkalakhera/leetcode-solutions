class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            ans+=s.charAt(i);
            if(count==k) break;
        }
        return ans.trim();
    }
}