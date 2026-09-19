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
    public void preorder(TreeNode root,List<TreeNode> pre) {
       if(root==null) return;
       pre.add(root);
       preorder(root.left,pre);
       preorder(root.right,pre);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> pre = new ArrayList<>();
        preorder(root,pre);
        int n = pre.size();
        for(int i =0;i<n;i++){
            if(i!=n-1) pre.get(i).right = pre.get(i+1);
            pre.get(i).left = null;
        }
    }
}