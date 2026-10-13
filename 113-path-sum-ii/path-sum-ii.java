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
    public void paths(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> lst){
        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            if(targetSum == root.val){
                lst.add(root.val);
                ans.add(new ArrayList<>(lst));
                lst.remove(lst.size()-1);
            }
        }

        lst.add(root.val);
        paths(root.left,targetSum-root.val,ans,lst);
        paths(root.right,targetSum-root.val,ans,lst);
        lst.remove(lst.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        paths(root,targetSum,ans,lst);
        return ans;
    }
}