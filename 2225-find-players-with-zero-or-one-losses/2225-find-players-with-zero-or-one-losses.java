class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> lossCount=new HashMap<>();

        for(int[] match : matches){
            int winner=match[0];
            int looser=match[1];

            lossCount.putIfAbsent(winner,0);

            lossCount.put(looser,lossCount.getOrDefault(looser,0)+1);
        }
        ArrayList<Integer> zeroLosses=new ArrayList<>();
        ArrayList<Integer> oneLosses=new ArrayList<>();

        for(int key : lossCount.keySet()){
            if(lossCount.get(key)==0){
                zeroLosses.add(key);
            }
            else if(lossCount.get(key)==1){
                oneLosses.add(key);
            }
        }

        Collections.sort(zeroLosses);
        Collections.sort(oneLosses);

        List<List<Integer>> winners=new ArrayList<>();
        winners.add(zeroLosses);
        winners.add(oneLosses);
        return winners;
    }
}