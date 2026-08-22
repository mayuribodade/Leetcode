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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
      // If left child is null, we must look down the right subtree
      if(root.left == null){
        return 1 + minDepth(root.right);
      }
       // If rightt child is null, we must look down the leftt subtree
      if(root.right == null){
        return 1 + minDepth(root.left);
      }

      // If both children exist, take the minimum of both paths
        int leftdepth = minDepth(root.left);
        int rightdepth = minDepth(root.right);

        int ans = 1+ Math.min(leftdepth , rightdepth);

        return ans;
    }
}