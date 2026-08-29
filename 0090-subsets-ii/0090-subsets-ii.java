class Solution {
    public void backtrack(int idx,int[] nums ,List<List<Integer>> finalList,List<Integer> currList){
        if(idx>=nums.length){
            finalList.add(new ArrayList<>(currList));
            return;
        }

        currList.add(nums[idx]);
        backtrack(idx+1,nums,finalList,currList);

        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        currList.remove(currList.size()-1);
        backtrack(idx+1,nums,finalList,currList);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList=new ArrayList<>();
        List<Integer> currList=new ArrayList<>();
        backtrack(0,nums,finalList,currList);
        return finalList;
    }
}