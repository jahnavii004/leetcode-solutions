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
    int cnt=0;
    public int goodNodes(TreeNode root) {
      int max=Integer.MIN_VALUE;
      good(root,max);
      return cnt;
    }
    public void good(TreeNode root , int max){
        if(root == null){
            return ;
        }
        if(root.val >= max){
            max=root.val;
            cnt++;
        }
        good(root.left , max);
        good(root.right , max);
    }
}