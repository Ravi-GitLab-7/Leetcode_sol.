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
    public TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        if (prelo > prehi || inlo > inhi)
            return null;
        TreeNode root = new TreeNode(preorder[prelo]);
        int r = 0;
        while (inorder[r] != preorder[prelo])
            r++;
        int leftsize = r - inlo;
        root.left = helper(preorder, inorder, prelo + 1, prelo + leftsize, inlo, r - 1);
        root.right = helper(preorder, inorder, prelo + leftsize + 1, prehi, r + 1, inhi);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}