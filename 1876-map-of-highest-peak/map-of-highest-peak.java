class Solution {
    class Pair{
        int row;
        int col;
        int height;
        Pair(int row,int col,int height){
            this.row=row;
            this.col=col;
            this.height=height;
        }
    }

    public int[][] highestPeak(int[][] isWater) {
        int m= isWater.length;
        int n= isWater[0].length;
        int [][]peak=new int[m][n];
        Queue<Pair> q=new ArrayDeque<>();
        boolean[][]visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j] == 1){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }

        while(!q.isEmpty()){
            Pair node= q.poll();
            int row=node.row;
            int col= node.col;
            int height=node.height;

            int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};

            for(int[] d : dir){
                int rn = row+d[0];
                int cn = col+d[1];
                if(rn< 0 || rn>= m || cn <0 || cn >=n || visited[rn][cn]){
                    continue;
                }
                visited[rn][cn]=true;
                peak[rn][cn]=height+1;
                q.add(new Pair(rn,cn,height+1));
            }
       }
       return peak;
    }
}