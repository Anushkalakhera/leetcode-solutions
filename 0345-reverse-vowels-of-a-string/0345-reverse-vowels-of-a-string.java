class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); 
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(isVowel(s.charAt(l)) && isVowel(s.charAt(r))){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }else if(!isVowel(arr[l])){
                l++;
            }else{
                r--;
            }
        }
        return new String(arr);
    }

    private static boolean isVowel(char s){
        return s=='a' || s=='e' ||s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U' ;
    }
}