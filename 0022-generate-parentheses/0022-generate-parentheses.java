class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        helper(0,0,n,"",li);
        return li;
    }

    public void helper(int l,int r,int n, String s ,List<String> ans){
        if(l==n && r==n){
            ans.add(s);
            return;
        }

        if(l<n) helper(l+1,r,n,s+"(",ans);
        if(r<l) helper(l,r+1,n,s+")",ans);
    }
}