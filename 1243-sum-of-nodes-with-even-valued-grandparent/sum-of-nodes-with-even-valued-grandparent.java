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
    public int sumEvenGrandparent(TreeNode root) {
        return sumOfGP(root,null,null);
    }
    public int sumOfGP(TreeNode root, TreeNode gp, TreeNode parent){
        if(root == null){
            return 0;
        }

        int sum =0;  

        if(gp != null && gp.val%2 == 0){
            sum += root.val;
        }   
        sum += sumOfGP(root.left,parent,root); 
        sum += sumOfGP(root.right,parent,root);  

        return sum; 
    }
}