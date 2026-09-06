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
    public boolean isBalanced(TreeNode root) {
        return checkheight(root) != -1;//if -1 then tree is unbalanced
    }
    public int checkheight(TreeNode root){
        if(root == null)return 0;

        int leftnode = checkheight(root.left);
        if(leftnode == -1) return -1;

        int rightnode = checkheight(root.right);
        if(rightnode == -1)return -1;

        if(Math.abs(leftnode - rightnode) > 1) return -1;

        return 1 + Math.max(leftnode , rightnode);
        //leftnode and rightnode if leftsubtree and right subtree height
    }
}