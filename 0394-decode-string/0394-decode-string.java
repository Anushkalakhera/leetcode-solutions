class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        Stack<Integer> n=new Stack<>();

        String s1=new String();
        int count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='0' &&c<='9'){
                count=10*count+(c-'0');
            }else if ( c =='['){
                st.push(s1);
                n.push(count);
                s1="";
                count=0;
            }else if ( c== ']'){
                String s2=st.pop();
                int x=n.pop();

                StringBuilder result=new StringBuilder();
                result.append(s2);

                for(int j=0;j<x;j++){
                    result.append(s1);
                }

                s1=result.toString();
            }else{
                s1+=Character.toString(c);
            }
        }
        return s1;
    }
}