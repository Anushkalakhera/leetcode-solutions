class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] pairs=new int[n][2];

        for(int i=0;i<n;i++){
            pairs[i][0]=nums1[i];
            pairs[i][1]=nums2[i];
        }

        Arrays.sort(pairs,(a,b)-> b[1]-a[1]);

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long sum=0;
        long ans=0;

        for (int[] pair : pairs) {
            pq.offer(pair[0]);
            sum += pair[0];

            if(pq.size()>k){
                sum-=pq.poll();
            }

            if(pq.size()==k){
                ans=Math.max(ans,sum * pair[1]);
            }
        }
        return ans;
    }
}