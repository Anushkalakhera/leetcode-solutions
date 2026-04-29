class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele : nums){
            pq.offer(ele);
        }
        for(int i=0;i<k;i++){
            int n=pq.poll();
            for(int j=0;j<nums.length;j++){
                if(nums[j]==n){
                    nums[j]=multiplier*nums[j];
                    pq.offer(nums[j]);
                    break;
                }
            }
        }
        return nums;
    }
}