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
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode r = curr.right;
                curr.right = curr.left;
                TreeNode pred = curr.left;
                while (pred.right != null) {
                    pred = pred.right;
                }
                pred.right = r;
                curr.left = null;
                curr = curr.right;
            } else {
                curr = curr.right;
            }
        }
    }
}