class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        int[]color =new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            if(color[i] == -1){
                if(!bfs(adj,color,i,0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj, int[]color,int s,int currentcolor){
        color[s]=currentcolor;
        for(int nbr:adj.get(s)){
            if(color[nbr] == -1){
                if(!dfs(adj,color,nbr,1-currentcolor)){
                    return false;
                }
            }
            else if(color[s] == color[nbr]){
                return false;
            }
        }
        return true;
    }

    public boolean bfs(List<List<Integer>> adj, int[]color,int s,int currentcolor){
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(s);
        color[s]= currentcolor;
        while(!q.isEmpty()){
            int node=q.poll();
            currentcolor=color[node];
            for(int nbr:adj.get(node)){
                if(color[nbr] == -1){
                    color[nbr] = 1-color[node];
                    q.offer(nbr);
                }
                else if(color[nbr] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}