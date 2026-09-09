class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxVal=Integer.MIN_VALUE;
        int area=0;
        while(i<j){
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                i++;
            }else if(height[j]<height[i]){
                area=height[j]*(j-i);
                j--;
            }else{
                area=height[j]*(j-i);
                j--;
                i++;
            }
            maxVal=Math.max(area,maxVal);
        }
        return maxVal;
    }
}