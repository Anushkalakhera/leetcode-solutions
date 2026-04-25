class Solution {
    public int findClosest(int x, int y, int z) {
       int diffA=Math.abs(z-x);
       int diffB=Math.abs(z-y);
        if(diffA>diffB){
            return 2;
        }else if(diffA<diffB){
            return 1;
        }else{
            return 0;
        }
    }
}