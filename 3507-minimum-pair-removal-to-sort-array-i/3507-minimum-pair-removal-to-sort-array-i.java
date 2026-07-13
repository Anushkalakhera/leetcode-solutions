class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int x : nums){
            list.add(x);
        }

        int operations=0;
        while(!isSorted(list)){
            int index=0;
            int minSum = list.get(0) + list.get(1);

            for (int i = 1; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index + 1);

            operations++;
        }
        return operations;
    }

    public boolean isSorted(List<Integer> li){
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)>li.get(i+1)){
                return false;
            }
        }
        return true;
    }
}