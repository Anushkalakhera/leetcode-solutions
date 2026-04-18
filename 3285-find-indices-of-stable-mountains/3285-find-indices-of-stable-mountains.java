class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> li=new ArrayList<>();

        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                li.add(i);
            }
        }
        return li;
    }
}