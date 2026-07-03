class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j< target.length ;i++){
            if(i==target[j]){
                li.add("Push");
                j++;
            }else{
                li.add("Push");
                li.add("Pop");
            }
        }
        return li;
    }
}