class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length; int provinces =0;
        List<List<Integer>> adj=new ArrayList<>();
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                dfs(adj,i,visited);
                provinces++;
            }
        }
        return provinces;    
    }

    public void dfs(List<List<Integer>> adj, int s, boolean[]visited){
        if(!visited[s]){
            visited[s]=true;
            for(int nbr: adj.get(s)){
                dfs(adj,nbr,visited);
            }
        }
    }
}