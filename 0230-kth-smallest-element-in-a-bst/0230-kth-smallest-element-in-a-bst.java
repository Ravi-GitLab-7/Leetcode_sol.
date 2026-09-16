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
    int count =0;
    int answer = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return answer;
    }
    public void inorder(TreeNode root,int k){
        if(root==null) return;
        // go left
        inorder(root.left,k);
        // add count
        count++;
        // if matched
        if(count==k){
            answer = root.val;
            return;
        }
        // go right
        inorder(root.right,k);
    }
}