class Solution {
    public String convertToBase7(int num) {

       if(num == 0) return "0";  

        boolean isNegative = num < 0;
        StringBuilder res = new StringBuilder();
        num = Math.abs(num);
        
        while(num != 0){
            int rem = num % 7;
            res.append(rem); 
            num = num / 7;
        }
        
        if(isNegative) res.append("-");

        return res.reverse().toString();
    }
}