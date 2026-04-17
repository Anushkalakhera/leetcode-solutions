class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> li=new ArrayList<>();
        // if(mountain.length<3) return li;
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                li.add(i);
            }
        }
        return li;
    }
}