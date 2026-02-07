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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst=new ArrayList<>();
        if(root == null){
            return lst;
        }
        paths(root,lst,"");
        return lst;
    }
    public void paths(TreeNode root , List<String> lst,String ans){
        if(root == null){
            return;
        }
        if(root.left != null || root.right !=null){
        paths(root.left , lst , ans+root.val+"->");
        paths(root.right , lst , ans+root.val+"->");
        }
        else{
       ans=ans+root.val;
       lst.add(ans);
        }
        return;
    }
}