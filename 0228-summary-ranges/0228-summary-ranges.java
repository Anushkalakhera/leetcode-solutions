class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s="";
            int start=nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start==nums[i]){
                s+=start;
            }else{
                s+=start+"->"+ nums[i];
            }

            ans.add(s);
        }
        return ans;
    }
}