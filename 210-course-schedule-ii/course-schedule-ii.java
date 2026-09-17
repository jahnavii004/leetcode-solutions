class Solution {
    public int[] findOrder(int num, int[][] pre) {
       int[] ans=new int[num];
        Stack<Integer> st=new Stack<>();
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
                if(dfs(adj,i,state,st) == true){
                    return new int[0];
                }
            }
        }

        int i=0;
        while(!st.isEmpty()){
            ans[i++] = st.pop();
        }
        return ans;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, int[]state, Stack<Integer> st){
        state[s]=1;
        for(int nbr: adj.get(s)){
            if(state[nbr] == 0){
                if(dfs(adj,nbr,state,st) == true){
                    return true;
                }
            }
            else if(state[nbr] == 1){
                return true;
            }
        }
        state[s] = 2;
        st.push(s);
        return false;
    }
}