class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n!=1){
            int rem=n%2;
            if(rem!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}