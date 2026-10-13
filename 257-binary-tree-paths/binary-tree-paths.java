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
    public void paths(TreeNode root, String sb, List<String> lst){
        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            sb= sb+root.val;
            lst.add(sb);
        }

        sb= sb+ root.val +"->";
        paths(root.left,sb,lst);
        paths(root.right,sb,lst);
        // sb = sb.substring(0,sb.length()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String sb="";
        List<String> lst=new ArrayList<>();
        paths(root,sb,lst);
        return lst;
    }
}