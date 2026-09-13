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
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root == null) return 0;
        int sum = rangeSumBST(root.left,lo,hi) + rangeSumBST(root.right,lo,hi);
        if(root.val>=lo && root.val<=hi) sum += root.val;
        return sum;
    }
}