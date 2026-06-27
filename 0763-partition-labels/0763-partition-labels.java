class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int i=0;
        int end=0;
        end=Math.max(end,map.get(s.charAt(0)));

        int start=0;
        while(i<s.length()){
           end=Math.max(end,map.get(s.charAt(i)));
           if(i==end){
               li.add(end-start+1);
               start=end+1;
           }
           i++;
        }
        return li;
    }
}