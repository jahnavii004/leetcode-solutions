/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void bfs(TreeNode root, List<Double> lst){
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                sum += n.val;
                if(n.left != null){
                    q.offer(n.left);
                }
                if(n.right != null){
                    q.offer(n.right);
                }
            }
            lst.add(sum/size);
        }
        return ;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> lst = new ArrayList<>();
        bfs(root,lst);
        return lst;
    }
}