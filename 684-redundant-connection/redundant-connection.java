class Solution {
    class DSU{
        int[]parent;
        int[]rank;
        DSU(int n){
            parent = new int[n+1];
            rank = new int[n+1];

            for(int i=0;i<n+1;i++){
                parent[i]=i;
            }
        }
        int find(int x){
            if(parent[x]!=x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        boolean union(int a, int b){
            int rootA= find(a);
            int rootB = find(b);

            if(rootA == rootB){
                return false;
            }

            if(rank[rootA] < rank[rootB]){
                parent[rootA] = rootB;
            }

            else if(rank[rootB]< rank[rootA]){
                parent[rootB] = rootA;
            }
            else{
                parent[rootB] = rootA;
                rank[rootA]++;
            }
            return true;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length);
        int []arr=new int[2];
        for(int[]edge: edges){
            if(!dsu.union(edge[0],edge[1])){
                arr[0]=edge[0];
                arr[1] = edge[1];
            }
        }
        return arr;
    }
}