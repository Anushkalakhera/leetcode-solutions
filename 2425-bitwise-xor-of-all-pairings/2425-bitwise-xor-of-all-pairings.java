class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
      int m=nums1.length;
      int n=nums2.length;
      int xor=0;
      if(m%2==0 && n%2!=0){
         for(int i=0;i<m;i++){
            xor^=nums1[i];
         }
         return xor;
      }else if(m%2!=0 && n%2==0){
         for(int i=0;i<n;i++){
            xor^=nums2[i];
         }
         return xor;
      }else if(m%2!=0 && n%2!=0){
         for(int i=0;i<n;i++){
            xor^=nums2[i];
         }
         for(int i=0;i<m;i++){
            xor^=nums1[i];
         }
         return xor;
      }else{
        return 0;
      }
    }
}