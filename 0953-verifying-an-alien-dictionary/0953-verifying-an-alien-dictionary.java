class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank=new int[26];
        for(int i=0;i<order.length();i++){
            rank[order.charAt(i) - 'a'] = i;
        }

        for(int i=0;i<words.length-1;i++){
            String a=words[i];
            String b=words[i+1];
            boolean differentFound = false;
            for (int j = 0; j < Math.min(a.length(), b.length()); j++) {
                if(a.charAt(j)!=b.charAt(j)){
                    differentFound = true;
                    if(rank[a.charAt(j) - 'a']<rank[b.charAt(j)-'a']){
                        break;
                    }else return false;
                }
            }  
            if (!differentFound && a.length() > b.length()) {
                return false;
            } 
        }
        return true;
    }
}