class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        boolean check=false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                check=true;
                break;
            }
        }

        if(check==false) return word;
        
        for(int i=0;i<word.length();i++){
            st.push(word.charAt(i));
            if(st.peek()==ch) break;
        }

    
        String s="";
        int n=st.size();
        while(!st.isEmpty()){
            s+=st.pop();
        }
        for(int i=n;i<word.length();i++){
            s+=word.charAt(i);
        }
        return s;
    }
}