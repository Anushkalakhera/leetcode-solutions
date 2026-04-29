class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele : nums){
            pq.offer(ele);
        }
        int[] arr=new int[nums.length];
        int i=0;
        while(pq.size()>1){
            int alice=pq.poll();
            int bob=pq.poll();
            arr[i]=bob;
            arr[i+1]=alice;
            i=i+2;
        }
        return arr;
    }
}