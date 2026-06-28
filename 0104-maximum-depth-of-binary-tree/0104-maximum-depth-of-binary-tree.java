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
    public int maxDepth(TreeNode root) {
       
        if(root == null){
            return 0;
        }
       
       int leftsubtree =  maxDepth(root.left);
       int rightsubtree =  maxDepth(root.right);
      
      // adding 1 for root node
        int ans = 1+ Math.max(leftsubtree , rightsubtree);

        return ans;
    }
}