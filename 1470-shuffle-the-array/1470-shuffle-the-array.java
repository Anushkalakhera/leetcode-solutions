class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] arr=new int[nums.length];
        for(int k=0;k<arr.length-1;k=k+2){
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            i++;
            j++;
        }
        return arr;
    }
}