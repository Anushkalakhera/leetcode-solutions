class Solution {
    public String convertToBase7(int num) {

       if(num == 0) return "0";  

        boolean isNegative = num < 0;
        num = Math.abs(num);

        String res = ""; 
        
        while(num != 0){
            int rem = num % 7;
            res = rem + res; 
            num = num / 7;
        }
        
        if(isNegative) res = "-" + res;

        return res;
    }
}