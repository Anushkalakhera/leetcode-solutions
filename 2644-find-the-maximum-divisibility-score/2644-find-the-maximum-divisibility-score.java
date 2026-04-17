class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxCount=-1;
        int max=Integer.MIN_VALUE;
        for(int d : divisors){
            int count=0;
            for(int num : nums){
                if(num%d==0){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                max = d;
            } else if(count == maxCount){
                max= Math.min(max, d);
            }
        }
        return max;
    }
}