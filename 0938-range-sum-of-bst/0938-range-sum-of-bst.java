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
        //if val small than target then goes to right 
        if(root.val<lo) return rangeSumBST(root.right,lo,hi);
        //if val greater than target then goes to left 
        if(root.val>hi) return rangeSumBST(root.left,lo,hi);
        return root.val + rangeSumBST(root.right,lo,hi) +rangeSumBST(root.left,lo,hi);
    }
}