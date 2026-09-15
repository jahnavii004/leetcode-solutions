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

        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                bfs(adj,i,visited);
            }
        }
        return provinces;
    }

    public void bfs( List<List<Integer>> adj, int s, boolean[]visited){
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(s);
        while(!q.isEmpty()){
            int n = q.poll();
            for(int nbr: adj.get(n)){
                if(!visited[nbr]){
                    visited[nbr] = true;
                    q.offer(nbr);
                }
            }
        }
    }
}