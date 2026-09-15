class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }

    public int[][] highestPeak(int[][] isWater) {
        int m= isWater.length;
        int n= isWater[0].length;
        int [][]peak=new int[m][n];
        Queue<Pair> q=new ArrayDeque<>();
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j] == 1){
                    q.add(new Pair(i,j));
                }
                else{
                    peak[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()){
            Pair node= q.poll();
            int row=node.row;
            int col= node.col;

            int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};

            for(int[] d : dir){
                int rn = row+d[0];
                int cn = col+d[1];
                if(rn< 0 || rn>= m || cn <0 || cn >=n || peak[rn][cn] != -1){
                    continue;
                }

                peak[rn][cn] = peak[row][col]+1;
                q.add(new Pair(rn,cn));
            }
       }
       return peak;
    }
}