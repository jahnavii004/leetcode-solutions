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
                if(!dfs(adj,color,i,0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj, int[]color,int s,int currentcolor){
        if(color[s] == -1){
            color[s]= currentcolor;
           for(int nbr: adj.get(s)){
            if(!dfs(adj,color,nbr,1-color[s])){
                return false;
            }
           }
        }
        else if(color[s] != currentcolor){
            return false;
        }
        return true;
    }
}