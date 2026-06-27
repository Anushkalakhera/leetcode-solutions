class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int max=0;
        while(i<nums1.length && j<nums2.length){
            if(i<=j && nums1[i]<=nums2[j]){
                int diff=j-i;
                max=Math.max(max,diff);
                j++;
            }else if(i<=j && nums1[i]>nums2[j]){
                i++;
            }

            if (i > j) {
                j = i;
            }
        }
        return max;
    }
}