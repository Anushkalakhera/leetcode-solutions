class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int low=0;
        int high=n-1;
        int val = 1;

        while (low < high) {
            arr[low] = -val;
            arr[high] = val;
            low++;
            high--;
            val++;
        }
        return arr;
    }
}