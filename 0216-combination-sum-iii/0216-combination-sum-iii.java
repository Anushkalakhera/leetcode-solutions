class Solution {
    public void backTrack(List<List<Integer>> finalList,List<Integer> currList,int[] nums,int i,int ans,int target,int count,int k) {
        if (ans == target && count==k) {
            finalList.add(new ArrayList<>(currList));
            return;
        }

        if (i >= nums.length || ans > target) {
            return;
        }

        currList.add(nums[i]);
        backTrack(finalList,currList,nums,i+1,ans+nums[i],target,count+1,k);
        currList.remove(currList.size()-1);
        backTrack(finalList,currList,nums,i+1,ans,target,count,k);
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> finalList = new ArrayList<>();
        backTrack(finalList,new ArrayList<>(),candidates,0,0,n,0,k);
        return finalList;
    }
}