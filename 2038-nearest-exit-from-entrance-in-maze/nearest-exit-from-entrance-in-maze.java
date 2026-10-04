class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int n=maze.length;
        int m=maze[0].length;
        int cnt=0;

        boolean [][]visited=new boolean[n][m];
        Queue<Pair> q=new ArrayDeque<>();
        int[][]dir = {{-1,0}, {1,0}, {0,-1} , {0,1}};
        q.offer(new Pair(entrance[0],entrance[1]));
        visited[entrance[0]][entrance[1]]=true;

        while(!q.isEmpty()){
            int size=q.size();

            while(size-->0){
                Pair cell = q.poll();
                for(int[]d : dir){
                    int r= cell.x +d[0];
                int c= cell.y +d[1];

                if(r <0 || c< 0 || r>= n || c>=m || visited[r][c] || maze[r][c] == '+'){
                    continue;
                }
                
                if(r == 0 || r== n-1 || c==0 || c== m-1){
                    return cnt+1;
                }

                q.offer(new Pair(r,c));
                visited[r][c] =true;
                }
            }
            cnt++;
        }
        return -1;
    }
}