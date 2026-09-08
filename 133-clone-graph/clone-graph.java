/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Node, Node> map=new HashMap<>();
        return bfs(node, map);
    }
    public Node bfs(Node node, HashMap<Node, Node> map){
       Node copy=new Node(node.val);
       Queue<Node> q=new ArrayDeque<>();
       q.offer(node);
       map.put(node,copy);

       while(!q.isEmpty()){
        Node n=q.poll();
        Node cp = map.get(n);
        for(Node nbr:n.neighbors){
            if(!map.containsKey(nbr)){
                Node nbr_copy= new Node(nbr.val);
                cp.neighbors.add(nbr_copy);
                map.put(nbr, nbr_copy);
                q.offer(nbr);
            }
            else{
                cp.neighbors.add(map.get(nbr));
            }
        }
       }
       return copy;
    }
}