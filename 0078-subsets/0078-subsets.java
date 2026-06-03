class Solution {
    public void backTrack(List<List<Integer>> finalList,List<Integer> currList,int[] nums,int start){
        finalList.add(new ArrayList<>(currList));
        for(int i=start;i<nums.length;i++){
            if(currList.contains(nums[i])) continue;

            currList.add(nums[i]);
            backTrack(finalList,currList,nums,i+1);
            currList.remove(currList.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList=new ArrayList<>();
        backTrack(finalList,new ArrayList<>(),nums,0);
        return finalList;       
    }
}