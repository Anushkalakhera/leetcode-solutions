class Solution {
    public void backtrack(List<List<Integer>> finalList,List<Integer> currList,int[] nums,int ind,int target){
        if (target==0) {
            finalList.add(new ArrayList<>(currList));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;

            currList.add(nums[i]);
            backtrack(finalList,currList,nums,i+1,target-nums[i]);
            currList.remove(currList.size()-1);
        
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> finalist=new ArrayList<>();
        backtrack(finalist,new ArrayList<>(),candidates,0,target);
        return finalist;
    }
}