class Solution {
    class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row=r;
            this.col=c;
        }
    }
    public int numEnclaves(int[][] grid) {
        Queue<Pair> q=new ArrayDeque<>();
        int n=grid.length; int m=grid[0].length;
        boolean[][]visited= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 || i == n-1 || j==0 || j == m-1){
                    if(grid[i][j] == 1){
                        q.offer(new Pair(i,j));
                        visited[i][j]=true;
                    }
                }
            }
        }

        while(!q.isEmpty()){
            Pair node= q.poll();
            int ri= node.row;
            int ci = node.col;
           int[][]dir = {{-1,0},{1,0},{0,-1},{0,1}};

           for(int[]d : dir){
            int row = ri+d[0];
            int col = ci+d[1];

            if(row>=0 && row<n && col >=0 && col<m && grid[row][col] == 1 && !visited[row][col]){
                q.offer(new Pair(row,col));
                visited[row][col] = true;
            } 
           }

        }

        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}