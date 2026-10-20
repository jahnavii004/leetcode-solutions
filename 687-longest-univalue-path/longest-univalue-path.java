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
    int max;
    public int longPath(TreeNode root, int parent){
        if(root == null){
            return 0;
        }

        int left = longPath(root.left,root.val);
        int right = longPath(root.right,root.val);

        max= Math.max(max, left+right);

        return root.val == parent ? Math.max(left,right) +1 : 0;
    }
    public int longestUnivaluePath(TreeNode root) {
        max =0;
        longPath(root,-1);
        return max;
    }
}