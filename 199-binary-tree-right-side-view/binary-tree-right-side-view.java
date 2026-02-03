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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> lst=new ArrayList<>();
       view(root , lst, 0);
       return lst;
    }
    public void view(TreeNode root, List<Integer> lst, int i){
        if(root == null){
            return;
        }
        if(i == lst.size()){
            lst.add(root.val);
        }
        view(root.right , lst, i+1);
        view(root.left,lst,i+1); 
    }
}