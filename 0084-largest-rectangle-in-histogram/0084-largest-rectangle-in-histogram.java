class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        int[] next=new int[n];
        next=nextSmallerElement(heights,n);

        int[] prev=new int[n];
        prev=prevSmallerElement(heights,n);

        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int l=heights[i];

            if(next[i]==-1){
                next[i]=n;
            }
            int b=next[i]-prev[i]-1;
            int area=l*b;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }


    private int[] nextSmallerElement(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.peek()!=-1 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }


    private int[] prevSmallerElement(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int[] ans=new int[arr.length];
        for(int i=0;i<n;i++){
            while(st.peek()!=-1 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
}