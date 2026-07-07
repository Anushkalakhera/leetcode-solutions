class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        boolean[] remove=new boolean[s.length()];
        Arrays.fill(remove,false);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(!st.isEmpty() && s.charAt(i)==')'){
                st.pop();
            }else if(st.isEmpty() && s.charAt(i)==')'){
                remove[i]=true;
            }
        }
        while(!st.isEmpty()){
            remove[st.pop()]=true;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(remove[i]==true) continue;
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}