class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();

        if(t.length()>s.length()) return "";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int requiredCount=t.length();
        int i=0;
        int j=0;

        int windowSize=Integer.MAX_VALUE;
        int start_i=0;

        while(j < n ){
            char ch=s.charAt(j);

            if(map.containsKey(ch) && map.get(ch)>0){
                requiredCount--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);

            while(requiredCount == 0){
                // start shrinking the window
                int currWindowSize=j-i+1;
                if(windowSize>currWindowSize){
                    windowSize=currWindowSize;
                    start_i=i;
                }

                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

                if(map.get(s.charAt(i))>0){
                    requiredCount++;
                }

                i++;
            }
            j++;
        }

        return windowSize==Integer.MAX_VALUE ? "" : s.substring(start_i,start_i+windowSize);
    }
}