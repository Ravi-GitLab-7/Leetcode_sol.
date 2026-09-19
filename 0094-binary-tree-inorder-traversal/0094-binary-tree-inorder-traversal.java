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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null&&pred.right!=curr){
                    pred = pred.right;
                }
                if(pred.right==null){// link : temprorary link
                    pred.right = curr;
                    curr =  curr.left;
                }
                else{ // unlink
                    pred.right = curr;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{ // visit current 
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}