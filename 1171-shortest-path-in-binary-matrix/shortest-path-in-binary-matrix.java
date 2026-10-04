class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }
        Queue<Pair> q=new ArrayDeque<>();
        q.offer(new Pair(0,0));
        grid[0][0]=1;
        int cnt=1;
        int[][] dir={{1,1} , {0,1}, {1,0} , {1,-1}, {0,-1},{-1,-1} , {-1,0},{-1,1} };
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
            Pair np= q.poll();
            if(np.x== n-1 && np.y== n-1){
                    return cnt;
            }
            for(int []d: dir){
                int r= np.x+d[0];
                int c=np.y+d[1];
                if(r>=n || c>=n || r<0 || c<0 || grid[r][c] == 1){
                    continue;
                }
                q.offer(new Pair(r,c));
                grid[r][c]=1;
            }
            }
            cnt++;
            }
        return -1;
    }
}