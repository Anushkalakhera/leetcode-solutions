class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token :tokens){
            if(token.equals("+")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2+num1);
            }else if(token.equals("-")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2-num1);
            }else if(token.equals("*")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2*num1);
            }else if(token.equals("/")){
                int num1=st.pop();
                int num2=st.pop();
                st.push(num2/num1);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}