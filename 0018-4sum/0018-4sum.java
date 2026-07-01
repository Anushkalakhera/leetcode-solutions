class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> fl=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        if(!fl.contains(li)){
                            fl.add(li);
                        }
                        k++;
                        l--;
                    }else if(sum>target){
                        l--;
                    }else{
                        k++;
                    }  
                }
            }
        }
        return fl;
    }
}