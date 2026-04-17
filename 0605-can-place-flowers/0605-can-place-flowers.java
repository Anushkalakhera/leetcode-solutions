class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
               boolean leftEmpty=true;
               boolean rightEmpty=true;

               if(i>0 && flowerbed[i-1]==1){
                  leftEmpty=false;
               }

               if(i<flowerbed.length-1 && flowerbed[i+1]==1){
                  rightEmpty=false;
               }

               if(leftEmpty && rightEmpty){
                flowerbed[i]=1;
                n--;
               }
            }
            if(n<=0) return true;
        }

        return n<=0;
    }
}