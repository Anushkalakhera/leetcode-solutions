class Solution {
    public boolean isPalindrome(String s) {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "");
        ans=ans.toLowerCase();
        int n=ans.length();
        int low=0;
        int high =n-1;
        while(low<high){
            if(ans.charAt(low)!=ans.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}