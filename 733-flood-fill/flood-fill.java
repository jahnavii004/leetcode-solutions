class Solution {
    public void dfs(int[][]image, int sr, int sc, int color, int curr, int n, int m){
        if(sr>= n || sr<0 || sc>=m || sc<0 || image[sr][sc] != curr){
            return;
        }
        image[sr][sc]=color;

        dfs(image,sr-1,sc,color,curr,n,m);  //up
        dfs(image,sr+1,sc,color,curr,n,m);  //down
        dfs(image,sr,sc-1,color,curr,n,m);  //left
        dfs(image,sr,sc+1,color,curr,n,m);  //right
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curr = image[sr][sc];
        if(curr == color){
            return image;
        }
        int n=image.length;
        int m=image[0].length;
        dfs(image,sr,sc,color,curr,n,m);
        return image;
    }
}