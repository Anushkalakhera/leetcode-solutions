class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set=new HashSet<>(dictionary);
        String[] words=sentence.split(" ");

        StringBuilder sb=new StringBuilder();
        for(String word: words){
            String s=word;
            for(int i=1;i<s.length();i++){
                String prefix=s.substring(0,i);

                if(set.contains(prefix)){
                    s=prefix;
                    break;
                }
            }
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}