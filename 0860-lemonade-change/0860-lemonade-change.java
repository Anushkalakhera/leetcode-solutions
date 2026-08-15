class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCoin=0;
        int tenCoin=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) fiveCoin++;
            else if(bills[i]==10){
                if(fiveCoin>0) {
                    fiveCoin--;
                    tenCoin++;
                }else return false;
            }else{
                if(tenCoin>0 && fiveCoin>0){
                    tenCoin--;
                    fiveCoin--;
                }else if(fiveCoin>=3){
                    fiveCoin-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}