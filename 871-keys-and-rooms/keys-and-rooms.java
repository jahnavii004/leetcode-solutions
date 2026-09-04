class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []visited=new boolean[n];
        bfs(rooms, visited, 0);
        for(int i=0;i<n;i++){
            if(visited[i] == false && rooms.get(i) != null){
                return false;
            }
        }
        return true;
    }
    public void bfs(List<List<Integer>> rooms, boolean[]visited, int s){
        Queue<Integer> q=new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int n=q.poll();
            for(int nbr: rooms.get(n)){
                if(!visited[nbr]){
                    visited[nbr] = true;
                    q.offer(nbr);
                }
            }
        }
    }
}