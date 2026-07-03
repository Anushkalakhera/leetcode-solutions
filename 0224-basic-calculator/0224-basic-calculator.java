class Solution {
    public int calculate(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();

         int number=0;
         int result=0;
         int sign=1;

        for(int i=0;i<n;i++){
            if(isDigit(s.charAt(i))){
                number=number*10+(s.charAt(i)-'0');  // number banate chalenge
            }else if(s.charAt(i)=='+'){
                result+=(number*sign);
                number=0;
                sign=1;
            }else if(s.charAt(i)=='-'){
                result+=(number*sign);
                number=0;
                sign=-1;
            }else if(s.charAt(i)=='('){
                st.push(result);
                st.push(sign);
                result=0;
                number=0;
                sign=1;
            }else if(s.charAt(i)==')'){
                result+=(number*sign);
                number=0;

                int stack_sign=st.pop();
                int last_result=st.pop();
                result*=stack_sign;
                result+=last_result;
            }
        }
        result += number * sign;
        return result;
    }

    public boolean isDigit(char ch){
        return ch=='0' || ch=='1' || ch=='2' ||ch=='3' ||ch=='4' ||ch=='5' ||ch=='6' ||ch=='7' ||ch=='8' ||ch=='9';
    }
}