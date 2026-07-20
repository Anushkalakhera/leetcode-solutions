class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>((a, b) -> {
            if (costs[a] == costs[b]) {
                return a - b;
            }
            return costs[a] - costs[b];
        });

        PriorityQueue<Integer> rightHeap = new PriorityQueue<>((a, b) -> {
            if (costs[a] == costs[b]) {
                return a - b;
            }
            return costs[a] - costs[b];
        });

        int n=costs.length;

        int left=candidates;
        int right=costs.length-candidates-1;

        for (int i = 0; i < candidates && i < n; i++) {
            leftHeap.offer(i);
        }

        for (int i = Math.max(candidates, n - candidates); i < n; i++) {
            rightHeap.offer(i);
        }

        long ans = 0;
        for (int i = 0; i < k; i++) {
            if(leftHeap.isEmpty()){
                int idx=rightHeap.poll();
                ans+=costs[idx];

                if(left<=right){
                    rightHeap.offer(right);
                    right--;
                }
            }else if(rightHeap.isEmpty()){
                int idx=leftHeap.poll();
                ans+=costs[idx];

                if(left<=right){
                    leftHeap.offer(left);
                    left++;
                }
            }else if(costs[leftHeap.peek()] <= costs[rightHeap.peek()]){
                int idx = leftHeap.poll();
                ans += costs[idx];

                if (left <= right) {
                    leftHeap.offer(left);
                    left++;
                }
            }else{
                int idx = rightHeap.poll();
                ans += costs[idx];

                if (left <= right) {
                    rightHeap.offer(right);
                    right--;
                }
            }
        }
        return ans;
    }
}