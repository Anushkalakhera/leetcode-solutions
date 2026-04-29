class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            pq.offer(ele);
        }

        return (pq.poll()-1)*(pq.poll()-1);
    }
}