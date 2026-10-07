class Solution {
    public void dfs(char [][]grid, int ri, int ci,int n, int m){
        grid[ri][ci]='0';
        int [][]dir ={{-1,0},{1,0},{0,-1},{0,1}};
        for(int []d:dir){
            int row= ri+d[0];
            int col= ci+d[1];
            if(row< n && row >=0 && col <m && col >=0){
                if(grid[row][col] == '1'){
                    dfs(grid,row,col,n,m);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;int m=grid[0].length;
        int cnt =0;
        for(int  i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    cnt++;
                    dfs(grid, i,j,n,m);
                }
            }
        }
        return cnt;
    }
}