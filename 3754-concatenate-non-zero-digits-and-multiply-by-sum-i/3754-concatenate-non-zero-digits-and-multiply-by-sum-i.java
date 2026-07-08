class Solution {
    public long sumAndMultiply(int n) {
        int num=0;
        int dummy=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                num=num*10+rem;
                sum+=rem;
            }
            n/=10;
        }
        
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }

        return (long)rev*sum;
    }
}