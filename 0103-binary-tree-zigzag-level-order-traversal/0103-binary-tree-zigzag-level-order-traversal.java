class Solution {
    static class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    private static int levels(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private void DFS(TreeNode root, List<List<Integer>> ans) {
        Queue<Pair> q = new LinkedList<>();

        if (root != null)
            q.add(new Pair(root, 0));

        while (q.size() > 0) {
            Pair front = q.remove();

            TreeNode temp = front.node;
            int lvl = front.level;
            if (lvl % 2 == 0) {
                ans.get(lvl).add(temp.val);
            } else {
                ans.get(lvl).add(0, temp.val);
            }
            if (temp.left != null)
                q.add(new Pair(temp.left, lvl + 1));

            if (temp.right != null)
                q.add(new Pair(temp.right, lvl + 1));
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        int lvl = levels(root);

        for (int i = 1; i <= lvl; i++) {
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }

        DFS(root, ans);

        return ans;
    }
}