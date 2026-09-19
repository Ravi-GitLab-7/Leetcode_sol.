class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null&&pred.right!=curr){
                    pred = pred.right;
                }
                if(pred.right==null){// link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ // unlink
                    if(prev!=null && prev.val>=curr.val) return false;
                    prev = curr;
                    curr = curr.right;
                }
            }
            else{ // visit current
                if(prev!=null && prev.val>=curr.val) return false;
                prev = curr;
                curr = curr.right;
            }
        }
        return true;
    }
}