class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int ele : nums){
            set.add(ele);
        }

        ArrayList<Integer> li=new ArrayList<>(set);
        Collections.sort(li);
        int n=li.size();

        if (n < 3) {
            return li.get(n - 1);
        }

        return li.get(n - 3);
    }
}