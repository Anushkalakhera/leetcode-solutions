class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                li1.add(nums[i]);
            }else if(nums[i]>pivot){
                li2.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                li1.add(nums[i]);
            }
        }
        
        int n=li1.size();
        for(int i=0;i<n;i++){
            nums[i]=li1.get(i);
        }

        int j=0;
        for(int i=n;i<nums.length;i++){
            nums[i]=li2.get(j);
            j++;
        }
        return nums;
    }
}