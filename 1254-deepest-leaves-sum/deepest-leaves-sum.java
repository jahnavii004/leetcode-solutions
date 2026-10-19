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
     public int bfs(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        int deepest = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum=0;
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
            deepest = sum;
        }
        return deepest;
    }
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        return bfs(root);
    }
}