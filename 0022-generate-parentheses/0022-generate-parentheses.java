class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        int l=0;
        int r=0;
        helper(l,r,n,"" ,li);
        return li; 
    }

    public void helper(int l,int r,int n,String curr,List<String> li){
        if(curr.length()==2*n){
            li.add(curr);
            return;
        }

        if(l<n) helper(l+1,r,n,curr+"(",li);
        if(r<l) helper(l,r+1,n,curr+")",li);
    }
}