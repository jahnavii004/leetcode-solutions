class Solution {
    public boolean canFinish(int num, int[][] pre) {
        int[]state=new int[num];
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<num;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int []edge: pre){
            int x= edge[1];
            int y=edge[0];
            adj.get(x).add(y);
        }
        
        for(int i=0;i<num;i++){
            if(state[i] == 0){
                if(dfs(adj,i,state) == true){
                    return false;
                }
            }
        }

        return true;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, int[]state){
        state[s]=1;
        for(int nbr: adj.get(s)){
            if(state[nbr] == 0){
                if(dfs(adj,nbr,state) == true){
                    return true;
                }
            }
            else if(state[nbr] == 1){
                return true;
            }
        }
        state[s] = 2;
        return false;
    }
}