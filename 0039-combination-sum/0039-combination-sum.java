class Solution {
    
    public void backTrack(List<List<Integer>> finalList,List<Integer> currList,int[] nums,int i,int ans,int target) {
        if (ans == target) {
            finalList.add(new ArrayList<>(currList));
            return;
        }

        if (i >= nums.length || ans > target) {
            return;
        }

        currList.add(nums[i]);
        backTrack(finalList,currList,nums,i,ans+nums[i],target);
        currList.remove(currList.size()-1);
        backTrack(finalList,currList,nums,i+1,ans,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        backTrack(finalList,new ArrayList<>(),candidates,0,0,target);
        return finalList;
    }
}