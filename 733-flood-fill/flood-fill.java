class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int[][]image, int sr, int sc, int color, int curr, int n, int m){
        Queue<Pair> q=new ArrayDeque<>();
        q.offer(new Pair(sr,sc));
        image[sr][sc]=color;
        while(!q.isEmpty()){
            Pair cell = q.poll();
            sr=cell.row;
            sc=cell.col;

            //up
            if(sr-1 >=0 && sr-1 < n && image[sr-1][sc] == curr){
                q.offer(new Pair(sr-1,sc));
                image[sr-1][sc]=color;
            }

            //down
            if(sr+1 >=0 && sr+1 < n && image[sr+1][sc] == curr){
                q.offer(new Pair(sr+1,sc));
                image[sr+1][sc]=color;
            }

            //left
            if(sc-1 >=0 && sc-1 <m && image[sr][sc-1] == curr){
                q.offer(new Pair(sr,sc-1));
                image[sr][sc-1]=color;
            }

            if(sc+1 >=0 && sc+1 <m && image[sr][sc+1] == curr){
                q.offer(new Pair(sr,sc+1));
                image[sr][sc+1]=color;
            }
        }
    }
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
        bfs(image,sr,sc,color,curr,n,m);
        return image;
    }
}