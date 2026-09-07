class Solution {

    public int levels(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public void dfs(TreeNode root, int level, List<Integer> ans) {
        if (root == null) return;

        ans.set(level, root.val);

        dfs(root.left, level + 1, ans);
        dfs(root.right, level + 1, ans);
    }

    public List<Integer> rightSideView(TreeNode root) {

        int n = levels(root);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(0);
        }

        dfs(root, 0, ans);

        return ans;
    }
}