class Solution {

    static boolean flag;
    public long max(TreeNode root) {
        if (root == null) return Long.MIN_VALUE;
        long a = root.val;
        long b = max(root.left);
        long c = max(root.right);
        if (b >= root.val) {
            flag = false;
        }
        return Math.max(a, Math.max(b, c));
    }
    public long min(TreeNode root) {
        if (root == null) return Long.MAX_VALUE;
        long a = root.val;
        long b = min(root.left);
        long c = min(root.right);
        if (c <= root.val) {
            flag = false;
        }
        return Math.min(a, Math.min(b, c));
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        min(root);
        return flag;
    }
}