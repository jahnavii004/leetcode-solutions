class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean[]visited =new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int x= edge[0];
            int y= edge[1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        return dfs(adj, source, destination, visited);
    }
    public boolean dfs(List<List<Integer>> adj, int s, int d, boolean[]visited){
        if(s==d){
            return true;
        }
        if(!visited[s]){
            visited[s] = true;
            for(int nbr: adj.get(s)){
                if(dfs(adj, nbr, d, visited) == true){
                return true;
            }
            }
        }
        return false;
    }
}