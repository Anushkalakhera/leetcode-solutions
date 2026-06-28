class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();

        if(s.length()<p.length()){
            return ans;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        for(char ch : p.toCharArray()){
            pCount[ch-'a']++;
        }

        int k = p.length();

        for(int i=0;i<s.length();i++){
            window[s.charAt(i) - 'a']++;

            if(i>=k){
                window[s.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(pCount, window)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}