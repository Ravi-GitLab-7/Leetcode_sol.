class Solution {
    int sum = 0;
    void reverseInoreder(TreeNode root) {
        if (root == null) return;
        // go right
        reverseInoreder(root.right);
        // add
        sum += root.val;
        // update current value
        root.val = sum;
        // go left
        reverseInoreder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        reverseInoreder(root);
        return root;
    }
}