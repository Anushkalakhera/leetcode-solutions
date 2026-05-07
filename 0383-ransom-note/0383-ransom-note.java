class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        for(int r : ransomNote.toCharArray()){
            arr[r-'a']++;
        }

        for(int r : magazine.toCharArray()){
            arr[r-'a']--;
        }

        for(int ch : arr){
            if(ch > 0){
                return false;
            }
        }
        return true;
    }
}
