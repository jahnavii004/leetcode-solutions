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

        return bfs(adj, source, destination, visited);
    }
    public boolean bfs(List<List<Integer>> adj, int s, int d, boolean[]visited){
        if(s==d){
            return true;
        }
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int n=q.poll();
            for(int nbr:adj.get(n)){
                if(nbr == d){
                    return true;
                }
                if(!visited[nbr]){
                    visited[nbr]=true;
                    q.offer(nbr);
                }
            }
        }
        return false;
    }
}