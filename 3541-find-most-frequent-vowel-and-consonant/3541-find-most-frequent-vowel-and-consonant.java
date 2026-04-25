class Solution {
    public int maxFreqSum(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      int vowel=0;
      int maxVowel=0;
      int consonent=0;
      int maxCons=0;

      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      } 

      for(char key : map.keySet()){
         if(isvowel(key)==true){
            vowel=map.get(key);
            maxVowel=Math.max(maxVowel,vowel);
         }else{
            consonent=map.get(key);
            maxCons=Math.max(maxCons,consonent);
         }
      } 
      return maxVowel+maxCons;
    }

    public boolean isvowel(char s){
        return s=='a' ||  s=='e' ||s=='i' ||s=='o' ||s=='u'; 
    }
}