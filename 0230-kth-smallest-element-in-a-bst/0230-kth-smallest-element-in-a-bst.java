class Solution {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;
                // Find inorder predecessor
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) { // link
                    pred.right = curr;
                    curr = curr.left;
                }
                else { // unlink
                    pred.right = null;
                    // Visit current
                    k--;
                    if (k == 0)
                        return curr.val;
                    curr = curr.right;
                }
            }
            else { // visit current
                k--;
                if (k == 0)
                    return curr.val;
                curr = curr.right;
            }
        }
        return -1;
    }
}