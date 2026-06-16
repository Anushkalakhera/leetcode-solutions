class Solution {
    public void backTrack(List<List<Integer>> finalList,List<Integer> currList,int[] nums,int start,int target){
        if(target<0) return;
        if(target==0){
            finalList.add(new ArrayList<>(currList));
            return;
        }else{
            for(int i=start;i<nums.length;i++){
                currList.add(nums[i]);
                backTrack(finalList,currList,nums,i,target-nums[i]);
                currList.remove(currList.size()-1);
           }
        }
        
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList=new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(finalList,new ArrayList<>(),candidates,0,target);
        return finalList;      
    }
}