class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();

        for(int ast : asteroids){
            boolean destroyed=false;

            while (!st.isEmpty() && ast< 0 && st.peek() > 0 && st.peek()<-ast){
                st.pop();
            }

            if(!st.isEmpty() && ast<0 && st.peek()>0){
                if(st.peek()==-ast){
                    st.pop();
                }
                destroyed=true;
            }

            if(!destroyed){
                st.push(ast);
            }
        }

        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}