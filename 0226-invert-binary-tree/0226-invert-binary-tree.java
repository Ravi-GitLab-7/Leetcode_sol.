class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert the subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}