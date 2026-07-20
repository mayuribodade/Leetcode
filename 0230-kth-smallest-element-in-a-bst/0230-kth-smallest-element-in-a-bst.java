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

     int count =0 ;
     int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        //reseting count and ans for each testcase
        count = 0;// reset count
       inorder(root , k);// here in this fuction ans is being reset
       return ans;
    }

    private void inorder(TreeNode root , int k ){

        if(root == null) return ;

        inorder(root.left , k);
        count++;
        if(count == k) {
            ans = root.val;
            return ;
        }
        inorder(root.right , k);
    }
}