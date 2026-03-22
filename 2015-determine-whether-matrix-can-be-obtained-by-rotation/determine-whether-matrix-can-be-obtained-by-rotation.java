class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        boolean r0=true,  r90=true, r180=true, r270=true;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] != target[i][j]){
                    r0= false;
                }
                if(mat[n-1-j][i] != target[i][j]){
                    r90= false;
                }
                if(mat[n-1-i][n-1-j] != target[i][j]){
                    r180= false;
                }
                if(mat[j][n-1-i] != target[i][j]){
                    r270= false;
                }
            }
        }
        return r0||r90||r180||r270;
    }
}