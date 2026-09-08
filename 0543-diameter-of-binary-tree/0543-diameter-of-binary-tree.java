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
    // static int maxDia; if i dont have to apply globally
    public int levels(TreeNode root, int [] maxDia) {
        if (root == null) return 0;
        int leftLevel = levels(root.left,maxDia);
        int rightLevel = levels(root.right,maxDia);
        int Dia = leftLevel + rightLevel;
        maxDia[0] = Math.max(Dia,maxDia[0]);
        return 1 + Math.max(leftLevel,rightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] maxDia = {0};
        levels(root,maxDia);
        return maxDia[0];
    }
}