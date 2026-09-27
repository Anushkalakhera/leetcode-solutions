class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            int revCharVal='z'-str+1;
            sum+=revCharVal*(i+1);
        }
        return sum;
    }
}