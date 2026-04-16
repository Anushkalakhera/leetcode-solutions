class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            boolean check=true;
            for(int j=0;j<pref.length();j++){
                if(s.charAt(j)!=pref.charAt(j)){
                    check=false;
                    break;
                }
                if(s.length() < pref.length()) continue;
            }
            if(check==true){
                count++;
            }
        }
        return count;
    }
}