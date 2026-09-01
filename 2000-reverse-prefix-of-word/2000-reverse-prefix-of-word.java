class Solution {
    public String reversePrefix(String word, char ch) {
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch) break;
            count++;
        }

        if(count==word.length()) return word;

        int i=0;
        int j=count;
        char[] arr=word.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        String str = new String(arr);
        return str;
    }
}