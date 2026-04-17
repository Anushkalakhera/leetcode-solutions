class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> li=new ArrayList<>();

        for(int i=0;i<words.size();i++){
            String s=words.get(i);
            String[] word = s.split("\\" + separator); 
            for(int j=0;j<word.length;j++){
                if(!word[j].equals("")) { 
                    li.add(word[j]);
                }
            }
        }
        return li;
    }
}