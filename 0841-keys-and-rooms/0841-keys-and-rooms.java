class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);

        for(boolean roomVisited : visited){
            if(!roomVisited) return false;
        }
        return true;
    }

    public void dfs(int node,List<List<Integer>> rooms,boolean[] visited){
        visited[node]=true;

        for(int key : rooms.get(node)){
            if(!visited[key]){
                dfs(key,rooms, visited);
            }
        }
    }
}