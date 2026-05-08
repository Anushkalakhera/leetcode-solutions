class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] arr=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
          int x=countParity(nums,i);
          arr[i]=x;
        }  
        return arr;
    }
    public int countParity(int[] arr,int index){
        int count=0;
            if(arr[index]%2==0){
                for(int i=index;i<arr.length;i++){
                    if(arr[i]%2!=0){
                        count++;
                    }
                }
            }else{
               for(int i=index;i<arr.length;i++){
                    if(arr[i]%2==0){
                        count++;
                    }
                } 
            }
        return count;
    }
}