class Solution {
    class DSU{
        int[]parent;
        int[]rank;
        DSU(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        boolean union(int a, int b){
            int rootA = find(a);
            int rootB = find(b);

            if(rootA == rootB){
                return false;
            }

            if(rank[rootA]<rank[rootB]){
                parent[rootA] = rootB;
            }
            else if(rank[rootB] < rank[rootA]){
                parent[rootB] = rootA;
            }
            else{
                parent[rootB] = rootA;
                rank[rootA]++;
            }
            return true;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        int comp = n;
        DSU dsu=new DSU(n);
        for(int[] edge: connections){
            if(dsu.union(edge[0],edge[1])){
                comp--;
            }
        }
        return comp-1;
    }
}