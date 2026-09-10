class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;

        int[][] arr=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int fleet=0;
        double LastTime=0;

        for(int i=0;i<n;i++){
            int pos=arr[i][0];
            int spd=arr[i][1];

            double currTime = (double)(target - pos) / spd;

            if(currTime >LastTime){
                fleet++;

                LastTime=currTime;
            }
        }
        return fleet;
    }
}