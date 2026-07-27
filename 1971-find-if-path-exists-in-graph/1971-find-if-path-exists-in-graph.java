class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u=edge[0];
            int v=edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited=new boolean[n];
        dfs(source,graph,visited);
        return visited[destination];
    }

    public void dfs(int node,List<List<Integer>> graph,boolean[] visited){
        visited[node]=true;

        for(int neighbour : graph.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,graph,visited);
            }
        }
    }
}