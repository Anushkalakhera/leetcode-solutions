class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : score){
            pq.offer(ele);
        }

        HashMap<Integer, String> map = new HashMap<>();
        int rank=1;
        
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(rank==1){
                map.put(curr,"Gold Medal");
            }else if(rank==2){
                map.put(curr,"Silver Medal");
            }else if(rank==3){
                map.put(curr,"Bronze Medal");
            }else{
                map.put(curr,rank+"");
            }
            rank++;
        }
        String[] arr=new String[score.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(score[i]);
        }
        return arr;
    } 
}