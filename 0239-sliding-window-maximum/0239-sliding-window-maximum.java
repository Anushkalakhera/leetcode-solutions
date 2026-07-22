class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();
        int idx=0;

        for(int i=0;i<n;i++){
            int left=i-k+1;
            if (!dq.isEmpty() && dq.peekFirst() < left) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if (i >= k - 1) {
                ans[idx] = nums[dq.peekFirst()];
                idx++;
            }
        }
        return ans;
    }
}