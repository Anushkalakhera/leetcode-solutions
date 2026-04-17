class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;

        StringBuilder s=new StringBuilder();
        boolean check=true;

        while(i<word1.length() && j<word2.length()){
            if(check){
                s.append(word1.charAt(i));
                i++;
            }else{
                s.append(word2.charAt(j));
                j++;
            }
            check=!check;
        }

        while(i<word1.length()){
            s.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length()){
            s.append(word2.charAt(j));
            j++;
        }
        return s.toString();
    }
}