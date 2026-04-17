class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int common=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    common=Math.min(common,nums1[i]);
                }
            }
        }

        if(common!=Integer.MAX_VALUE) return common;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]<min2){
                min2=nums2[i];
            }
        }

        if(min>min2){
            return min2*10+min;
        }else{
            return min*10+min2;
        }
    }
}