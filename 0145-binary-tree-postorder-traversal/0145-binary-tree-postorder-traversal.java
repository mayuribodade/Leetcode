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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Postorder(root , list);
        return list;
    }
    private void Postorder(TreeNode node , List<Integer> ans){
        if(node == null) return ;

        Postorder(node.left , ans);
        Postorder(node.right , ans);
        ans.add(node.val);
    }
}