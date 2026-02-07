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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        List<TreeNode> lst=new ArrayList<>();
        sum_left(root,lst);
        int sum=0;
        for(int i=0;i<lst.size();i++){
            TreeNode n=lst.get(i);
            if(n.left == null && n.right == null){
                sum+=n.val;
            }
        }
        return sum;

    }
    public void sum_left(TreeNode root,List<TreeNode> lst){
        if(root ==null){
            return;
        }
        if(root.left!=null){
            lst.add(root.left);
        }
        sum_left(root.left,lst);
        sum_left(root.right,lst);
    }
}