class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans=new int[arr.length];
        int i=0;
        for(int j=0;j<arr.length && i < arr.length;j++){
            if(arr[j]==0){
                ans[i]=0;
                if(i + 1 < arr.length){
                    ans[i + 1] = 0;
                }
                i+=2;
            }else{
                ans[i]=arr[j];
                i++;
            }   
        }

        for(int j=0;j<arr.length;j++){
            arr[j]=ans[j];
        }
    }
}