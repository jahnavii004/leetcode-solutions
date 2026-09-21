class Solution {
    public boolean dfs(List<List<Integer>> adj, int[]color, int s, int curr_color){
        color[s]=curr_color;
        for(int nbr:adj.get(s)){
            if(color[nbr] == -1){
                if(!dfs(adj,color,nbr,1-curr_color)){
                    return false;
                }
            }
            else if(color[nbr] == color[s]){
                return false;
            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []people: dislikes){
            int x=people[0];
            int y=people[1];
            adj.get(x-1).add(y-1);
            adj.get(y-1).add(x-1);
        }
        int[]color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i] == -1){
                if(!dfs(adj,color,i,0)){
                    return false;
                }
            }
        }
        return true;
    }
}