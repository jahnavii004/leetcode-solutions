class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh=0, cnt=0;
        Queue<Pair> q=new ArrayDeque<>();          //<int []>
        int n=grid.length;int m=grid[0].length;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j));   //new int[]{1,2}
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair rot=q.poll();
                int x=rot.row;
                int y=rot.col;

                //right
                if(((y+1)< m) && (grid[x][y+1] == 1)){
                    grid[x][y+1] =2;
                    fresh--;
                    q.offer(new Pair(x,y+1));
                }

                //left
                if(((y-1)>=0) && (grid[x][y-1] == 1)){
                    grid[x][y-1] =2;
                    fresh--;
                    q.offer(new Pair(x,y-1));
                }

                //up
                if((x-1>=0) && (grid[x-1][y] == 1)){
                    grid[x-1][y] =2;
                    fresh--;
                    q.offer(new Pair(x-1,y));
                }

                //down
                if((x+1<n) && (grid[x+1][y] == 1)){
                    grid[x+1][y] =2;
                    fresh--;
                    q.offer(new Pair(x+1,y));
                }
            }
            cnt++;
        }
        if(fresh !=0){
            return -1;
        }
        return cnt-1;
    }
}