class Solution {
    boolean flag;
    int cnt;
    public void dfs(int[][]grid, int n, int m, int r, int c){
        if(r>=n || r<0 || c>=m || c<0 || grid[r][c] == 0){
            return;
        }
        if(r == n-1 || r== 0 || c== m-1 || c== 0){
            if(grid[r][c] == 1){
                flag= true;
            }
        }
        cnt++;
        grid[r][c]=0;
        dfs(grid,n,m, r-1,c);
        dfs(grid,n,m, r+1,c);
        dfs(grid,n,m, r,c-1);
        dfs(grid,n,m, r,c+1);
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    flag=false;
                    cnt=0;
                    dfs(grid,n,m,i,j);
                    if(!flag){
                        ans += cnt;
                    }
                }
            }
        }
        return ans;
    }
}