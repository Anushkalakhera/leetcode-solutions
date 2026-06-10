class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        return helper(nums,target,low,high,mid);
    }
    public int helper(int[]nums ,int target,int low,int high,int mid){
        if(low>high) return -1;
        if(nums[mid]==target) return mid;
        if(nums[mid]<target) return helper(nums,target,mid+1,high,low+(high-low)/2);
        return helper(nums,target,low,mid-1,low+(high-low)/2);
    }
}